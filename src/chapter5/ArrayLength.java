package chapter5;

public class ArrayLength {
    public static void main(String args[]) {
        int[] array = new int[10];
        int[] numbers = {1, 2, 3};
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Length of array is " + array.length);
        System.out.println("Length of numbers is " + numbers.length);
        System.out.println("Length of matrix is " + matrix.length + ". It shows the number of rows.");
        System.out.println("Length of matrix[0] is " + matrix[0].length + ". It shows the number of columns in row 0.");
        System.out.println("Length of matrix[1] is " + matrix[1].length + ". It shows the number of columns in row 1.");
        System.out.println("Length of matrix[2] is " + matrix[2].length + ". It shows the number of columns in row 2.");
        System.out.println();

        // Use length to initialize array
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        // Use length to display array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
