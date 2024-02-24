package soal.pkg1;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int angka1, angka2, angka3;
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = masuk.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = masuk.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        angka3 = masuk.nextInt();
        
        if ((angka1 % 1000 == 0) && (angka2 % 1000 == 0) && (angka3 % 1000 == 0)) {
            System.out.println("Masukan adalah ribuan.");
        } else {
            System.out.println("Masukan bukan ribuan.");
        }
    }
}