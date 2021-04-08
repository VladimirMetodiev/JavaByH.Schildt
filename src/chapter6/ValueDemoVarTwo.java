package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ValueDemoVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printValues("Argument");
        printValues("Argument", 6);
        printValues("Argument", 15, 17, 19);
        printValues("Argument", Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray());  //2, 15, 4, 34, 0, 8
    }

    private static void printValues(String message, int ... value) {
        System.out.println("Number of arguments: " + value.length);
        System.out.println("Contents: ");

        for (int a = 0; a < value.length; a++) {
            System.out.printf("%s %d: %d%n", message, a, value[a]);
        }

        System.out.println();
    }
}
