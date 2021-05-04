package chapter11.theFirstExample;

public class MyThread implements Runnable {
    private String name = null;

    MyThread(String name) {
        this.name = name;
    }

    public void run(){
        try{
            Thread.sleep(500);
            System.out.println(name);
        }
        catch (InterruptedException ex) {
            System.out.println(name + " interrupted.");
        }
    }
}
