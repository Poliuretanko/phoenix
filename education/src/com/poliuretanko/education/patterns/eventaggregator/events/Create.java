package com.poliuretanko.education.patterns.eventaggregator.events;

import com.poliuretanko.education.patterns.eventaggregator.Key;

public class Create extends KeyEvent {
    public Create(Key key) {
        super(key);
    }
}
