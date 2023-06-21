package com.example.project_basic_manager.ProjectNodeManager.Controller;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemCarSeries;
import com.example.project_basic_manager.ProjectNodeManager.General.Result;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCAItemCarSeriesRepository;
import com.example.project_basic_manager.ProjectNodeManager.Repository.PCAItemMasterRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class PCAItemMasterController {
    private final PCAItemMasterRepository itemMasterRepository;
    private final PCAItemCarSeriesRepository carSeriesRepository;

    public PCAItemMasterController(PCAItemMasterRepository itemMasterRepository, PCAItemCarSeriesRepository carSeriesRepository) {
        this.itemMasterRepository = itemMasterRepository;
        this.carSeriesRepository = carSeriesRepository;
    }

    @PostMapping("/yf-project-base/item-master/get-unit-ids")
    public Result getAllUnitIds() {
        List<String> list = new ArrayList<>();
        List<PCAItemMaster> masters = itemMasterRepository.findAll();
        for (PCAItemMaster master : masters)
            if (!isExistedInList(list, master.getUnitId()))
                list.add(master.getUnitId());
        return new Result(0, "OK", list.size(), list);
    }

    private boolean isExistedInList(List<String> list, String text) {
        for (String s : list)
            if (s.equals(text))
                return true;
        return false;
    }

    @PostMapping("/yf-project-base/item-master/list")
    public Result itemMasterList(@RequestBody PCAItemMaster master) {
        System.out.println("this is list");
        List<PCAItemMaster> list = itemMasterRepository.findAll();
        return new Result(0, "OK", list.size(), list);
    }

    @PostMapping("/yf-project-base/item-master/add")
    public Result itemMasterAdd(@RequestBody PCAItemMaster master) {
        System.out.println(master);
        PCAItemCarSeries carSeries=carSeriesRepository.findById();
        // itemMasterRepository.save(master);
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/item-master/remove")
    public Result itemMasterRemove(@RequestBody PCAItemMaster master) {
        itemMasterRepository.deleteById(master.getId());
        return new Result(0, "OK");
    }

    @PostMapping("/yf-project-base/item-master/search")
    public Result itemMasterSearch(@RequestBody PCAItemMaster message) {
        List<PCAItemMaster> list;
        if (message.getUnitId().equals(""))
            list = itemMasterRepository.findAll();
        else
            list = itemMasterRepository.findByUnitId(message.getUnitId());
        return new Result(1, "OK", list.size(), list);
    }

    @PostMapping("/yf-project-base/item-master/modify")
    public Result itemMasterModify(@RequestBody PCAItemMaster master) {
        System.out.println("this is master's modify");
        PCAItemMaster existMaster = itemMasterRepository.findById(master.getId());
        if (existMaster == null)
            return new Result(1, "PCA Master not find, contents: " + master);
        else {
            existMaster.SetAttribute(master);
            itemMasterRepository.save(existMaster);
            return new Result(0, "OK");
        }
    }
}
