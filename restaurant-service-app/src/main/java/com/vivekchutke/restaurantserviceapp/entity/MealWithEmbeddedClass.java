package com.vivekchutke.restaurantserviceapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "mealse")
@NoArgsConstructor
@AllArgsConstructor
@SecondaryTable(name = "allergens", pkJoinColumns = @PrimaryKeyJoinColumn(name = "meal_id"))
public class MealWithEmbeddedClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    private String description;
    private BigDecimal price;
    @Embedded
    private AllergensWithEmbeddedClass allergens;
}
