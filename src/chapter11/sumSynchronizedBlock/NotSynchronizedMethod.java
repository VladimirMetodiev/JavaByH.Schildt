package chapter11.sumSynchronizedBlock;

public class NotSynchronizedMethod {
    private int sum;

    int sumArray(int[] array){
        sum = 0;

        for(int a = 0; a < array.length; a++){
            sum += array[a];
            System.out.printf("Current total for %s is %d.%n", Thread.currentThread().getName(), sum);

            try {
                Thread.sleep(50);
            }
            catch(InterruptedException ex) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}
