package com.example.project_basic_manager.ProjectNodeManager.Controller;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCANode;
import com.example.project_basic_manager.ProjectNodeManager.General.RecPCANode;
import com.example.project_basic_manager.ProjectNodeManager.General.Result;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCANodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/yf-project-base/node/add")
    public Result newNode(@RequestBody RecPCANode node) {
        repository.save(new PCANode(node));
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/node/remove")
    public Result deleteNode(@RequestBody PCANode[] node) {
        System.out.println(node[0]);
        repository.deleteById(node[0].getId());
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/node/modify")
    public Result modifyNode(@RequestBody PCANode node) {
        PCANode existNode = repository.findById(node.getId());
        if (existNode == null)
            return new Result(1, "PCA Node not find, contents: " + node);
        else {
            existNode.SetAttribute(node);
            repository.save(existNode);
            return new Result(0, "OK");
        }
    }
}
