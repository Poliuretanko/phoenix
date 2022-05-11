package com.poliuretanko.education.patterns.eventaggregator;

public class OnlineStoreIntegration implements Subscriber {

    public OnlineStoreIntegration(EventAggregator eventAggregator) {
        eventAggregator.subscribe(this);
    }

    @Override
    public void onCreate(Key key) {
        System.out.println("Create a subscription in online store");
    }

    @Override
    public void onTerminate(Key key) {
        System.out.println("Cancel the subscription in online store");
    }

    @Override
    public void onRenew(Key key) {
        System.out.println("Prolongate the subscription in online store");
    }
}
