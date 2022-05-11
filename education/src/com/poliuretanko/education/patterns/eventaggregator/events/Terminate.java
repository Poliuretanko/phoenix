package com.poliuretanko.education.patterns.eventaggregator.events;

import com.poliuretanko.education.patterns.eventaggregator.Key;

public class Terminate extends KeyEvent {
    public Terminate(Key key) {
        super(key);
    }
}
