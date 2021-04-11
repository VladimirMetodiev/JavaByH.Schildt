package chapter7.methodOverriding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Superclass obj1 = new Superclass(input.nextInt(), input.nextInt());
        Superclass obj2 = new SubClass(input.nextInt(), input.nextInt(), input.nextInt());

        obj1.displayFields();
        obj2.displayFields();
    }
}



//Test

//11 18 29 32 46
