package chapter12.myTrafficLights;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press \"ENTER\" to stop!");

        TrafficLights trafficLights = new TrafficLights();
        Thread thread = new Thread(trafficLights);
        thread.start();

        input.nextLine();
        trafficLights.stop();
    }
}
