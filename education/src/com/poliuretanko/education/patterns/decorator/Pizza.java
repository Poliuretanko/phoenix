package com.poliuretanko.education.patterns.decorator;

public class Pizza implements Meal {

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
