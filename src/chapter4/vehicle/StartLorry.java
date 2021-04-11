package chapter4.vehicle;

import java.util.Locale;
import java.util.Scanner;

public class StartLorry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        Lorry articulatedLorry = new Lorry("Volvo", "FH", 2, 600, 0.8, 325);

        System.out.printf("Maximum range of articulated lorry %s with %.1f tons of load is: %.1f km.%n", articulatedLorry.producer, articulatedLorry.getTonnage(), articulatedLorry.range());

        System.out.println("Enter the length of the journey:");
        double distance = input.nextDouble();

        System.out.printf("%s %s needs %.1f liters of petrol.%n", articulatedLorry.producer, articulatedLorry.model, articulatedLorry.fuelNeeded(distance));
    }
}

