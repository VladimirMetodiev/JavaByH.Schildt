package chapter1;

import java.util.Scanner;

public class HowMuchDoYouWeighOnTheMoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double weight = Double.parseDouble(input.nextLine());

        weight *= 0.165;

        System.out.printf("%.2f kilograms", weight);
    }
}
