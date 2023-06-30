package com.akanksha.AbstractFactory;

public class IITBombayFee implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 10000;
    }
}
