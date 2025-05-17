package io.pragra.learning.feb25_ioc.bo;

import io.pragra.learning.feb25_ioc.dao.MovieDAO;
import org.springframework.stereotype.Component;

@Component
public class MovieCustomerService {
    MovieDAO movieDAO = new MovieDAO();
}
