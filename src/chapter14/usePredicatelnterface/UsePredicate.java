package chapter14.usePredicatelnterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class UsePredicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Predicate<Integer> isEven = (num) -> (num % 2) == 0;

        System.out.println("Enter some integer:");
        int number = Integer.parseInt(input.nextLine());

        boolean result = isEven.test(number);
        if(result) System.out.println("The number is even.");
        else System.out.println("The number is odd.");
    }
}
