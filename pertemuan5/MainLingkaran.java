package pertemuan5;

public class MainLingkaran {
    public static void main(String[] args) {
        // Membuat objek lingkaran dengan berbagai input (positif, nol, negatif)
        Lingkaran lingkaran1 = new Lingkaran(7.0);
        Lingkaran lingkaran2 = new Lingkaran(0);   // Akan menjadi 1.0 karena <= 0
        Lingkaran lingkaran3 = new Lingkaran(-5.5); // Akan menjadi 1.0 karena negatif

        System.out.println("=== PENGUJIAN VALIDASI LINGKARAN ===");
        lingkaran1.tampilkanInfo();
        lingkaran2.tampilkanInfo();
        lingkaran3.tampilkanInfo();
    }
}