package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculadora2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,300,500);
        frame.setVisible(true);
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        Font font = new Font("SansSerif", Font.BOLD, 45);

        JPanel textPanel = new JPanel();
        JTextField textField = new JTextField("0",6);
        textField.setPreferredSize(new Dimension(80,80));
        textField.setLayout(new BorderLayout());
        textField.setFont(font);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textPanel.add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(10,10,500,400);
        buttonPanel.setLayout(new GridLayout(4,4,2,2));

        JPanel buttonEndPanel = new JPanel();
        buttonEndPanel.setLayout(new GridLayout(1,2,2,2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(0,0,1,0));
        buttonEndPanel.setPreferredSize(new Dimension(65,65));

        JButton buttonDel = new JButton("DEL");
        buttonDel.setBackground(new Color(15,130,133));
        buttonDel.setForeground(Color.white);
        JButton buttonDivide = new JButton("/");
        JButton buttonMultiply = new JButton("*");
        JButton buttonSubtract = new JButton("-");
        JButton buttonSum = new JButton("+");
        JButton buttonDecimal = new JButton(".");
        JButton buttonReset = new JButton("RESET");
        buttonReset.setBackground(new Color(15,130,133));
        buttonReset.setForeground(Color.white);
        JButton buttonEquals = new JButton("=");
        buttonEquals.setBackground(new Color(215,78,29));
        buttonEquals.setForeground(Color.white);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDel);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonSum);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSubtract);

        buttonPanel.add(buttonDecimal);
        buttonPanel.add(button0);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonMultiply);

        buttonEndPanel.add(buttonReset);
        buttonEndPanel.add(buttonEquals);

        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(buttonEndPanel, BorderLayout.SOUTH);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}