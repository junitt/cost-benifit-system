package com.example.PcaManger.repos;

import com.example.PcaManger.entity.PCANode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCARepository extends PagingAndSortingRepository<PCANode, Long>, JpaRepository<PCANode, Long> {

}
