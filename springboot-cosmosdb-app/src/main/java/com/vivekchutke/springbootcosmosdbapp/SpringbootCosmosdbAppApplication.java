package com.vivekchutke.springbootcosmosdbapp;

import com.vivekchutke.springbootcosmosdbapp.document.User;
import com.vivekchutke.springbootcosmosdbapp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Optional;

@SpringBootApplication
public class SpringbootCosmosdbAppApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootCosmosdbAppApplication.class);

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCosmosdbAppApplication.class, args);
	}

	public void run(String... var1) throws Exception {
        final User testUser = new User("3", "Tasha", "Calderon", "4567 Main St Buffalo, NY 98052");
        final User vivekUser = new User("4", "Vivek", "Chutke", "361 W Tuscan ln");

		LOGGER.info("Saving user: {}", testUser);

		// Save the User class to Azure CosmosDB database.
		final Mono<User> saveUserMono = repository.save(testUser);
		repository.save(vivekUser).block();

		final Flux<User> firstNameUserFlux = repository.findByFirstName("testFirstName");
//		final Flux<User> all = repository.findAll();

		//  Nothing happens until we subscribe to these Monos.
		//  findById will not return the user as user is not present.
		final Mono<User> findByIdMono = repository.findById(testUser.getId());
		final User findByIdUser = findByIdMono.block();
		Assert.isNull(findByIdUser, "User must be null");

		final User savedUser = saveUserMono.block();
		Assert.state(savedUser != null, "Saved user must not be null");
		Assert.state(savedUser.getFirstName().equals(testUser.getFirstName()), "Saved user first name doesn't match");

		LOGGER.info("Saved user");

		firstNameUserFlux.collectList().block();

		final Optional<User> optionalUserResult = repository.findById(testUser.getId()).blockOptional();
		Assert.isTrue(optionalUserResult.isPresent(), "Cannot find user.");

		final User result = optionalUserResult.get();
		Assert.state(result.getFirstName().equals(testUser.getFirstName()), "query result firstName doesn't match!");
		Assert.state(result.getLastName().equals(testUser.getLastName()), "query result lastName doesn't match!");

		LOGGER.info("Found user by findById : {}", result);

		LOGGER.info("******* Pulling all the users");
        Flux<User> allUsers = repository.findAll();
        allUsers.subscribe(user -> {LOGGER.info(user.toString());});

    }

	@PostConstruct
	public void setup() {
		LOGGER.info("Clear the database");
		this.repository.deleteAll().block();
	}

	@PreDestroy
	public void cleanup() {
		LOGGER.info("Cleaning up users");
		this.repository.deleteAll().block();
	}
}
