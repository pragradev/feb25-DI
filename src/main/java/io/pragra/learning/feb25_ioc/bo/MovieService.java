package io.pragra.learning.feb25_ioc.bo;

import io.pragra.learning.feb25_ioc.Cast;
import io.pragra.learning.feb25_ioc.Movie;
import io.pragra.learning.feb25_ioc.dao.MovieDAO;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class MovieService {

    @Autowired // setter based DI
    MovieDAO movieDAO;
    @Value("${movieName}")
    String movieName;
    @Value("${cast}")
    String castName;

//    public MovieService(MovieDAO movieDAO) {
//        this.movieDAO = movieDAO;
//    }


    public void movieInject(){
        movieDAO.insertMovie(new Movie(1,"",2,"",new Cast()));
    }
}
