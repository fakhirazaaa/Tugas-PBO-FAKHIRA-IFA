package pertemuan6;

public class Persegi extends BagunDatar{
    float sisi;
    
    
    public void luas(){
        System.out.println("Sisi Persegi: " + this.sisi);
        System.out.println("Luas Persegi: " + this.sisi * this.sisi);
    }
    
    public void keliling(){
        System.out.println("Sisi Persegi: " + this.sisi);
        System.out.println("Keliling Persegi: " + this.sisi * 4);
    }
}