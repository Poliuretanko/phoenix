package com.poliuretanko.education.patterns.builder;

import com.poliuretanko.education.patterns.builder.sandwich.CologneSandwichBulder;
import com.poliuretanko.education.patterns.builder.sandwich.RussianSandwichBuilder;
import com.poliuretanko.education.patterns.builder.sandwich.Sandwich;
import com.poliuretanko.education.patterns.builder.sandwich.SandwichMaker;

public class SandwichMakerSimulator {
    public static void main(String[] args) {
        SandwichMaker maker = new SandwichMaker(new RussianSandwichBuilder());
        maker.makeSandwich();
        Sandwich sandwich1 = maker.getSandwich();
        System.out.println(sandwich1.getDescription());
        SandwichMaker maker2 = new SandwichMaker(new CologneSandwichBulder());
        maker2.makeSandwich();
        Sandwich sandwich2 = maker2.getSandwich();
        System.out.println(sandwich2.getDescription());
    }
}
