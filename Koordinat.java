package TP08;

public class Koordinat {
    private int x;
    private int y;
    
    public Koordinat(int x, int y){
        setX(x);
        setY(y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}
