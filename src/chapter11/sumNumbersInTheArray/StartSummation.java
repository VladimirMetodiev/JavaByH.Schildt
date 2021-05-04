package chapter11.sumNumbersInTheArray;

import java.util.Arrays;
import java.util.Scanner;

public class StartSummation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] theFirst = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] theSecond = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        //int[] theThird = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        MyThread one = MyThread.createAndStart("One", theFirst);
        MyThread two = MyThread.createAndStart("Two", theSecond);
        //NewThread three = NewThread.createAndStart("Three", theThird);

        try {
            one.getThread().join();
            two.getThread().join();
            //three.getThread().join();
        }
        catch (InterruptedException ex){
            System.out.println("Main thread interrupted.");
        }
    }
}



//Tests

//27, 14, 53, 8, 62
//16, -55, 83, 0, -2
//-1, -2, -3, -4, -5

//18, -6, -8, 34, 19, 25, 60
//-8, -18, -28
//28, 48, 168, 58
