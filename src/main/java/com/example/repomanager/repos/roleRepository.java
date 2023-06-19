package com.example.repomanager.repos;

import com.example.repomanager.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface roleRepository extends PagingAndSortingRepository<RoleEntity, Long>, JpaRepository<RoleEntity, Long> {
    List<RoleEntity> findByrName(String rName);
}
