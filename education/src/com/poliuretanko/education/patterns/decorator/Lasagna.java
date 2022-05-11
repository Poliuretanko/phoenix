package com.poliuretanko.education.patterns.decorator;

public class Lasagna implements Meal {
    @Override
    public String getDescription() {
        return "Lasagna";
    }

    @Override
    public double getCost() {
        return 7;
    }
}
