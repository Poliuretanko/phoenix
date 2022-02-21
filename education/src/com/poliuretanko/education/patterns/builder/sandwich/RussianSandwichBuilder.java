package com.poliuretanko.education.patterns.builder.sandwich;

import java.util.ArrayList;
import java.util.List;

public class RussianSandwichBuilder extends SandwichBuilder {

    @Override
    void prepareBread() {
        sandwich.setBreadType(Sandwich.BreadType.white);
        sandwich.setToasted(true);
    }

    @Override
    void applySauses() {
        List<Sandwich.Sause> sauses = new ArrayList<>();
        sauses.add(Sandwich.Sause.mustard);
        sandwich.setSauses(sauses);
    }

    @Override
    void applyAdditions() {
        List<Sandwich.Addition> additions = new ArrayList<>();
        additions.add(Sandwich.Addition.bacon);
        sandwich.setAdditions(additions);
    }
}
