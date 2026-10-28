package pertemuan6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Program Luas dan Keliling bangun datar:");
        Persegi p = new Persegi();
        p.sisi = 4;
        p.luas();
        p.keliling();
        System.out.println("");
        
        PersegiPanjang pj = new PersegiPanjang();
        pj.lebar = 4;
        pj.panjang = 8;
        pj.luas();
        pj.keliling();
        System.out.println("");
        
        Lingkaran l = new Lingkaran();
        l.r = 7;
        l.luas();
        l.keliling();
        System.out.println("");
        
        Segitiga s = new Segitiga();
        s.alas = 4;
        s.tinggi = 6;
        s.a = 3;
        s.b = 4;
        s.c = 5;
        s.luas();
        s.keliling();
        System.out.println("");
        
        
    }
}