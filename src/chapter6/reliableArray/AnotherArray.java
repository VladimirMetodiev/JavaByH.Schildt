package chapter6.reliableArray;

import java.util.Scanner;

public class AnotherArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        int length, index;
        long number;

        while(true){
            System.out.println("Enter a length of array:");
            length = Integer.parseInt(input.nextLine());
            if(FailSoftArray.checkLength(length)) break;
            else System.out.println("Length should be bigger than 0 and smaller than 1000000.");
        }

        FailSoftArray obj = new FailSoftArray(length);

        printMessage();

        while(!(command = input.nextLine().toLowerCase()).equals("end")){
            switch (command){
                case "put": {
                    System.out.println("Enter an index:");
                    try {
                        index = Integer.parseInt(input.nextLine());
                    }
                    catch (NumberFormatException ex){
                        System.out.println("This isn't an index.");
                        break;
                    }

                    if(!FailSoftArray.checkIndex(index, obj.getLength())) {
                        System.out.println("Wrong index!");
                        break;
                    }

                    System.out.println("Enter an integer:");
                    try {
                        number = Long.parseLong(input.nextLine());
                    }
                    catch (NumberFormatException ex){
                        System.out.println("This isn't an integer.");
                        break;
                    }

                    if(!FailSoftArray.checkNumber(number)) {
                        System.out.println("Wrong number!");
                        break;
                    }

                    obj.putNumber(index, (int)number);

                    break;
                }
                case "get": {
                    System.out.println("Enter an index:");
                    try {
                        index = Integer.parseInt(input.nextLine());
                    }
                    catch (NumberFormatException ex){
                        System.out.println("This isn't an index.");
                        break;
                    }

                    if(!FailSoftArray.checkIndex(index, obj.getLength())) {
                        System.out.println("Wrong index!");
                        break;
                    }

                    obj.getNumber(index);

                    break;
                }
                case "print": obj.printArray(); break;
                default: System.out.println("Wrong command"); break;
            }

            printMessage();
        }
    }

    private static void printMessage(){
        System.out.println("Choose: \"put\", \"get\", \"print\", or \"end\"");
    }
}
