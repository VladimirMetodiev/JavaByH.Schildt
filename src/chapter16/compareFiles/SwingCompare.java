package chapter16.compareFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SwingCompare implements ActionListener {
    private JTextField jTextFieldFirst, jTextFieldSecond;
    private JLabel jLabelResult;

    public SwingCompare(){
        JFrame frame = new JFrame("Compare Files");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 190);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jTextFieldFirst = new JTextField(14);
        jTextFieldSecond = new JTextField(14);

        jTextFieldFirst.setActionCommand("fileA");
        jTextFieldSecond.setActionCommand("fileB");


        JButton jButtonCompare = new JButton("Compare");
        jButtonCompare.addActionListener(this);


        JLabel jLabelFirst = new JLabel("First file: ");
        JLabel jLabelSecond = new JLabel("Second file: ");
        jLabelResult = new JLabel("");


        frame.add(jLabelFirst);
        frame.add(jTextFieldFirst);
        frame.add(jLabelSecond);
        frame.add(jTextFieldSecond);
        frame.add(jButtonCompare);
        frame.add(jLabelResult);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        int first, second;
        boolean areTheyDifferent = true;

        if(jTextFieldFirst.getText().equals("")) {
            jLabelResult.setText("First file name missing.");
            return;
        }
        if(jTextFieldSecond.getText().equals("")) {
            jLabelResult.setText("Second file name missing.");
            return;
        }

        try(FileInputStream theFirst = new FileInputStream(jTextFieldFirst.getText()); FileInputStream theSecond = new FileInputStream(jTextFieldSecond.getText())){
            do{
                first = theFirst.read();
                second = theSecond.read();

                if(first - second != 0){
                    areTheyDifferent = false;
                    break;
                }

            } while (first != -1 && second != -1);

            if(areTheyDifferent) jLabelResult.setText("The two files are identical.");
            else jLabelResult.setText("The two files are different.");
        }
        catch (FileNotFoundException ex1){
            jLabelResult.setText("There isn't such file!");
        }
        catch (IOException ex2){
            jLabelResult.setText("File error!");
        }
    }
}
