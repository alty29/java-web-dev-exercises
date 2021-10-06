package org.launchcode.java.demos.lsn5unittesting.main;

public class Car {

    private String make;
    private String model;
    private int gasTankSize;
    private double gasTankLevel;
    private double milesPerGallon;
    private double odometer = 0;

    public Car(String make, String model, int gasTankSize, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.gasTankSize = gasTankSize;
        // Gas tank level defaults to a full tank
        this.gasTankLevel = gasTankSize;
        this.milesPerGallon = milesPerGallon;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(int gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public void setGasTankLevel(double gasTankLevel) {
        if (gasTankLevel > this.getGasTankSize()) {
            throw new IllegalArgumentException("Can't exceed tank size");
        }
        this.gasTankLevel = gasTankLevel;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getOdometer() {
        return odometer;
    }

    public void drive(double miles)
    {
        double maxDistance = this.milesPerGallon * this.gasTankLevel;
        double milesAbleToTravel = miles > maxDistance ? maxDistance : miles;
        double gallonsUsed = milesAbleToTravel / this.milesPerGallon;
        this.gasTankLevel = this.gasTankLevel - gallonsUsed;
        this.odometer += milesAbleToTravel;
    }

    public void addGas(double gas) {
        this.setGasTankLevel(gas + this.getGasTankLevel());
    }

}