package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploJListWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,300,400);
        frame.setVisible(true);
        frame.setTitle("Ejemplo JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JLabel labelJList = new JLabel("JList", SwingConstants.CENTER);
        Font font = new Font("Arial", Font.BOLD, 30);
        labelJList.setFont(font);
        labelJList.setLayout(new GridBagLayout());
        labelJList.setBorder(BorderFactory.createBevelBorder(1));
        GridBagConstraints constraintsLabelJList = new GridBagConstraints(
                0,0,2,1,0,0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,10,0),
                0,0
        );

        JTextField textField = new JTextField("Pepito Perez");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsTextField = new GridBagConstraints(
                0,1,1,1,2,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,10,0),
                0,0
        );

        JButton addButton = new JButton("Agregar");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsAddButton = new GridBagConstraints(
                1,1,1,1,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,2,10,0),
                0,0
        );

        JList<String> jListNames = new JList<>();
        jListNames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Pepito Perez");
        model.addElement("Juanito Perez");
        model.addElement("Manolo Perez");
        model.addElement("Pepito Perez");
        model.addElement("Juanito Perez");
        model.addElement("Manolo Perez");
        model.addElement("Pepito Perez");
        model.addElement("Juanito Perez");
        model.addElement("Manolo Perez");
        model.addElement("Pepito Perez");
        model.addElement("Juanito Perez");
        model.addElement("Manolo Perez");
        jListNames.setModel(model);


        JScrollPane scrollbar = new JScrollPane();
        scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jListNames.add(scrollbar);

        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsJListNames = new GridBagConstraints(
                0,2,2,2,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,10,0),
                0,0
        );

        JButton deleteButton = new JButton("Eliminar");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsDeleteButton = new GridBagConstraints(
                0,4,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,10,0),
                0,0
        );

        JButton deleteListButton = new JButton("Borrar Lista");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsDeleteListButton = new GridBagConstraints(
                1,4,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,2,10,0),
                0,0
        );

        JLabel label = new JLabel("Se agregó un nuevo elemento");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsLabel = new GridBagConstraints(
                0,5,3,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,10,0),
                0,0
        );

        mainPanel.add(labelJList, constraintsLabelJList);
        mainPanel.add(textField, constraintsTextField);
        mainPanel.add(addButton, constraintsAddButton);
        mainPanel.add(jListNames, constraintsJListNames);
        mainPanel.add(deleteButton, constraintsDeleteButton);
        mainPanel.add(deleteListButton, constraintsDeleteListButton);
        mainPanel.add(label, constraintsLabel);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}
