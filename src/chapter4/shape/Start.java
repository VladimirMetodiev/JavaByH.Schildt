package chapter4.shape;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String command;
        double a, b, h;

        System.out.println("Choose: \"end\", \"rectangle\", \"rhombus\", \"triangle\" or \"trapezium\"");

        while (!(command = input.nextLine().toLowerCase()).equals("end")) {
            switch (command) {
                case "rectangle": {
                    a = Double.parseDouble(input.nextLine());
                    h = Double.parseDouble(input.nextLine());
                    Rectangle rectangle = new Rectangle(a, h);
                    System.out.printf("Quadrangle area = %.2f%n", rectangle.calculateArea());
                    break;
                }
                case "rhombus": {
                    a = Double.parseDouble(input.nextLine());
                    h = Double.parseDouble(input.nextLine());
                    Rhombus rhombus = new Rhombus(a, h);
                    System.out.printf("Rhombus area = %.2f%n", rhombus.calculateArea());
                    break;
                }
                case "triangle": {
                    a = Double.parseDouble(input.nextLine());
                    h = Double.parseDouble(input.nextLine());
                    Triangle triangle = new Triangle(a, h);
                    System.out.printf("Triangle area = %.2f%n", triangle.calculateArea());
                    break;
                }
                case "trapezium": {
                    a = Double.parseDouble(input.nextLine());
                    h = Double.parseDouble(input.nextLine());
                    b = Double.parseDouble(input.nextLine());
                    Trapezium trapezium = new Trapezium(a, h, b);
                    System.out.printf("Trapezium area = %.2f%n", trapezium.calculateArea());
                    break;
                }
                default: {
                    System.out.println("Wrong command!");
                    break;
                }
            }

            System.out.println("\nChoose: \"end\", \"rectangle\", \"rhombus\", \"triangle\" or \"trapezium\"");
        }
    }
}
