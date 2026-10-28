package pertemuan6;

public class PersegiPanjang extends BagunDatar{
    float panjang;
    float lebar;
    
    public void luas(){
        System.out.println("Panjang Persegi Panjang: " + this.panjang);
        System.out.println("Lebar Persegi Panjang: " + this.lebar);
        System.out.println("Luas Persegi Panjang: " + this.panjang * this.lebar);
    }
    
    public void keliling(){
        System.out.println("Panjang Persegi Panjang: " + this.panjang);
        System.out.println("Lebar Persegi Panjang: " + this.lebar);
        System.out.println("Keliling Persegi Panjang: " + ((this.panjang * 2) + (this.lebar * 2)));
    }
    
    
}
