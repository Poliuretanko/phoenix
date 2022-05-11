package com.poliuretanko.education.patterns.decorator;

public class RestaurantSimulator {
    public static void main(String[] args) {
        Meal pizzaFull = new Tomatos(new Pepper(new Cheese(new Ham(new Pizza()))));
        Meal pizzaLight = new Tomatos(new Pepper(new Pizza()));
        Meal lasagna = new Tomatos(new Cheese(new Ham(new Lasagna())));

        System.out.println(pizzaFull.getDescription());
        System.out.println(pizzaFull.getCost());

        System.out.println(pizzaLight.getDescription());
        System.out.println(pizzaLight.getCost());

        System.out.println(lasagna.getDescription());
        System.out.println(lasagna.getCost());
    }
}
