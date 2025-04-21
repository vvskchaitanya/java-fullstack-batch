package com.vvsk.fullstack.movies_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvsk.fullstack.movies_api.entity.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    // Custom query methods can be defined here if needed
    // For example, to find movies by name:
    // List<MovieEntity> findByName(String name);

}
