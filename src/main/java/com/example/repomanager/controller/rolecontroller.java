package com.example.repomanager.controller;


import com.example.repomanager.entity.result;
import com.example.repomanager.entity.*;
import com.example.repomanager.repos.roleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class rolecontroller {
    private final roleRepository repository;
    private static final Logger log = LoggerFactory.getLogger(rolecontroller.class);
    rolecontroller(roleRepository repository) {
        this.repository = repository;
    }
    @PostMapping("/yf-project-base/role/list")
    result allrole(@RequestBody Object rec) {
        List<RoleEntity> lst=repository.findAll();
        return new result(0,"good",lst.size(),lst);
    }
}
