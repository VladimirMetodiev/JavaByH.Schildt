package chapter7.shapes;

import java.util.Locale;
import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter radius:");
        Circle circle = new Circle(input.nextDouble());

        circle.displayDimension();
        circle.displayArea();
    }
}



//Tests

//5
//Radius = 5,00
//Circle area = 78,54

//8
//Radius = 8,00
//Circle area = 201,06
