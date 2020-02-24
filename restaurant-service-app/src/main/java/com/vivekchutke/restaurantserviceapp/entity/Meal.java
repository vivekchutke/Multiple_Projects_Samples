package com.vivekchutke.restaurantserviceapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

//@Data
//@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="meal")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    private String description;
    private BigDecimal price;
//    @OneToOne(mappedBy = "meal")
    private Allergens allergens;

}
