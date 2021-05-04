package chapter11.theFourthExampleExtendThread;

public class SomeThread extends Thread {
    SomeThread (String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.printf("[ID %d] %s - P: %d%n", getId(), getName(), getPriority());
        }
        catch (InterruptedException ex) {
            System.out.println("The thread interrupted.");
        }
    }
}
