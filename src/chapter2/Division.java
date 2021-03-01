package chapter2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());

        if(y != 0 && (x % y) == 0) {
            System.out.println(y + " is a factor of " + x);
        }
        else{
            System.out.println(y + " isn't a factor of " + x);
        }
    }
}
