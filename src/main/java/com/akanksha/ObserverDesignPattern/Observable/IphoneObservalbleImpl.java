package com.akanksha.ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;
import com.akanksha.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservalbleImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount =0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer: observerList){

            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {

        stockCount = stockCount + newStockAdded;
        if(stockCount > 0){
            notifySubscriber();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
