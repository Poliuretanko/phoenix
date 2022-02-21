package com.poliuretanko.education.patterns.builder.sandwich;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public void createNewSandwich() {
        sandwich = new Sandwich();
    }

    abstract void prepareBread();
    abstract void applyAdditions();
    abstract void applySauses();

    public Sandwich getSandwich() {
        return sandwich;
    }
}
