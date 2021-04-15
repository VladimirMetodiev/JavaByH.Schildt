package chapter8.vehicles;

public class AnotherVehicle implements InterfaceVehicle{
    private String producer = null;
    private String model = null;
    private int passengers = 0;
    private int fuelCapacity = 0;
    private double kilometersPerLiter = 0.0;

    public AnotherVehicle() {
    }

    @Override
    public double range() {
        return fuelCapacity * kilometersPerLiter;
    }

    @Override
    public double fuelNeeded(double kilometers){
        return kilometers / kilometersPerLiter;
    }

    @Override
    public String getProducer() {
        return producer;
    }

    @Override
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public double getKilometersPerLiter() {
        return kilometersPerLiter;
    }

    @Override
    public void setKilometersPerLiter(double kilometersPerLiter) {
        this.kilometersPerLiter = kilometersPerLiter;
    }

    @Override
    public String toString() {
        return String.format("%s %s can carry %d passengers with a range of %.1f km.", producer, model, passengers, range());
    }
}
