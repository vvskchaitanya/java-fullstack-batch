package com.vvsk.fullstack.movies.service;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.vvsk.fullstack.movies.models.Movie;
import com.vvsk.fullstack.movies.utils.MovieUtils;


/**
 * Create a service class called movies service which holds the list of movie objects
 */

public class MoviesService {
    private List<Movie> movies;

    // Constructor
    public MoviesService() {
        this.movies = MovieUtils.loadMovies();
    }

    // Method to add a movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Method to get all movies
    public List<Movie> getAllMovies() {
        return movies;
    }

    // Method to find a movie by name
    public Movie getMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(name)) {
                return movie;
            }
        }
        return null; // Return null if not found
    }

    // Method to remove a movie by name
    public boolean removeMovie(String name) {
        return movies.removeIf(movie -> movie.getName().equalsIgnoreCase(name));
    }
}

