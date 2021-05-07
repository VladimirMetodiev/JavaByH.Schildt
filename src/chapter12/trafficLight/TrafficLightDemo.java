package chapter12.trafficLight;

import chapter12.myTrafficLights.Lights;

public class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator traffic = new TrafficLightSimulator(Lights.GREEN);

        Thread thread = new Thread(traffic);
        thread.start();

        for (int a = 0; a < 9; a++) {
            System.out.println(traffic.getColor());
            traffic.waitForChange();
        }

        traffic.cancel();
    }
}
