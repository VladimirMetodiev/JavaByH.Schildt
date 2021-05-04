package chapter11.suspendingResumingStopping;

public class OneHundredAndFirstThread implements Runnable {
    Thread thread;
    boolean suspended;
    boolean stopped;

    OneHundredAndFirstThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static OneHundredAndFirstThread createAndStart(String name) {
        OneHundredAndFirstThread newThread = new OneHundredAndFirstThread(name);
        newThread.thread.start();
        return newThread;
    }

    public void run() {
        System.out.println(thread.getName() + " starting.");

        try {
            for (int a = 1; a < 1000; a++) {
                System.out.print(a + " ");
                if ((a % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Използвам синхронизиран блок, за да проверя прекратяването и спирането.
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) {
                        break;
                    }
                }
            }
        }
        catch (InterruptedException ex) {
            System.out.println(thread.getName() + " interrupted.");
        }

        System.out.println(thread.getName() + " exiting.");
    }

    // Спри нишката
    synchronized void myStop() {
        stopped = true;

        // Гарантира, че прекратена нишка може да бъде спряна
        suspended = false;
        notify();
    }

    // Прекрати нишката
    synchronized void mySuspend() {
        suspended = true;
    }

    // Продължи нишката
    synchronized void myResume() {
        suspended = false;
        notify();
    }
}
