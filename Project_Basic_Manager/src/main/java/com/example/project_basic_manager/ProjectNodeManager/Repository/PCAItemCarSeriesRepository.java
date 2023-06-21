package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemCarSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCAItemCarSeriesRepository extends PagingAndSortingRepository<PCAItemCarSeries,Long>, JpaRepository<PCAItemCarSeries,Long> {
    PCAItemCarSeries findById(long id);
}
