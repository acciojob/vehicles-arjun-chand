package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public String getVehicleName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
