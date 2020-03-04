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

public class GamePanel extends JPanel implements MouseListener{
    private int first=0000;
    private int frame=0;
    private boolean fired;
    //Vector<Ball> oVector = new Vector<Ball>();
    Vector<Integer> stopped = new Vector<Integer>();
    int[][] coordArray = new int[][]{
        {1600,100,3,1},
        {100,100,2,0},
        {100,300,1,3},
        {1400,300,2,0},
        {1400,500,3,1},
        {100,500,4,3},
    };
    private ImageIcon ballPurpleIcon = new ImageIcon("Ball_Purple.png");
    //public Ball ball = new Ball();
    GameLogic gl = new GameLogic();
    public GamePanel(){
        setSize(1600,800);
        setLayout(null);
        setVisible(true);
    }
    /*
        double MouseX;
        this.setSize(1600,900);
        this.addMouseListener(this);
        //make shooter sprite
        Shooter shooter = new Shooter();
    
        // //Make cursor invisible
        // BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);        
        // Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
        // cursorImg, new Point(0, 0), "blank cursor");
        // this.getContentPane().setCursor(blankCursor);

        // add shooter ball
        ball.setBall();
        this.add(ball);
        this.add(shooter);
        shooter.setBounds(800,750,200,100);
        
        // add ball in the track
        oVector.add(new Ball());
        oVector.forEach((n)->n.Orb());
        oVector.forEach((n)->this.add(n));
        oVector.forEach((n)->n.dir(3));

        while(true){
            frame = this.getX();
            //moving the sprites
            ball.follow(frame);
            shooter.move(frame);
            oVector.forEach((n)->n.move());
            if(first<20000){
                first++;
                oVector.forEach((n)->n.fast());
            }
            else if(first==20000){
                oVector.forEach((n)->n.back());
                first++;
            }
            if(fired){

            }
            // add more balls if they are already in frame
            if(oVector.lastElement().inframe()){
                oVector.add(new Ball());
                oVector.lastElement().Orb();
                this.add(oVector.lastElement());
            }
        }
    }
    */
    @Override
    public void mousePressed(MouseEvent e){
        //int mx = e.getX();
        //this.setBounds(800,100,52,52);
        //yvel = 4;
        //System.out.println("CLICKED");
    }

    //Mouse click detection
    @Override
    public void mouseClicked(MouseEvent e) {
        //ball.fire();
        gl.fire(ball);
        fired=true;
    }   
    @Override
    public void mouseReleased(MouseEvent e) {
    
        //System.out.println("CLICKED");
    }
    @Override
    public void mouseExited(MouseEvent e){

        //System.out.println("CLICKED");
    }
    @Override
    public void mouseEntered(MouseEvent e){

        //System.out.println("CLICKED");
    }
}