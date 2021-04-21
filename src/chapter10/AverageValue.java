package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        double realNumber, sum = 0.0, average;

        while(true){
            System.out.println("Enter some count:");
            try{
                number = Integer.parseInt(reader.readLine());
                break;
            }
            catch (NumberFormatException ex1){
                System.out.println("This isn't an integer!");
            }
        }

        for(int a = 0; a < number; a++){
            while(true){
                System.out.println("Enter a real number:");
                try{
                    realNumber = Double.parseDouble(reader.readLine());
                    break;
                }
                catch (NumberFormatException ex1){
                    System.out.println("This isn't real number!");
                }
            }
            sum += realNumber;
        }


        if(number > 0) {
            average = sum / number;
            System.out.printf("%.2f%n", average);
        }

        reader.close();
    }
}
