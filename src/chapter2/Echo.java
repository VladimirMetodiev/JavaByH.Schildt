package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some time in seconds:");
        double time = Double.parseDouble(input.nextLine());

        time /= 2.0;
        double distance = 343.0 * time;

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(distance) + " meters");
    }
}



// Намирате се в планината, определете разтоянието до отсрешното било на планината, по времето, за което се връща ехото.

//Скоростта на звука е 343 м/с
