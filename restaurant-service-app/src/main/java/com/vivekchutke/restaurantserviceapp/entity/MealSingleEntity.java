package com.vivekchutke.restaurantserviceapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

//@Data
//@Entity
//@Table(name = "mealse")
@SecondaryTable(name ="allergens", pkJoinColumns = @PrimaryKeyJoinColumn(name="meal_id"))
@AllArgsConstructor
@NoArgsConstructor
public class MealSingleEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "peanuts", table = "allergens")
    private boolean peanuts;
    @Column(name = "celery", table = "allergens")
    private boolean celery;
    @Column(name = "sesame_seeds", table = "allergens")
    private boolean sesameSeeds;


}
