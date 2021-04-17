package chapter9;

public class ExceptionDemo5 {

    public static void main(String[] arguments) {
        int[] number = {3, 8, 16, 9, -5, 1258, 343};
        int[] divisor = {2, 0, 4, 2, 0, 8};

        for (int a = 0; a < number.length; a++) {
            try {
                int result = number[a]/divisor[a];
                System.out.printf("%d / %d = %d%n", number[a], divisor[a], result);
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException ex2){
                System.out.println("No matching element found.");
            }
        }
    }
}
