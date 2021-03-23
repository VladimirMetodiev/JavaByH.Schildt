package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int current;

        //Classic solution - Bubble sort
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - 1; b++) {
                if (array[b] > array[b + 1]) {
                    current = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = current;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}



//Tests

//8, 12, -5, 43, 215, 64, -18, 192, 76, -34

//100, 6, 19, -3, 0, 23, -1, 14, 28, -19, 5, 88, -26, 44

//200, 67, -15, 199, -164, 200, -15, 0, -3, 22

//5, 12, 12, -2, 18, 5, -2, -2



//My first idea

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
//        int current;
//
//        for (int a = 0; a < array.length - 1; a++) {
//            for (int b = a + 1; b < array.length; b++) {
//                if(array[a] > array[b]) {
//                    current = array[a];
//                    array[a] = array[b];
//                    array[b] = current;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//    }
