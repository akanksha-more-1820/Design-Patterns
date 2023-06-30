package com.akanksha.strategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SpecialDriveStrategy());
    }
}
