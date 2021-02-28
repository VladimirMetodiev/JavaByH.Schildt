package chapter1;

public class DifferencesBetweenIntAndDouble {
    public static void main(String[] args) {
        int number = 10;
        double realNumber = 10d;

        System.out.println("Original value of number: " + number);
        System.out.println("Original value of realNumber: " + realNumber + "\n");

        number = number / 4;
        realNumber = realNumber / 4.0;

        System.out.println("number after division: " + number);
        System.out.println("realNumber after division: " + realNumber);
    }
}
