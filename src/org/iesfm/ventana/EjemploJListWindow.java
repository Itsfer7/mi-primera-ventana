package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjemploJListWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,300,400);
        frame.setVisible(true);
        frame.setResizable(false);
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
        labelJList.setBorder(BorderFactory.createLoweredBevelBorder());
        GridBagConstraints constraintsLabelJList = new GridBagConstraints(
                0,0,2,1,0,0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,10,0),
                0,0
        );
        labelJList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                labelJList.setForeground(Color.RED);
            }
        });
        labelJList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                labelJList.setForeground(Color.BLACK);
            }
        });
        labelJList.setPreferredSize(new Dimension(200, 60));

        JTextField textField = new JTextField();
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsTextField = new GridBagConstraints(
                0,1,1,1,2,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,10,0),
                0,0
        );
        textField.setPreferredSize(new Dimension(0, 25));

        JList<String> jListNames = new JList<>();
        jListNames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        DefaultListModel<String> model = new DefaultListModel<>();
        JScrollPane scrollPane = new JScrollPane(jListNames);
        scrollPane.setViewportView(jListNames);
        jListNames.setModel(model);
        for (int i = 1; i <= 30; i++) {
            model.addElement("Nombre " + i);
        }

        JButton addButton = new JButton("Agregar");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsAddButton = new GridBagConstraints(
                1,1,1,1,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,2,10,0),
                0,0
        );
        addButton.addActionListener(e -> {
            if (!textField.getText().isEmpty()) {
                model.addElement(textField.getText());
                textField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "El campo está vacío");
            }
        });

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
        deleteButton.addActionListener(e -> {
            int index = jListNames.getSelectedIndex();
            model.remove(index);
        });

        JButton deleteListButton = new JButton("Borrar Lista");
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsDeleteListButton = new GridBagConstraints(
                1,4,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,2,10,0),
                0,0
        );
        deleteListButton.addActionListener(e -> {
            model.clear();
        });

        JLabel label = new JLabel();
        labelJList.setLayout(new GridBagLayout());
        GridBagConstraints constraintsLabel = new GridBagConstraints(
                0,5,3,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,10,0),
                0,0
        );
        jListNames.addListSelectionListener(e -> {
            if (jListNames.getSelectedValue() != null) {
                label.setText("Seleccionado: " + jListNames.getSelectedValue());
            }
        });


        mainPanel.add(labelJList, constraintsLabelJList);
        mainPanel.add(textField, constraintsTextField);
        mainPanel.add(addButton, constraintsAddButton);
        mainPanel.add(scrollPane, constraintsJListNames);
        mainPanel.add(deleteButton, constraintsDeleteButton);
        mainPanel.add(deleteListButton, constraintsDeleteListButton);
        mainPanel.add(label, constraintsLabel);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}
