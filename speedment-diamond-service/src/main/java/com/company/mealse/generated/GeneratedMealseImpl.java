package com.company.mealse.generated;

import com.company.mealse.Mealse;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.mealse.Mealse}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMealseImpl implements Mealse {
    
    private long id;
    private String description;
    private String name;
    private BigDecimal price;
    
    protected GeneratedMealseImpl() {}
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public Optional<BigDecimal> getPrice() {
        return Optional.ofNullable(price);
    }
    
    @Override
    public Mealse setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Mealse setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public Mealse setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Mealse setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "          + Objects.toString(getId()));
        sj.add("description = " + Objects.toString(OptionalUtil.unwrap(getDescription())));
        sj.add("name = "        + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("price = "       + Objects.toString(OptionalUtil.unwrap(getPrice())));
        return "MealseImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Mealse)) { return false; }
        final Mealse thatMealse = (Mealse)that;
        if (this.getId() != thatMealse.getId()) { return false; }
        if (!Objects.equals(this.getDescription(), thatMealse.getDescription())) { return false; }
        if (!Objects.equals(this.getName(), thatMealse.getName())) { return false; }
        if (!Objects.equals(this.getPrice(), thatMealse.getPrice())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescription()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrice()));
        return hash;
    }
}