package chapter14.range;

import java.util.Scanner;

public class StartRangeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        do{
            try{
                System.out.println("Enter a lower bound:");
                int lowerBound = Integer.parseInt(input.nextLine());

                System.out.println("Enter an upper bound:");
                int upperBound = Integer.parseInt(input.nextLine());

                System.out.println("Enter a number:");
                double number = Double.parseDouble(input.nextLine());

                MyTest isItInTheRange = num -> {
                    if(num >= lowerBound && num <= upperBound)return true;
                    else return false;
                };

                if(isItInTheRange.testing(number)) System.out.println("The number is in the range.");
                else System.out.println("The number isn't in the range.");

                flag = true;
            }
            catch (NumberFormatException ex) {
                System.out.println("Wrong input!");
            }
        } while (!flag);
    }
}
