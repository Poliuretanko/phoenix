package com.poliuretanko.education.patterns.decorator;

public abstract class Addition implements Meal {

    private final Meal meal;
    protected String description;
    protected double cost;

    public Addition(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + " with " + description;
    }

    @Override
    public double getCost() {
        return meal.getCost() + cost;
    }
}
