package chapter12.myTrafficLights;

public class TrafficLights implements Runnable {
    private boolean exit = false;
    private Lights light = Lights.GREEN;

    @Override
    public void run() {
        while (!exit){
            if(light == Lights.GREEN){
                System.out.println(Lights.GREEN);
                light = Lights.YELLOW;
            }
            else if(light == Lights.YELLOW){
                System.out.println(Lights.YELLOW);
                light = Lights.RED;
            }
            else if(light == Lights.RED){
                System.out.println(Lights.RED);
                light = Lights.GREEN;
            }

            try{
                if(light == Lights.GREEN) {
                    Thread.sleep(7000);
                }
                else if(light == Lights.YELLOW){
                    Thread.sleep(5000);
                }
                else if(light == Lights.RED){
                    Thread.sleep(2000);
                }
            }
            catch (InterruptedException ex){
                System.out.println("Thread interrupted!");
            }
        }
    }

    public void stop() {
        exit = true;
    }
}
