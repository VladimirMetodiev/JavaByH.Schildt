package chapter5;

import java.util.Arrays;

public class SomeArrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        double[] realNumbers = new double[5];
        String[] words = {"lovely", "friendly", "nice"};
        int[][] twoDimensionalArray = new int[5][5];

        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 12;
        numbers[4] = 15;

        for (int a = 1; a <= realNumbers.length; a++){
            realNumbers[a - 1] = a * 1.33;
        }

        for (int b = 0; b < twoDimensionalArray.length; b++) {
            for (int c = 0; c < twoDimensionalArray[b].length; c++) {
                twoDimensionalArray[b][c] = b * c;
            }
        }


        for (int d = 0; d < numbers.length; d++) {
            if(d < numbers.length - 1) System.out.print(numbers[d] + ", ");
            else System.out.println(numbers[d] + "\n");
        }

        for(double element : realNumbers){
            System.out.print(element + " ");
        }
        System.out.println("\n");

        System.out.println("Words: " + String.join(", ", words) + "\n");

        for(int[] arr : twoDimensionalArray){
            for(int element : arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\n" + "Alternative:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(twoDimensionalArray));
    }
}
