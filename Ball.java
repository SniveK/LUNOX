import java.awt.MouseInfo;
import java.util.Random;
public class Ball{
    private int finalx =0;
    private int finaly = (int) y;
    private int colorcode;
    private int lastdir;

    private double xvel=0;
    private double yvel=0;
    private double x=0;
    private double y = 750;
    private double MouseX=0;

    private boolean notfired=true;
    private boolean faster=false;
    private boolean stop=false;
    private boolean disconnect=false;
    
    private Random rn = new Random();

    private BallUI bui= new BallUI();
    
    public void setyvel(Double v){
        yvel = v;
    }
    public void setBall(){
        bui.setColor(rn.nextInt(3));
    }
    public int getX(){
        return finalx;
    }
    public void setX(int xcoord){
        x=xcoord;
        finalx=xcoord;
    }
    public void setY(int ycoord){
        y=ycoord;
        finaly=ycoord;
    }
    public int getY() {
        return finaly;
    }
    public int showColor(){
        return colorcode;
    }
    public int showDirection(){
        return lastdir;
    }
    public boolean getStop(){
        return stop;
    }
    public void setStop(boolean x){
        stop=x;
    }
    public void setDC(boolean x){
        disconnect =x;
    }
    public boolean getDC(){
        return disconnect;
    }
    // public void setCoord(int xx,int yy){
    //     x = (double) xx;
    //     y = (double) yy;
    //     finalx = (int) x;
    //     finaly = (int) y;
    //     bui.setBounds(finalx, finaly, 52, 52);
    // }
    public void follow(int frame){
        
        if(notfired){
            MouseX = MouseInfo.getPointerInfo().getLocation().getX();
            if(MouseX>frame&&MouseX<(frame+1600)){
                x = MouseX -26;
                finalx = (int) x - frame;
            }
        }
        else{
            y-=yvel;
            x+=xvel;
            finalx = (int) x - frame;
        }
        
        finaly = (int) y;
        if(finaly<0){
            reset();
        }
        bui.setLoc(finalx, finaly);
    }
    public void fire(){
        yvel = 0.007;
        notfired=false;
    }
    public void reset(){
        xvel =0;
        yvel=0;
        y=750;
        //finaly = (int) y;
        notfired=true;
        bui.setColor(rn.nextInt(3));
    }
    public boolean inframe(){
        if(x<1423){
            return true;
        }
        else{
            return false;
        }
    }
    public void dir(int dir){
        if (dir!=5 && dir!=4) {
            lastdir = dir;
        }
        switch (dir) {
            case 0:
                //up
                if(faster){

                    yvel = -0.07;
                }
                else{
                    yvel = -0.001;
                }
                xvel = 0;
                break;
            case 1:
                //right
                if(faster){
                    xvel = 0.07;
                }
                else{
                    xvel = 0.001;
                }
                yvel = 0;
                break;
            case 2:
                //down
                if(faster){
                    yvel = 0.07;
                }
                else{
                    yvel = 0.001;
                }
                xvel =0;
                break;
            case 3:
                //left
                if(faster){
                    xvel = -0.07;
                }
                else{
                    xvel = -0.001;
                }
                yvel =0;
                break;
            case 4:
                //stop
                xvel=0.0;
                yvel=0.0;
                break;
            case 5:
                //back to previous dir
                dir(lastdir);
                break;
        }
    }
    public void move(){
        x += xvel;
        y += yvel;
        finalx = (int) x;
        finaly = (int) y;
        bui.setLoc(finalx,finaly);
    }
    public void Orb(){
        dir(3);
        bui.setColor(rn.nextInt(3));
        x = 1475;
        y = 100;
        finalx = (int) x;
        finaly = (int) y;
        bui.setBounds(finalx, finaly, 52, 52);
    }
    public void fast(){
        faster=true;
        dir(lastdir);
    }
    public void back(){
        faster=false;
        dir(lastdir);
    }
    public void insertion(int g){
        dir(g);
        fast();
        yvel = 0.007;
    }
}