package Praktikum5;

public abstract class Bentuk {
    private String nama;
    
    public Bentuk(String nama) {
        this.nama = nama;
    }
    
    // Abstract method: wajib diimplementasikan oleh subclass
    public abstract double hitungLuas();
    
    // Concrete method: memiliki implementasi
    public void tampilkanNama() {
        System.out.println("Bentuk: " + nama);
    }
}

