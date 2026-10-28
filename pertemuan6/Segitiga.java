package pertemuan6;

public class Segitiga extends BagunDatar{
    float alas;
    float tinggi;
    int a, b, c;
    
    public void luas(){
        System.out.println("Alas Segitiga: " + this.alas);
        System.out.println("Tinggi Segitiga: " + this.tinggi);
        System.out.println("Luas Segitiga: " + (alas * tinggi) / 2);
    }
    
    public void keliling(){
        System.out.println("Sisi a Segitiga: " + this.a);
        System.out.println("Sisi b Segitiga: " + this.b);
        System.out.println("Sisi c Segitiga: " + this.c);
        System.out.println("Keliling Segitiga: " + (this.a + this.b + this.c));
    }
}
