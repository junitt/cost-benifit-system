package com.example.project_basic_manager.ProjectNodeManager.Controller;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import com.example.project_basic_manager.ProjectNodeManager.General.Result;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCAItemMasterRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class PCAItemMasterController {
    private final PCAItemMasterRepository itemMasterRepository;

    public PCAItemMasterController(PCAItemMasterRepository itemMasterRepository) {
        this.itemMasterRepository = itemMasterRepository;
    }

    @PostMapping("/yf-project-base/ItemMaster/search")
    public Result itemMasterSearch(@RequestBody String message) {
        List<PCAItemMaster> list;
        if (message.equals(""))
            list = itemMasterRepository.findAll();
        else
            list = itemMasterRepository.findByitemCode(message);
        return new Result(1, "OK", list.size(), list);
    }
}
