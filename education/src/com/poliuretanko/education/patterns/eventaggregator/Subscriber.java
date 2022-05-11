package com.poliuretanko.education.patterns.eventaggregator;

import com.poliuretanko.education.patterns.eventaggregator.events.Create;
import com.poliuretanko.education.patterns.eventaggregator.events.Renew;
import com.poliuretanko.education.patterns.eventaggregator.events.Terminate;

public interface Subscriber {
    void onCreate(Key key);

    void onTerminate(Key key);

    void onRenew(Key key);
}
