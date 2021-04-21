package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class BreakOutOfWhileWithHasNext {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Double> realNumbers = new ArrayList<>();

        while (!reader.hasNext("end")){
            try {
                realNumbers.add(Double.parseDouble(reader.nextLine()));
            }
            catch (NumberFormatException ex){
                System.out.println("This is not a real number!");
            }
        }

        System.out.print("List of real numbers: ");
        print(realNumbers);
        realNumbers.clear();
    }

    private static void print(ArrayList<Double> list){
        for (int a = 0; a < list.size(); a++) {
            if(a < list.size() - 1) System.out.print(list.get(a) + ", ");
            else System.out.println(list.get(a));
        }
    }
}



//Бележка: когато в скобите на методът .hasNext(), няма някакъв pattern, той може да бъде прекратен с Ctrl + D

//Tests

//5.3
//6.4
//-4.2
//end

//16
//-82.4
//six
//67.3
//end
