package com.poliuretanko.education.patterns.composite;

public class Player implements Party {
    private final String name;

    private int gold;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setGold(int value) {
        gold = value;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public String stats() {
        return name + " earned " + gold + " gold";
    }
}
