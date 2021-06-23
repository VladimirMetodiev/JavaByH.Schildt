package chapter13.anotherQueue;

import java.util.Scanner;

public class CreateQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression;
        Integer value;

        Integer[] store = new Integer[256];
        GenQueue<Integer> queue = new GenQueue<>(store);

        printMessage();

        while (!(expression = input.nextLine().toLowerCase()).equals("end")) {
            switch (expression) {
                case "offer": {
                    try {
                        System.out.println("Enter some number:");
                        value = Integer.parseInt(input.nextLine());
                        queue.offer(value);
                    }
                    catch (QueueFullException ex1){
                        System.out.println(ex1.toString());
                    }
                    catch (NumberFormatException ex2){
                        System.out.println("It isn't an integer.");
                    }
                    break;
                }
                case "poll": {
                    try {
                        System.out.println(queue.poll());
                    }
                    catch (QueueEmptyException ex){
                        System.out.println(ex.toString());
                    }
                    break;
                }
                case "peek": {
                    try {
                        queue.peek();
                    }
                    catch (QueueEmptyException ex){
                        System.out.println(ex.toString());
                    }
                    break;
                }
                case "clear": {
                    queue.clear();
                    break;
                }
                case "contains": {
                    try {
                        System.out.println("Enter the number you are looking for:");
                        value = Integer.parseInt(input.nextLine());
                        queue.contains(value);
                    }
                    catch (NumberFormatException ex) {
                        System.out.println("It isn't an integer.");
                    }
                    break;
                }
                case "size": {
                    System.out.println(queue.size());
                    break;
                }
                case "print": {
                    try {
                        queue.print();
                    }
                    catch (QueueEmptyException ex) {
                        System.out.println(ex.toString());
                    }
                    break;
                }
                default: {
                    System.out.println("Wrong command!");
                    break;
                }
            }
            printMessage();
        }
    }

    static void printMessage(){
        System.out.println("Choose: \"offer\", \"poll\", \"peek\", \"clear\", \"contains\", \"size\", \"print\", \"end\"");
    }
}
