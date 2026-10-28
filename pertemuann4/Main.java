package pertemuann4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Merk Sepeda
        System.out.print("Masukan Object Merk Sepeda: ");
        String merkInput = scanner.nextLine();

        // Instansiasi Object Sepeda
        Sepeda sepeda = new Sepeda(merkInput);

        int pilihan = -1;

        // Loop Menu Utama
        while (pilihan != 0) {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");

            System.out.print("Pilihan : ");
            pilihan = scanner.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    sepeda.melaju();
                    break;
                case 2:
                    sepeda.mundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}