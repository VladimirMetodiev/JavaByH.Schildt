package chapter6.innerClasses;

public class OuterClass {
    int[] numbers;

    OuterClass(int[] num) {
        numbers = num;
    }

    void analyze() {
        InnerClass innerObject = new InnerClass();

        System.out.println("Minimum: " + innerObject.min());
        System.out.println("Maximum: " + innerObject.max());
        System.out.println("Average: " + innerObject.avg());
    }

    // This is an inner class.
    class InnerClass {
        int min() {
            int m = numbers[0];
            for(int i = 1; i < numbers.length; i++) {
                if (numbers[i] < m) m = numbers[i];
            }
            return m;
        }

        int max() {
            int m = numbers[0];
            for(int i = 1; i < numbers.length; i++) {
                if (numbers[i] > m) m = numbers[i];
            }
            return m;
        }

        int avg() {
            int a = 0;
            for(int i = 0; i < numbers.length; i++) {
                a += numbers[i];
            }
            return a / numbers.length;
        }
    }
}
