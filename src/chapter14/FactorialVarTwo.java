package chapter14;

import java.util.Scanner;

public class FactorialVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CalculateFactorialVarTwo<Long> factorial = (num) -> {
            long result = 1L;
            for (int a = 2; a <= num; a++) {
                result *= a;
            }
            return result;
        };

        System.out.println("Enter an integer:");
        long number = Long.parseLong(input.nextLine());

        long result = factorial.setNumber(number);

        System.out.printf("%d! = %d%n", number, result);
    }
}
