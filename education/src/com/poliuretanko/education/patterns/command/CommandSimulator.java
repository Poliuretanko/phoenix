package com.poliuretanko.education.patterns.command;

public class CommandSimulator {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        String result = executor.execute(args);
        System.out.println(result);
    }
}
