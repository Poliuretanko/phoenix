package com.poliuretanko.education.patterns.command.greeting;

public class HelloGreeter implements Greeter, GreeterFactory {

    private String name;

    public HelloGreeter(String name) {
        this.name = name;
    }

    public HelloGreeter() {
    }

    @Override
    public String greet() {
        return "Hello, " + name + "!";
    }

    @Override
    public String getDescription() {
        return "-h printing hello greeting for the [name]";
    }

    @Override
    public HelloGreeter create( String[] args ) {
        return new HelloGreeter(args[1]);
    }
}
