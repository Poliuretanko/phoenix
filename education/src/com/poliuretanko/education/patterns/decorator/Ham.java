package com.poliuretanko.education.patterns.decorator;

public class Ham extends Addition {
    public Ham(Meal meal) {
        super(meal);
        description = "Ham";
        cost = 1.2;
    }
}
