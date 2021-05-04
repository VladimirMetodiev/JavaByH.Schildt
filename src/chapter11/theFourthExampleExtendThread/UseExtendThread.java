package chapter11.theFourthExampleExtendThread;

public class UseExtendThread {
    public static void main(String[] args) {
        SomeThread newThread1 = new SomeThread("One");
        SomeThread newThread2 = new SomeThread("Two");

        if(Thread.currentThread().isAlive()){
            try {
                newThread1.join();
                newThread1.start();
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }


            if(newThread1.isAlive()){
                try {
                    newThread2.join();
                    newThread2.start();
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        for (int a = 0; a < 5; a++) {
            System.out.print("[/] ");
        }

        System.out.println();
    }
}
