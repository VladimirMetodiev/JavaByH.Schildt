package chapter5;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Enter some command:");

        while(!(command = input.nextLine().toLowerCase()).equals("end")) {
            switch (command) {
                case "connect": System.out.println("Connecting"); break;
                case "cancel": System.out.println("Canceling"); break;
                case "disconnect": System.out.println("Disconnecting"); break;
                default: System.out.println("Command Error!"); break;
            }
            System.out.println("Enter some command:");
        }
    }
}
