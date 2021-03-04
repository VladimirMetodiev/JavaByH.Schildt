package chapter3;

public class EnglishAlphabet {
    public static void main(String[] args) {
        char letter = 'a';

        while (letter <= 'z') {
            System.out.printf("%C %c%n", letter, letter);
            letter++;
        }
    }
}



// Принципна схема

// while (testExpression) {
//     code;
// }

// Цикълът се изпълнява, докато условието е вярно.
