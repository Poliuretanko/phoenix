package com.poliuretanko.education.patterns.adapter;

public class GooseDuckAdapter implements Duck {

    private final Goose goose;

    public GooseDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public String quack() {
        return goose.honk();
    }
}