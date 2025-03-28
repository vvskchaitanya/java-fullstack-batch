package com.fullstack.book_my_show.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fullstack.book_my_show.entity.Movie;
import com.fullstack.book_my_show.repository.MoviesRepository;

@Service
public class MoviesService {

    private MoviesRepository moviesRepository;

    public MoviesService(MoviesRepository moviesRepository){
        System.out.println("Creating "+this.getClass().getName());
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> get(){
        return this.moviesRepository.findAll();
    }

    public List<Movie> get(String language){
        return this.moviesRepository.findByLanguage(language);
    }

    public Movie add(Movie movie){
        return this.moviesRepository.save(movie);
    }

    public Boolean delete(Integer id){
        this.moviesRepository.deleteById(id);
        return true;
    }

}
