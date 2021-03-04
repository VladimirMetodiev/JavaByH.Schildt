package chapter3;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.println("MENU\n------------------------------");
        System.out.println("For \"if\", choose: 1");
        System.out.println("For \"switch\", choose: 2");
        System.out.println("------------------------------");

        int choice = Integer.parseInt("" + (char)System.in.read());

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
            default:
                System.out.println("Selection not found.");
                break;
        }

        System.out.println("------------------------------");
    }
}
