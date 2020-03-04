import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;

public class Shooter extends JLabel {
    private ImageIcon shooterIcon = new ImageIcon("Shooter.png");
    private double MouseX;
    private double x;
    private int finalx;
    public Shooter(){
        this.setIcon(shooterIcon);
    }
    public void move(int frame){
        MouseX = MouseInfo.getPointerInfo().getLocation().getX();
            if(MouseX>frame&&MouseX<(frame+1600)){
                x = MouseX -100;
                finalx = (int) x -frame;
            }
        this.setLocation(finalx, 750);
    }
}