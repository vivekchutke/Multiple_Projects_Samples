package com.vivekchutke.restaurantserviceapp.controller;

import com.vivekchutke.restaurantserviceapp.entity.MealSingleEntity;
import com.vivekchutke.restaurantserviceapp.entity.MealWithEmbeddedClass;
import com.vivekchutke.restaurantserviceapp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController  {

    @Autowired
    private RestaurantService restaurantService;

//    @GetMapping("/")
//    public List<MealSingleEntity> getallMeals() {
//    return restaurantService.testing();
//    }

    @GetMapping("/")
    public List<MealWithEmbeddedClass> getallMeals() {
        return restaurantService.testing();
    }
}
