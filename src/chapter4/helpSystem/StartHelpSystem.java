package chapter4.helpSystem;

import java.util.Scanner;

public class StartHelpSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;

        Help help = new Help();

        help.showMenu();

        while (!(command = input.nextLine().toLowerCase()).equals("end")){
            help.helpOn(command);
            help.showMenu();
        }

        Help.printLine();
    }
}
