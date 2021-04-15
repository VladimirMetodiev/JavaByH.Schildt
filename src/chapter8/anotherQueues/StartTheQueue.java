package chapter8.anotherQueues;

import java.util.Scanner;

public class StartTheQueue {
    public static void main(String[] arguments){
        Scanner input = new Scanner(System.in);

        QueueRealization qr = new QueueRealization();
        String command;

        while (true) {
            getMessage1();
            command = input.nextLine().toLowerCase();
            if(command.equals("end")) break;

            switch (command){
                case "offer": {
                    getMessage2();
                    qr.offer(Double.parseDouble(input.nextLine()));
                    break;
                }
                case "poll": System.out.println(qr.poll()); break;
                case "peek": System.out.println(qr.peek()); break;
                case "clear": qr.clear(); break;
                case "size": System.out.println(qr.size()); break;
                case "contains": {
                    getMessage2();
                    System.out.println(qr.contains(Double.parseDouble(input.nextLine())));
                    break;
                }
                case "print": qr.print(); break;
                default: System.out.println("Wrong command."); break;
            }
        }
    }

    private static void getMessage1(){
        System.out.println("Choose: \"end\", \"offer\", \"poll\", \"peek\", \"clear\", \"size\", \"contains\" or \"print\"");
    }

    private static void getMessage2(){
        System.out.println("Enter a real number:");
    }
}
