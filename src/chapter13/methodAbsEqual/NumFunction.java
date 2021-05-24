package chapter13.methodAbsEqual;

public class NumFunction<T extends Number> {
    T number;

    NumFunction(T num) {
        number = num;
    }

    boolean absEqual(NumFunction<?> obj) {
        if(Math.abs(number.doubleValue()) == Math.abs(obj.number.doubleValue())) return true;
        else return false;
    }

    static boolean absEqual(NumFunction<?> obj1, NumFunction<?> obj2) {
        if(Math.abs(obj1.number.doubleValue()) == Math.abs(obj2.number.doubleValue())) return true;
        else return false;
    }
}
