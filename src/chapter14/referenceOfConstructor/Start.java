package chapter14.referenceOfConstructor;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some expression:");
        String newStr = input.nextLine();

        MyFuncInterface myClassCons = MyClass::new;
        MyClass mc = myClassCons.function(newStr);

        System.out.println("The expression is: " + mc.getStr( ));
    }
}



//Tests

//Demonstrate a constructor reference.

//Leonhard Euler is held to be one of the greatest mathematicians in history.
