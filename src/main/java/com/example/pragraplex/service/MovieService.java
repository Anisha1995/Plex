package com.example.pragraplex.service;

import com.example.pragraplex.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Optional<Movie> createMovie(Movie movie);
    List<Movie> getAllMovies();
    Optional<Movie>getMovieByID(Integer id);
}
