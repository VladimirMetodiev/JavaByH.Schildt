package chapter11.theSecondExample;

public class UseThreadVarTwo {
    public static void main(String[] args) {
        OtherThread.startNewThread("One");
        OtherThread.startNewThread("Two");

        for (int a = 0; a < 6; a++) {
            if(a <= 2) System.out.print(">>> ");
            else System.out.print("<<< ");

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
