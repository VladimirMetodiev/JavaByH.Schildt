package chapter4;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CheckNumber chk = new CheckNumber();

        if (chk.check(input.nextInt())) System.out.println("It is even.");
        else System.out.println("It is odd.");
    }

    boolean check(int num){
        return num % 2 == 0 ? true : false;
    }
}
