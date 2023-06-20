package com.example.project_basic_manager.ProjectNodeManager.Controller;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import com.example.project_basic_manager.ProjectNodeManager.Entity.PCANode;
import com.example.project_basic_manager.ProjectNodeManager.General.RecPCANode;
import com.example.project_basic_manager.ProjectNodeManager.General.Result;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCANodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PCANodeController {
    private final PCANodeRepository repository;
    private static final Logger log = LoggerFactory.getLogger(PCANodeController.class);

    public PCANodeController(PCANodeRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/yf-project-base/node/list")
    public Result getAllNode(@RequestBody Object rec) {
        List<PCANode> lst = repository.findAll();
        return new Result(0, "good", lst.size(), lst);
    }

    @GetMapping("/yf-project-base/node/nlist")
    public void newNode() {
        repository.save(new PCANode());
    }

    @PostMapping("/yf-project-base/node/add")
    public Result newNode(@RequestBody RecPCANode node) {
        System.out.println(node);
        //repository.save(node);
        return new Result(0, "???");
    }

    @PostMapping("/yf-project-base/node/remove")
    public Result deleteNode(@RequestBody PCANode node) {
        System.out.println(node.getId());
        //repository.deleteById(node.getId());
        return new Result(0, "OK");
    }
}
