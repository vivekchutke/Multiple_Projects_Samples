package com.vivekchutke.restaurantserviceapp;

import com.vivekchutke.restaurantserviceapp.entity.Allergens;
import com.vivekchutke.restaurantserviceapp.entity.AllergensWithEmbeddedClass;
import com.vivekchutke.restaurantserviceapp.entity.MealSingleEntity;
import com.vivekchutke.restaurantserviceapp.entity.MealWithEmbeddedClass;
import com.vivekchutke.restaurantserviceapp.repository.RestaurantRepo;
import com.vivekchutke.restaurantserviceapp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class RestaurantServiceAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantServiceAppApplication.class, args);
	}

	@Autowired
	private RestaurantRepo restaurantRepo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("**********Insertion of record");
//		MealSingleEntity meal = new MealSingleEntity();
//		meal.setCelery(true);
//		meal.setDescription("Chicken Sandwich");
//		meal.setName("Sandwich");
//		meal.setPeanuts(false);
//		meal.setPrice(new BigDecimal(15.00));
//		meal.setSesameSeeds(true);
//		restaurantRepo.save(meal);

		//Embedded Example
		MealWithEmbeddedClass meal = new MealWithEmbeddedClass();
		AllergensWithEmbeddedClass allergens = new AllergensWithEmbeddedClass();
		allergens.setCelery(true);
		meal.setDescription("Ceaser Sandwich");
		meal.setName("Sandwich");
		allergens.setPeanuts(true);
		meal.setPrice(new BigDecimal(13.65));
		allergens.setSesameSeeds(true);
		meal.setAllergens(allergens);
		restaurantRepo.save(meal);
	}
}
