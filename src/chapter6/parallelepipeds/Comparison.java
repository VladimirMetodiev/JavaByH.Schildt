package chapter6.parallelepipeds;

import java.util.Locale;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter parallelepiped sides:");
        Parallelepiped obj1 = new Parallelepiped(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Enter parallelepiped sides:");
        Parallelepiped obj2 = new Parallelepiped(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if(Parallelepiped.compareShapes(obj1, obj2)) {
            System.out.println("The parallelepipeds are the same.");
        }
        else{
            System.out.printf("The first parallelepiped has volume: %.2f%n", obj1.getVolume());
            System.out.printf("The second parallelepiped has volume: %.2f%n", obj2.getVolume());
        }
    }
}
