package chapter6.constructorOverloadPartTwo;

public class Summation {
    private int sum = 0;

    // Construct from an int.
    Summation(int num) {
        for (int a = 1; a <= num; a++)
            sum += a;
    }

    // Construct from another object.
    Summation(Summation ob) {
        sum = ob.sum;
    }

    public int getSum() {
        return sum;
    }
}
