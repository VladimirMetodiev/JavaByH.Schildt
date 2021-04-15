package chapter8.vehicles;

public interface InterfaceVehicle {
    public double range();
    public double fuelNeeded(double kilometers);
    public String getProducer();
    public void setProducer(String producer);
    public String getModel();
    public void setModel(String model);
    public int getPassengers();
    public void setPassengers(int passengers);
    public int getFuelCapacity();
    public void setFuelCapacity(int fuelCapacity);
    public double getKilometersPerLiter();
    public void setKilometersPerLiter(double kilometersPerLiter);
}
