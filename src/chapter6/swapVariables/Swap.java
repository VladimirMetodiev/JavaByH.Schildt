package chapter6.swapVariables;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Test.printMessage();
        Test t1 = new Test(Integer.parseInt(input.nextLine()));
        Test.printMessage();
        Test t2 = new Test(Integer.parseInt(input.nextLine()));

        Test.printObjectVariable(t1);
        Test.printObjectVariable(t2);

        Test.swap(t1, t2);

        Test.printObjectVariable(t1);
        Test.printObjectVariable(t2);
    }
}
