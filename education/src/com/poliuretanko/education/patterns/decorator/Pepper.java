package com.poliuretanko.education.patterns.decorator;

public class Pepper extends Addition {
    public Pepper(Meal meal) {
        super(meal);
        description = "Pepper";
        cost = 0.8;
    }
}
