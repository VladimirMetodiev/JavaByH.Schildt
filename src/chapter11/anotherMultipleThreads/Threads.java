package chapter11.anotherMultipleThreads;

public class Threads {
    public static void main(String[] args) {
        AnotherThread theFirst = new AnotherThread("The first sequence", 1);
        AnotherThread theSecond = new AnotherThread("The second sequence", 2);
        AnotherThread theThird = new AnotherThread("The third sequence", 3);
        AnotherThread theFourth = new AnotherThread("The fourth sequence", 4);

        theFirst.start();
        theSecond.start();
        theThird.start();
        theFourth.start();

        while (true){
            if(!theFirst.isAlive() && !theSecond.isAlive() && !theThird.isAlive() && !theFourth.isAlive()){
                break;
            }
        }

        System.out.println("TOTAL: " + (theFirst.getSubSum() + theSecond.getSubSum() + theThird.getSubSum() + theFourth.getSubSum()));
    }
}
