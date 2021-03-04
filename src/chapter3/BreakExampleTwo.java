package chapter3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BreakExampleTwo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> realNumbers = new ArrayList<>();
        String expression;

        System.out.println("Enter a real number or \"END\"");

        for( ; ; ) {
            expression = input.nextLine().toUpperCase();
            if(expression.equals("END")) break;
            realNumbers.add(Double.parseDouble(expression));
        }

        realNumbers.forEach(e -> System.out.print(e + " "));
    }
}
