package chapter1;

public class MathematicalOperations {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        double c = 81;
        double d = 9;

        int sum = a + b;
        int difference = a - b;
        double product = c * d;
        double dividend = c / d;
        int remainder = b % a;
        double power = Math.pow(6, 2);
        double squareRoot = Math.sqrt(c);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(dividend);
        System.out.println(remainder);
        System.out.println(power);
        System.out.println(squareRoot);
    }
}
