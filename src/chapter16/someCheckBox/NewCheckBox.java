package chapter16.someCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class NewCheckBox implements ItemListener {
    private JLabel jLabelSelected;
    private JLabel jLabelChanged;
    private JCheckBox jCheckBoxAlpha;
    private JCheckBox jCheckBoxBeta;
    private JCheckBox jCheckBoxGamma;

    NewCheckBox() {
        JFrame jFrame = new JFrame("Demonstrate Check Boxes");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(280, 120);
        jFrame.setLocation(300, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jLabelSelected = new JLabel("");
        jLabelChanged = new JLabel("");


        jCheckBoxAlpha = new JCheckBox("Alpha");
        jCheckBoxBeta = new JCheckBox("Beta");
        jCheckBoxGamma = new JCheckBox("Gamma");
        jCheckBoxAlpha.addItemListener(this);
        jCheckBoxBeta.addItemListener(this);
        jCheckBoxGamma.addItemListener(this);


        jFrame.add(jCheckBoxAlpha);
        jFrame.add(jCheckBoxBeta);
        jFrame.add(jCheckBoxGamma);
        jFrame.add(jLabelChanged);
        jFrame.add(jLabelSelected);

        jFrame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent event) {
        String str = "";

        JCheckBox cb = (JCheckBox) event.getItem();

        if(cb.isSelected()) jLabelChanged.setText(cb.getText() + " was just selected.");
        else jLabelChanged.setText(cb.getText() + " was just cleared.");

        if(jCheckBoxAlpha.isSelected()) {
            str += "Alpha ";
        }

        if(jCheckBoxBeta.isSelected()) {
            str += "Beta ";
        }

        if(jCheckBoxGamma.isSelected()) {
            str += "Gamma";
        }

        jLabelSelected.setText("Selected check boxes: " + str);
    }
}
