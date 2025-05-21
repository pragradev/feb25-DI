package io.pragra.learning.feb25_ioc.config;

import io.pragra.learning.feb25_ioc.Cast;
import io.pragra.learning.feb25_ioc.Movie;
import io.pragra.learning.feb25_ioc.bo.MovieBO;
import io.pragra.learning.feb25_ioc.bo.MovieService;
import io.pragra.learning.feb25_ioc.dao.MovieDAO;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Configuration
public class AppConfig {
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

//    @Bean
//    public DataSource dataSource(){
//        DataSource dataSource = DataSourceBuilder
//                .create()
//                .url("jdbc:h2:mem:appdb")
//                .username("sa")
//                .password("sa123")
//                .build();
//
//        return dataSource;
//    }

    /*
    * <bean name="rrr" class="io.pragra.learning.feb25_ioc.Movie" init-method="setup" destroy-method="destroy">
        <constructor-arg name="movieId" value="1"></constructor-arg>
        <constructor-arg name="movieName" value="RRR"></constructor-arg>
        <constructor-arg name="releaseYear" value="2022"></constructor-arg>
        <constructor-arg name="genre" value="Action"></constructor-arg>
        <constructor-arg name="cast" ref="srk"></constructor-arg>
    </bean>
    * */

//    @Bean(initMethod = "setup", destroyMethod = "destroy")
//    public Movie rrr(){
//        Movie movie = new Movie(1,"RRR",2022,"Action",srk());
//        return movie;
//    }

    @Bean
    public Cast srk(){
        Cast cast = new Cast();
        cast.setFirstName("asdasdsa");
        cast.setLastName("uiioiiuiu");
        return cast;
    }
//    @Bean
//    public String name(){
//        return "RRR";
//    }

//    public MovieService movieService(MovieDAO movieDAO){
//        return new MovieService(movieDAO, "RRR", "Jr.NTR");
//    }

//    @Bean
//    public MovieDAO movieDAO(){
//        return new MovieDAO();
//    }

//    @Bean
//    public MovieService movieService(MovieDAO movieDAO){
//        return new MovieService(movieDAO);
//    }

//    @Bean
//    public MovieBO movieBO(){
//        return new MovieBO();
//    }
}
