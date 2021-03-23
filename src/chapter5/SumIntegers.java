package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] array = Arrays.stream(input.nextLine().split(",\\s+")).mapToLong(e -> Long.parseLong(e)).toArray();

        long sum = 0L;

        for(long element : array){
            sum += element;
        }

        System.out.println(sum);
    }
}



//Test

//543, 95, 18, 634, -142, 52
//1200

//375, -834,  62, 1253, -618, 725, 114, 952, -802, 2458
//3685

//452253947, 67592435, 532248247616, 386726211838, 8429924825
//927924230661
