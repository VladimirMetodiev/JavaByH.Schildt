package chapter5;

import java.util.Scanner;

public class SeveralStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = new String("Java programming");
        String str2 = str1 + "!";
        String str3 = "Java is a class-based, object-oriented programming language.";
        String str4 = input.nextLine();         // Java was originally developed by James Gosling at Sun MicroSystems.

        System.out.println("Example 1");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4 + "\n");

        System.out.println("Example 2");
        System.out.println(str1.equals("Java programming"));
        System.out.println(str1.equalsIgnoreCase("JAVA PROGRAMMING") + "\n");

        System.out.println("Example 3");
        System.out.println(str3.length() + "\n");

        System.out.println("Example 4");
        System.out.println(str1.charAt(0) + "\n");

        System.out.println("Example 5");
        System.out.println(str1.compareTo(str2) + "\n");

        System.out.println("Example 6");
        System.out.println(str3.indexOf("b"));
        System.out.println(str3.lastIndexOf("g"));
        System.out.println(str3.substring(0, 5) + "\n");

        System.out.println("Example 7");
        System.out.println(str3.contains("Java") + "\n");

        System.out.println("Example 8");
        String current = "Java";
        System.out.println(current.concat(" is great!") + "\n");

        System.out.println("Example 9");
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println(String.join(", ", array) + "\n");

        System.out.println("Example 10");
        current = "C# was developed by James Gosling.";
        current = current.replace("C#", "Java");
        System.out.println(current + "\n");

        System.out.println("Example 11");
        System.out.println(current.toLowerCase());
        System.out.println(current.toUpperCase() + "\n");

        System.out.println("Example 12");
        System.out.println("   " + current);
        System.out.println(current.trim() + "\n");

    }
}
