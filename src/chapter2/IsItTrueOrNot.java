package chapter2;

import java.util.Scanner;

public class IsItTrueOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.println("Enter an integer or a real number:");
        x = Double.parseDouble(input.nextLine());
        System.out.println("Enter the second number:");
        y = Double.parseDouble(input.nextLine());

        boolean judge = x >= y;

        if(judge) {
            judge = x > y;

            if(judge) {
                System.out.println("x is greater than y");
            }
            else {
                System.out.println("x is equal to y");
            }
        }
        else {
            System.out.println("x is less than y");
        }
    }
}
