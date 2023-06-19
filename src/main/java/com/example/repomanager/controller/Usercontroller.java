package com.example.repomanager.controller;
import com.example.repomanager.common.*;
import com.example.repomanager.entity.*;
import com.example.repomanager.repos.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Usercontroller {
    private final UserRepository repository;
    private static final Logger log = LoggerFactory.getLogger(Usercontroller.class);
    Usercontroller(UserRepository repository) {
        this.repository = repository;
    }
    @PostMapping("/yf-project-base/user/login")
    result Userlogin(@RequestBody UserEntity rec) {
        List<UserEntity>lst=repository.findByuAccount(rec.getuAccount());
        for(UserEntity user : lst){
            if (user.getuPwd().equals(rec.getuPwd())&&user.getRole().getrId()==1){
                return new result(0,"good");
            }
        }
        return new result(1,"wrong account or pwd");
    }

    @PostMapping("/yf-project-base/user/list")
    result search(@RequestBody UserEntity rec) {
        log.info(rec.toString());
        if (rec.getuId()==0&&rec.getuName().equals("")){
            List<UserEntity>lst=repository.findAll();
            log.info(lst.get(0).getRole().getrId()+"");
            return new result(1,"ok", lst.size(), lst);
        }
        else if(rec.getuId()==0){
            List<UserEntity> lst=repository.findByuName(rec.getuName());
            return new result(1,"ok", lst.size(), lst);
        }
        else{
            UserEntity[] arr=new UserEntity[1];
            arr[0]=(UserEntity)repository.findById(rec.getuId()).orElse(null);
            return new result(1,"ok", arr.length, arr);
        }
    }

    @PostMapping("/yf-project-base/user/add")
    result newuser(@RequestBody recuser rec){
        repository.save(new UserEntity(rec));
        return new result(0,"good");
    }

    @PostMapping("/yf-project-base/user/remove")
    result removeuser(@RequestBody recuser rec){
        log.info(rec.getuId());
        //repository.deleteById();
        return new result(0,"good");
    }

}//private @Id @GeneratedValue Long id; // 主键
