package com.vvsk.fullstack.movies;

import com.vvsk.fullstack.movies.models.Movie;
import com.vvsk.fullstack.movies.service.MoviesService;

public class App {
    public static void main(String[] args) throws Exception {
        
        MoviesService movieService = new MoviesService();

        // Print all the movies from movie service
        System.out.println(movieService.getAllMovies());

        // Print the movie object by fetching with name

        Movie movie = movieService.getMovieByName("Inception");

        println(movie);
        

        // Print the movie object by fetching with name
        println(movieService.getMovieByName("Baahubali: The Beginning"));

    }

    public static void println(Movie movie){
        try{
            System.out.println("Movie "+movie.getName()+" is directed by "+movie.getDirector()+" and has a rating of "+movie.getRating());
        }catch(
            NullPointerException ne
        ){
            System.out.println("Unable to print movie details as movie object is not available");
        }
        
    }
}
