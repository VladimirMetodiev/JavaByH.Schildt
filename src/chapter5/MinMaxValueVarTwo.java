package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValueVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;

        for (int element : array) {
            if(minValue > element) minValue = element;
            if(maxValue < element) maxValue = element;
        }

        System.out.println("Minimal value = " + minValue);
        System.out.println("Maximal value = " + maxValue);
    }
}
