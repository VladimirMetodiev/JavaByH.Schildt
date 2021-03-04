package chapter3;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int a = 0; a < num; a++) {
            if (a * a >= num) {
                break;        // terminate loop if a*a >= 100
            }
            System.out.print(a + " ");
        }

        input.close();
    }
}



//Tests

//100
//0 1 2 3 4 5 6 7 8 9

//225
//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
