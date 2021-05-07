package chapter12.trafficLight;

import chapter12.myTrafficLights.Lights;

public class TrafficLightSimulator implements Runnable {
    private Lights current; // съдържа текущия цвят на светофара
    private boolean stop = false; // постави true, за да спре симулацията
    private boolean changed = false; // true когато светлините се променят

    TrafficLightSimulator(Lights colour) {
        current = colour;
    }

    TrafficLightSimulator() {
        current = Lights.RED;
    }

    // пусни светлината
    public void run() {
        while(!stop) {
            try {
                switch(current) {
                    case GREEN:
                        Thread.sleep(10000); // зелено 10 секунди
                        break;
                    case YELLOW:
                        Thread.sleep(2000);  // жълто за 2 секунди
                        break;
                    case RED:
                        Thread.sleep(12000); // червено за 12 секунди
                        break;
                }
            }
            catch(InterruptedException ex) {
                System.out.println(ex);
            }

            changeColor();
        }
    }

    // промени цветът на светлината
    synchronized void changeColor() {
        switch(current) {
            case RED: {
                current = Lights.GREEN;
                break;
            }
            case YELLOW: {
                current = Lights.RED;
                break;
            }
            case GREEN: {
                current = Lights.YELLOW;
            }
        }

        changed = true;
        notify(); // сигнализира, че светлината се е променила
    }

    // изчакване, докато настъпи промяна на светлината
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // чака промяна на светлината
            changed = false;
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }

    // връща текущият цвят
    synchronized Lights getColor() {
        return current;
    }

    // спира светофара
    synchronized void cancel() {
        stop = true;
    }
}

