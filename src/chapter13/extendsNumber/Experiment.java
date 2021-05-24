package chapter13.extendsNumber;

public class Experiment {
    public static void main(String[] args) {
        NumericalFunctions<Double, Double> object1 = new NumericalFunctions<>(11.0, 12.0);
        object1.divide();

        NumericalFunctions<Double, Integer> object2 = new NumericalFunctions<>(81.0, 9);
        object2.divide();

        NumericalFunctions<Integer, Integer> object3 = new NumericalFunctions<>(28, 36);
        object3.add();

        NumericalFunctions<Long, Integer> object4 = new NumericalFunctions<>(9853644328L, 3621);
        object4.multiply();
    }
}
