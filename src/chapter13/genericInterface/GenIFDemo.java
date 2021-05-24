package chapter13.genericInterface;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        NewClass<Integer> obj1 = new NewClass<>(intArray);

        if(obj1.contains(2)) System.out.println("2 is in the array");
        else System.out.println("2 is NOT in the array");

        if(obj1.contains(15)) System.out.println("15 is in the array");
        else System.out.println("15 is NOT in the array");


        Double[] realNumbers = {62.5, 74.0, 2.6, 18.0, 9.8, 60.0, -15.0, 38.4, 29.1};

        NewClass<Double> obj2 = new NewClass<>(realNumbers);

        if(obj2.contains(2.6)) System.out.println("2.6 is in the array");
        else System.out.println("2.6 is NOT in the array");

        if(obj2.contains(15.0)) System.out.println("15.0 is in the array");
        else System.out.println("15.0 is NOT in the array");
    }
}
