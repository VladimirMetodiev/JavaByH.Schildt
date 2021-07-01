package chapter14.referenceForAnInstanceMethod;

import chapter14.referenceForAStaticMethod.IntPredicate;

public class Demo {
    public static void main(String[] args) {
        MyIntNum obj1 = new MyIntNum(88);
        MyIntNum obj2 = new MyIntNum(15);


        IntPredicate predicate = obj1::isFactor;

        boolean result = predicate.anotherTest(2);
        System.out.println(result);


        predicate = obj2::isFactor;

        result = predicate.anotherTest(19);
        System.out.println(result);
    }
}
