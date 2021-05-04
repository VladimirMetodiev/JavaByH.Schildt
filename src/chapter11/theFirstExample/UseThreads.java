package chapter11.theFirstExample;

public class UseThreads {
    public static void main(String[] args) {
        MyThread threadObj1 = new MyThread("One");
        Thread thread1 = new Thread(threadObj1);

        MyThread threadObj2 = new MyThread("Two");
        Thread thread2 = new Thread(threadObj2);

        thread1.start();
        thread2.start();

        for (int a = 0; a < 10; a++) {
            System.out.print("<!> <*> ");
            if(a == 4 || a == 9) System.out.println();
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
