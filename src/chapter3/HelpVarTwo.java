package chapter3;

import java.io.IOException;

public class HelpVarTwo {
    public static void main(String[] args) throws IOException {
        int choice;
        char ignore;

        do {
            System.out.println("MENU\n----------------------------------------");
            System.out.println("For \"if\", choose: 1");
            System.out.println("For \"switch\", choose: 2");
            System.out.println("For \"for loop\", choose: 3");
            System.out.println("For \"while loop\", choose: 4");
            System.out.println("For \"do-while loop\", choose: 5");
            System.out.println("----------------------------------------");

            choice = Integer.parseInt("" + (char)System.in.read());

            do {
                ignore = (char)System.in.read();
            } while(ignore != '\n');

        } while (choice < 1 | choice > 5);

        switch(choice) {
            case 1:
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case 3:
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case 4:
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case 5:
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("  statement;");
                System.out.println("} while (condition);");
                break;
        }

        System.out.println("----------------------------------------");
    }
}
