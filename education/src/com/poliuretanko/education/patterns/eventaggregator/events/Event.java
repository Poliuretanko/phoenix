package com.poliuretanko.education.patterns.eventaggregator.events;

public interface Event<T> {
    T getObject();
}
