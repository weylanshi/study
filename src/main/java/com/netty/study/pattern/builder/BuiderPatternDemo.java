package com.netty.study.pattern.builder;

public class BuiderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("nonVegMeal");
        nonVegMeal.showItems();
        System.out.println("cost: "+nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("VegMeal :");
        vegMeal.showItems();
        System.out.println("Total cost :"+vegMeal.getCost());

    }
}
