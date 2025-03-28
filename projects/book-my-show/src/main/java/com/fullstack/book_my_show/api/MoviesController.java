package com.fullstack.book_my_show.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.book_my_show.entity.Movie;
import com.fullstack.book_my_show.service.MoviesService;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private MoviesService moviesService;

    public MoviesController(MoviesService moviesService){
        System.out.println("Creating "+this.getClass().getName());
        this.moviesService = moviesService;
    }

    @GetMapping
    public List<Movie> get(){
        return this.moviesService.get();
    }


    @GetMapping("/{language}")
    public List<Movie> get(@PathVariable String language){
        return this.moviesService.get(language);
    }

    @PostMapping
    public Integer save(@RequestBody Movie movie){
        return this.moviesService.add(movie).getId();
    }

    @DeleteMapping
    public Boolean save(@RequestParam Integer id){
        return this.moviesService.delete(id);
    }

}
