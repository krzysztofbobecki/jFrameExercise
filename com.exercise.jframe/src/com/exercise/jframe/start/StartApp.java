package com.exercise.jframe.start;

import javax.swing.JFrame;

import com.exercise.jframe.main.frame.MainFrame;

public class StartApp {

    public static void main(String[] args) {
       
        JFrame jFrame = new MainFrame();
        jFrame.setTitle("MyApp_1.0v");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        
    }

}
