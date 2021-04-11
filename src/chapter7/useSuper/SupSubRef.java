package chapter7.useSuper;

import java.util.Scanner;

public class SupSubRef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SuperClass superClass1 = new SuperClass();
        superClass1.field = input.nextInt();

        SuperClass superClass2 = superClass1;

        SuperClass subClassConstructor = new SubClassTwo(input.nextInt(), input.nextInt());

        System.out.println(superClass2.field);
        System.out.println(superClass2.field = subClassConstructor.field);
    }
}



//Test

//A superclass constructor was called.
//1
//2
//3
//A superclass constructor was called.
//A subclass constructor was called.
//1
//2
