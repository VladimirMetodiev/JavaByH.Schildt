package chapter7.useSuper;

import java.util.Scanner;

public class UseSuper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SubClass obj = new SubClass(input.nextInt(), input.nextInt());

        obj.show();
    }
}



//Test

//Input
//-3
//9

//Output
//A superclass constructor was called.
//A subclass constructor was called.
//field in superclass: -3
//field in subclass: 9
