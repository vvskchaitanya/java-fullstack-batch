package com.vvsk.fullstack.movies_api.mapper;

import org.mapstruct.Mapper;

import com.vvsk.fullstack.movies_api.dto.Movie;
import com.vvsk.fullstack.movies_api.entity.MovieEntity;

@Mapper
public interface MovieMapper {

    MovieEntity toEntity(Movie movie);
    Movie toDto(MovieEntity movieEntity);

}
