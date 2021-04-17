package chapter9;

public class MultiCatch {
    static final int ZERO = 0;

    public static void main(String[] args) {
        int result;
        char[] letters = {'A', 'B', 'C'};

        for (int a = 0; a < 2; a++) {
            try {
                if (a == 0) result = (int)letters[a] / ZERO;
                else letters[5] = 'F';
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Exception caught: " + ex);
            }
        }
    }
}
