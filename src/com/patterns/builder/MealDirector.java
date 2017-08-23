package com.patterns.builder;

/**
 * Created by AbhishekH on 8/8/17.
 */
public class MealDirector {

    public Meal createMeal(MealBuilder mealBuilder) {
        mealBuilder.buildDrink();
        mealBuilder.buildGift();
        mealBuilder.buildMainDish();
        mealBuilder.buildSide();
        return mealBuilder.getMeal();
    }
}
