package com.vivekchutke.reactivepgm.netfluxreactiveexample.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@NoArgsConstructor
@Document
public class MovieEvent {
    private String movieId;
    private Date date;


}

