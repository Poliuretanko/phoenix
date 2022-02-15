package com.poliuretanko.education.patterns.bridge;

public class ReversedFormatter implements Formatter{
    @Override
    public String format(String key, String value) {
        String reversedValue = new StringBuilder(value).reverse().toString();
        return key + ": " + reversedValue;
    }
}
