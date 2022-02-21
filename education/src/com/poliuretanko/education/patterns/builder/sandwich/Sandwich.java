package com.poliuretanko.education.patterns.builder.sandwich;

import java.util.List;

public class Sandwich {

    private BreadType breadType;
    private boolean isToasted;
    private List<Addition> additions;
    private List<Sause> sauses;

    void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    void setAdditions(List<Addition> additions) {
        this.additions = additions;
    }

    void setSauses(List<Sause> sauses) {
        this.sauses = sauses;
    }

    public String getDescription() {
        return "Sandwich on " + breadType + " bread."
                + (isToasted ? " Toasted." : "")
                + " with additions: " + additions
                + " with sauses: " + sauses;
    }

    public enum BreadType {
        white,
        gray,
        black
    }

    public enum Addition {
        cheese,
        bacon
    }

    public enum Sause {
        mayonnaise,
        mustard
    }
}
