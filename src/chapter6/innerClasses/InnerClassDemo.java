package chapter6.innerClasses;

import java.util.Arrays;
import java.util.Scanner;

public class InnerClassDemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        OuterClass outObject = new OuterClass(array);

        outObject.analyze();
    }
}



//Tests

//3, 2, 1, 5, 6, 9, 7, 8

//62, 19, 19, 34, 52


