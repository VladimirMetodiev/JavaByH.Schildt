package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;

        for (int a = 0; a < array.length; a++) {
            if(minValue > array[a]) minValue = array[a];
            if(maxValue < array[a]) maxValue = array[a];
        }

        System.out.println("Minimal value = " + minValue);
        System.out.println("Maximal value = " + maxValue);
    }
}



//Tests

//8, 12, -5, 43, 215, 64, -18, 192, 76, -34

//6, 19, -3, 0, 23, -1, 14, 28, -19, 5

//200, 67,  -15, 199, 154, 200, -15, 0, -3, 22

//16, 16, 16
