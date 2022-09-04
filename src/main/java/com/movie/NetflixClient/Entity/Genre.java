package com.movie.NetflixClient.Entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Genre {

@Id
private Integer id;
private String name;

}
