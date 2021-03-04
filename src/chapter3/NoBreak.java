package chapter3;

public class NoBreak {
    public static void main(String[] args) {
        int index;

        for (index = 0; index <= 5; index++) {
            switch (index) {
                case 0: System.out.println("index is less than one");
                case 1: System.out.println("index is less than two");
                case 2: System.out.println("index is less than three");
                case 3: System.out.println("index is less than four");
                case 4: System.out.println("index is less than five");
            }
            System.out.println();
        }
    }
}
