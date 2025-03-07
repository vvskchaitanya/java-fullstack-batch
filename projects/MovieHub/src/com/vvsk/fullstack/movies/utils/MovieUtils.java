package com.vvsk.fullstack.movies.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.vvsk.fullstack.movies.models.Movie;

/**
 * This is a Utility Class to perform below operations
 * - Read movies.csv file to load the objects by reading each line and convert them into Movie and return the list
 * - Take the list as input and save again movies.csv file
 */

public class MovieUtils {

    public static final String MOVIES_FILE="movies.csv";

    public static List<Movie> loadMovies(){

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(MOVIES_FILE));
        } catch (IOException e) {

            System.out.println("Unable to read the file "+MOVIES_FILE);
            e.printStackTrace();
        }

        List<Movie> output = new ArrayList<>();
        lines.removeFirst();
        lines.forEach(line->{
            String[] fields = line.split(",");
            output.add(new Movie(fields[0],fields[1],fields[2],fields[3],Double.valueOf(fields[4])));

        });

        return output;

    }

    public static void saveMovies(List<Movie> movies){
        String line = "name,category,language,director,rating\n";

        for(Movie m: movies){
            line+=""+m.getName()+","+m.getCategory()+","+m.getDirector()+","+m.getLanguage()+","+m.getRating()+"\n";
        }

        try {
            Files.write(Paths.get(MOVIES_FILE), line.getBytes());
        } catch (IOException e) {
            System.out.println("Unable to write to the file "+MOVIES_FILE);
            e.printStackTrace();
        }
    }



}
