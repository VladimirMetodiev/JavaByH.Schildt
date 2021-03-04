package chapter3;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press \"E\" to end.");

        for(int a = 0; input.nextLine().charAt(0) != 'E'; a++) {
            System.out.println("Pass #" + a);
        }
    }
}
