
package TP08;

public class Semut extends Serangga {
    public Semut(String warna, Koordinat k){
        super(warna,k);
    }
    @Override
    public void gerak(Koordinat k) {
        this.posisi = k;
    }
    @Override
    public void info() {
        System.out.printf("Posisi Semut\t: ");
        System.out.printf("\t X = %d \n",this.posisi.getX());
        System.out.printf("\t\t\t Y = %d \n",this.posisi.getY());
    }
    
}
