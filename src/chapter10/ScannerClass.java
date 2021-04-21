package chapter10;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] arguments){
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> realNumbers = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();

        while (!reader.hasNext("@end")) {
            if (reader.hasNextInt()) {
                numbers.add(reader.nextInt());
                continue;
            }

            if (reader.hasNextDouble()) {
                realNumbers.add(reader.nextDouble());
                continue;
            }

            String exp = reader.nextLine();
            if(!exp.equals("")) text.add(exp);
        }

        System.out.print("Numbers: ");
        for (int a = 0; a < numbers.size(); a++) {
            if(a < numbers.size() - 1) System.out.print(numbers.get(a) + ", ");
            else System.out.println(numbers.get(a));
        }

        System.out.print("Real numbers: ");
        for (int a = 0; a < realNumbers.size(); a++) {
            if(a < realNumbers.size() - 1) System.out.print(realNumbers.get(a) + ", ");
            else System.out.println(realNumbers.get(a));
        }

        System.out.print("Expressions: ");
        System.out.println(String.join(", ", text));
    }
}



//Test

//36
//tidy up
//83.54
//12
//take out
//write once run anywhere
//-9.2
//Women are not allowed!
//1692
//Best regards!
//@end
