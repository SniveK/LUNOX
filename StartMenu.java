import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.lang.Thread;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;

import java.awt.MouseInfo;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class StartMenu extends JFrame implements ActionListener{
    public static void main(String[] args) {
        StartMenu hmm = new StartMenu();
    }
    JButton startButton = new JButton("Start");
    JButton exitButton = new JButton("Exit");
    private boolean startGame=false;
    private boolean exitGame=false;
    public StartMenu(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600,900);
        setResizable(false);
        getContentPane().setBackground(Color.black);
        // setVisible(true);
        setLayout(null);
        JLabel imageLabel = new JLabel();
        
        ImageIcon ii = new ImageIcon("LunoxGIF3.gif");
        imageLabel.setIcon(ii);
        imageLabel.setBounds(0, 0, 1600, 900);
        
        // JButton startButton = new JButton("Start");
        // JButton exitButton = new JButton("Exit");
        startButton.addActionListener(this);
        exitButton.addActionListener(this);
        add(startButton);
        add(exitButton);
        add(imageLabel);
        startButton.setBounds(650,575,300,100);
        exitButton.setBounds(650,675,300,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startButton){
            startGame=true;
            dispose();
            System.exit(0);
            
        }
        if (e.getSource()==exitButton){
            exitGame=true;
            dispose();
            System.exit(0);
        }
    }

    public boolean getStart(){
        return startGame;
    }
    public boolean getExit(){
        return exitGame;
    }
}