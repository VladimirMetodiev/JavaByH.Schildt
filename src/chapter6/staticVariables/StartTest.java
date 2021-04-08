package chapter6.staticVariables;

import java.util.ArrayList;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<StaticDemo> list = new ArrayList<>();

        System.out.println("Enter a number of objects:");
        int number = Integer.parseInt(input.nextLine());

        for (int a = 0; a < number; a++) {
            list.add(new StaticDemo());
            list.get(a).setX(a * 2);
        }

        for (int b = 0; b < number; b++) {
            System.out.printf("Object %d has x = %d and sum = %d;%n", b + 1, list.get(b).getX(), list.get(b).getSum());
        }
    }
}
