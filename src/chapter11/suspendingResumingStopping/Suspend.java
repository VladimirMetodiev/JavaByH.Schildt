package chapter11.suspendingResumingStopping;

public class Suspend {
    public static void main(String args[]) {
        OneHundredAndFirstThread OneHundredAndOne = OneHundredAndFirstThread.createAndStart("One hundred and first thread");

        try {
            Thread.sleep(1000);

            OneHundredAndOne.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            OneHundredAndOne.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            OneHundredAndOne.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            OneHundredAndOne.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            OneHundredAndOne.mySuspend();
            System.out.println("Stopping thread.");
            OneHundredAndOne.myStop();

        }
        catch (InterruptedException ex) {
            System.out.println("Main thread Interrupted");
        }

        // Чака нишката да приключи
        try {
            OneHundredAndOne.thread.join();
        }
        catch (InterruptedException ex) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
