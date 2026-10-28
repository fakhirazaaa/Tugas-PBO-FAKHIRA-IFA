package pertemuan6;

public class Employee {
    int nip;
    String nama;
    double gaji;
    
    public Employee(int nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void info(){
        System.out.println("Info Employee");
        System.out.println("NIP " + this.nip);
        System.out.println("Nama " + this.nama);
        System.out.println("Gaji " + this.gaji);
    }
}
