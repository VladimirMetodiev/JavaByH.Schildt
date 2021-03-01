package chapter2;

public class UseCast {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            System.out.printf("int: %d / 3 = %d%n", a, a / 3);
            System.out.printf("double: %d / 3 = %f%n", a, (double)a / 3);
        }
    }
}
