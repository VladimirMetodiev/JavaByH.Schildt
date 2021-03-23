package chapter5.bitwiseOperations;

import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte value = Byte.parseByte(input.nextLine());
        getBit(value);

        value = (byte)~value;
        getBit(value);
    }

    static void getBit(byte val) {
        StringBuilder sb = new StringBuilder();

        for (int a = 128; a > 0; a = a / 2) {
            if ((val & a) != 0) sb.append(1);
            else sb.append(0);
        }

        System.out.println(sb);
    }
}



//Tests

//123
//01111011
//10000100

//3
//00000011
//11111100

//97
//01100001
//10011110

//59
//00111011
//11000100

//-34
//11011110
//00100001