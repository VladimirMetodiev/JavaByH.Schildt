package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 2:");
        int number = Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        for (int n = 2; n <= number; n++) {
            System.out.printf("2 ^ %d = %s%n", n, df.format(Math.pow(2, n)));
        }

        input.close();
    }
}



//Test

//Input
//10
//Output
//2 ^ 2 = 4
//2 ^ 3 = 8
//2 ^ 4 = 16
//2 ^ 5 = 32
//2 ^ 6 = 64
//2 ^ 7 = 128
//2 ^ 8 = 256
//2 ^ 9 = 512
//2 ^ 10 = 1024
