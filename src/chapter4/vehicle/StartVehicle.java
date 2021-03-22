package chapter4.vehicle;

public class StartVehicle {
    public static void main(String[] args){

        Vehicle minivan = new Vehicle();
        double range;

        minivan.passengers = 7;
        minivan.fuelCapacity = 60;
        minivan.kilometersPerLiter = 5.7;

        range = minivan.fuelCapacity * minivan.kilometersPerLiter;

        System.out.printf("Minivan can carry %d passengers with a range of %.1f km.%n", minivan.passengers, range);
    }
}
