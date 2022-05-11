package com.poliuretanko.education.patterns.eventaggregator.events;

import com.poliuretanko.education.patterns.eventaggregator.Key;

public class Renew extends KeyEvent{
    public Renew(Key key) {
        super(key);
    }
}
