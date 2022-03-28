package com.poliuretanko.education.patterns.composite;

public class GoldDividerSimulator {
    public static void main(String[] args) {
        Player joe = new Player("Joe");
        Player ann = new Player("Ann");
        Player pit = new Player("Pit");
        Player buz = new Player("Buz");
        Player lad = new Player("Lad");
        Player oldBob = new Player("Old Bob");
        Player newBob = new Player("New Bob");
        Group bobs = new Group("bobs");
        bobs.add(oldBob);
        bobs.add(newBob);

        Group supporters = new Group("supporters");
        supporters.add(pit);
        supporters.add(buz);
        supporters.add(lad);
        supporters.add(bobs);

        Group mainParty = new Group("All Players");
        mainParty.add(joe);
        mainParty.add(ann);
        mainParty.add(supporters);
        int earnedGold = 1022;
        mainParty.setGold(earnedGold);
        System.out.println(mainParty.stats());
    }
}
