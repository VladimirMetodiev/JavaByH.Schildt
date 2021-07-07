package chapter16.someTextField;

import javax.swing.*;

public class StartText {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleTextField();
            }
        });
    }
}
