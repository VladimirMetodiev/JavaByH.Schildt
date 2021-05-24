package chapter13.extendsNumber;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumericalFunctions<Double, Double> object = new NumericalFunctions<>();
        String command;

        print();
        while (!(command = input.nextLine().toLowerCase()).equals("end")){
            while(true) {
                try {
                    System.out.println("Enter the first number:");
                    object.setNumber1(Double.parseDouble(input.nextLine()));
                    break;
                }
                catch (NumberFormatException ex1) {
                    System.out.println("It isn't number!");
                }
            }

            while (true) {
                try {
                    System.out.println("Enter the second number:");
                    object.setNumber2(Double.parseDouble(input.nextLine()));
                    break;
                }
                catch (NumberFormatException ex2) {
                    System.out.println("It isn't number!");
                }
            }

            switch (command){
                case "add": object.add(); break;
                case "subtract": object.subtract(); break;
                case "multiply": object.multiply(); break;
                case "divide": object.divide(); break;
                default: System.out.println("Wrong command!"); break;
            }

            print();
        }
    }

    static void print () {
        System.out.println("Choose: \"end\", \"add\", \"subtract\", \"multiply\" or \"divide\"");
    }
}
