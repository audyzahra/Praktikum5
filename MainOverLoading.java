package Praktikum5;

// File: MainOverloading.java (Demonstrasi)
public class MainOverLoading {
    public static void main(String[] args) {
        Kalkulator obj = new Kalkulator();

        // Memanggil Method 1
        System.out.println("Hasil 1 (int): " + obj.tambah(5, 3));
        
        // Memanggil Method 2 (Overloaded, beda tipe data)
        System.out.println("Hasil 2 (double): " + obj.tambah(4.5, 2.5));

        // Memanggil Method 3 (Overloaded, beda jumlah parameter)
        System.out.println("Hasil 3 (3 int): " + obj.tambah(1, 2, 3));
    }
}