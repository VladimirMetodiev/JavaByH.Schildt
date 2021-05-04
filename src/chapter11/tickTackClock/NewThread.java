package chapter11.tickTackClock;

public class NewThread implements Runnable {
    Thread thread;
    TickTack ttObject;

    NewThread(String name, TickTack tt) {
        thread = new Thread(this, name);
        ttObject = tt;
    }

    public static NewThread createAndStart(String name, TickTack tt) {
        NewThread newThread = new NewThread(name, tt);
        newThread.thread.start();
        return newThread;
    }

    public void run() {
        if (thread.getName().compareTo("Tick") == 0) {
            for (int a = 0; a < 6; a++) {
                ttObject.tick(true);
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException ex){
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            ttObject.tick(false);
        }
        else if (thread.getName().compareTo("Tack") == 0) {
            for (int b = 0; b < 6; b++) {
                ttObject.tack(true);
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException ex){
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            ttObject.tack(false);
        }
    }
}
