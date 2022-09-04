package com.movie.NetflixClient.Entity.Dto;

import com.movie.NetflixClient.Entity.Movie;
import lombok.Data;

import java.util.List;

@Data
public class MovieList {

    private List<Movie> movieList;

}
