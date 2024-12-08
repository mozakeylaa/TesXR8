package ujian;

import java.util.Random;
import java.util.Scanner;

public class SoalSedang3 {
    static int inputpengguna(String petunjuk) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(petunjuk);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Random generator = new Random();
        int pilih = 0;

        // perulangan dengan while-loop
        while (pilih == 0) {
            int bil1 = generator.nextInt(10) + 1; // bilangan akan muncul secara random dari 1-10
            int bil2 = generator.nextInt(10) + 1; // bilangan random akan muncul sampai 10 karna (10) + 1
            int opr = generator.nextInt(3);       // pilih operator, ada 3 yaitu didefinisikan sebagai (0 = x, 1 = /, 2 = %)
            String textopr = ""; //textopr sebagai status operator nya

            if (opr == 0) {
                textopr = " x  ";
            } else if (opr == 1) {
                textopr = " / ";
            } else if (opr == 2) {
                textopr = " % ";
            }

            System.out.print(bil1 + textopr + bil2 + " = ");
            float jawaban = inputpengguna(""); // memanggil function diatas sebagai inputan pengguna
            float jawabanBenar = 0;

            if (opr == 0) {
                jawabanBenar = bil1 * bil2;
            } else if (opr == 1) {
                jawabanBenar = bil1 / (float) bil2; // agar hasil pembagian dapat berbentuk bilangan desimal
            } else if (opr == 2) {
                jawabanBenar = bil1 % bil2;
            }

            // cek jawaban
            if (jawaban == jawabanBenar) {
                System.out.println("selamat jawaban anda BENAR!");
            } else {
                System.out.println("SALAH! Jawaban yang benar adalah: " + jawabanBenar);
            }

            // tanya apakah ingin lanjut
            pilih = inputpengguna("Anda ingin mengulang? Pilih ya [0] / tidak [1]: ");
        }

        System.out.println("Terima kasih telah bermain!");
    }
}
