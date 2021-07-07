package chapter16.someSwingList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyList implements ListSelectionListener {
    JList<String> jList;
    JLabel label;
    JScrollPane jScrollPane;

    MyList(String[] names) {
        JFrame frame = new JFrame("JList");
        frame.setLayout(new FlowLayout());
        frame.setSize(220, 160);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jList = new JList<>(names);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        jScrollPane = new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(140, 90));


        label = new JLabel("Please, choose a name.");


        jList.addListSelectionListener(this);


        frame.add(jScrollPane);
        frame.add(label);


        frame.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent event) {
        if(jList.getSelectedIndex() != -1) label.setText("Current selection is: " + (jList.getSelectedIndex() + 1));
        else label.setText("Please, choose a name.");
    }
}
