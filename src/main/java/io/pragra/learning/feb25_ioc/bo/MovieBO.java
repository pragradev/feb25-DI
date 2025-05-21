package io.pragra.learning.feb25_ioc.bo;

import io.pragra.learning.feb25_ioc.Movie;
import io.pragra.learning.feb25_ioc.dao.MovieDAO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MovieBO {

    MovieDAO movieDAO = new MovieDAO();


}
