package com.vvsk.fullstack.movies_api.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvsk.fullstack.movies_api.dto.Movie;
import com.vvsk.fullstack.movies_api.mapper.MovieMapper;
import com.vvsk.fullstack.movies_api.repository.MovieRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DataLoader {

    @Autowired
    private MovieRepository movieRepository;

    @PostConstruct
    public void load() throws IOException{

        System.out.println("Post Construct method called");

       String json =  Files.readAllLines(Paths.get("C:\\Users\\HP\\Downloads\\java-fullstack-batch\\projects\\MovieHub\\movies-api\\src\\main\\resources\\movies.json"))
        .stream().reduce("", (a, b) -> a + b);

        Data data = new ObjectMapper().readValue(json, Data.class);

        MovieMapper mapper = Mappers.getMapper(MovieMapper.class);

        data.getData().forEach(movie -> {
            movieRepository.save(mapper.toEntity(movie));
            System.out.println("Successfully saved movie: " + movie.getName());
        });

    }

}

class Data{
    private List<Movie> data;

    public List<Movie> getData() {
        return data;
    }
}
