package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJRadioButton {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(10,10,550,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

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

        mainPanel.add(radioButtoLinux);
        mainPanel.add(radioButtonWindows);
        mainPanel.add(radioButtoMacintosh);

        JLabel image = new JLabel();
        image.setIcon(new ImageIcon("Windows.png"));
        mainPanel.add(image);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = buttonGroup.getSelection().getActionCommand();

                image.setIcon(new ImageIcon(selected + ".png"));
                JOptionPane.showMessageDialog(frame, "Has seleccionado: " + selected);
            }
        });
        mainPanel.add(okButton);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}