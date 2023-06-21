package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemGearBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCAItemGearBoxRepository extends PagingAndSortingRepository<PCAItemGearBox,Long>, JpaRepository<PCAItemGearBox,Long> {

}
