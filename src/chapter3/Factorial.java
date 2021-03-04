package chapter3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some number:");
        int number = Integer.parseInt(input.nextLine());

        long factorial = 1L;

        for (int a = 1; a <= number; a++) {
            factorial *= a;
        }

        System.out.printf("The factorial from %d is: %d", number, factorial);
    }
}



//Tests

//4
//The factorial from 4 is: 24

//5
//The factorial from 5 is: 120

//6
//The factorial from 6 is: 720

//19
//The factorial from 19 is: 121645100408832000
