package com.akanksha.ObserverDesignPattern.Observer;

import com.akanksha.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is back in stock");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println(msg+" mail sent to " + emailId);


    }
}
