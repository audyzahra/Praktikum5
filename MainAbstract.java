package Praktikum5;

public class MainAbstract {
    public static void main(String[] args) {
        // Bentuk objBentuk = new Bentuk("A"); // ERROR: Tidak bisa instansiasi Abstract Class

        Bentuk b1 = new Lingkaran(7);
        b1.tampilkanNama();
        System.out.println("Luas: " + b1.hitungLuas());
    }
}
