package chapter11.multipleThreads;

public class MyThread implements Runnable {
    private Thread thread;

    private MyThread(String name) {
        thread = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");

        try {
            for (int a = 0; a < 10; a++) {
                Thread.sleep(400);
                System.out.println(" In " + thread.getName() + ", count is " + (a + 1));
            }
        }
        catch (InterruptedException ex) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }

    public Thread getThread(){
        return thread;
    }
}
