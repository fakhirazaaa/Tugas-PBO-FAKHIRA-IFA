/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;


public class MainBuku {
    public static void main(String[] args) {
        // Membuat objek dengan berbagai constructor
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Pemrograman Berorientasi Objek", "Budi Raharjo");
        Buku buku3 = new Buku("Struktur Data", "Siti Aminah", 2024);

        System.out.println("=== INFORMASI BUKU ===");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}