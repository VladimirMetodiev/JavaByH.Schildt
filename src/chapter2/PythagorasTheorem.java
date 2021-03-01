package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PythagorasTheorem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.println("Enter the length of the first cathetus:");
        a = Double.parseDouble(input.nextLine());

        while (a <= 0) {
            System.out.println("Enter the length of the first cathetus:");
            a = Double.parseDouble(input.nextLine());
        }

        System.out.println("Enter the length of the second cathetus:");
        b = Double.parseDouble(input.nextLine());

        while (b <= 0) {
            System.out.println("Enter the length of the second cathetus:");
            b = Double.parseDouble(input.nextLine());
        }

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(c));
    }
}



//Test

//Input
//3
//4
//Output
//5