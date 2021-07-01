package chapter14.numericTest;

import java.util.Scanner;

public class StartTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int x = input.nextInt();
        int y = input.nextInt();
        input.nextLine();

        NumericTest first = (a, b) -> (a % b) == 0;
        try {
            System.out.println(first.test(x, y));
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        NumericTest second = (a, b) -> (a < b);
        System.out.println(second.test(x, y));

        NumericTest three = (a, b) -> (a == b);
        System.out.println(three.test(x, y));

        NumericTest four = (a, b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        System.out.println(four.test(x, y));
    }
}
