package chapter6.constructorOverloadPartTwo;

public class StartSum {
    public static void main(String args[]) {
        Summation s1 = new Summation(19);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.getSum());
        System.out.println("s2.sum: " + s2.getSum());
    }
}
