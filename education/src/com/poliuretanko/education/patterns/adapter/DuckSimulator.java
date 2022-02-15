package com.poliuretanko.education.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        ducks.add(new GooseDuckAdapter(new Goose()));

        ducks.forEach(duck -> System.out.println(duck.quack()));
    }
}
