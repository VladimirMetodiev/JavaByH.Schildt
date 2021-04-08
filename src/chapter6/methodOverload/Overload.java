package chapter6.methodOverload;

public class Overload {
    protected int calculate (int a, int b){
        return a * b;
    }

    protected int calculate (int a, int b, int c){
        return a * b * c;
    }

    protected double calculate (double a, int b){
        return a * b;
    }

    protected double calculate (double a, double b){
        return a * b;
    }

    protected double calculate (double a, double b, double c){
        return a * b * c;
    }
}
