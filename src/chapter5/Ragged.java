package chapter5;

import java.util.Random;

public class Ragged {
    public static void main(String[] args) {
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        Random rd = new Random();

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < (a <= 4 ? 10 : 2); b++) {
                riders[a][b] = rd.nextInt(101);
            }
        }

        for(int[] arr : riders){
            for(int element : arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
