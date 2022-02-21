package com.poliuretanko.education.patterns.builder.sandwich;

public class SandwichMaker {

    private final SandwichBuilder builder;

    public SandwichMaker(SandwichBuilder builder) {
        this.builder = builder;
    }

    public void makeSandwich() {
        builder.createNewSandwich();
        builder.prepareBread();
        builder.applyAdditions();
        builder.applySauses();
    }

    public Sandwich getSandwich() {
        return builder.getSandwich();
    }
}
