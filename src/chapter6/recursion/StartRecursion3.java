package chapter6.recursion;

import java.util.Scanner;

public class StartRecursion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text:");
        Recursion3 obj = new Recursion3(input.nextLine());

        Recursion3.printInReverseOrder(obj, obj.getText().length());
    }
}



//Tests

//a b c
//c b a

//E v a c a n I s e e b e e s I n a c a v E
//E v a c a n I s e e b e e s I n a c a v E

//Knowing yourself is the beginning of all wisdom
//modsiw lla fo gninnigeb eht si flesruoy gniwonK

