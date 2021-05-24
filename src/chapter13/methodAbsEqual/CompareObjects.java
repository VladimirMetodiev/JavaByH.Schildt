package chapter13.methodAbsEqual;

public class CompareObjects {
    public static void main(String[] args) {
        NumFunction<Integer> obj = new NumFunction<>(999);

        NumFunction<Integer> intObj = new NumFunction<>(1000);
        NumFunction<Long> longObj = new NumFunction<>(999L);
        NumFunction<Double> doubleObj = new NumFunction<>(999.0);

        System.out.println(obj.absEqual(intObj));
        System.out.println(obj.absEqual(longObj) + "\n");

        System.out.println(NumFunction.absEqual(obj, intObj));
        System.out.println(NumFunction.absEqual(obj, doubleObj));
    }
}
