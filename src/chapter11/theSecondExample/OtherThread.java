package chapter11.theSecondExample;

public class OtherThread implements Runnable {
    private Thread thread;

    // С конструктора създавам обект от клас Thread
    private OtherThread(String name){
        thread = new Thread(this, name);
    }

    static void startNewThread(String name){
        OtherThread newThread = new OtherThread(name);      // Това е екземлярът от клас OtherThread имплементиращ Runnable
        newThread.thread.start();                           // Стартирам обект от тип Thread с идентификатор thread
    }

    public void run() {
        try{
            Thread.sleep(300);
            System.out.println(thread.getName());
        }
        catch (InterruptedException ex) {
            System.out.println(thread.getName() + " interrupted.");
        }
    }
}
