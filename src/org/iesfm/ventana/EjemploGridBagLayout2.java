package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,300);
        frame.setVisible(true);
        frame.setTitle("Ejemplo 2 GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JTextArea textArea1 = new JTextArea("Text Area");
        GridBagConstraints constraintsTextArea1 = new GridBagConstraints(
                0,0,2,2,10,10000,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JButton button1 = new JButton("Button 1");
        GridBagConstraints constraintsButton1 = new GridBagConstraints(
                2,0,1,1,0,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JButton button2 = new JButton("Button 2");
        GridBagConstraints constraintsButton2 = new GridBagConstraints(
                2,1,1,1,0,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JButton button3 = new JButton("Button 3");
        GridBagConstraints constraintsButton3 = new GridBagConstraints(
                0,2,1,1,0,0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JButton button4 = new JButton("Button 4");
        GridBagConstraints constraintsButton4 = new GridBagConstraints(
                2,2,1,1,0,1,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JTextField textField1 = new JTextField("Text Field");
        GridBagConstraints constraintsTextField1 = new GridBagConstraints(
                1,2,1,1,1,0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        mainPanel.add(textArea1, constraintsTextArea1);
        mainPanel.add(button1, constraintsButton1);
        mainPanel.add(button2, constraintsButton2);
        mainPanel.add(button3, constraintsButton3);
        mainPanel.add(button4, constraintsButton4);
        mainPanel.add(textField1, constraintsTextField1);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}