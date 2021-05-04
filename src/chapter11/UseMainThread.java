package chapter11;

public class UseMainThread {
    public static void main(String[] arguments){
        Thread mainThread = Thread.currentThread();
        print(mainThread);

        mainThread.setName("Base thread");
        mainThread.setPriority(8);
        print(mainThread);
    }

    static void print(Thread thread){
        System.out.printf("Name of thread is: %s%n", thread.getName());
        System.out.printf("ID of thread is: %s%n", thread.getId());
        System.out.printf("Priority of thread is: %s%n", thread.getPriority());
        System.out.printf("State of thread is: %s%n%n", thread.getState());
    }
}
