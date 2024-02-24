package soal.pkg2;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int angka1, angka2, angka3, nT;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        angka1 = masuk.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = masuk.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        angka3 = masuk.nextInt();

        if (angka1 >= angka2 && angka1 >= angka3) {
            nT = angka1;
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            nT = angka2;
        } else {
            nT = angka3;
        }

        System.out.println("Nilai terbesar adalah: " + nT);
    }
}