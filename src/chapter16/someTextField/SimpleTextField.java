package chapter16.someTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTextField implements ActionListener {
    JTextField text;
    JButton button;
    JLabel label1, label2;

    SimpleTextField () {
        JFrame frame = new JFrame("Use a Text Field");
        frame.setSize(340, 100);
        frame.setLocation(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        text = new JTextField(10);
        text.setActionCommand("write");

        button = new JButton("Reverse");

        text.addActionListener(this);
        button.addActionListener(this);

        label1 = new JLabel("Enter text: ");
        label2 = new JLabel("");

        frame.add(label1);
        frame.add(text);
        frame.add(button);
        frame.add(label2);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().equals("Reverse")){
            String orgStr = text.getText();
            String resStr = "";

            for(int a = orgStr.length() - 1; a >= 0; a--) resStr += orgStr.charAt(a);

            text.setText(resStr);
        }
        else{
            label2.setText("You pressed ENTER. Text is: " + text.getText());
        }
    }
}
