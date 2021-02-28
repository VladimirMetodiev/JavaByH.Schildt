package chapter1;

public class GalToLitTable {
    public static void main(String[] args) {
        int counter = 0;
        double litters;

        for (int a = 1; a <= 100; a++) {
            counter++;
            litters = a * 3.7854;

            if(a > 1) System.out.printf("|%5d gallons|%5.2f litters|%n", a, litters);
            else System.out.printf("|%5d gallon |%5.2f litters|%n", a, litters);

            if(counter == 10) {
                counter = 0;
                System.out.println();
            }
        }
    }
}
