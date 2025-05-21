package io.pragra.learning.feb25_ioc.dao;

import io.pragra.learning.feb25_ioc.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class MovieDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Movie> fetchMoviesFromAppDb(){
        RowMapper<Movie> rowMapper = new RowMapper<Movie>() {
            @Override
            public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
                Movie movie = new Movie();
                movie.setMovieId(rs.getInt("MOVIE_ID"));
                movie.setMovieName(rs.getString("MOVIE_NAME"));
                movie.setDirectorName(rs.getString("DIRECTOR_NAME"));
                movie.setActorName(rs.getString("ACTOR_NAME"));
                return movie;
            }
        };
        List<Movie> movieList = jdbcTemplate.query(QueryConstants.FETCH_MOVIE, rowMapper);
        return movieList;
    }

    public List<Movie> fetchMoviesFromAppDbWithBeanProRowMapper() {
        List<Movie> movieList = jdbcTemplate.query(QueryConstants.FETCH_MOVIE, new BeanPropertyRowMapper<Movie>(Movie.class));
        return movieList;
    }

}
