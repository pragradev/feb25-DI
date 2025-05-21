package io.pragra.learning.feb25_ioc.bo;

import io.pragra.learning.feb25_ioc.Cast;
import io.pragra.learning.feb25_ioc.Movie;
import io.pragra.learning.feb25_ioc.dao.MovieDAO;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class MovieService {

    @Autowired // setter based DI
    MovieDAO movieDAO;
    @Value("#{'${movieName}'.substring(2)}") // #[]
    String movieName;
    @Value("${cast}")
    String castName;

    public void displayAllMovies(){
        List<Movie> movies = movieDAO.fetchMoviesFromAppDbWithBeanProRowMapper();
        System.out.println(movies);
    }

//    public MovieService(MovieDAO movieDAO) {
//        this.movieDAO = movieDAO;
//    }



}
