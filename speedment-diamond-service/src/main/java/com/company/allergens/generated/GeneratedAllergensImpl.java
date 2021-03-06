package com.company.allergens.generated;

import com.company.allergens.Allergens;
import com.company.mealse.Mealse;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.allergens.Allergens}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAllergensImpl implements Allergens {
    
    private Boolean celery;
    private Boolean peanuts;
    private Boolean sesameSeeds;
    private long mealId;
    
    protected GeneratedAllergensImpl() {}
    
    @Override
    public OptionalBoolean getCelery() {
        return OptionalUtil.ofNullable(celery);
    }
    
    @Override
    public OptionalBoolean getPeanuts() {
        return OptionalUtil.ofNullable(peanuts);
    }
    
    @Override
    public OptionalBoolean getSesameSeeds() {
        return OptionalUtil.ofNullable(sesameSeeds);
    }
    
    @Override
    public long getMealId() {
        return mealId;
    }
    
    @Override
    public Allergens setCelery(Boolean celery) {
        this.celery = celery;
        return this;
    }
    
    @Override
    public Allergens setPeanuts(Boolean peanuts) {
        this.peanuts = peanuts;
        return this;
    }
    
    @Override
    public Allergens setSesameSeeds(Boolean sesameSeeds) {
        this.sesameSeeds = sesameSeeds;
        return this;
    }
    
    @Override
    public Allergens setMealId(long mealId) {
        this.mealId = mealId;
        return this;
    }
    
    @Override
    public Mealse findMealId(Manager<Mealse> foreignManager) {
        return foreignManager.stream().filter(Mealse.ID.equal(getMealId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("celery = "      + Objects.toString(OptionalUtil.unwrap(getCelery())));
        sj.add("peanuts = "     + Objects.toString(OptionalUtil.unwrap(getPeanuts())));
        sj.add("sesameSeeds = " + Objects.toString(OptionalUtil.unwrap(getSesameSeeds())));
        sj.add("mealId = "      + Objects.toString(getMealId()));
        return "AllergensImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Allergens)) { return false; }
        final Allergens thatAllergens = (Allergens)that;
        if (!Objects.equals(this.getCelery(), thatAllergens.getCelery())) { return false; }
        if (!Objects.equals(this.getPeanuts(), thatAllergens.getPeanuts())) { return false; }
        if (!Objects.equals(this.getSesameSeeds(), thatAllergens.getSesameSeeds())) { return false; }
        if (this.getMealId() != thatAllergens.getMealId()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCelery()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPeanuts()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSesameSeeds()));
        hash = 31 * hash + Long.hashCode(getMealId());
        return hash;
    }
}