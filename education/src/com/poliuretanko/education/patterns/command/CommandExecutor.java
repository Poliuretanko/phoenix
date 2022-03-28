package com.poliuretanko.education.patterns.command;

import com.poliuretanko.education.patterns.command.greeting.Greeter;
import com.poliuretanko.education.patterns.command.greeting.GreeterDispatcher;

public class CommandExecutor {

    GreeterDispatcher dispatcher = new GreeterDispatcher();

    public String execute(String[] args) {
        if (args.length > 0) {
            Greeter greeter = dispatcher.parse(args);
            return greeter.greet();
        }
        return dispatcher.getUsage();
    }
}
