package com.poliuretanko.education.patterns.bridge;

public class LengthCuttingFormatter implements Formatter {

    private final int lengthToRetain;

    public LengthCuttingFormatter(int lengthToRetain) {
        this.lengthToRetain = lengthToRetain;
    }

    @Override
    public String format(String key, String value) {
        String cutValue = value.length() > lengthToRetain ? value.substring(0, lengthToRetain - 1) + "..." : value;
        return key + ": " + cutValue;
    }
}
