package com.fullstack.book_my_show.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.book_my_show.entity.Movie;

@Repository
public interface MoviesRepository extends JpaRepository<Movie,Integer>{

    public List<Movie> findByLanguage(String language);

}
