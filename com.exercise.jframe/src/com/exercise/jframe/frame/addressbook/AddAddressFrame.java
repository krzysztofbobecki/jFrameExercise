package com.exercise.jframe.frame.addressbook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.exercise.database.addressbook.DataBaseConnection;

import javax.swing.JTextField;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class AddAddressFrame extends JFrame {

    private JPanel contentPane;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField numberField;

    public AddAddressFrame() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblFirstName = new JLabel("First Name");

        firstNameField = new JTextField();
        firstNameField.setColumns(10);

        JLabel lblLastName = new JLabel("Last Name");

        lastNameField = new JTextField();
        lastNameField.setColumns(10);

        JLabel lblNumber = new JLabel("Number");

        numberField = new JTextField();
        numberField.setColumns(10);

        JButton btnAdd = new JButton("Add...");
        btnAdd.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                DataBaseConnection baseConnection = new DataBaseConnection();
                int idNumber = baseConnection.getFirstFreeIdNumber();
                baseConnection.addContact(idNumber, firstNameField.getText(), lastNameField.getText(), numberField.getText());
                baseConnection.getAllContatcs();
            }
        });
        JButton btnCancel = new JButton("Cancel");
        
        
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup().addGap(14)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblFirstName)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNumber)
                                        .addComponent(lblLastName)))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(numberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE))
                        .addGap(40).addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(btnCancel).addComponent(btnAdd))
                        .addContainerGap(150, Short.MAX_VALUE)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
                .createSequentialGroup()
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup().addGap(8)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblFirstName).addComponent(firstNameField, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblLastName)
                                        .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancel)))
                        .addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(btnAdd)))
                .addGap(18)
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNumber).addComponent(
                        numberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE)));
        contentPane.setLayout(gl_contentPane);
    }
}
