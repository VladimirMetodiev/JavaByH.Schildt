package chapter5.queues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SomeQueues myQueue = new SomeQueues();
        SomeQueues picture = null;
        String command;
        int num = 0;

        printMessage();

        while (!(command = input.nextLine().toLowerCase()).equals("end")){
            switch (command){
                case "offer": {
                    System.out.println("Enter a number:");
                    myQueue.offer(Integer.parseInt(input.nextLine()));
                    break;
                }
                case "poll": {
                    if(myQueue.isThereElement()) {
                        num = myQueue.poll();
                        System.out.println("Do you want to print this number? Chose: \"yes\" or \"no\".");
                        command = input.nextLine().toLowerCase();
                        if (command.equals("yes")) System.out.println(num);
                    }
                    else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                }
                case "take picture": {
                    picture = new SomeQueues(myQueue);
                    break;
                }
                case "print": {
                    myQueue.print();
                    break;
                }
                case "print picture": {
                    try {
                        picture.print();
                    }
                    catch (NullPointerException ex){
                        System.out.println("No picture!");
                    }
                    break;
                }
                default: break;
            }

            printMessage();
        }
    }

    private static void printMessage(){
        System.out.println("Choose: \"end\", \"offer\", \"poll\", \"take picture\", \"print\" or \"print picture\".");
    }
}
