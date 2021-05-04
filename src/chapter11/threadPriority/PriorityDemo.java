package chapter11.threadPriority;

public class PriorityDemo {
    public static void main(String args[]) {
        Priority theFirst = new Priority("High Priority");
        Priority theSecond = new Priority("Low Priority");
        Priority theThird = new Priority("Normal Priority #1");
        Priority theFourth = new Priority("Normal Priority #2");
        Priority theFifth = new Priority("Normal Priority #3");

        theFirst.thread.setPriority(Thread.MAX_PRIORITY);
        theSecond.thread.setPriority(Thread.MIN_PRIORITY);

        theFirst.thread.start();
        theSecond.thread.start();
        theThird.thread.start();
        theFourth.thread.start();
        theFifth.thread.start();

        try {
            theFirst.thread.join();
            theSecond.thread.join();
            theThird.thread.join();
            theFourth.thread.join();
            theFifth.thread.join();
        }
        catch(InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nHigh priority thread counted to " + theFirst.counter);
        System.out.println("Low priority thread counted to " + theSecond.counter);
        System.out.println("1st Normal priority thread counted to " + theThird.counter);
        System.out.println("2nd Normal priority thread counted to " + theFourth.counter);
        System.out.println("3rd Normal priority thread counted to " + theFifth.counter);

    }
}
