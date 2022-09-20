package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EjemploJBorder {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Border margin = BorderFactory.createEmptyBorder(20,20,20,20);
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(margin);

        JPanel secondPanel = new JPanel();
        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray, 1, true),"Search");
        secondPanel.setBorder(border);
        mainPanel.add(secondPanel);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton radioButtoLinux = new JRadioButton("Linux");
        radioButtoLinux.setActionCommand("Linux");
        JRadioButton radioButtonWindows = new JRadioButton("Windows");
        radioButtonWindows.setActionCommand("Windows");
        JRadioButton radioButtoMacintosh = new JRadioButton("Macintosh");
        radioButtoMacintosh.setActionCommand("Macintosh");

        buttonGroup.add(radioButtoLinux);
        buttonGroup.add(radioButtonWindows);
        buttonGroup.add(radioButtoMacintosh);

        secondPanel.add(radioButtoLinux);
        secondPanel.add(radioButtonWindows);
        secondPanel.add(radioButtoMacintosh);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}
