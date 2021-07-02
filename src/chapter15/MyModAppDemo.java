package chapter15;

import java.util.Scanner;

public class MyModAppDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second integer:");
        int b = Integer.parseInt(input.nextLine());

        if(SimpleMathFunctions.isFactor(a, b)) System.out.printf("%d is a factor of %d%n", a <= b ? a : b, a > b ? a : b);
        else System.out.printf("%d isn't a factor of %d%n", a <= b ? a : b, a > b ? a : b);

        System.out.printf("Smallest factor common to both %d and %d is %d%n", a, b, SimpleMathFunctions.lcf(a, b));

        System.out.printf("Largest factor common to both %d and %d is %d%n", a, b, SimpleMathFunctions.gcf(a, b));
    }
}



//Tests

//175
//35

//12
//36

//20
//20

//7
//81
