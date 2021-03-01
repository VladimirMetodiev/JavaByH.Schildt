package chapter2;

import java.util.Scanner;

public class FromLightYearsToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some light-years:");
        int lightYears = Integer.parseInt(input.nextLine());

        while(lightYears <= 0) {
            System.out.println("Enter some light-years:");
            lightYears = Integer.parseInt(input.nextLine());
        }

        double kilometers = lightYears * 9460730472580.8;

        if(lightYears > 1) System.out.printf("%d light-years are %.3f kilometers", lightYears, kilometers);
        else System.out.printf("%d light-year is %.3f kilometers", lightYears, kilometers);
    }
}
