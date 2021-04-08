package chapter6.recursion;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        long factorial = 1L;

        for(int a = 1; a <= number; a++){
            factorial *= a;
        }

        System.out.println(factorial);
    }
}



//Tests

//3
//6

//4
//24

//5
//120

//19
//121645100408832000

//20
//2432902008176640000
