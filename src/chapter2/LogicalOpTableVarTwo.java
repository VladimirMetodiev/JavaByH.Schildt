package chapter2;

public class LogicalOpTableVarTwo {
    public static void main(String args[]) {
        int a, b;

        System.out.printf("|%-4s|%-4s|%-4s|%-4s|%-4s|%-4s|%n", "A", "B", "AND", "OR", "XOR", "NOT");

        a = 1; b = 1;
        System.out.printf("|%-4d|%-4d|%-4d|%-4d|%-4d|%-4d|%n", a, b, a * b == 1 ? 1 : 0, a + b > 0 ? 1 : 0, a + b == 1 ? 1 : 0, a == 1 ? 0 : 1);

        a = 1; b = 0;
        System.out.printf("|%-4d|%-4d|%-4d|%-4d|%-4d|%-4d|%n", a, b, a * b == 1 ? 1 : 0, a + b > 0 ? 1 : 0, a + b == 1 ? 1 : 0, a == 1 ? 0 : 1);

        a = 0; b = 1;
        System.out.printf("|%-4d|%-4d|%-4d|%-4d|%-4d|%-4d|%n", a, b, a * b == 1 ? 1 : 0, a + b > 0 ? 1 : 0, a + b == 1 ? 1 : 0, a == 1 ? 0 : 1);

        a = 0; b = 0;
        System.out.printf("|%-4d|%-4d|%-4d|%-4d|%-4d|%-4d|%n", a, b, a * b == 1 ? 1 : 0, a + b > 0 ? 1 : 0, a + b == 1 ? 1 : 0, a == 1 ? 0 : 1);
    }
}
