package chapter2;

public class TheEnglishAlphabet {
    public static void main(String[] args) {
        for (int a = 'A'; a <= 'Z'; a++) {
            System.out.print((char)a);
            System.out.print((char)(a + 32) + " ");
        }
    }
}
