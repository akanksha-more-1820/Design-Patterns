package com.akanksha.Adapter;

public class WeightMachineAdapterImpl implements WeightMachine {

    private double weight;
    @Override
    public double getWeightPound() {

        return this.weight*0.45;
    }

    public WeightMachineAdapterImpl(WeightMachine weight) {
        this.weight = weight.getWeightPound();
    }

    //WeightMachine weightMachine;
}
