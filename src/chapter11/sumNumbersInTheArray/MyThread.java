package chapter11.sumNumbersInTheArray;

public class MyThread implements Runnable {
    private Thread thread;
    static SumArray sArr = new SumArray();
    private int[] array;
    private int answer;

    MyThread(String name, int[] numbers) {
        thread = new Thread(this, name);
        array = numbers;
    }

    public static MyThread createAndStart(String name, int[] numbers) {
        MyThread myThread = new MyThread(name, numbers);
        myThread.thread.start();
        return myThread;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");

        answer = sArr.sumArray(array);

        System.out.printf("Sum for %s is %d.%n", thread.getName(), answer);

        System.out.println(thread.getName() + " terminating.");
    }
}
