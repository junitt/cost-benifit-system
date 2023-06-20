package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PCAItemMasterRepository extends PagingAndSortingRepository<PCAItemMaster, Long>, JpaRepository<PCAItemMaster, Long> {
    List<PCAItemMaster> findByitemCode(String str);
}
