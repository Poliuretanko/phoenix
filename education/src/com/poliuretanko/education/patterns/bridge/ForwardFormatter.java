package com.poliuretanko.education.patterns.bridge;

public class ForwardFormatter implements Formatter{

    @Override
    public String format(String key, String value) {
        return key + ": " + value;
    }
}
