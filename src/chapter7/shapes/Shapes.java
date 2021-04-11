package chapter7.shapes;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setHeight(5.2);
        t1.setWidth(3);
        t2.setHeight(27);
        t2.setWidth(13);

        System.out.println("The first triangle");
        t1.displayDimension();
        t1.displayArea();
        System.out.println("The second triangle");
        t2.displayDimension();
        t2.displayArea();

        Quadrangle q1 = new Quadrangle();
        Quadrangle q2 = new Quadrangle();

        q1.setHeight(3.25);
        q1.setWidth(8.75);
        q2.setHeight(9);
        q2.setWidth(9);

        System.out.println("The first quadrangle");
        q1.displayQuadrangle();
        q1.displayDimension();
        q1.displayArea();
        System.out.println("The second quadrangle");
        q2.displayQuadrangle();
        q2.displayDimension();
        q2.displayArea();

        System.out.println("Enter height:");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("Enter width:");
        double width = Double.parseDouble(input.nextLine());

        System.out.println("The triangle");
        Triangle t3 = new Triangle(height, width);
        t3.displayDimension();
        t3.displayArea();

        System.out.println("The quadrangle");
        Quadrangle q3 = new Quadrangle(height, width);
        q3.displayQuadrangle();
        q3.displayDimension();
        q3.displayArea();

        System.out.println("Enter colour:");
        String colour = input.nextLine().toLowerCase();
        System.out.println("Enter height:");
        height = Double.parseDouble(input.nextLine());
        System.out.println("Enter width:");
        width = Double.parseDouble(input.nextLine());

        System.out.println("The colour triangle");
        ColourTriangle t4 = new ColourTriangle(colour, height, width);
        t4.displayColour();
        t4.displayDimension();
        t4.displayArea();

        System.out.println("Another triangle");
        TwoDimensionalShape tDS = new TwoDimensionalShape(t4);
        tDS.displayDimension();
        System.out.printf("Triangle area = %.2f%n%n",tDS.getHeight() * tDS.getWidth() / 2.0);

        System.out.println("Enter height:");
        height = Double.parseDouble(input.nextLine());
        System.out.println("Enter the first side:");
        width = Double.parseDouble(input.nextLine());
        System.out.println("Enter the second side:");
        double secondSide = Double.parseDouble(input.nextLine());

        System.out.println("The trapezium");
        Trapezium tr = new Trapezium(height, width, secondSide);
        tr.displayDimension();
        tr.displayArea();

        System.out.println("Three shapes");
        TwoDimensionalShape[] array = new TwoDimensionalShape[3];
        array[0] = new TwoDimensionalShape(t1);
        array[1] = new TwoDimensionalShape(q1);
        array[2] = new TwoDimensionalShape(q3);

        System.out.println("Dimensions of the triangle");
        array[0].displayDimension();
        System.out.println("Dimensions of the first quadrangle");
        array[1].displayDimension();
        System.out.println("Dimensions of the second quadrangle");
        array[2].displayDimension();
    }
}
