package chapter9;

public class ExceptionDemo6 {
    public static void main(String[] arguments) {
        int[] number = {3, 8, 16, 9, -5, 1258, 343, 48};
        int[] divisor = {2, 0, 4, 2, 0, 8};

        for (int a = 0; a < number.length; a++) {
            try {
                int result = number[a]/divisor[a];
                System.out.printf("%d / %d = %d%n", number[a], divisor[a], result);
            }
            catch (ArrayIndexOutOfBoundsException ex1){
                System.out.println("No matching element found.");
            }
            catch (Throwable ex2) {
                System.out.println(ex2.getMessage());
            }
        }
    }
}
