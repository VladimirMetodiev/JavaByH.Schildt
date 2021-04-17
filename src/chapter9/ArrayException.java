package chapter9;

import chapter8.MyScanner;

public class ArrayException implements MyScanner {
    public static void main(String[] arguments) {
        String[] capitals = {"Sofia", "Bucharest", "Budapest", "Prague", "Warsaw", "Berlin", "Vienna", "Rome", "Bern", "Paris"};
        int index = -1;

        try{
            System.out.println("Enter an index:");
            index = input.nextInt();
            if(index < 0 || index > capitals.length - 1) throw new ArrayIndexOutOfBoundsException("Wrong index!");
            System.out.println(capitals[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
