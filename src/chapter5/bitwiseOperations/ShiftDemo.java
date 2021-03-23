package chapter5.bitwiseOperations;

public class ShiftDemo {
    public static void main(String args[]) {
        int value = 1;

        for (int i = 0; i < 8; i++) {
            getBit(value);
            value = value << 1; // left shift
        }

        System.out.println();

        value = 128;

        for (int i = 0; i < 8; i++) {
            getBit(value);
            value = value >> 1; // right shift
        }
    }

    static void getBit(int val) {
        StringBuilder sb = new StringBuilder();

        for (int a = 128; a > 0; a = a / 2) {
            if ((val & a) != 0) sb.append(1);
            else sb.append(0);
        }

        System.out.println(sb);
    }
}
