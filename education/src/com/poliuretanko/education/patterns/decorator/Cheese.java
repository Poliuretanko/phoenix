package com.poliuretanko.education.patterns.decorator;

public class Cheese extends Addition {

    public Cheese(Meal meal) {
        super(meal);
        description = "Cheese";
        cost = 1.5;
    }
}
