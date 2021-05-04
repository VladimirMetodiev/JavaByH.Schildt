package chapter11.multipleThreads;

public class MoreThreads {
    public static void main(String args[]) {
        // Use .isAlive()

        System.out.println("Main thread starting.");

        MyThread theFirst = MyThread.createAndStart("One");
        MyThread theSecond = MyThread.createAndStart("Two");
        MyThread theThird = MyThread.createAndStart("Three");

        while (theFirst.getThread().isAlive() || theSecond.getThread().isAlive() || theThird.getThread().isAlive()) {
            System.out.print(">");

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}



// Solutions

// Create multiple threads

//    public static void main(String args[]) {
//        System.out.println("Main thread starting.");
//
//        NewThread theFirst = NewThread.createAndStart("One");
//        NewThread theSecond = NewThread.createAndStart("Two");
//        NewThread theThird = NewThread.createAndStart("Three");
//
//        for (int b = 0; b < 50; b++) {
//            System.out.print(">");
//
//            try {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException exc) {
//                System.out.println("Main thread interrupted.");
//            }
//        }
//
//        System.out.println("Main thread ending.");
//    }



// Use .join()

//    public static void main(String args[]) {
//        System.out.println("Main thread starting.");
//
//        NewThread theFirst = NewThread.createAndStart("One");
//        NewThread theSecond = NewThread.createAndStart("Two");
//        NewThread theThird = NewThread.createAndStart("Three");
//
//        try {
//            theFirst.getThread().join();
//            System.out.println(theFirst.getThread().getName() + " joined.");
//            theSecond.getThread().join();
//            System.out.println(theSecond.getThread().getName() + " joined.");
//            theThird.getThread().join();
//            System.out.println(theThird.getThread().getName() + " joined.");
//        }
//        catch (InterruptedException exc) {
//            System.out.println("Main thread interrupted.");
//        }
//
//        System.out.println("Main thread ending.");
//    }
