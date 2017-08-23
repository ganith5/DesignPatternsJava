package com.patterns.builder;

/**
 * Created by AbhishekH on 8/8/17.
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildDrink();

    public abstract void buildGift();

    public abstract void buildMainDish();

    public abstract void buildSide();

    public abstract Meal getMeal();


}
