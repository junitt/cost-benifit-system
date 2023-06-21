package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.RepChangeMemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepChangeMemoRepository extends PagingAndSortingRepository<RepChangeMemo,Long>, JpaRepository<RepChangeMemo,Long> {

}
