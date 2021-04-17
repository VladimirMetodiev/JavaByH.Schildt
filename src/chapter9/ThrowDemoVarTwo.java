package chapter9;

import java.util.InputMismatchException;
import java.util.Random;

public class ThrowDemoVarTwo {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            try{
                int number = random.nextInt(101) + 25;
                if(number > 100) throw new InputMismatchException("Fatal error!");
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
