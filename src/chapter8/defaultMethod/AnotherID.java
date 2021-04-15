package chapter8.defaultMethod;

import java.util.Scanner;

public class AnotherID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GetID2 admin = new GetID2();
        GetID2 user1 = new GetID2(11);
        GetID2 user2 = new GetID2(19);

        System.out.println("Administrator's ID is: " + admin.getUserID());
        System.out.println("User1 ID is: " + user1.getUserID());
        System.out.println("User2 ID is: " + user2.getUserID() + "\n");

        System.out.println("Which is the default administrator ID?");
        System.out.println("Answer: " + admin.getAdminID() + "\n");

        System.out.println("Enter a new admin ID:");
        user1.setAdminID(Integer.parseInt(input.nextLine()));

        System.out.println("\n" + "Enter a new admin ID:");
        admin.setAdminID(Integer.parseInt(input.nextLine()));
        System.out.println("New administrator's ID is: " + admin.getUserID() + "\n");

        System.out.println("Which is the default administrator ID?");
        System.out.println("Answer: " + admin.getAdminID());
    }
}
