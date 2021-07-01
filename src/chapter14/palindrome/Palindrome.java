package chapter14.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine().trim().toLowerCase();

        StringManipulation invert = (exp) -> {
            StringBuilder sb = new StringBuilder();
            for(int a = exp.length() - 1; a >= 0; a--) {
                if(exp.charAt(a) != ' ' &&
                        exp.charAt(a) != ',' &&
                        exp.charAt(a) != '\'' &&
                        exp.charAt(a) != '\"' &&
                        exp.charAt(a) != '-' &&
                        exp.charAt(a) != '.' &&
                        exp.charAt(a) != '!' &&
                        exp.charAt(a) != '?') {
                    sb.append(exp.charAt(a));
                }
            }
            return sb.toString();
        };

        StringManipulation replaceSymbols = (exp) -> {
            StringBuilder sb = new StringBuilder();
            for(int b = 0; b < exp.length(); b++) {
                if(exp.charAt(b) != ' ' &&
                        exp.charAt(b) != ',' &&
                        exp.charAt(b) != '\'' &&
                        exp.charAt(b) != '\"' &&
                        exp.charAt(b) != '-' &&
                        exp.charAt(b) != '.' &&
                        exp.charAt(b) != '!' &&
                        exp.charAt(b) != '?') {
                    sb.append(exp.charAt(b));
                }
            }
            return sb.toString();
        };

        String result = invert.changeStr(expression);
        expression = replaceSymbols.changeStr(expression);

        if(result.equals(expression)) System.out.println("It is palindrome!");
        else System.out.println("It isn't palindrome.");
    }
}



//Tests

//Anna

//Madam

//Step on no pets.

// Bombard a drab mob.

//No lemon, no melon!

//Eva, can I see bees in a cave?

//Are we not pure? "No, sir!" Panama's moody Noriega brags. "It is garbage!" Irony dooms a man - a prisoner up to new era.

//Inveteracy

//Surround

//Maxim

//Eva can't see anything in the cave.
