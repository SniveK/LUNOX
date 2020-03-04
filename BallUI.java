import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;
import java.awt.*;
import java.lang.Thread;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.MouseInfo;
import java.awt.Toolkit; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener;
import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.Random;

class BallUI extends JLabel{
    private ImageIcon ballPurpleIcon = new ImageIcon("Ball_Purple.png");
    private ImageIcon ballOrangeIcon = new ImageIcon("Ball_Orange.png");
    private ImageIcon ballBlueIcon = new ImageIcon("Ball_Blue.png");
    public BallUI(){
        this.setSize(52, 52);
        this.setLocation(800, 750);
    }
    public void setColor(int c){
        switch (c) {
            case 0:
                this.setIcon(ballBlueIcon);
                break;        
            case 1:
                this.setIcon(ballOrangeIcon);
                break;
            case 2:
                this.setIcon(ballPurpleIcon);
                break;
        }
    }
    public void setLoc(int x,int y){
        this.setLocation(x, y);
    }
    public void remove(){
        this.setLocation(2000, 2000);
    }
}