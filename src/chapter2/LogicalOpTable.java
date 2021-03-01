package chapter2;

public class LogicalOpTable {
    public static void main(String args[]) {
        boolean a, b;

        System.out.printf("|%8s|%8s|%8s|%8s|%8s|%8s|%n", "A", "B", "AND", "OR", "XOR", "NOT");

        a = true; b = true;
        System.out.printf("|%-8b|%-8b|%-8b|%-8b|%-8b|%-8b|%n", a, b, (a & b), (a | b), (a ^ b), !a);

        a = true; b = false;
        System.out.printf("|%-8b|%-8b|%-8b|%-8b|%-8b|%-8b|%n", a, b, (a & b), (a | b), (a ^ b), !a);

        a = false; b = true;
        System.out.printf("|%-8b|%-8b|%-8b|%-8b|%-8b|%-8b|%n", a, b, (a & b), (a | b), (a ^ b), !a);

        a = false; b = false;
        System.out.printf("|%-8b|%-8b|%-8b|%-8b|%-8b|%-8b|%n", a, b, (a & b), (a | b), (a ^ b), !a);
    }
}
