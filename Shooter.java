import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.lang.annotation.Retention;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;

public class Shooter{
    
    private double MouseX;
    private double x;
    private int finalx;
    
    public void move(int frame){
        MouseX = MouseInfo.getPointerInfo().getLocation().getX();
            if(MouseX>frame&&MouseX<(frame+1600)){
                x = MouseX -100;
                finalx = (int) x -frame;
            }
    }
    public int getX() {
        return finalx;
    }
}