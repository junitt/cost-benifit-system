package com.example.PcaManger.controller;

import com.example.PcaManger.entity.PCANode;
import com.example.PcaManger.repos.PCARepository;
import com.example.repomanager.entity.result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PCANodeController {
    private PCARepository repository;
    private static final Logger log = LoggerFactory.getLogger(PCANodeController.class);
    public PCANodeController(PCARepository repository){this.repository=repository;}
    @PostMapping("/yf-project-base/node/list")
    result getallNode(@RequestBody Object rec){
        List<PCANode>lst=repository.findAll();
        return new result(0,"good",lst.size(),lst);
    }
    @GetMapping("/yf-project-base/node/list")
    void newNode(){
        repository.save(new PCANode());
    }
}
