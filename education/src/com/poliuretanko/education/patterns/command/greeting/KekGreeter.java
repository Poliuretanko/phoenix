package com.poliuretanko.education.patterns.command.greeting;

public class KekGreeter implements Greeter, GreeterFactory {
    @Override
    public String greet() {
        return "Kek cheburek";
    }

    @Override
    public String getDescription() {
        return "-k printing kek";
    }

    public KekGreeter create(String[] ignore) {
        return new KekGreeter();
    }
}
