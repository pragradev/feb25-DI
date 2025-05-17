package io.pragra.learning.feb25_ioc.dao;

import io.pragra.learning.feb25_ioc.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieDAO {

    public void insertMovie(Movie movie){
        System.out.println("MovieDAO: Inserting Movie ");
    }
}
