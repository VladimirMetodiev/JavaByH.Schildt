package chapter5;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] table = new int[3][4];
        int counter = 0;

        for (int a = 0; a < table.length; a++) {
            for (int b = 0; b < table[a].length; b++) {
                table[a][b] = ++counter;
            }
        }

        for(int[] arr : table){
            for(int item : arr){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
