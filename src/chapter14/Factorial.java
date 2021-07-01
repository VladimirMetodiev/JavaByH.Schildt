package chapter14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CalculateFactorial factorial = (num) -> {
            long result = 1L;
            for (int a = 2; a <= num; a++) {
                result *= a;
            }
            return result;
        };

        System.out.println("Enter an integer:");
        int number = Integer.parseInt(input.nextLine());

        long result = factorial.setNumber(number);

        System.out.printf("%d! = %d%n", number, result);
    }
}



//Tests

//3
//6

//4
//24

//5
//120

//6
//720

//19
//121645100408832000

//20
//2432902008176640000
