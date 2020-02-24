package com.vivekchutke.restaurantserviceapp.service;

import com.vivekchutke.restaurantserviceapp.entity.Meal;
import com.vivekchutke.restaurantserviceapp.entity.MealSingleEntity;
import com.vivekchutke.restaurantserviceapp.entity.MealWithEmbeddedClass;
import com.vivekchutke.restaurantserviceapp.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vivekchutke.restaurantserviceapp.repository.RestaurantRepo;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepo restaurantRepo;

//    public List<MealSingleEntity> testing() {
//        return restaurantRepo.findAll();
//    }

    public List<MealWithEmbeddedClass> testing() {
        return restaurantRepo.findAll();
    }


}
