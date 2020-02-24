package com.vivekchutke.reactivepgm.netfluxreactiveexample.repository;

import com.vivekchutke.reactivepgm.netfluxreactiveexample.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}

