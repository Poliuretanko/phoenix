package com.poliuretanko.education.patterns.builder.sandwich;

import java.util.ArrayList;
import java.util.List;

public class CologneSandwichBulder extends SandwichBuilder {

    @Override
    void prepareBread() {
        sandwich.setBreadType(Sandwich.BreadType.gray);
        sandwich.setToasted(true);
    }

    @Override
    void applySauses() {
        List<Sandwich.Sause> sauses = new ArrayList<>();
        sauses.add(Sandwich.Sause.mayonnaise);
        sandwich.setSauses(sauses);
    }

    @Override
    void applyAdditions() {
        List<Sandwich.Addition> additions = new ArrayList<>();
        additions.add(Sandwich.Addition.cheese);
        additions.add(Sandwich.Addition.cheese);
        sandwich.setAdditions(additions);
    }
}
