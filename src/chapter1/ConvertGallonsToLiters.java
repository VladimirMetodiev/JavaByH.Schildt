package chapter1;

import java.util.Scanner;

public class ConvertGallonsToLiters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity in gallons:");
        double gallons = Double.parseDouble(input.nextLine());
        double liters;

        liters = gallons * 3.7854;
        System.out.printf("%.2f gallons are %.2f liters.", gallons, liters);
    }
}



//Condition

//Конвертирайте галони в литри.



//Tests

//4
//4,00 gallons are 15,14 liters.

//10
//10,00 gallons are 37,85 liters.
