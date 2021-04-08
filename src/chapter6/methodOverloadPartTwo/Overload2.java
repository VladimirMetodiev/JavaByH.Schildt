package chapter6.methodOverloadPartTwo;

public class Overload2 {
    protected void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    protected void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
