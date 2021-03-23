package chapter5;

public class ArrayDemo {
    public static void main(String args[]) {
        int array[] = new int[10];

        for (int a = 0; a < 10; a = a + 1) {
            array[a] = a + 1;
        }

        for (int b = 0; b < 10; b = b + 1) {
            System.out.printf("This is array[%d]: %d%n", b, array[b]);
        }
    }
}
