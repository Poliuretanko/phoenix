package com.poliuretanko.education.patterns.eventaggregator.events;

import com.poliuretanko.education.patterns.eventaggregator.Key;

public class KeyEvent implements Event<Key>{
    private final Key key;

    public KeyEvent(Key key) {
        this.key = key;
    }

    @Override
    public Key getObject() {
        return key;
    }
}
