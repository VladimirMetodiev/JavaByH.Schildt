package chapter11.sumSynchronizedBlock;

import java.util.Arrays;
import java.util.Scanner;

public class StartSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] theFirst = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] theSecond = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        ClassWithSynchronizedBlock one = ClassWithSynchronizedBlock.createAndStart("One", theFirst);
        ClassWithSynchronizedBlock two = ClassWithSynchronizedBlock.createAndStart("Two", theSecond);

        try {
            one.getThread().join();
            two.getThread().join();
        }
        catch (InterruptedException ex){
            System.out.println("Main thread interrupted.");
        }
    }
}



//Tests

//2, 4, 6, 8
//3, 6, 9, 12, 15

//9, 81, -7, 16, -34, 56
//9, -91, 4, -16, 12, -144, 5, -25
