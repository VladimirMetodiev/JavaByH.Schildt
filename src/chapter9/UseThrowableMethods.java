package chapter9;

import chapter8.MyScanner;

import java.util.Arrays;

public class UseThrowableMethods implements MyScanner {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an index:");
            ExceptionTest.generatesException(input.nextInt());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            //System.out.println("Standard message is: ");
            //System.out.println(ex);
            System.out.println("Stack trace: ");
            ex.printStackTrace();
        }
    }
}

class ExceptionTest {
    static void generatesException(int index) {
        int[] numbers = new int[6];
        Arrays.fill(numbers, 6);
        numbers[index] = 18;
        System.out.println(Arrays.toString(numbers));
    }
}