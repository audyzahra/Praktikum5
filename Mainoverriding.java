package Praktikum5;

public class Mainoverriding {
    public static void main(String[] args) {
        // Objek dari kelas turunan diperlakukan sebagai tipe kelas induk (Polymorphism)
        Hewan h1 = new Kucing(); 
        Hewan h2 = new Anjing();

        System.out.print("H1: "); h1.bersuara(); // Memanggil Kucing.bersuara()
        System.out.print("H2: "); h2.bersuara(); // Memanggil Anjing.bersuara()
    }
}