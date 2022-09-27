package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploFlowLayout1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,550,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        mainPanel.add(new JButton("Button 1"));
        mainPanel.add(new JButton("Button 2"));
        mainPanel.add(new JButton("Button 3"));
        mainPanel.add(new JButton("Long-Named Button 4"));
        mainPanel.add(new JButton("5"));

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton leftRightButton = new JRadioButton("Left to Right");
        leftRightButton.setActionCommand("Left to Right");
        leftRightButton.setSelected(true);

        JRadioButton rightLeftButton = new JRadioButton("Right to Left");
        rightLeftButton.setActionCommand("Right to Left");

        buttonGroup.add(leftRightButton);
        buttonGroup.add(rightLeftButton);

        JButton orientationButton = new JButton("Apply orientation");

        mainPanel.add(leftRightButton);
        mainPanel.add(rightLeftButton);
        mainPanel.add(orientationButton);

        orientationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FlowLayout layout = (FlowLayout) mainPanel.getLayout();

                String selected = buttonGroup.getSelection().getActionCommand();

                if (selected.equals("Left to Right")) {
                    layout.setAlignment(FlowLayout.LEFT);
                } else {
                    layout.setAlignment(FlowLayout.RIGHT);
                }
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}