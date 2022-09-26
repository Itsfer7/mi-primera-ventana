package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploBorderLayout {
public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(5,5));

        JButton northButton = new JButton("Hide North Border");
        northButton.addActionListener(e -> {
            northButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton southButton = new JButton("Hide South Border");
        southButton.addActionListener(e -> {
            southButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton eastButton = new JButton("Hide East Border");
        eastButton.addActionListener(e -> {
            eastButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton westButton = new JButton("Hide West Border");
        westButton.addActionListener(e -> {
            westButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton centerButton = new JButton("Hide Center Border");
        centerButton.addActionListener(e -> {
            centerButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });

        mainPanel.add(northButton, BorderLayout.NORTH);
        mainPanel.add(southButton, BorderLayout.SOUTH);
        mainPanel.add(eastButton, BorderLayout.EAST);
        mainPanel.add(westButton, BorderLayout.WEST);
        mainPanel.add(centerButton, BorderLayout.CENTER);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}