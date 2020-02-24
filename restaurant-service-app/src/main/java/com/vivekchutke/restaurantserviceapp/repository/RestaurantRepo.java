package com.vivekchutke.restaurantserviceapp.repository;

import com.vivekchutke.restaurantserviceapp.entity.MealSingleEntity;
import com.vivekchutke.restaurantserviceapp.entity.MealWithEmbeddedClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<MealWithEmbeddedClass, Long> {      //<MealSingleEntity, Long> {
}
