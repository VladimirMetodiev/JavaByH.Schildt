package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = Double.parseDouble(input.nextLine());
        System.out.println("Enter a height:");
        double height = Double.parseDouble(input.nextLine());

        double volume = 3.1416 *  pow(radius, 2) * height;

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Volume is: " + df.format(volume));
    }
}
