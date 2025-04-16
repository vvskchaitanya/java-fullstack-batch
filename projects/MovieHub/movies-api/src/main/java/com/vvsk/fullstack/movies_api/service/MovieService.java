package com.vvsk.fullstack.movies_api.service;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvsk.fullstack.movies_api.dto.Movie;
import com.vvsk.fullstack.movies_api.entity.MovieEntity;
import com.vvsk.fullstack.movies_api.mapper.MovieMapper;
import com.vvsk.fullstack.movies_api.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    MovieMapper mapper = Mappers.getMapper(MovieMapper.class);

    public Movie addMovie(Movie movie) {
        MovieEntity mEntity = mapper.toEntity(movie);
        movieRepository.save(mEntity);
        return movie;
    }

    public void updateMovie(Movie movie) {
        MovieEntity mEntity = mapper.toEntity(movie);
        movieRepository.save(mEntity);
    }   

    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

}
