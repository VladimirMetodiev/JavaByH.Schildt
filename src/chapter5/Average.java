package chapter5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        double[] array = new double[10];
        double average = 0.0;

        for (int a = 0; a < array.length; a++) {
            array[a] = input.nextDouble();
        }

        for (int b = 0; b < array.length; b++) {
            if(b < array.length - 1) average += array[b];
            else average = (average + array[b]) / array.length;
        }

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(average));
    }
}



//Tests

//3 6 9 12 15 18 21 24 27 30

//5 18.3 64.1 27.2 4 9.8 22 54.7 19 83.2

//-6.8 58.24 32.6 88 -15.9 -45.72 62.3 -52.81 46.9 75.5
