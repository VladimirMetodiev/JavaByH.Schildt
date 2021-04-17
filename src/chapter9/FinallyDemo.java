package chapter9;

public class FinallyDemo {
    public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {
            genException(a);
            System.out.println();
        }
    }

    static void genException(int num) {
        int anotherNum;
        int[] numbers = {0, 1};

        System.out.println("Receiving " + num);

        try {
            switch(num) {
                case 0: {
                    System.out.println("Generate division by zero error.");
                    anotherNum = 10 / num;
                    break;
                }
                case 1: {
                    System.out.println("Generate array index error.");
                    numbers[4] = 4;
                    break;
                }
                case 2: {
                    System.out.println("Return from try block ");
                    return;
                }
            }
        }
        catch (ArithmeticException ex) {
            System.out.println("Can't divide by Zero!");
            System.out.println("Return from catch block.");
            return;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No matching element found.");
        }
        finally {
            System.out.println("Leaving try.");
        }
    }
}
