package chapter8.staticMethodInInterface;

import chapter8.MyScanner;
import chapter8.Perform;

import java.util.Arrays;

public class Start implements MyScanner, Perform {
    public static void main(String[] args) {
        String word = input.nextLine();
        double realNumber = Double.parseDouble(input.nextLine());
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println("\n" + "Result: " + word);
        System.out.println("Result: " + realNumber);
        System.out.println("Result: " + Arrays.toString(array));

        System.out.println("\n" + "Addition: " + Perform.addition(array[1], array[0]));
        System.out.println("Subtraction: " + Perform.subtraction(array[1], array[0]));
        System.out.println("Multiplication: " + Perform.multiplication(array[1], array[0]));
        System.out.println("Division: " + Perform.division(array[1], array[0]));
    }
}



//Test

//experimental
//2.718281828459
//3 9 27 81 243 729
