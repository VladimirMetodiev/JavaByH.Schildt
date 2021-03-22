package chapter4.vehicle;

public class StartTwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();

        minivan.producer = "Ford";
        minivan.model = "Galaxy";
        minivan.passengers = 7;
        minivan.fuelCapacity = 60;
        minivan.kilometersPerLiter = 5.8;

        Vehicle sportCar = new Vehicle("Ford", "Mustang", 2, 61, 6.45);

        System.out.printf("%s %s can carry %d passengers with a range of %.1f km.%n", minivan.producer, minivan.model, minivan.passengers, minivan.range());
        System.out.printf("%s %s can carry %d passengers with a range of %.1f km.%n", sportCar.producer, sportCar.model, sportCar.passengers, sportCar.range());

        if (sportCar.range() > minivan.range()){
            System.out.println("The car travels a greater distance than the minivan.");
        }
        else if (sportCar.range() < minivan.range()){
            System.out.println("The minivan travels a greater distance than the car.");
        }
        else {
            System.out.println("They travel the same distance.");
        }
    }
}
