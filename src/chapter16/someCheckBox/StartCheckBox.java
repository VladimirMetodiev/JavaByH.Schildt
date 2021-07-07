package chapter16.someCheckBox;

import javax.swing.*;

public class StartCheckBox {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewCheckBox();
            }
        });
    }
}
