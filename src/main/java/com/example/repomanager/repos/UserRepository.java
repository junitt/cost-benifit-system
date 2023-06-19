package com.example.repomanager.repos;

import com.example.repomanager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>,JpaRepository<UserEntity, Long> {
    List<UserEntity> findByuAccount(String account);
    List<UserEntity> findByuName(String name);
}
