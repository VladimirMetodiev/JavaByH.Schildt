package chapter4.vehicle;

import java.util.Locale;
import java.util.Scanner;

public class StartRetroCars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Vehicle vwKaefer = new Vehicle("Volkswagen", "Kaefer", 4, 40, 5.2);
        Vehicle vxGolf = new Vehicle("Volkswagen", "Golf", 5, 55, 8.6);

        System.out.println("Enter the length of the journey:");
        double distance = input.nextDouble();

        System.out.printf("%s %s can travel %.2f kilometers with %.1f liters of petrol.%n", vwKaefer.producer, vwKaefer.model, distance, vwKaefer.fuelNeeded(distance));
        System.out.printf("%s %s can travel %.2f kilometers with %.1f liters of petrol.%n", vxGolf.producer, vxGolf.model, distance, vxGolf.fuelNeeded(distance));

    }
}
