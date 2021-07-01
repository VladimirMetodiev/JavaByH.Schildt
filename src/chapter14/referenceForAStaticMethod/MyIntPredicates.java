package chapter14.referenceForAStaticMethod;

import java.util.Scanner;

public class MyIntPredicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean result;
        int number;

        printMessage();
        number = Integer.parseInt(input.nextLine());


        result = numTest(MyIntPredicates::isPrime, number);
        if(result) System.out.println("The number is prime.");
        else System.out.println("The number isn't prime.");


        result = numTest(MyIntPredicates::isEven, number);
        if(result) System.out.println("The number is even.");
        else System.out.println("The number is odd.");


        result = numTest(MyIntPredicates::isPositive, number);
        if(result) System.out.println("The number is positive.");
        else System.out.println("The number is negative.");
    }

    static boolean numTest(IntPredicate p, int value) {
        return p.anotherTest(value);
    }

    static void printMessage(){
        System.out.println("Enter some integer:");
    }

    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int a = 2; a <= num / a; a++) {
            if ((num % a) == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    static boolean isPositive(int num) {
        return num > 0;
    }
}
