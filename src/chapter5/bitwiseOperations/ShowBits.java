package chapter5.bitwiseOperations;

import java.util.Scanner;

public class ShowBits {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        byte value = Byte.parseByte(input.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int a = 128; a > 0; a = a / 2) {
            if ((value & a) != 0) sb.append(1);
            else sb.append(0);
        }

        System.out.println(sb);
    }
}



//Tests

//123
//01111011

//3
//00000011

//97
//01100001

//59
//00111011

//-34
//11011110
