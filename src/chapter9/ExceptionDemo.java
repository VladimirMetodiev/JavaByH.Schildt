package chapter9;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] arguments) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 5);

        try {
            System.out.println("Generate an index out-of-bounds exception.");
            numbers[101] = 10;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught the exception: Array index out-of-bounds!");
        }

        System.out.println(Arrays.toString(numbers));
    }
}
