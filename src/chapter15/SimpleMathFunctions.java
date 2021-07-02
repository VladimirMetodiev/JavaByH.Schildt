package chapter15;

public class SimpleMathFunctions {

    public static boolean isFactor(int a, int b) {
        if ((a > b ? a : b) % (a <= b ? a : b) == 0) return true;
        else return false;
    }

    public static int lcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(a, i) && isFactor(b, i)) return i;
        }

        return 1;
    }

    public static int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = min / 2; i >= 2; i--) {
            if (isFactor(a, i) && isFactor(b, i)) return i;
        }

        return 1;
    }
}
