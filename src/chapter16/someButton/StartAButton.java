package chapter16.someButton;

import javax.swing.*;

public class StartAButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyButton();
            }
        });
    }
}
