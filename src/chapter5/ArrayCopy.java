package chapter5;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        double[] theFirst = new double[10];
        double[] theSecond = new double[theFirst.length];

        for (int a = 0; a < theFirst.length; a++) {
            theFirst[a] = Math.pow(a + 1, 3);
        }

        for (int b = 0; b < theSecond.length; b++) {
            theSecond[b] = theFirst[b];
        }

        System.out.println("The first array: " + Arrays.toString(theFirst));
        System.out.println("The second array: " + Arrays.toString(theSecond));

        int[] theThird = new int[15];
        int[] theFourth;

        for(int c = 1; c <= theThird.length; c++) {
            theThird[c - 1] = c * 6 + 2;
        }

        theFourth = Arrays.copyOf(theThird, theThird.length);

        System.out.println("The third array: " + Arrays.toString(theThird));
        System.out.println("The fourth array: " + Arrays.toString(theFourth));

    }
}
