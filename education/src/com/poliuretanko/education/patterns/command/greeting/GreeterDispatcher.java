package com.poliuretanko.education.patterns.command.greeting;


import java.util.HashMap;
import java.util.Map;

public class GreeterDispatcher {

    private final Map<String, GreeterFactory> greeterMap;

    public GreeterDispatcher() {
        greeterMap = new HashMap<>();
        greeterMap.put("-h", new HelloGreeter());
        greeterMap.put("-t", new FuckGreeter());
        greeterMap.put("-k", new KekGreeter());
        greeterMap.put("-n", new NotFoundGreeter());
    }

    public Greeter parse(String[] args) {
        if (args.length > 0 && greeterMap.containsKey(args[0])) {
            GreeterFactory factory = greeterMap.get(args[0]);
            return factory.create(args);
        }
        return greeterMap.get("-n").create(args);
    }

    public String getUsage() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usage: <Command> <Args>[optional]\nCommands:");
        for (GreeterFactory factory : greeterMap.values()) {
            builder.append("\n\t").append(factory.getDescription());
        }
        return builder.toString();
    }
}
