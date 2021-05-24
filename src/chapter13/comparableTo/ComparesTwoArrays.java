package chapter13.comparableTo;

public class ComparesTwoArrays {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] arr1, V[] arr2) {

        if (arr1.length != arr2.length) return false;

        for (int a = 0; a < arr1.length; a++) {
            if (!arr1[a].equals(arr2[a])) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] numbers2 = {1, 2, 3, 4, 5};
        Integer[] numbers3 = {1, 2, 7, 4, 5};

        Double[] realNumbers = {3.6, 18.2, 8.5, 21.4, 14.3};
        Double[] realNumbers2 = {3.6, 18.2, 8.5};
        Double[] realNumbers3 = {3.6, 18.2, 8.5, 21.4, 14.3};


        if (arraysEqual(numbers, numbers)) System.out.println("numbers equals numbers");
        else System.out.println("numbers isn't equal to numbers");

        if (arraysEqual(numbers, numbers2)) System.out.println("numbers equals numbers2");
        else System.out.println("numbers isn't equal to numbers2");

        if (arraysEqual(numbers, numbers3)) System.out.println("numbers equals numbers3");
        else System.out.println("numbers isn't equal to numbers3");

        if (arraysEqual(realNumbers, realNumbers2)) System.out.println("realNumbers equals realNumbers2");
        else System.out.println("realNumbers isn't equal to realNumbers2");

        if (arraysEqual(realNumbers, realNumbers3)) System.out.println("realNumbers equals realNumbers3");
        else System.out.println("realNumbers isn't equal to realNumbers3");

    }
}