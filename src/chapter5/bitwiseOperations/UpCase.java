package chapter5.bitwiseOperations;

public class UpCase {
    public static void main(String[] args) {
        char letter;

        for (int a = 0; a < 26; a++) {
            letter = (char) ('a' + a);
            System.out.print(letter);

            // ? This statement turns off the 6th bit. ?
            //           0110 0001
            //                &(*)
            // 1111 1111 1101 1111
            letter = (char) ((int) letter & 65503);

            System.out.print(letter + " ");
        }
    }
}
