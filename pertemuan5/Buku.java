/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor 1: Tanpa parameter
    public Buku() {
        this.judul = "Belum Diisi";
        this.pengarang = "Anonim";
        this.tahunTerbit = 0;
    }

    // Constructor 2: Dengan 2 parameter (Judul & Pengarang)
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 2023; // Nilai default
    }

    // Constructor 3: Dengan 3 parameter lengkap
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("-----------------------------------");
    }
}
