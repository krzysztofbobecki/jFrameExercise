package com.exercise.jframe.frame.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CalculatorFrame extends JFrame {

    private JLabel text;
    private JTextArea jTextArea;
    private String textArea = "";
    private String result;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 370;

    public CalculatorFrame() throws HeadlessException {


        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLayout(null);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        // Title
        text = new JLabel("Calculator");
        text.setLayout(null);
        text.setBounds(200, 10, 200, 50);
        text.setFont(new Font("Courier New", Font.BOLD, 15));
        text.setForeground(Color.BLACK.darker());
        add(text);

        // resultTextArea
        jTextArea = new JTextArea();
        jTextArea.setLayout(null);
        jTextArea.setBounds(10, 50, 465, 30);
        jTextArea.setForeground(Color.blue.brighter());
        jTextArea.setFont(new Font("Arial", Font.LAYOUT_RIGHT_TO_LEFT, 15));
        jTextArea.setEditable(false);
        add(jTextArea);
       

        
        // first line
        JButton jButtonC= new JButton("C");
        jButtonC.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButtonC.setBounds(11, 90, 115, 45);
        add(jButtonC);
        
        jButtonC.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.selectAll();
                jTextArea.replaceSelection("");
                textArea = "";     
            }
        });

        JButton jButtonDivision = new JButton("/");
        jButtonDivision.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButtonDivision.setBounds(127, 90, 115, 45);
        add(jButtonDivision);
        
        jButtonDivision.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("/");    
                jTextArea.append("/");
            }
        });

        JButton jButtonMultiplication = new JButton("*");
        jButtonMultiplication.setFont(new Font("Arial", Font.BOLD, 17));
        jButtonMultiplication.setBounds(243, 90, 115, 45);
        add(jButtonMultiplication);
        
        jButtonMultiplication.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("*");
                jTextArea.append("*");
                System.out.println("test: " + (-4.1 + 2.0));
            }
        });

        JButton jButtonBackSpace = new JButton("BACKSPACE");
        jButtonBackSpace.setFont(new Font("Arial", Font.BOLD, 10));
        jButtonBackSpace.setBounds(359, 90, 115, 45);
        add(jButtonBackSpace);
        
        jButtonBackSpace.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int textAreaLength = textArea.length();
                textArea = textArea.substring(0, textAreaLength-1);
                jTextArea.selectAll();
                jTextArea.replaceSelection(textArea);
            }
        });

        
        // second line
        JButton jButton7 = new JButton("7");
        jButton7.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton7.setBounds(11, 138, 115, 45);
        add(jButton7);
        
        jButton7.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("7");
                jTextArea.append("7");
                
            }
        });

        JButton jButton8 = new JButton("8");
        jButton8.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton8.setBounds(127, 138, 115, 45);
        add(jButton8);
        
        jButton8.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("8");
                jTextArea.append("8");
            }
        });
        
        JButton jButton9 = new JButton("9");
        jButton9.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton9.setBounds(243, 138, 115, 45);
        add(jButton9);
        
        jButton9.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("9");
                jTextArea.append("9");
            }
        });
        
        JButton jButtonAdd = new JButton("+");
        jButtonAdd.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButtonAdd.setBounds(359, 138, 115, 45);
        add(jButtonAdd);
        
        jButtonAdd.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("+");
                jTextArea.append("+");
            }
        });
         
             
        // third line
        JButton jButton4 = new JButton("4");
        jButton4.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton4.setBounds(11, 186, 115, 45);
        add(jButton4);
        
        jButton4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("4");
                jTextArea.append("4");
            }
        });
        
        JButton jButton5 = new JButton("5");
        jButton5.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton5.setBounds(127, 186, 115, 45);
        add(jButton5);
        
        jButton5.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("5");
                jTextArea.append("5");
            }
        });
        
        JButton jButton6 = new JButton("6");
        jButton6.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton6.setBounds(243, 186, 115, 45);
        add(jButton6);
        
        jButton6.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("6");
                jTextArea.append("6");
            }
        });
        
        JButton jButtonSubstracion = new JButton("-");
        jButtonSubstracion.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButtonSubstracion.setBounds(359, 186, 115, 45);
        add(jButtonSubstracion);

        jButtonSubstracion.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("-");
                jTextArea.append("-");
            }
        });
        
        
     // forth line
        JButton jButton1 = new JButton("1");
        jButton1.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton1.setBounds(11, 234, 115, 45);
        add(jButton1);

        jButton1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("1");
                jTextArea.append("1");
            }
        });
        
        JButton jButton2 = new JButton("2");
        jButton2.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton2.setBounds(127, 234, 115, 45);
        add(jButton2);

        jButton2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("2");
                jTextArea.append("2");
            }
        });
        
        JButton jButton3 = new JButton("3");
        jButton3.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton3.setBounds(243, 234, 115, 45);
        add(jButton3);

        jButton3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("3");
                jTextArea.append("3");
            }
        });
        
        JButton jButtonResult = new JButton("=");
        jButtonResult.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButtonResult.setBounds(359, 234, 115, 93);
        add(jButtonResult);

        jButtonResult.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator calc = new Calculator();
                result = calc.calcMathOperation(new Calculator().getAValue(textArea), 
                                                    new Calculator().getBValue(textArea), 
                                                    new Calculator().getOptionValue(textArea)
                                                    );
                jTextArea.selectAll();
                jTextArea.replaceSelection("");
                jTextArea.append(result);
                textArea = "";
            }
        });
        
        
     // fifth line
        JButton jButton0 = new JButton("0");
        jButton0.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jButton0.setBounds(11, 282, 230, 45);
        add(jButton0);

        jButton0.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat("0");
                jTextArea.append("0");
            }
        });
        
        JButton jButtonComma = new JButton(",");
        jButtonComma.setFont(new Font("Arial", Font.BOLD, 16));
        jButtonComma.setBounds(243, 282, 115, 45);
        add(jButtonComma);

        jButtonComma.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea = textArea.concat(".");
                jTextArea.append(",");
            }
        });
        
        
    }
}
