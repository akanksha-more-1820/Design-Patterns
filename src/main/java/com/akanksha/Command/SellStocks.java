package com.akanksha.Command;

public class SellStocks implements Order{

    Stocks stocks;
    @Override
    public void execute() {
        this.stocks.sellStocks();
    }

    public SellStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
