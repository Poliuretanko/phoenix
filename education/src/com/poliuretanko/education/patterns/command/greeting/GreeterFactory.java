package com.poliuretanko.education.patterns.command.greeting;

public interface GreeterFactory {
    Greeter create(String[] args);

    String getDescription();
}
