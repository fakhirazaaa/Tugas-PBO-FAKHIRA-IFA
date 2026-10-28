/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuann4;

/**
 *
 * @author HP
 */
public class Sepeda {
    private String merk;
    private int jarakTempuh;

    // Konstruktor
    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0; // Jarak awal sebelum kemampuannya digunakan adalah 0 km
        System.out.println("-   Object " + this.merk + " dibuat, jarak tmpuh awal " + this.jarakTempuh + " km");
    }

    // Method Bergerak Maju (+10 Km)
    public void melaju() {
        this.jarakTempuh += 10;
        System.out.println("-   Bergerak Maju 10 Km");
        System.out.println("-   Object Sepeda " + this.merk + ", Jarak tempuh " + this.jarakTempuh + " Km");
    }

    // Method Bergerak Mundur (-5 Km)
    public void mundur() {
        this.jarakTempuh -= 5;
        System.out.println("-   Bergerak Mundur 5 Km");
        System.out.println("-   Object Sepeda " + this.merk + ", Jarak tempuh " + this.jarakTempuh + " Km");
    }

    // Method Berhenti (Menampilkan jarak tempuh terakhir)
    public void berhenti() {
        System.out.println("-   Object Sepeda " + this.merk + " Berhenti.");
        System.out.println("-   Jarak tempuh akhir: " + this.jarakTempuh + " Km");
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Getter untuk jarak tempuh
    public int getJarakTempuh() {
        return jarakTempuh;
    }
}
