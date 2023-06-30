package com.akanksha.AbstractFactory;

public class SpFee implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 2000;
    }
}
