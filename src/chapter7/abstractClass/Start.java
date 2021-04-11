package chapter7.abstractClass;

import java.util.Locale;
import java.util.Scanner;

public class Start {
    private static double a, b, h;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        enter();
        Parallelogram parallelogram = new Parallelogram(a, b, h);

        enter();
        Rhombus rhombus = new Rhombus(a, b, h);

        enter();
        Rectangle rectangle = new Rectangle(a, b, h);

        enter();
        Square square = new Square(a, b, h);

        checkShape(parallelogram);
        checkShape(rhombus);
        checkShape(rectangle);
        checkShape(square);
    }

    static void enter(){
        input.useLocale(Locale.US);
        System.out.println("Enter a:");
        a = input.nextDouble();
        System.out.println("Enter b:");
        b = input.nextDouble();
        System.out.println("Enter h:");
        h = input.nextDouble();
    }

    static void checkShape(Parallelogram obj){
        if(obj.getName().equals(check(obj.getA(), obj.getB(), obj.getH()))) {
            System.out.println("The shape is parallelogram.");
            obj.display();
        }
        else {
            printMessage();
        }
    }

    static void checkShape(Rhombus obj){
        if(obj.getName().equals(check(obj.getA(), obj.getB(), obj.getH()))) {
            System.out.println("The shape is rhombus.");
            obj.display();
        }
        else {
            printMessage();
        }
    }

    static void checkShape(Rectangle obj){
        if(obj.getName().equals(check(obj.getA(), obj.getB(), obj.getH()))) {
            System.out.println("The shape is rectangle.");
            obj.display();
        }
        else {
            printMessage();
        }
    }

    static void checkShape(Square obj){
        if(obj.getName().equals(check(obj.getA(), obj.getB(), obj.getH()))) {
            System.out.println("The shape is square.");
            obj.display();
        }
        else {
            printMessage();
        }
    }

    static String check(double a, double b, double h){
        if(h < b) {
            if(a != b) return "Parallelogram";
            else return "Rhombus";
        }
        else if(h == b){
            if(a != b) return "Rectangle";
            else return "Square";
        }
        else return "-1";
    }

    static void printMessage(){
        System.out.println("Wrong values!" + "\n");
    }
}



//Tests

//5 6.3 4 3.2 3.2 2 4 2 2 3 3 3

//19.5 14.2 8.3 5.6 3 2.1 9 5.7 5.7 6 7 6
