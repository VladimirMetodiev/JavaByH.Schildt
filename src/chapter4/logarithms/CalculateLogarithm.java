package chapter4.logarithms;

import java.util.Scanner;

public class CalculateLogarithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a base:");
        double base = Double.parseDouble(input.nextLine());
        System.out.println("Enter a number:");
        double number = Double.parseDouble(input.nextLine());

        Logarithm log = new Logarithm(base, number);

        log.calculate();
    }
}
