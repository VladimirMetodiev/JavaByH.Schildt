package chapter11;

public class MainThreadPriority {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);

        mainThread.setName("BaseThread");
        System.out.println(mainThread);

        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(mainThread);

        mainThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(mainThread);

        mainThread.setPriority(Thread.NORM_PRIORITY);
        System.out.println(mainThread);
    }
}
