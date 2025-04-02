package com.triveni.fullstack.employees.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triveni.fullstack.employees.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public List<UserEntity> findByusername(String username);

}
