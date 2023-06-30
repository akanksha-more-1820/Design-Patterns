package com.akanksha.Command;

public class Broker {

    Order order;
    public Broker(Order order) {
        this.order=order;
    }

    public void placeOrder(){
        this.order.execute();
    }
}
