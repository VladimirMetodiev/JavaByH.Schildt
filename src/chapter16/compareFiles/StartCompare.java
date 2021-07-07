package chapter16.compareFiles;

import javax.swing.*;

public class StartCompare {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingCompare();
            }
        });
    }
}



//Tests

//text\\ShowText.txt
//text\\CopyOfShowText.txt

//text\\ShowText.txt
//text\\CopyOfShowText2.txt
