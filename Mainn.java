import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.Vector;
import java.lang.Math;
import java.awt.Toolkit; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.util.Collections;
import javax.swing.JPanel;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;

public class Mainn {
  // public static void main(String[] args) {
  //   Mainn M = new Mainn();
  // }
  public Mainn() {
    JFrame f = new JFrame("LUNOX");
    GamePanel g=new GamePanel();
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(1600,900);
    f.setResizable(false);
    f.getContentPane().setBackground(Color.black);
    f.setLayout(new BorderLayout());
    f.add(g,BorderLayout.CENTER);
    f.setVisible(true);
  }
}