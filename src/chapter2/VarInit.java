package chapter2;

import java.util.Scanner;

public class VarInit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int a = 0; a < array.length; a++) {
            System.out.println("Enter some integer:");

            int current = Integer.parseInt(input.nextLine());

            array[a] = current;
        }

        System.out.printf("Sum = %d%n", array[0] + array[1] + array[2] + array[3] + array[4]);
        System.out.printf("Product = %d", array[0] * array[1] * array[2] * array[3] * array[4]);
    }
}
