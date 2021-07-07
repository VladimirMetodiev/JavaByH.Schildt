package chapter16.someLabel;

import javax.swing.*;

public class MyLabel {
    MyLabel(){
        JFrame frame = new JFrame();                                        // Създавам рамка
        frame.setTitle("A Simple Swing Application");                       // Поставям заглавие
        frame.setSize(335, 100);                                // Поставям размери на рамката
        frame.setLocation(250, 300);                                    // Определям местоположението
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);      // Определям как да се затвори

        /*
         * Методът .setDefaultCloseOperation() може да приеме следните константи:
         * JFrame.EXIT_ON_CL0SE6
         * JFrame.DISPOSE_ON_CLOSE
         * JFrame.HIDE_ON_CLOSE
         * JFrame.DO_NOTHING_ON_CLOSE
         */

        JLabel myLabel = new JLabel();                                      // Създавам етикет
        myLabel.setText("I am number one!");                                // Поставям надпис
        myLabel.setHorizontalAlignment(JLabel.CENTER);                      // Подравнявам етикета в центъра


        frame.add(myLabel);                                                 // Добавям етикета н рамката

        frame.setVisible(true);                                             // Рамката може да се визуализира на екрана
    }
}
