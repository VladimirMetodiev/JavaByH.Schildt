package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int value = Integer.parseInt(input.nextLine());
        boolean found = false;

        for(int element : numbers) {
            if(element == value) {
                found = true;
                break;
            }
        }

        if(found) System.out.println("Value found!");
        else System.out.println("Value not found.");
    }
}



//Tests

//6, 8, 3, 7, 5, 6, 1, 4
//5

//38, 49, 51, -15, 16, 92, 47, 68, -2, 25, 55, 84, 86, 18, 37, 57, 100, -30, -100, -50, 62
//57

//1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21
//18
