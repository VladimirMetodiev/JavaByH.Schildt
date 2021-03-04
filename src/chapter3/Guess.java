package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter = getLetter();
        String choice;

        System.out.println("Guess the intended letter from the range A - Z or enter END.");

        while (true){
            choice = input.nextLine().toUpperCase();
            if(choice.equals("END")) break;

            if (choice.charAt(0) == letter) {
                System.out.println("It is true!");
            }
            else{
                System.out.println("Sorry, it is false.");
            }
        }
    }

    private static char getLetter(){
        Random random = new Random();

        int current = random.nextInt(26);

        switch (current){
            case 0: return 'A';
            case 1: return 'B';
            case 2: return 'C';
            case 3: return 'D';
            case 4: return 'E';
            case 5: return 'F';
            case 6: return 'G';
            case 7: return 'H';
            case 8: return 'I';
            case 9: return 'J';
            case 10: return 'K';
            case 11: return 'L';
            case 12: return 'M';
            case 13: return 'N';
            case 14: return 'O';
            case 15: return 'P';
            case 16: return 'Q';
            case 17: return 'R';
            case 18: return 'S';
            case 19: return 'T';
            case 20: return 'U';
            case 21: return 'V';
            case 22: return 'W';
            case 23: return 'X';
            case 24: return 'Y';
            case 25: return 'Z';
            default: return 'A';
        }
    }
}
