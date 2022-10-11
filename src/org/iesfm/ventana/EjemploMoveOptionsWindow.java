package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploMoveOptionsWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,450,300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("MoveOptionsWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JList<String> jListOptions1 = new JList<>();
        jListOptions1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        DefaultListModel<String> model1 = new DefaultListModel<>();
        JScrollPane scrollPane1 = new JScrollPane(jListOptions1);
        scrollPane1.setViewportView(jListOptions1);
        jListOptions1.setModel(model1);
        model1.addElement("strSubjectName");
        model1.addElement("strStandardName");
        model1.addElement("strReferenceName");

        jListOptions1.setLayout(new GridBagLayout());
        GridBagConstraints constraintsJListOption1 = new GridBagConstraints(
                0,0,2,2,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );
        jListOptions1.setBorder(BorderFactory.createLoweredBevelBorder());

        JList<String> jListOptions2 = new JList<>();
        jListOptions2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        DefaultListModel<String> model2 = new DefaultListModel<>();
        JScrollPane scrollPane2 = new JScrollPane(jListOptions2);
        scrollPane2.setViewportView(jListOptions2);
        jListOptions2.setModel(model2);

        jListOptions2.setLayout(new GridBagLayout());
        GridBagConstraints constraintsJListOption2 = new GridBagConstraints(
                3,0,2,2,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );
        jListOptions2.setBorder(BorderFactory.createLoweredBevelBorder());

        JButton moveRightButton = new JButton(">>");
        moveRightButton.setLayout(new GridBagLayout());
        GridBagConstraints constraintsMoveRightButtonButton = new GridBagConstraints(
                2,0,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,15,0,15),
                0,0
        );
        moveRightButton.setPreferredSize(new Dimension(30,30));
        moveRightButton.addActionListener(e -> {
            model2.addElement(model1.getElementAt(jListOptions1.getSelectedIndex()));
            model1.removeElementAt(jListOptions1.getSelectedIndex());
        });

        JButton moveLeftButton = new JButton("<<");
        moveLeftButton.setLayout(new GridBagLayout());
        GridBagConstraints constraintsMoveLeftButtonButton = new GridBagConstraints(
                2,1,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,15,0,15),
                0,0
        );
        moveLeftButton.setPreferredSize(new Dimension(5,30));
        moveLeftButton.addActionListener(e -> {
            model1.addElement(model2.getElementAt(jListOptions2.getSelectedIndex()));
            model2.removeElementAt(jListOptions2.getSelectedIndex());
        });

        JButton addAllButton = new JButton("Add All");
        addAllButton.setLayout(new GridBagLayout());
        GridBagConstraints constraintsAddAllButton = new GridBagConstraints(
                0,2,1,1,1,1,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );
        addAllButton.addActionListener(e -> {
            for (int i = 0; i < model1.getSize(); i++) {
                model2.addElement(model1.getElementAt(i));
            }
            model1.removeAllElements();
        });

        JButton removeAllButton = new JButton("Remove All");
        removeAllButton.setLayout(new GridBagLayout());
        GridBagConstraints constraintsRemoveALlButton = new GridBagConstraints(
                4,2,1,1,1,1,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );
        removeAllButton.addActionListener(e -> {
            for (int i = 0; i < model2.getSize(); i++) {
                model1.addElement(model2.getElementAt(i));
            }
            model2.removeAllElements();
        });

        mainPanel.add(jListOptions1, constraintsJListOption1);
        mainPanel.add(jListOptions2, constraintsJListOption2);
        mainPanel.add(moveRightButton, constraintsMoveRightButtonButton);
        mainPanel.add(moveLeftButton, constraintsMoveLeftButtonButton);
        mainPanel.add(addAllButton, constraintsAddAllButton);
        mainPanel.add(removeAllButton, constraintsRemoveALlButton);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}
