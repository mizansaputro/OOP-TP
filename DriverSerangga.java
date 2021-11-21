package TP08;

public class DriverSerangga {
    public static void main(String[] args) {
        String warna1 = "merah";
        String warna2 = "oranye";
        
        int X1 = 70;
        int Y1 = 90;
        int X2 = 30;
        int Y2 = 40;
        int Z2 = 50;

        Serangga s = new Semut(warna1, new Koordinat(X1, Y1));
        System.out.println("Warna Semut\t:\t "+s.getWarna());
        s.info();
        s.gerak(new Koordinat(80,100));
        s.info();
        s = new Lebah(warna2, new Koordinat3D(X2, Y2, Z2));
                System.out.println("Warna Lebah\t:\t "+s.getWarna());
        s.info();
        s.gerak(new Koordinat3D(45,55,65));
        s.info();
    }   
}
