package chapter4.vehicle;

public class Lorry extends Vehicle {
    private double tonnage = 0.0;

    public Lorry (String producer, String model, int passengers, int fuelCapacity, double kilometersPerLiter, double tonnage) {
        super(producer, model, passengers, fuelCapacity, kilometersPerLiter);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }
}
