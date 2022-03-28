package com.poliuretanko.education.patterns.command.greeting;

import java.util.Arrays;

public class NotFoundGreeter implements Greeter, GreeterFactory {

    private String[] args;

    public NotFoundGreeter(String[] args) {
        this.args = args;
    }

    public NotFoundGreeter() {
    }

    @Override
    public String greet() {
        return "No greeting is found for " + Arrays.toString(args);
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public NotFoundGreeter create(String[] args) {
        return new NotFoundGreeter(args);
    }
}
