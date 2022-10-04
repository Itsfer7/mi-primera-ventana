package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,600,220);
        frame.setVisible(true);
        frame.setTitle("Ejemplo 5 GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        GridBagLayout gridBagLayout = new GridBagLayout();
        mainPanel.setLayout(gridBagLayout);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraintsFirstPanel = new GridBagConstraints(
                0,0,3,1,1,0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraintsSecondPanel = new GridBagConstraints(
                0,1,3,2,1,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );

        JPanel thirdPanel = new JPanel();
        thirdPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraintsThirdPanel = new GridBagConstraints(
                3,0,1,3,0,1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0
        );



        JTextField findWhatTextField = new JTextField();
        GridBagConstraints constraintsFindWhatTextField = new GridBagConstraints(
                1,0,1,1,50,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JTextField replaceWithTextField = new JTextField();
        GridBagConstraints constraintsReplaceWithTextField = new GridBagConstraints(
                1,1,3,1,50,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JLabel findWhatLabel = new JLabel("Find What:");
        GridBagConstraints constraintsFindWhatLabel = new GridBagConstraints(
                0,0,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JLabel replaceWithLabel = new JLabel("Replace With:");
        GridBagConstraints constraintsReplaceWithLabel = new GridBagConstraints(
                0,1,1,1,1,1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,5),
                0,0
        );

        JCheckBox matchCaseCheckBox = new JCheckBox("Match Case");
        GridBagConstraints constraintsMatchCaseCheckBox = new GridBagConstraints(
                1,0,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,110,0,0),
                0,0
        );

        JCheckBox wholeWordsCheckBox = new JCheckBox("Whole Words");
        GridBagConstraints constraintsWholeWordsCheckBox = new GridBagConstraints(
                1,1,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,110,0,0),
                0,0
        );

        JCheckBox regularExpressionsCheckBox = new JCheckBox("Regular Expressions");
        GridBagConstraints constraintsRegularExpressionsCheckBox = new GridBagConstraints(
                1,2,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,110,0,0),
                0,0
        );

        JCheckBox highlightResultsCheckBox = new JCheckBox("Highlight Results", true);
        GridBagConstraints constraintsHighlightResultsCheckBox = new GridBagConstraints(
                1,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,110,0,0),
                0,0
        );

        JCheckBox wrapAroundCheckBox = new JCheckBox("Wrap Around", true);
        GridBagConstraints constraintsWrapAroundCheckBox = new GridBagConstraints(
                2,0,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JCheckBox searchSelectionCheckBox = new JCheckBox("Search Selection");
        searchSelectionCheckBox.setEnabled(false);
        GridBagConstraints constraintsSearchSelectionCheckBox = new GridBagConstraints(
                2,1,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JCheckBox searchBackwardsCheckBox = new JCheckBox("Search Backwards");
        GridBagConstraints constraintsSearchBackwardsCheckBox = new GridBagConstraints(
                2,2,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0
        );

        JCheckBox incrementalSearchCheckBox = new JCheckBox("Incremental Search", true);
        GridBagConstraints constraintsIncrementalSearchCheckBox = new GridBagConstraints(
                2,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(1,0,0,0),
                0,0
        );

        JButton findButton = new JButton("Find");
        GridBagConstraints constraintsFindButton = new GridBagConstraints(
                0,0,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,2,0,0),
                0,0
        );

        JButton replaceButton = new JButton("Replace");
        GridBagConstraints constraintsReplaceButton = new GridBagConstraints(
                0,1,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,2,0,0),
                0,0
        );

        JButton replaceAllButton = new JButton("Replace All");
        GridBagConstraints constraintsReplaceAllButton = new GridBagConstraints(
                0,2,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,2,0,0),
                0,0
        );

        JButton closeButton = new JButton("Close");
        GridBagConstraints constraintsCloseButton = new GridBagConstraints(
                0,3,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,2,0,0),
                0,0
        );

        JButton helpButton = new JButton("Help");
        GridBagConstraints constraintsHelpButton = new GridBagConstraints(
                0,4,1,1,1,0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(5,2,10,0),
                0,0
        );

        firstPanel.add(findWhatLabel, constraintsFindWhatLabel);
        firstPanel.add(findWhatTextField, constraintsFindWhatTextField);
        firstPanel.add(replaceWithLabel, constraintsReplaceWithLabel);
        firstPanel.add(replaceWithTextField, constraintsReplaceWithTextField);

        secondPanel.add(matchCaseCheckBox, constraintsMatchCaseCheckBox);
        secondPanel.add(wholeWordsCheckBox, constraintsWholeWordsCheckBox);
        secondPanel.add(regularExpressionsCheckBox, constraintsRegularExpressionsCheckBox);
        secondPanel.add(highlightResultsCheckBox, constraintsHighlightResultsCheckBox);
        secondPanel.add(wrapAroundCheckBox, constraintsWrapAroundCheckBox);
        secondPanel.add(searchSelectionCheckBox, constraintsSearchSelectionCheckBox);
        secondPanel.add(searchBackwardsCheckBox, constraintsSearchBackwardsCheckBox);
        secondPanel.add(incrementalSearchCheckBox, constraintsIncrementalSearchCheckBox);

        thirdPanel.add(findButton, constraintsFindButton);
        thirdPanel.add(replaceButton, constraintsReplaceButton);
        thirdPanel.add(replaceAllButton, constraintsReplaceAllButton);
        thirdPanel.add(closeButton, constraintsCloseButton);
        thirdPanel.add(helpButton, constraintsHelpButton);

        mainPanel.add(firstPanel, constraintsFirstPanel);
        mainPanel.add(secondPanel, constraintsSecondPanel);
        mainPanel.add(thirdPanel, constraintsThirdPanel);

        frame.setContentPane(mainPanel);
        frame.repaint();
        frame.revalidate();
    }
}