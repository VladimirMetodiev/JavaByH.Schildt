package chapter16.someLabel;

import javax.swing.*;

public class StartMyLabel {
    public static void main(String[] args) {
        //MyLabel obj = new MyLabel();

        // За да бъде изпълнен в потока на диспечеризация на събития, обекта от тип MyLabel, се създава по следният начин:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyLabel();
            }
        });
    }
}
