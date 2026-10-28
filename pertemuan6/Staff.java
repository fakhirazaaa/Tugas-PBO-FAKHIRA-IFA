package pertemuan6;

public class Staff extends Employee {
    String bagian;
    
    public Staff(int nip, String nama, double gaji){
        super(nip, nama, gaji);
    }
    
    public void info(){
        System.out.println("Info Staff");
        System.out.println("NIP " + this.nip);
        System.out.println("Nama " + this.nama);
        System.out.println("Gaji " + this.gaji);
    }
    
    
    public void infoBagian(){
        System.out.println("Bagian " + this.bagian);
    }
    
}
