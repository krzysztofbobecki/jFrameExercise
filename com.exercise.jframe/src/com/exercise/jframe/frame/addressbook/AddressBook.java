package com.exercise.jframe.frame.addressbook;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.exercise.database.addressbook.DataBaseConnection;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class AddressBook extends JFrame {

    private JPanel contentPane;
    private JTable table;

    

    /**
     * Create the frame.
     */
    public AddressBook() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 483, 396);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);
        
        JButton btnNewButton = new JButton("Add...");
        btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton.setIcon(null);
        btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddAddressFrame addAddressFrame = new AddAddressFrame();
            }
        });
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Edit...");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Remove");
        panel.add(btnNewButton_2);
        
        
        
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();
        
        columns.add("id");
        columns.add("First Name");
        columns.add("Last Name");
        columns.add("Number");
        
//        for (int i = 0; i < 10; i++) {

            DataBaseConnection dataBaseConnection = new DataBaseConnection();
            List<String> firstNamesList = new ArrayList<String>();
            firstNamesList = dataBaseConnection.getFirstNames();
            
            for (String string : firstNamesList) {
                values.add(new String[] {"", string, "", ""});
            }
            for (String string : firstNamesList) {
                values.add(new String[] {string, "" , "", ""});
            }
//            values.add(new String[] {, dataBaseConnection.getFirstNameById(i), "null", "null"});
//        }
        
        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
        table = new JTable(tableModel);
        contentPane.add(table, BorderLayout.CENTER);
        add(new JScrollPane(table), BorderLayout.SOUTH);
        setSize(672,573);
    }

}
