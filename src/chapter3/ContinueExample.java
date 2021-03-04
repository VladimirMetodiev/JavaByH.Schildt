package chapter3;

public class ContinueExample {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if(a % 2 != 0) continue;
            System.out.println(a + " ");
        }
    }
}
