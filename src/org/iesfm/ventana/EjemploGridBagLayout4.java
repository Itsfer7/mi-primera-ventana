package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,400,400);
        frame.setVisible(true);
        frame.setTitle("Ejemplo 2 GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JTextField fullNameTextField = new JTextField();
        GridBagConstraints constraintsFullNameTextField = new GridBagConstraints(
                1,0,3,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JTextField addressTextField = new JTextField();
        GridBagConstraints constraintsAddressTextField = new GridBagConstraints(
                1,2,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JTextField cityTextField = new JTextField();
        GridBagConstraints constraintsCityTextField = new GridBagConstraints(
                2,2,1,1,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );


        JTextField zipCodeTextField = new JTextField();
        GridBagConstraints constraintsZipCodeTextField = new GridBagConstraints(
                3,2,1,1,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );


        JTextField phoneTextField = new JTextField();
        GridBagConstraints constraintsPhoneTextField = new GridBagConstraints(
                1,3,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );


        JTextField ageTextField = new JTextField();
        GridBagConstraints constraintsAgeTextField = new GridBagConstraints(
                3,3,1,1,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );


        JTextArea descriptionTextArea = new JTextArea();
        GridBagConstraints constraintsDescriptionTextArea = new GridBagConstraints(
                1,4,2,2,1,2,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );


        JLabel fullNameLabel = new JLabel("Full Name");
        GridBagConstraints constraintsFullNameLabel = new GridBagConstraints(
                0,0,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel addressLabel = new JLabel("Address");
        GridBagConstraints constraintsAddressLabel = new GridBagConstraints(
                0,2,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel streetLabel = new JLabel("Street");
        GridBagConstraints constraintsStreetLabel = new GridBagConstraints(
                1,1,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel cityLabel = new JLabel("City");
        GridBagConstraints constraintsCityLabel = new GridBagConstraints(
                2,1,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel zipCodeLabel = new JLabel("Zip Code");
        GridBagConstraints constraintsZipCodeLabel = new GridBagConstraints(
                3,1,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel phoneLabel = new JLabel("Phone");
        GridBagConstraints constraintsPhoneLabel = new GridBagConstraints(
                0,3,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel ageLabel = new JLabel("Age");
        GridBagConstraints constraintsAgeLabel = new GridBagConstraints(
                2,3,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel descriptionLabel = new JLabel("Description");
        GridBagConstraints constraintsDescriptionLabel = new GridBagConstraints(
                0,4,1,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JButton submitButton = new JButton("Submit");
        GridBagConstraints constraintsSubmitButton = new GridBagConstraints(
                2,5,2,1,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        mainPanel.add(fullNameTextField, constraintsFullNameTextField);
        mainPanel.add(addressTextField, constraintsAddressTextField);
        mainPanel.add(cityTextField, constraintsCityTextField);
        mainPanel.add(zipCodeTextField, constraintsZipCodeTextField);
        mainPanel.add(phoneTextField, constraintsPhoneTextField);
        mainPanel.add(ageTextField, constraintsAgeTextField);
        mainPanel.add(descriptionTextArea, constraintsDescriptionTextArea);
        mainPanel.add(fullNameLabel, constraintsFullNameLabel);
        mainPanel.add(addressLabel, constraintsAddressLabel);
        mainPanel.add(streetLabel, constraintsStreetLabel);
        mainPanel.add(cityLabel, constraintsCityLabel);
        mainPanel.add(zipCodeLabel, constraintsZipCodeLabel);
        mainPanel.add(phoneLabel, constraintsPhoneLabel);
        mainPanel.add(ageLabel, constraintsAgeLabel);
        mainPanel.add(descriptionLabel, constraintsDescriptionLabel);
        mainPanel.add(submitButton, constraintsSubmitButton);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}