package chapter11.sumNumbersInTheArray;

public class SumArray {
    private int sum;

    synchronized public int sumArray(int[] array){
        sum = 0;        // В NewThread създавам статично поле от тип SumArray

        for(int a = 0; a < array.length; a++){
            sum += array[a];
            System.out.printf("Current total for %s is %d.%n", Thread.currentThread().getName(), sum);

            // Този блок е необходим, за да осигури (време за) превключването на задачите.
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
