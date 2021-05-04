package chapter11.theThirdThread;

public class TheThirdThread implements Runnable {
    private Thread thread;

    private TheThirdThread(String name){
        thread = new Thread(this, name);
    }

    // Фабричен метод createAndStart
    // DEF Фабричен метод е такъв метод, който връща обект на класа
    public static TheThirdThread createAndStart(String name){
        TheThirdThread theThird  = new TheThirdThread(name);
        theThird.thread.start();
        return theThird;
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
