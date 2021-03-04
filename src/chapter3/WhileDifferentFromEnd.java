package chapter3;

import java.util.Scanner;

public class WhileDifferentFromEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some integers while you write \"end\":");

        String expression;
        long sum = 0L;

        while (!(expression = input.nextLine().toLowerCase()).equals("end")){
            sum += Long.parseLong(expression);
        }

        System.out.println(sum);

        System.out.println("Enter some real numbers while you write \"end\":");

        double anotherSum = 0L;
        expression = input.nextLine().toLowerCase();

        while (true) {
            if(expression.equals("end")) {
                break;
            }

            anotherSum += Double.parseDouble(expression);

            expression = input.nextLine().toLowerCase();
        }

        System.out.println(anotherSum);

        input.close();
    }
}
