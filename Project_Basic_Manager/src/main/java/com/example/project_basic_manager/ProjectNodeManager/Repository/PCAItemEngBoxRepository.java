package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemEngBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCAItemEngBoxRepository extends PagingAndSortingRepository<PCAItemEngBox,Long>, JpaRepository<PCAItemEngBox,Long> {

}
