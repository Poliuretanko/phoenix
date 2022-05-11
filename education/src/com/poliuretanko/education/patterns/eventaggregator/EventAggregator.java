package com.poliuretanko.education.patterns.eventaggregator;

import com.poliuretanko.education.patterns.eventaggregator.events.Event;

public interface EventAggregator<T> {
    void subscribe(Subscriber subscriber);

    void publish(Event<T> event);
}
