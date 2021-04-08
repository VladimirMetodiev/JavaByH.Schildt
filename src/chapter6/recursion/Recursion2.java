package chapter6.recursion;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(calculateFactorial(number));
    }

    private static long calculateFactorial(int n) {
        long result;

        if (n == 1) return 1;
        System.out.println("n = " + n);
        result = calculateFactorial(n - 1) * n;
        System.out.println("result = " + result);

        return result;
    }
}
