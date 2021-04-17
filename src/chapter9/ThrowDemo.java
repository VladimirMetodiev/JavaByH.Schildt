package chapter9;

import chapter8.MyScanner;

import java.util.InputMismatchException;
import java.util.Random;

public class ThrowDemo implements MyScanner {
    public static void main(String[] args) {
        Random random = new Random();
        long number = 0;
        try {
            try{
                number = input.nextLong();
                if(number < -2147483648 || number > 2147483647) throw new InputMismatchException("Fatal error!");

                System.out.println(number / random.nextInt(5));
            }
            catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Exception caught.");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Game over!");
        }
    }
}
