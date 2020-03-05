import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;
public class ShooterUI extends JLabel{
    private ImageIcon shooterIcon = new ImageIcon("Shooter.png");
    public ShooterUI(){
        this.setIcon(shooterIcon);
    }
    public void setLoc(int x){
        this.setLocation(x,750);
    }
}