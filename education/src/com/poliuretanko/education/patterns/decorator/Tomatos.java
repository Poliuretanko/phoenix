package com.poliuretanko.education.patterns.decorator;

public class Tomatos extends Addition {
    public Tomatos(Meal meal) {
        super(meal);
        description = "Tomatos";
        cost = 0.5;
    }
}
