package com.movie.NetflixClient.Service;

import com.movie.NetflixClient.Entity.Dto.MovieList;
import com.movie.NetflixClient.Entity.Movie;
import com.movie.NetflixClient.Repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements  MovieService{


    private final MovieRepository movieRepository;

    @Override
    public MovieList getAllMovies() {
        List<Movie> getAllMovies = movieRepository.findAll();
        MovieList list = new MovieList();
        list.setMovieList(getAllMovies);
        return list;
    }
}
