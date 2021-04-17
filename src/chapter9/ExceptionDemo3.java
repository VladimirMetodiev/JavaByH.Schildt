package chapter9;

import chapter8.MyScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ExceptionDemo3 implements MyScanner  {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        try{
            System.out.println("Enter a divisor:");
            int x = input.nextInt();
            list.add(list.get(list.size() - 1) / x);
            System.out.println("Enter an index:");
            System.out.println(list.get(input.nextInt()));
        }
        catch (InputMismatchException ex1){
            System.out.println("It isn't an integer.");
        }
        catch (ArithmeticException ex2){
            System.out.println("It can not be divide by zero.");
        }
        catch (IndexOutOfBoundsException ex3){
            System.out.println("Wrong index.");
        }
        finally {
            list.forEach(e -> System.out.print(e + " "));
        }
    }
}
