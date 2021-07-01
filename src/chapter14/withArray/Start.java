package chapter14.withArray;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Double[] realNumbers = {2116.0, 3844.0, 5329.0, 81.0, 605284.0};

        MyTransform<Double> squareRoot = (array) -> {
            for (int a = 0; a < array.length; a++) {
                array[a] = Math.sqrt(array[a]);
            }
            return array;
        };

        realNumbers = squareRoot.transform(realNumbers);
        System.out.println(Arrays.toString(realNumbers));
    }
}
