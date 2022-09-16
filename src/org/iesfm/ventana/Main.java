package org.iesfm.ventana;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // mainPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0,0,300,300);
        mainPanel.setBackground(Color.BLACK);

        // secondPanel
        JPanel secondPanel = new JPanel();
        secondPanel.setBounds(0,0,100,100);
        secondPanel.setBackground(Color.BLUE);

        JLabel lblUser1 = new JLabel("Usuario:");
        secondPanel.add(lblUser1);

        JTextField textFieldUser1 = new JTextField(16);
        secondPanel.add(textFieldUser1);

        JButton buttonAccept1 = new JButton("Aceptar");
        secondPanel.add(buttonAccept1);

        // thirdPanel
        JPanel thirdPanel = new JPanel();
        thirdPanel.setBounds(0,0,100,100);
        thirdPanel.setBackground(Color.RED);

        JLabel lblUser2 = new JLabel("Usuario:");
        thirdPanel.add(lblUser2);

        JTextField textFieldUser2 = new JTextField(16);
        thirdPanel.add(textFieldUser2);

        JButton buttonAccept2 = new JButton("Aceptar");
        thirdPanel.add(buttonAccept2);

        JCheckBox checkBox = new JCheckBox("Aceptar");
        thirdPanel.add(checkBox);

        JRadioButton radioButton = new JRadioButton("Aceptar");
        thirdPanel.add(radioButton);

        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Opcion 1");
        comboBox.addItem("Opcion 2");
        comboBox.addItem("Opcion 3");
        thirdPanel.add(comboBox);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("src/org/iesfm/ventana/imagen.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        thirdPanel.add(label);


        frame.add(mainPanel, BorderLayout.CENTER);

        mainPanel.add(secondPanel, BorderLayout.NORTH);
        mainPanel.add(thirdPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}