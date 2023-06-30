package com.akanksha.Command;

public class BuyStocks implements Order{

    Stocks stocks;
    @Override
    public void execute() {
       this.stocks.buyStocks();
    }

    public BuyStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
