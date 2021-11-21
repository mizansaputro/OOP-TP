package TP08;
public class Lebah extends Serangga{
    public Lebah(String warna, Koordinat3D k){
        super(warna,k);
    }

    @Override
    public void gerak(Koordinat k) {
       this.posisi = k;
    }

    @Override
    public void info() {
        System.out.printf("Posisi Lebah\t: ");
        System.out.printf("\t X = %d \n", super.getPosisi().getX());
        System.out.printf("\t\t\t Y = %d \n", super.getPosisi().getY());
        System.out.printf("\t\t\t Z = %d \n",((Koordinat3D) super.getPosisi()).getZ());
    }
}
