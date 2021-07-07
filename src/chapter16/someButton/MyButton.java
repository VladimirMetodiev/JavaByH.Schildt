package chapter16.someButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton implements ActionListener {
    JLabel jLabel;

    MyButton(){
        JFrame jFrame = new JFrame("A Button Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(250, 100);
        jFrame.setLocation(300, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton buttonUp = new JButton("Up");
        JButton buttonDown = new JButton("Down");

        buttonUp.addActionListener(this);
        buttonDown.addActionListener(this);

        jFrame.add(buttonUp);
        jFrame.add(buttonDown);

        jLabel = new JLabel("Press a button.");
        jLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().equals("Up")){
            jLabel.setText("You pressed Up.");
        }
        else{
            jLabel.setText("You pressed Down.");
        }
    }
}
