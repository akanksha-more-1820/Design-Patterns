package com.akanksha.Command;

public class DemoStocks {

    public static void main(String[] args) {

        Stocks stocks = new Stocks();
        BuyStocks buyStocks=new BuyStocks(stocks);
        Broker broker=new Broker(buyStocks);
        broker.placeOrder();

        SellStocks sellStocks=new SellStocks(stocks);
        Broker broker1=new Broker(sellStocks);
        broker1.placeOrder();
    }
}
