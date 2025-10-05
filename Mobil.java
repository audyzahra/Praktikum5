package Praktikum5;

public class Mobil implements Bergerak {
    private int posisi;
    
    public Mobil() {
        this.posisi = 0;
    }

    @Override
    public void maju(int kecepatan) {
        posisi += kecepatan;
        System.out.println("Mobil bergerak maju dengan kecepatan " 
                           + kecepatan + ". Posisi: " + posisi);
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}

