package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploFlowLayout2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,550,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Long-Named Button 4"));
        centerPanel.add(new JButton("5"));

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton leftRightButton = new JRadioButton("Left to Right");
        leftRightButton.setActionCommand("Left to Right");
        leftRightButton.setSelected(true);

        JRadioButton rightLeftButton = new JRadioButton("Right to Left");
        rightLeftButton.setActionCommand("Right to Left");

        buttonGroup.add(leftRightButton);
        buttonGroup.add(rightLeftButton);

        JButton orientationButton = new JButton("Apply orientation");

        orientationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = buttonGroup.getSelection().getActionCommand();

                if (selected.equals("Left to Right")) {
                    centerPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                } else {
                    centerPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                }
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        southPanel.add(leftRightButton);
        southPanel.add(rightLeftButton);
        southPanel.add(orientationButton);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.setContentPane(mainPanel);
        frame.pack();
        frame.repaint();
        frame.revalidate();
    }
}
