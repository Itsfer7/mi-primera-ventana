package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2NoMain extends JFrame {

    private Font font;
    private JPanel mainPanel;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JPanel buttonEndPanel;
    private Color turquoise;
    private Color orangeRed;
    private Color veyLightGray;
    private JButton buttonDel;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JButton buttonDot;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonReset;
    private JButton buttonEquals;

    public Calculator2NoMain() {
        setBounds(10, 10, 300, 500);
        setVisible(true);
        setResizable(false);
        setTitle("Calculadora 2 No Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }

    private Font createFont() {
        return font = new Font("SansSerif", Font.BOLD, 45);
    }

    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(createTextPanel(), BorderLayout.NORTH);
        mainPanel.add(createButtonPanel(), BorderLayout.CENTER);
        mainPanel.add(createButtonEndPanel(), BorderLayout.SOUTH);
        return mainPanel;
    }

    private JPanel createTextPanel() {
        textPanel = new JPanel();
        JTextField textField = new JTextField("0", 6);
        textField.setPreferredSize(new Dimension(80, 80));
        textField.setLayout(new BorderLayout());
        textField.setFont(createFont());
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textPanel.add(textField);
        return textPanel;
    }

    private JPanel createButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setBounds(10, 10, 500, 400);
        buttonPanel.setLayout(new GridLayout(4, 4, 2, 2));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        buttonPanel.add(createButton7());
        buttonPanel.add(createButton8());
        buttonPanel.add(createButton9());
        buttonPanel.add(createButtonDel());

        buttonPanel.add(createButton4());
        buttonPanel.add(createButton5());
        buttonPanel.add(createButton6());
        buttonPanel.add(createButtonPlus());

        buttonPanel.add(createButton1());
        buttonPanel.add(createButton2());
        buttonPanel.add(createButton3());
        buttonPanel.add(createButtonMinus());

        buttonPanel.add(createButtonDot());
        buttonPanel.add(createButton0());
        buttonPanel.add(createButtonDivide());
        buttonPanel.add(createButtonMultiply());

        return buttonPanel;
    }

    private JPanel createButtonEndPanel() {
        buttonEndPanel = new JPanel();
        buttonEndPanel.setLayout(new GridLayout(1, 2, 2, 2));
        buttonEndPanel.setPreferredSize(new Dimension(65, 65));
        buttonEndPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonEndPanel.add(createButtonReset());
        buttonEndPanel.add(createButtonEquals());

        return buttonEndPanel;
    }

    private Color createTurquoise() {
        return turquoise = new Color(15, 130, 133);
    }

    private Color createOrangeRed() {
        return orangeRed = new Color(215, 78, 29);
    }

    private Color createVeryLightGray() {
        return veyLightGray = new Color(229, 228, 224);
    }

    private JButton createButton(String text, Color color, Color textColor) {
        JButton button = new JButton(text);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        button.setBackground(color);
        button.setForeground(textColor);
        return button;
    }

    private JButton createButtonDel() {
        return buttonDel = createButton("DEL", createTurquoise(), Color.WHITE);
    }

    private JButton createButtonDivide() {
        return buttonDivide = createButton("/", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButtonMultiply() {
        return buttonMultiply = createButton("*", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButtonMinus() {
        return buttonMinus = createButton("-", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButtonPlus() {
        return buttonPlus = createButton("+", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButtonDot() {
        return buttonDot = createButton(".", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton0() {
        return button0 = createButton("0", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton1() {
        return button1 = createButton("1", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton2() {
        return button2 = createButton("2", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton3() {
        return button3 = createButton("3", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton4() {
        return button4 = createButton("4", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton5() {
        return button5 = createButton("5", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton6() {
        return button6 = createButton("6", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton7() {
        return button7 = createButton("7", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton8() {
        return button8 = createButton("8", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButton9() {
        return button9 = createButton("9", createVeryLightGray(), Color.BLACK);
    }

    private JButton createButtonReset() {
        return buttonReset = createButton("RESET", createTurquoise(), Color.WHITE);
    }

    private JButton createButtonEquals() {
        return buttonEquals = createButton("=", createOrangeRed(), Color.WHITE);
    }


    public static void main(String[] args) {
        Calculator2NoMain frame = new Calculator2NoMain();
    }
}
