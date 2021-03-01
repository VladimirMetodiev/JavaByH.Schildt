package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some time in seconds:");
        float time = Float.parseFloat(input.nextLine());

        double distance = 343.0 * time;

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(distance) + " meters");
    }
}



//Condition

//Напишете програма, която изчислява разтоянието, до мястото, на падането на мълния, по дадено време, след което се чува гръм.

//Скоростта на звука е 343 м/с
