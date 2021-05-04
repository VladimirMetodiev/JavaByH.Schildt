package chapter11.theThirdThread;

public class UseTheThirdThread {
    public static void main(String[] args) {
        TheThirdThread one = TheThirdThread.createAndStart("One");
        TheThirdThread two = TheThirdThread.createAndStart("Two");

        for (int a = 0; a < 6; a++) {
            System.out.print("<3th> ");

            if(a == 2 || a == 5) System.out.println();

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
