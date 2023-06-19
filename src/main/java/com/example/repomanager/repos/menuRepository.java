package com.example.repomanager.repos;
import com.example.repomanager.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface menuRepository extends PagingAndSortingRepository<MenuEntity, Long>, JpaRepository<MenuEntity, Long> {
}
