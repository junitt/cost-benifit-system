package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemCarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCAItemCarTypeRepository extends PagingAndSortingRepository<PCAItemCarType,Long>, JpaRepository<PCAItemCarType,Long> {

}
