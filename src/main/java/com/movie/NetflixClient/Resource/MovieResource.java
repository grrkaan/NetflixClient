package com.movie.NetflixClient.Resource;

import com.movie.NetflixClient.Entity.Dto.MovieList;
import com.movie.NetflixClient.Entity.Movie;
import com.movie.NetflixClient.Service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieResource {

    private final MovieService movieService;

    @GetMapping("/list")
    public ResponseEntity<MovieList> getALlMovies(){

        MovieList movieList = movieService.getAllMovies();

        return ResponseEntity.ok().body(movieList);
    }

}
