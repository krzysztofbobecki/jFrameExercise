package com.exercise.jframe.main.frame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import com.exercise.jframe.frame.addressbook.AddressBook;
import com.exercise.jframe.frame.calculator.CalculatorFrame;

public class MainFrame extends JFrame {

    private JLabel label;
    private JFileChooser fileChooser;
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 500;

    public MainFrame() throws HeadlessException {

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        label = new JLabel();
        add(label);

        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        JMenu menuFile = new JMenu("File");
        JMenu menuOptions = new JMenu("Options");
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuOptions);

//        OPEN FILE
        JMenuItem menuItemOpen = new JMenuItem("Open");
        menuFile.add(menuItemOpen);

        menuItemOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String name = fileChooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        });

//        ADDRESS BOOK
        JMenuItem menuItemAddressBook = new JMenuItem("Address Book");
        menuOptions.add(menuItemAddressBook);
        
        menuItemAddressBook.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                AddressBook addressBook = new AddressBook();
                
            }
        });
        
        
//        CALCULATOR
        JMenuItem menuItemCalculator = new JMenuItem("Calculator");
        menuOptions.add(menuItemCalculator);
        
        menuItemCalculator.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorFrame calculatorFrame = new CalculatorFrame();
                
            }
        });
        
        JMenuItem menuExitItem = new JMenuItem("Close");
        menuFile.add(menuExitItem);

        menuExitItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
    }
}
