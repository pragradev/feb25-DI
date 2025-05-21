package io.pragra.learning.feb25_ioc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Movie {
    private Integer movieId;
    private String movieName;
    private String directorName;
    private String actorName;
}
