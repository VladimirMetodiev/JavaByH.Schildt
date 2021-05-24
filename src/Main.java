import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10_000_000];

        for (int a = 0; a < array.length; a++) {
            array[a] = a + 1;
        }

        for (int b = 1; b <= array.length - 1; b++) {
            if(b % 20 == 0) System.out.println(array[b]);
            else System.out.print(array[b] + " ");
        }
    }
}
