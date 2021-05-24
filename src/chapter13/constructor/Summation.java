package chapter13.constructor;

public class Summation {
    private double sum;

    <T extends Number> Summation(T arg) {
        sum = 0;
        for (int a = 0; a <= arg.intValue(); a++) sum += a;
    }

    double getSum() {
        return sum;
    }
}
