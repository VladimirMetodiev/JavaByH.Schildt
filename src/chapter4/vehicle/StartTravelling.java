package chapter4.vehicle;

import java.util.Locale;
import java.util.Scanner;

public class StartTravelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        Vehicle suv = new Vehicle();
        suv.producer = "Volkswagen";
        suv.model = "Atlas";
        suv.passengers = 5;
        suv.fuelCapacity = 70;
        suv.kilometersPerLiter = 6.4;

        System.out.println("Enter the length of the journey:");
        double distance = input.nextDouble();

        System.out.printf("%s %s needs %.1f liters of petrol.%n", suv.producer, suv.model, suv.fuelNeeded(distance));
    }
}
