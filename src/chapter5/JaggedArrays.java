package chapter5;

public class JaggedArrays {
    public static void main(String[] args) {
        int[][] theFirst = new int[3][];
        theFirst[0] = new int[4];
        theFirst[1] = new int[5];
        theFirst[2] = new int[3];

        for (int a = 0; a < theFirst.length; a++) {
            for (int b = 0; b < theFirst[a].length; b++) {
                theFirst[a][b] = b + 1;
            }
        }

        int[][] theSecond = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9}
        };

        printTheArray(theFirst);
        printTheArray(theSecond);
    }

    private static void printTheArray(int[][] table){
        for(int[] arr : table){
            for(int item : arr){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
