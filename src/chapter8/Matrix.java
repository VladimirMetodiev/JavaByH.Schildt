package chapter8;

import java.util.Arrays;

public class Matrix implements SetOfConstants {
    public static void main(String[] args) {
        int[] array = new int[HUNDRED];
        int current = 0;

        Arrays.fill(array, FIVE);

        for (int a = 0; a < HUNDRED; a++) {
            if(++current == TEN){
                System.out.println(array[a]);
                current = 0;
                continue;
            }
            System.out.print(array[a] + ", ");
        }
    }
}
