package chapter11.tickTackClock;

public class TickTack {
    String state; // текущо състояние на часовника

    synchronized void tick(boolean running) {
        if(!running) { // спиране на часовника
            state = "ticked";
            notify(); // съобщи на чакащите нишки
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // постави като текущо състояние ticked

        notify(); // съобщи на .tack(), че може да работи

        try {
            while(!state.equals("tacked")) wait(); // изчакай tack да приключи
        }
        catch(InterruptedException ex) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tack(boolean running) {
        if(!running) { // спиране на часовника
            state = "tacked";
            notify(); // съобщи на чакащите нишки
            return;
        }

        System.out.println("Tack");

        state = "tacked"; // постави като текущо състояние tacked

        notify(); // съобщи на .tick(), че може да работи

        try {
            while(!state.equals("ticked")) wait(); // изчакай tick да приключи
        }
        catch(InterruptedException ex) {
            System.out.println("Thread interrupted.");
        }
    }
}
