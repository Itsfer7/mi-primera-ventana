package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.yellow);

        JLabel lblUser = new JLabel("Usuario:");
        mainPanel.add(lblUser);

        JTextField textFieldUser = new JTextField(16);
        mainPanel.add(textFieldUser);

        JButton buttonAccept = new JButton("Aceptar");
        mainPanel.add(buttonAccept);

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.BLUE);

        JLabel lblUser1 = new JLabel("Usuario:");
        secondPanel.add(lblUser1);

        JTextField textFieldUser1 = new JTextField(16);
        secondPanel.add(textFieldUser1);

        JButton buttonAccept1 = new JButton("Aceptar");
        secondPanel.add(buttonAccept1);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(secondPanel, BorderLayout.PAGE_END);

        frame.setLayout(new GridLayout(2,2));

        frame.repaint();
        frame.revalidate();
    }
}