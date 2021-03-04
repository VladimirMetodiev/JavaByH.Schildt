package chapter3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;

        do {
            System.out.print("Press a key following by ENTER: ");
            letter = input.nextLine().charAt(0);
            System.out.println(("" + letter).toUpperCase());
        } while(letter != 'e');
    }
}



// Принципна схема на do-while цикъл

// do {
//   code;
// } while (testExpression);

// Винаги do-while цикълът, се изпълнява поне по веднъж.
