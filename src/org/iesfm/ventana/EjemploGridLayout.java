package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,3));

        JButton button1 = new JButton("O");
        JButton button2 = new JButton("X");
        JButton button3 = new JButton("O");
        JButton button4 = new JButton("O");
        JButton button5 = new JButton("O");
        JButton button6 = new JButton("X");
        JButton button7 = new JButton("X");
        JButton button8 = new JButton("O");
        JButton button9 = new JButton("X");

        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}