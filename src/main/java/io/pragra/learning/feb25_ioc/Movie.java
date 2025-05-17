package io.pragra.learning.feb25_ioc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Movie {
    private Integer movieId;
    private String movieName;
    private Integer releaseYear;
    private String genre;
    private Cast cast;

    public void setup(){
        System.out.println("opening a delivery stream");
    }

    public void destroy(){
        System.out.println("closing delivery stream");
    }
    //private Map<String,Integer> castSalaries;

}
