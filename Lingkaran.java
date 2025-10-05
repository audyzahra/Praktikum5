package Praktikum5;

public class Lingkaran extends Bentuk {
    private double jariJari;
    
    public Lingkaran(double r) {
        super("Lingkaran");
        this.jariJari = r;
    }
    
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}