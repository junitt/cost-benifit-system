package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCAItemVersionRepository extends PagingAndSortingRepository<PCAItemVersion, Long>, JpaRepository<PCAItemVersion, Long> {
    PCAItemVersion findById(long id);
}
