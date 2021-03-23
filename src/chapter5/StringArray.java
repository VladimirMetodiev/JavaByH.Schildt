package chapter5;

public class StringArray {
    public static void main(String args[]) {
        String[] array = { "This", "is", "a", "test." };

        System.out.println("Original array: ");
        for(String str : array) {
            System.out.print(str + " ");
        }
        System.out.println("\n");

        // Change a string.
        array[1] = "was";
        array[3] = "test, too!";

        System.out.println("Modified array: ");
        for(String str : array) {
            System.out.print(str + " ");
        }
    }
}
