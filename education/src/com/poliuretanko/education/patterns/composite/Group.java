package com.poliuretanko.education.patterns.composite;

import java.util.HashSet;
import java.util.Set;

public class Group implements Party {
    private final String name;
    private final Set<Party> parties;

    public Group(String name) {
        this.name = name;
        parties = new HashSet<>();
    }

    public void add(Party party) {
        parties.add(party);
    }

    public String getName() {
        return name;
    }

    public Set<Party> getParties() {
        return parties;
    }

    @Override
    public void setGold(int value) {
        int valueForEach = value / parties.size();
        int leftOver = value % parties.size();
        for (Party party : parties) {
            party.setGold(valueForEach + leftOver);
            leftOver = 0;
        }
    }

    @Override
    public int getGold() {
        int sum = 0;
        for (Party party : parties) {
            sum += party.getGold();
        }
        return sum;
    }

    @Override
    public String stats() {
        StringBuilder builder = new StringBuilder();
        parties.forEach(party -> builder.append("\n\t").append(party.stats()));
        return builder.toString();
    }
}
