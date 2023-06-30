package com.akanksha.strategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
