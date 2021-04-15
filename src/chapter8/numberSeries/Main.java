package chapter8.numberSeries;

import java.util.Scanner;

/* Получи се структурата стек */

public class Main {
    static Scanner input = new Scanner(System.in);
    static NumericalSeries numberSeries;
    static String command;
    static int start, value;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        enterStart();

        while(true){
            printMenu();
            command = input.nextLine().toLowerCase();
            if(command.equals("end")) break;

            switch (command){
                case "add": numberSeries.add(); break;
                case "remove": numberSeries.remove(); break;
                case "get": System.out.println(numberSeries.getLast()); break;
                case "reset": {
                    numberSeries.reset();
                    while(true){
                        givesAWarning();
                        try{
                            numberSeries.setStart(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()));
                            break;
                        }
                        catch (NumberFormatException ex){
                            System.out.println("<- Error ->");
                        }
                    }
                    break;
                }
                case "print": numberSeries.print(); break;
                default: System.out.println("Wrong command!"); break;
            }
        }
    }

    static void printMenu(){
        System.out.println("Choose: \"end\", \"add\", \"get\", \"reset\" or \"print\"");
    }

    static void givesAWarning(){
        System.out.println("There isn't a number sequence! Please, enter a start value and an incremental step.");
    }

    static void enterStart(){
        System.out.println("Enter a start value:");
        start = Integer.parseInt(input.nextLine());
        System.out.println("Enter an incremental step:");
        value = Integer.parseInt(input.nextLine());
        numberSeries = new NumericalSeries(start, value);
    }
}
