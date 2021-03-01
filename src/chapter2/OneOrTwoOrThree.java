package chapter2;

import java.util.Scanner;

public class OneOrTwoOrThree {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = setNumber();

        while (a != 1 & a != 2 & a != 3){
            a = setNumber();
        }

        if(a == 1) System.out.println("One");
        if(a == 2) System.out.println("Two");
        if(a == 3) System.out.println("Three");
    }

    private static int setNumber(){
        System.out.print("Enter a number from 1 to 3 inclusive: ");
        return Integer.parseInt(input.nextLine());
    }
}
