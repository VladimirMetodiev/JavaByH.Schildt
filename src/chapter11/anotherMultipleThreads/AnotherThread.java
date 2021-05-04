package chapter11.anotherMultipleThreads;

public class AnotherThread extends Thread {
    private Thread thread;
    private int number;
    private int subSum = 0;

    public AnotherThread(String name, int number) {
        this.thread = new Thread();
        this.thread.setName(name);
        this.number = number;
    }

    @Override
    public void run() {
        for(int a = 1; a <= 10; a++){
            subSum += a * number;
        }

        System.out.println(thread.getName() + " = " + subSum);
    }

    public int getSubSum(){
        return  subSum;
    }
}
