package chapter9.myException;

public class CustomExceptionDemo {
    public static void main(String args[]) {
        int[] numbers = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] divisor = {2, 0, 4, 4, 0, 8};

        for (int a = 0; a < numbers.length; a++) {
            try {
                if ((numbers[a] % 2) != 0) throw new NonIntResultException(numbers[a], divisor[a]);
                System.out.printf("%d / %d = %d%n", numbers[a], divisor[a], numbers[a] / divisor[a]);
            }
            catch (ArithmeticException ex) {
                System.out.println("Can't divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("No matching element found.");
            }
            catch (NonIntResultException ex) {
                System.out.println(ex);
            }
        }
    }
}
