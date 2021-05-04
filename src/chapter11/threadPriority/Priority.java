package chapter11.threadPriority;

public class Priority implements Runnable {
    int counter;
    Thread thread;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        counter = 0;
        currentName = name;
    }

    public void run () {
        System.out.println(thread.getName() + " starting.");

        while(stop == false && counter < 10_000_000) {
            counter++;

            if(currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        }

        stop = true;

        System.out.println("\n" + thread.getName() + " terminating.");
    }
}
