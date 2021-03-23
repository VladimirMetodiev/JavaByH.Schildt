package chapter5.bitwiseOperations;

public class LowerCase {
    public static void main(String[] args) {
        char letter;

        for (int i = 0; i < 26; i++) {
            letter = (char) ('A' + i);
            System.out.print(letter);

            letter = (char) ((int) letter | 32);

            System.out.print(letter + " ");
        }
    }
}
