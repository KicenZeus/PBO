package pemro;

import java.util.Scanner;

public class pertemuan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nisabZakat = 85000000;
        char pilihan;
        
        do {
            
            System.out.print("Masukkan jumlah kekayaan (dalam Rupiah): ");
            double totalKekayaan = input.nextDouble();

            if (totalKekayaan >= nisabZakat) {
                
                double jumlahZakat = totalKekayaan * 2.5 / 100;
                System.out.println("Jumlah zakat yang harus dibayarkan: Rp " + jumlahZakat);
            } else {
                System.out.println("Kekayaan Anda belum memenuhi nisab zakat.");
            }
            
            System.out.print("Apakah Anda ingin menghitung zakat lagi? (y/n): ");
            pilihan = input.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');
        
        System.out.println("Terima kasih telah menggunakan kalkulator zakat.");
    }
}
