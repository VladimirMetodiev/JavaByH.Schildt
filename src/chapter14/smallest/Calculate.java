package chapter14.smallest;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some integer:");
        int someInteger = Integer.parseInt(input.nextLine());

        NumericFunction f = (number) -> {
            int result = 1;                                 // Ако числото се дели само на 1 и на себе си, тогава връщаният резултат е 1

            number = number < 0 ? -number : number;

            for (int a = 2; a < number; a++) {
                if(number % a == 0){
                    result = a;
                    break;
                }
            }

            return result;                                  // В блоковите ламбда-изрази винаги трябва да има инструкция return
        };

        System.out.printf("Smallest factor of %d is %d.%n", someInteger, f.putNumber(someInteger));
    }
}



// Търси се най-малкият делител на който се дели въведеното число.