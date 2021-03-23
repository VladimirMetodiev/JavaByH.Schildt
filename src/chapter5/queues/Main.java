package chapter5.queues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SomeQueues myQueue = new SomeQueues();
        String command;
        int num = 0;

        System.out.println("Choose: \"end\", \"offer\", \"poll\" or \"print\".");

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
                case "print": {
                    myQueue.print();
                }
                default: break;
            }

            if(command.equals("poll")){

            }

            System.out.println("Choose: \"end\", \"offer\", \"poll\" or \"print\".");
        }
    }
}
