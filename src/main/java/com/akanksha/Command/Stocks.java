package com.akanksha.Command;

public class Stocks {

    private String name="HDFC";
    private int quantity=10;

    public void buyStocks(){
        System.out.println("bought "+name+" quantity = "+quantity);
    }

    public void sellStocks(){
        System.out.println("sold "+name+" quantity = "+quantity);
    }
}
