package chapter9;

public class ExceptionDemo4 {
    public static void main(String[] arguments) {
        int[] number = {3, 8, 16, 9, -5, 1258};
        int[] divisor = {2, 0, 4, 2, 0, 8};

        for (int a = 0; a < number.length; a++) {
            try {
                System.out.printf("%d / %d = %d%n", number[a], divisor[a], number[a]/divisor[a]);
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
