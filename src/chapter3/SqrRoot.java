package chapter3;

import java.text.DecimalFormat;

public class SqrRoot {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.################");
        double num, squareRoot, roundingError;

        for (num = 1.0; num <= 100.0; num++) {
            squareRoot = Math.sqrt(num);
            System.out.printf("Square root of %.0f is: %f%n", num, squareRoot);

            roundingError = num - (squareRoot * squareRoot);
            System.out.println("Rounding error is: " + df.format(roundingError) + "\n");
        }
    }
}
