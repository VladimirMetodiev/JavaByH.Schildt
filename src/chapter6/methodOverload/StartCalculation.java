package chapter6.methodOverload;

import java.util.Scanner;

public class StartCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, counter = 0;
        double x, y, z;

        Overload obj = new Overload();

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        c = Integer.parseInt(input.nextLine());

        x = Double.parseDouble(input.nextLine());
        y = Double.parseDouble(input.nextLine());
        z = Double.parseDouble(input.nextLine());

        System.out.println(obj.calculate(a, b));
        System.out.println(obj.calculate(a, b, c));
        System.out.println(obj.calculate(x, b));
        System.out.println(obj.calculate(x, y));
        System.out.println(obj.calculate(x, y, z));
    }
}



//Test

//18
//35
//2
//3.7
//56.8
//24.25
