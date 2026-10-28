package pertemuan6;

public class Lingkaran extends BagunDatar{
    float r;
    
    public void luas(){
        System.out.println("Jari-Jari Lingkaran: " + this.r);
        System.out.println("Luas Lingkaran: " + this.r * this.r * 3.14);
    }
    
    public void keliling(){
        System.out.println("Jari-Jari Lingkaran: " + this.r);
        System.out.println("Luas Lingkaran: " + 2 * this.r * 3.14);
    }
}

