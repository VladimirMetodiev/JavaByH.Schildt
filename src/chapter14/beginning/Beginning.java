package chapter14.beginning;

import java.util.Random;

public class Beginning {
    public static void main(String[] args) {
        // Ламбда изрази

        MyValue myValue1 = () -> 3.14;
        System.out.println(myValue1.getValue());


        MyValue myValue2 = () -> new Random().nextDouble() * 10.0;
        System.out.println(myValue2.getValue());


        MyParamValue myParamValue1 = (num) -> num / 10.0;
        System.out.println(myParamValue1.getValue(5));
        System.out.println(myParamValue1.getValue(99.9));


        MyBooleanValue myBooleanValue = (n) -> (n % 2) == 0;
        System.out.println(myBooleanValue.getValue(124));
        System.out.println(myBooleanValue.getValue(33));


        MyStrings myStrings = (a, b) -> a.equals(b);
        System.out.println(myStrings.compares("word", "word"));
        System.out.println(myStrings.compares("word", "vocable"));
    }
}
