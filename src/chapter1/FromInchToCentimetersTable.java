package chapter1;

public class FromInchToCentimetersTable {
    public static void main(String[] args) {
        int counter = 0;
        double centimeters;

        for (int a = 1; a <= 100; a++) {
            counter++;
            centimeters = a * 2.54;

            if(a > 1) System.out.printf("|%5d inches|%8.2f centimeters|%n", a, centimeters);
            else System.out.printf("|%5d inch  |%8.2f centimeters|%n", a, centimeters);

            if(counter == 10) {
                counter = 0;
                System.out.println();
            }
        }
    }
}
