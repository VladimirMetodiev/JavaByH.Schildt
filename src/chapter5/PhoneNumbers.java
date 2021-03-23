package chapter5;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression;

        String numbers[][] = {
                { "Adam", "87-758-5341"},
                { "Irina", "88-914-9981"},
                { "Tomas", "88-127-3322" },
                { "Gabriel", "87-797-1538" },
                { "Mary", "86-098-8976" },
                { "Peter", "87-050-3835" },
                { "John", "88-522-1037" },
                { "Boris", "86-313-2465" },
                { "Anna", "87-777-1467" },
                { "Vladimir", "88-999-1568" },
                { "Ema", "87-392-3564" },
                { "Nicola", "88-434-5316" },
                { "Jana", "86-952-4246" },
                { "Ivan", "88-492-5634" }
        };

        while (!(expression = input.nextLine()).equals("end")){
            for (int a = 0; a < numbers.length; a++) {
                if(expression.equals(numbers[a][0])){
                    System.out.printf("%s's number is: %s.%n", numbers[a][0], numbers[a][1]);
                    break;
                }

                if(a == numbers.length - 1){
                    System.out.println("Name not found.");
                }
            }
        }
    }
}
