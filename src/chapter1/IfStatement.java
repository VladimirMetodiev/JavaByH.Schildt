package chapter1;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(input.nextLine());
        c = a - b;

        if(c == 0) System.out.println("c is equal to zero.");
        else if(c < 0) System.out.println("c is less than zero.");
        else if(c > 0) System.out.println("c is greater than zero.");
    }
}



//Comparison operators - оператори за сравнение

// < Less
// > Greater
// <= Less than or equal
// >= Greater than or equal
// == Equal
// != Not equal
