package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        String labelText = "Programming language selected: ";
        JLabel labelSelected = new JLabel(labelText);
        mainPanel.add(labelSelected);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("C");
        comboBox.setActionCommand("C");
        comboBox.addItem("C++");
        comboBox.setActionCommand("C++");
        comboBox.addItem("C#");
        comboBox.setActionCommand("C#");
        comboBox.addItem("Java");
        comboBox.setActionCommand("Java");
        comboBox.addItem("PHP");
        comboBox.setActionCommand("PHP");
        comboBox.addItem("Python");
        comboBox.setActionCommand("Python");
        mainPanel.add(comboBox);

        JButton showButton = new JButton("Show");
        showButton.addActionListener(e -> {
                String selected = (String) comboBox.getSelectedItem();
                labelSelected.setText(labelText + selected);
                JOptionPane.showMessageDialog(frame, "Has seleccionado: " + selected);
                });
        mainPanel.add(showButton);


        /*JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                labelSelected.setText(labelText + selected);
                JOptionPane.showMessageDialog(frame, "Has seleccionado: " + selected);
            }
        });
        mainPanel.add(okButton);*/

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}
