package Praktikum5;

// File: Kalkulator.java
public class Kalkulator {
    
    // Method 1: Menjumlahkan dua bilangan bulat (int)
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method 2: Overloading - Menjumlahkan dua bilangan desimal (double)
    public double tambah(double a, double b) {
        return a + b;
    }

    // Method 3: Overloading - Menjumlahkan tiga bilangan bulat (int)
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }
}

