package chapter5;

import java.util.Scanner;

public class NoZeroDivision {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        double result;

        for(int a = start; a <= end; a++) {
            result = (a != 0) ? 100.0 / a : 0;
            if(a != 0) System.out.printf("100 / %d = %.2f%n", a, result);
        }
    }
}
