package chapter13.constructor;

public class Start {
    public static void main(String[] args) {
        Summation object = new Summation(10.0);
        System.out.println("Summation from 1 to 10.0 is " + object.getSum());
    }
}
