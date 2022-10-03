package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,400);
        frame.setVisible(true);
        frame.setTitle("Ejemplo 2 GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JTextField fullNameTextField = new JTextField();
        GridBagConstraints constraintsFullNameTextField = new GridBagConstraints(
                1,0,5,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,5,0),
                0,0
        );

        JTextField addressTextField = new JTextField();
        GridBagConstraints constraintsAddressTextField = new GridBagConstraints(
                1,2,3,1,3,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JTextField cityTextField = new JTextField();
        GridBagConstraints constraintsCityTextField = new GridBagConstraints(
                4,2,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );


        JTextField zipCodeTextField = new JTextField();
        GridBagConstraints constraintsZipCodeTextField = new GridBagConstraints(
                5,2,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,5,0,0),
                0,0
        );


        JTextField phoneTextField = new JTextField();
        GridBagConstraints constraintsPhoneTextField = new GridBagConstraints(
                1,3,3,1,3,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,8,5),
                0,0
        );


        JTextField ageTextField = new JTextField();
        GridBagConstraints constraintsAgeTextField = new GridBagConstraints(
                5,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,5,0,0),
                0,0
        );


        JTextArea descriptionTextArea = new JTextArea();
        GridBagConstraints constraintsDescriptionTextArea = new GridBagConstraints(
                1,4,5,1,1,25,
                GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );


        JLabel fullNameLabel = new JLabel("Full Name", SwingConstants.RIGHT);
        GridBagConstraints constraintsFullNameLabel = new GridBagConstraints(
                0,0,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JLabel addressLabel = new JLabel("Address", SwingConstants.RIGHT);
        GridBagConstraints constraintsAddressLabel = new GridBagConstraints(
                0,2,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JLabel streetLabel = new JLabel("Street", SwingConstants.CENTER);
        GridBagConstraints constraintsStreetLabel = new GridBagConstraints(
                1,1,3,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel cityLabel = new JLabel("City", SwingConstants.CENTER);
        GridBagConstraints constraintsCityLabel = new GridBagConstraints(
                4,1,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel zipCodeLabel = new JLabel("Zip Code", SwingConstants.CENTER);
        GridBagConstraints constraintsZipCodeLabel = new GridBagConstraints(
                5,1,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,5,0,0),
                0,0
        );

        JLabel phoneLabel = new JLabel("Phone", SwingConstants.RIGHT);
        GridBagConstraints constraintsPhoneLabel = new GridBagConstraints(
                0,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JLabel ageLabel = new JLabel("Age", SwingConstants.RIGHT);
        GridBagConstraints constraintsAgeLabel = new GridBagConstraints(
                4,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel descriptionLabel = new JLabel("Description", SwingConstants.RIGHT);
        GridBagConstraints constraintsDescriptionLabel = new GridBagConstraints(
                0,4,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JButton submitButton = new JButton("Submit");
        GridBagConstraints constraintsSubmitButton = new GridBagConstraints(
                4,5,2,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,0,0,0),
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