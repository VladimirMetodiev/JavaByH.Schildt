package chapter5.bitwiseOperations;

import java.util.Scanner;

public class Encode {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder();
        StringBuilder decryptedMessage = new StringBuilder();

        System.out.println("Enter some message:");
        String message = input.nextLine();
        System.out.println("Enter a key:");
        int key = Integer.parseInt(input.nextLine());

        System.out.print("Original message: ");
        System.out.println(message);

        // Encode the message
        for (int a = 0; a < message.length(); a++) {
            encryptedMessage.append((char) (message.charAt(a) ^ key));
        }

        System.out.print("Encoded message: ");
        System.out.println(encryptedMessage);

        // Decode the message
        for (int b = 0; b < message.length(); b++) {
            decryptedMessage.append((char) (encryptedMessage.charAt(b) ^ key));
        }

        System.out.print("Decoded message: ");
        System.out.println(decryptedMessage);
    }
}



//Tests

//This is a test
//88

//Portfolio Diversification and Supporting Financial Institutions
//5436
