package TP08;

public class Koordinat3D extends Koordinat{
    private int z;
    
    public Koordinat3D (int x, int y, int z){
            super(x,y);
            setZ(z);
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
}
