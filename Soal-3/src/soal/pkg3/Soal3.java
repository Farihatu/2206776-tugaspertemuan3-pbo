package soal.pkg3;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int jamMasuk, jamKeluar, lamaParkir, biayaParkir;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan jam masuk (format 24 jam): ");
        jamMasuk = masuk.nextInt();
        System.out.print("Masukkan jam keluar (format 24 jam): ");
        jamKeluar = masuk.nextInt();

        lamaParkir = Math.max(jamKeluar - jamMasuk, 0); 
        
        if (lamaParkir <= 2) {
            biayaParkir = 1500; 
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Biaya parkir: Rp " + biayaParkir);
    }
}