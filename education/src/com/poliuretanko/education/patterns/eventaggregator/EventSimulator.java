package com.poliuretanko.education.patterns.eventaggregator;

import com.poliuretanko.education.patterns.eventaggregator.events.Create;
import com.poliuretanko.education.patterns.eventaggregator.events.Renew;
import com.poliuretanko.education.patterns.eventaggregator.events.Terminate;

public class EventSimulator {
    public static void main(String[] args) {
        KeyEventAggregator aggregator = new KeyEventAggregator();
        new KeyCreationCounter(aggregator);
        new OnlineStoreIntegration(aggregator);
        Key key1 = new Key(1L);
        Key key2 = new Key(2L);
        Key key3 = new Key(3L);
        Create create1 = new Create(key1);
        Create create2 = new Create(key2);
        Create create3 = new Create(key3);
        aggregator.publish(create1);
        aggregator.publish(create2);

        Renew renew2 = new Renew(key2);
        aggregator.publish(renew2);

        Terminate terminate1 = new Terminate(key1);
        Terminate terminate2 = new Terminate(key2);
        Terminate terminate3 = new Terminate(key3);
        aggregator.publish(terminate1);

        aggregator.publish(create3);

        aggregator.publish(terminate2);
        aggregator.publish(terminate3);
    }
}
