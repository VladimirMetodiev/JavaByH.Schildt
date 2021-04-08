package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sum(Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray());
    }

    private static void sum (int ... num){
        long sum = 0L;

        for (int a = 0; a < num.length; a++) {
            sum += num[a];
        }

        System.out.println(sum);
    }
}



//Tests

//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//55

//3, -2, 9, -4, 81, -16, 6561, -256, 43046721, -65656
//42987441
