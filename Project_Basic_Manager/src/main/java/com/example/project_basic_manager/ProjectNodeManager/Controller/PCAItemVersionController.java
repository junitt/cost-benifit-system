package com.example.project_basic_manager.ProjectNodeManager.Controller;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemVersion;
import com.example.project_basic_manager.ProjectNodeManager.General.Result;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCAItemMasterRepository;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCAItemVersionRepository;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCANodeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class PCAItemVersionController {
    private final PCAItemVersionRepository repository;
    private final PCAItemMasterRepository masterRepository;
    private final PCANodeRepository nodeRepository;

    public PCAItemVersionController(PCAItemVersionRepository repository, PCAItemMasterRepository masterRepository, PCANodeRepository nodeRepository) {
        this.repository = repository;
        this.masterRepository = masterRepository;
        this.nodeRepository = nodeRepository;
    }

    @PostMapping("/yf-project-base/item-version/master-list")
    public Result GetMasterList() {
        System.out.println("this is list in version");
        List<PCAItemMaster> list = masterRepository.findAll();
        return new Result(0, "OK", list.size(), list);
    }

    @PostMapping("/yf-project-base/item-version/master-list-archive")
    public Result GetMasterListByArchive(){
        return new Result(1,"nothing");
    }

    @PostMapping("/yf-project-base/item-version/list")
    public Result itemVersionList(@RequestBody PCAItemVersion version) {
        List<PCAItemVersion> list = repository.findAll();
        return new Result(0, "OK", list.size(), list);
    }

    @PostMapping("/yf-project-base/item-version/add")
    public Result addItemVersion(@RequestBody PCAItemVersion version) {
        System.out.println("add: " + version);
        repository.save(version);
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/item-version/remove")
    public Result removeItemVersion(@RequestBody PCAItemVersion version) {
        System.out.println("delete: " + version);
        //repository.deleteById(version.getId());
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/item-version/modify")
    public Result modifyNode(@RequestBody PCAItemVersion version) {
        System.out.println("modify: " + version);
        PCAItemVersion existVersion = repository.findById(version.getId());
        if (existVersion == null)
            return new Result(1, "PCA Version not find, contents: " + version);
        else {
            existVersion.SetAttributes(version);
            //repository.save(existVersion);
            return new Result(0, "OK");
        }
    }
}
