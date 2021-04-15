package chapter8;

public interface Perform {
    static double addition(double a, double b){
        return a + b;
    }

    static double subtraction(double a, double b){
        return a - b;
    }

    static double multiplication(double a, double b){
        return a * b;
    }

    static double division(double a, double b){
        return a / b;
    }
}
