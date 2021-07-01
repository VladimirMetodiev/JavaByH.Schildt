package chapter14.quadraticEquation;

public class Mathematics {
    static double calculate(MathInterface qE, double first, double second, double third){
        return qE.setNumbers(first, second, third);
    }

    static double calculateDiscriminant (double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

    static double calculateX (double a, double b, double c){
        return -b / (2 * a);
    }

    static double calculateX1 (double a, double b, double c){
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    static double calculateX2 (double a, double b, double c){
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
