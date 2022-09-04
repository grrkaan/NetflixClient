package com.movie.NetflixClient.Entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class Genres4Movie {

    @Id
    private Integer id;
    private Integer genreId;
    private UUID movieId;
}
