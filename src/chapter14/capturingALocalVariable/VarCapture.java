package chapter14.capturingALocalVariable;

import java.util.Scanner;

public class VarCapture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double localVariable = 3.14;        // мога да не пиша final
        // localVariable може да бъде взета (използвана) от ламбда-изразът

        MyFunc myLambda = (n) -> {
            // localVariable++ Следната инструкция е невалидна, тъй като се опитва да модифицира стойността на localVariable;
            // localVariable може да бъде взета и използвана, но не може да бъде модифицирана от ламбда-изразът;
            return localVariable * Math.pow(n, 2);
        };

        System.out.println("Enter some real number:");
        double num = Double.parseDouble(input.nextLine());
        System.out.println(myLambda.newFunction(num));
    }
}



// Tests

//5
//78.5

//18.2
//1040.0936
