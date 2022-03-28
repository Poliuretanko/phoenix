package com.poliuretanko.education.patterns.command.greeting;

public class FuckGreeter implements Greeter, GreeterFactory {

    private String name;

    public FuckGreeter(String name) {
        this.name = name;
    }

    public FuckGreeter() {
    }

    @Override
    public String greet() {
        return "Hi, " + name + "! Fuck you!!!";
    }

    @Override
    public String getDescription() {
        return "-t printing fuck greeting for the [name]";
    }

    public FuckGreeter create( String[] args ) {
        return new FuckGreeter(args[1]);
    }
}
