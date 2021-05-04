package chapter11.sumSynchronizedBlock;

public class ClassWithSynchronizedBlock implements Runnable {
    private Thread thread;
    static NotSynchronizedMethod sArr = new NotSynchronizedMethod();
    private int[] array;
    private int answer;

    ClassWithSynchronizedBlock(String name, int[] numbers) {
        thread = new Thread(this, name);
        array = numbers;
    }

    public static ClassWithSynchronizedBlock createAndStart(String name, int[] numbers) {
        ClassWithSynchronizedBlock myThread = new ClassWithSynchronizedBlock(name, numbers);
        myThread.thread.start();
        return myThread;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        synchronized (sArr) {
            System.out.println(thread.getName() + " starting.");
            answer = sArr.sumArray(array);
            System.out.printf("Sum for %s is %d.%n", thread.getName(), answer);
            System.out.println(thread.getName() + " terminating.");
        }
    }
}
