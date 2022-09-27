package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,500);
        frame.setVisible(true);
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        mainPanel.setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        JTextField textField = new JTextField(25);
        textField.setLayout(new BorderLayout());
        textPanel.add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(10,10,500,400);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50,0,0,0));
        buttonPanel.setLayout(new GridLayout(5,4,5,5));

        JButton buttonRtc = new JButton("Rtc");
        JButton buttonCE = new JButton("CE");
        JButton buttonCL = new JButton("CL");
        JButton buttonPlusMinus = new JButton("+/-");
        JButton buttonDivide = new JButton("/");
        JButton buttonMultiply = new JButton("*");
        JButton buttonSubtract = new JButton("-");
        JButton buttonSum = new JButton("+");
        JButton buttonDecimal = new JButton(".");
        JButton buttonEquals = new JButton("=");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("O");

        buttonPanel.add(buttonRtc);
        buttonPanel.add(buttonCE);
        buttonPanel.add(buttonCL);
        buttonPanel.add(buttonPlusMinus);

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivide);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMultiply);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSubtract);

        buttonPanel.add(button0);
        buttonPanel.add(buttonDecimal);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonSum);

        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}