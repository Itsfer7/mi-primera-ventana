package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculator2 {
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
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        JPanel buttonEndPanel = new JPanel();
        buttonEndPanel.setLayout(new GridLayout(1,2,2,2));
        buttonEndPanel.setPreferredSize(new Dimension(65,65));
        buttonEndPanel.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));

        Color turquoise = new Color(15,130,133);
        Color orangeRed = new Color(215,78,29);
        Color veryLightGray = new Color(229,228,224);

        Border buttonBorder = BorderFactory.createRaisedBevelBorder();

        JButton buttonDel = new JButton("DEL");
        buttonDel.setBackground(turquoise);
        buttonDel.setForeground(Color.white);
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBackground(veryLightGray);
        buttonDivide.setBorder(buttonBorder);
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBackground(veryLightGray);
        buttonMultiply.setBorder(buttonBorder);
        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setBackground(veryLightGray);
        buttonSubtract.setBorder(buttonBorder);
        JButton buttonSum = new JButton("+");
        buttonSum.setBackground(veryLightGray);
        buttonSum.setBorder(buttonBorder);
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setBackground(veryLightGray);
        buttonDecimal.setBorder(buttonBorder);
        JButton buttonReset = new JButton("RESET");
        buttonReset.setBackground(turquoise);
        buttonReset.setForeground(Color.white);
        JButton buttonEquals = new JButton("=");
        buttonEquals.setBackground(orangeRed);
        buttonEquals.setForeground(Color.white);
        JButton button1 = new JButton("1");
        button1.setBackground(veryLightGray);
        button1.setBorder(buttonBorder);
        JButton button2 = new JButton("2");
        button2.setBackground(veryLightGray);
        button2.setBorder(buttonBorder);
        JButton button3 = new JButton("3");
        button3.setBackground(veryLightGray);
        button3.setBorder(buttonBorder);
        JButton button4 = new JButton("4");
        button4.setBackground(veryLightGray);
        button4.setBorder(buttonBorder);
        JButton button5 = new JButton("5");
        button5.setBackground(veryLightGray);
        button5.setBorder(buttonBorder);
        JButton button6 = new JButton("6");
        button6.setBackground(veryLightGray);
        button6.setBorder(buttonBorder);
        JButton button7 = new JButton("7");
        button7.setBackground(veryLightGray);
        button7.setBorder(buttonBorder);
        JButton button8 = new JButton("8");
        button8.setBackground(veryLightGray);
        button8.setBorder(buttonBorder);
        JButton button9 = new JButton("9");
        button9.setBackground(veryLightGray);
        button9.setBorder(buttonBorder);
        JButton button0 = new JButton("0");
        button0.setBackground(veryLightGray);
        button0.setBorder(buttonBorder);

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