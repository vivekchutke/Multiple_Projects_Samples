package com.vivekchutke.reactivepgm.netfluxreactiveexample.bootstrap;

import com.vivekchutke.reactivepgm.netfluxreactiveexample.domain.Movie;
import com.vivekchutke.reactivepgm.netfluxreactiveexample.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class BootStrapComandLineTest implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(BootStrapComandLineTest.class);
    private final MovieRepository movieRepository;

    public BootStrapComandLineTest(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("***************Into BootStrapComandLineTest to demonstrate the Input/Output Movie names saved in mongoDB");

        // Clearning the mongoDb before insering the new data
        movieRepository.deleteAll().block();

        Flux.just("1. Star Wars", "2. Terminator", "3. Jurassi Park", "4. Fun and Frustrction", "5. Bahubali").
                map(title -> new Movie(title, UUID.randomUUID().toString())).flatMap(movie -> movieRepository.save(movie)).subscribe(null,null, () -> {
                    movieRepository.findAll().subscribe(System.out::println);
        });

    }
}
