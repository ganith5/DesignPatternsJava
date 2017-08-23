package com.patterns.builder;

/**
 * Created by AbhishekH on 8/8/17.
 */
public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder;
        MealDirector mealDirector = new MealDirector();
        boolean isKids = true;

        if(isKids) {
            mealBuilder = new KidsMealBuilder();
            Meal meal = mealDirector.createMeal(mealBuilder);

        }
    }
}
