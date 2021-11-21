package TP08;

public abstract class Serangga{
    private int jmlKaki;
    private String warna;
    protected Koordinat posisi;
    
    public Serangga(String warna, Koordinat k){
        this.posisi = k;
        setWarna(warna);
        this.jmlKaki = 6;
    }
    public abstract void gerak(Koordinat k);
    public int getJmlKaki(){
        return jmlKaki;
    }
    public Koordinat getPosisi(){
        return posisi;
    }
    public String getWarna(){
        return warna;
    }
    public abstract void info();
    public void setWarna(String warna){
        this.warna = warna;
    }
}
