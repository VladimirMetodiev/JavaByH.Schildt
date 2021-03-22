package chapter4.vehicle;

public class Vehicle {
    String producer = null;
    String model = null;
    int passengers = 0;                     // number of passengers
    int fuelCapacity = 0;                   // fuel capacity in gallons
    double kilometersPerLiter = 0.0;        // fuel consumption in kilometers per liter

    public Vehicle() {
    }

    public Vehicle(String producer, String model, int passengers, int fuelCapacity, double kilometersPerLiter) {
        this.producer = producer;
        this.model = model;
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.kilometersPerLiter = kilometersPerLiter;
    }

    protected double range() {
        return fuelCapacity * kilometersPerLiter;
    }

    protected double fuelNeeded(double kilometers){
        return kilometers / kilometersPerLiter;
    }
}
