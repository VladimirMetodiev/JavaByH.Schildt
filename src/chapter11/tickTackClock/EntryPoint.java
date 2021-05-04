package chapter11.tickTackClock;

public class EntryPoint {
    public static void main(String args[]) {
        TickTack tt = new TickTack();
        NewThread newTick = NewThread.createAndStart("Tick", tt);
        NewThread newTack = NewThread.createAndStart("Tack", tt);

        try {
            newTick.thread.join();
            newTack.thread.join();
        }
        catch(InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }
    }
}
