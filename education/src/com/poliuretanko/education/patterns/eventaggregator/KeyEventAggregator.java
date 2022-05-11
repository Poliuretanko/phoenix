package com.poliuretanko.education.patterns.eventaggregator;

import com.poliuretanko.education.patterns.eventaggregator.events.Create;
import com.poliuretanko.education.patterns.eventaggregator.events.Event;
import com.poliuretanko.education.patterns.eventaggregator.events.KeyEvent;
import com.poliuretanko.education.patterns.eventaggregator.events.Terminate;

import java.util.ArrayList;
import java.util.List;

public class KeyEventAggregator implements EventAggregator<Key> {
    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void publish(Event<Key> event) {
        KeyEvent keyEvent = (KeyEvent) event;
        Key key = keyEvent.getObject();
        if (event instanceof Create) {
            subscribers.forEach(subscriber -> subscriber.onCreate(key));
        }
        if (event instanceof Terminate) {
            subscribers.forEach(subscriber -> subscriber.onTerminate(key));
        }
        if (event instanceof Create) {
            subscribers.forEach(subscriber -> subscriber.onRenew(key));
        }
    }
}
