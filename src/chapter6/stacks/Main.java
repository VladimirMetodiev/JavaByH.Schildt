package chapter6.stacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] arguments){
        Scanner input = new Scanner(System.in);

        String command, chooseCapacity;
        int capacity;
        IntegerStack numbers;
        StringStack text;

        while (true){
            System.out.println("Choose: \"text stack\", \"number stack\" or \"end\".");
            command = input.nextLine().toLowerCase();
            if(command.equals("text stack") || command.equals("number stack")) break;
            else if(command.equals("end")) return;
        }

        while(true){
            System.out.println("Enter a capacity of stack or choose \"end\":");
            chooseCapacity = input.nextLine().toLowerCase();
            if(chooseCapacity.equals("end")) return;

            try{
                capacity = Integer.parseInt(chooseCapacity);
                break;
            }
            catch (NumberFormatException ex1){
                System.out.println("Capacity must be an integer. This is not integer.");
            }
        }

        if(command.equals("text stack")) {
            text = new StringStack(capacity);

            printMessage();
            while (!(command = input.nextLine().toLowerCase()).equals("end")){
                switch (command){
                    case "push": {
                        System.out.println("Enter some text:");
                        text.push(input.nextLine());
                        break;
                    }
                    case "pop": {
                        String current = text.pop();
                        if(!current.equals("-1")) System.out.println(current);
                        break;
                    }
                    case "peek": {
                        String current = text.peek();
                        if(!current.equals("-1")) System.out.println(current);
                        break;
                    }
                    case "size": text.printSize(); break;
                    case "print": text.print(); break;
                    case "clear": text.clear(); break;
                    default: System.out.println("Wrong command!");
                }
                printMessage();
            }
        }
        else if(command.equals("number stack")) {
            numbers = new IntegerStack(capacity);

            printMessage();
            while (!(command = input.nextLine().toLowerCase()).equals("end")){
                switch (command){
                    case "push": {
                        System.out.println("Enter some number:");
                        try {
                            numbers.push(Integer.parseInt(input.nextLine()));
                        }
                        catch (NumberFormatException ex2){
                            System.out.println("It can not be entered. This is not integer.");
                        }
                        break;
                    }
                    case "pop": {
                        int current = numbers.pop();
                        if(current > -1) System.out.println(current);
                        break;
                    }
                    case "peek": {
                        int current = numbers.peek();
                        if(current > -1) System.out.println(current);
                        break;
                    }
                    case "size": numbers.printSize(); break;
                    case "print": numbers.print(); break;
                    case "clear": numbers.clear(); break;
                    default: System.out.println("Wrong command!");
                }
                printMessage();
            }
        }
    }

    private static void printMessage(){
        System.out.println("Choose: \"push\", \"pop\", \"peek\", \"size\", \"clear\", \"print\" or \"end\"");
    }
}
