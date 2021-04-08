package chapter6.errors;

import java.util.Arrays;
import java.util.Scanner;

public class StartErr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command;
        int[] array = null;
        int number = 0, index = 0;
        ErrorMessage err = new ErrorMessage();

        while (index <= 0 || index > 1000000) {
            System.out.println("Enter a length of array:");
            index = Integer.parseInt(input.nextLine());
            array = new int[index];
        }

        printMessage();

        while (!(command = input.nextLine().toLowerCase()).equals("end")) {
            try {
                try {
                    number = Integer.parseInt(command);
                }
                catch (NumberFormatException ex1) {
                    err.getMessages(1);
                    printMessage();
                    continue;
                }

                System.out.printf("Enter an index from 0 to %d:%n", array.length - 1);
                index = Integer.parseInt(input.nextLine());
                array[index] = number;
            }
            catch (IndexOutOfBoundsException ex2) {
                err.getMessages(3);
            }

            printMessage();
        }

        System.out.println(Arrays.toString(array));
    }

    private static void printMessage(){
        System.out.println("Enter an integer or end:");
    }
}
