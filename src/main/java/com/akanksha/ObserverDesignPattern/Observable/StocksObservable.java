package com.akanksha.ObserverDesignPattern.Observable;

import com.akanksha.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);


    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
