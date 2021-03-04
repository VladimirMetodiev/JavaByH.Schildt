package chapter3;

public class FindFac {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++) {
            System.out.printf("Factors of %d: ", a);
            for (int b = 2; b < a; b++) {
                if ((a % b) == 0) System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
