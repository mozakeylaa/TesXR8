import java.util.Scanner;

public class BbSiswa {
    public static void main(String[] args) {
        int jumlah_siswa;
        double berat_badan;
        int absensi_siswa;
        double total_berat = 0;
        double rata_rata_berat;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa");
        jumlah_siswa = s.nextInt();
        System.out.println("----------------------");
        for(absensi_siswa = 1; absensi_siswa <= jumlah_siswa; absensi_siswa++){
            System.out.println("Masukkan berat badan siswa ke-" + absensi_siswa + ":");
            berat_badan = s.nextDouble();
            total_berat += berat_badan;
        }
        rata_rata_berat = total_berat/jumlah_siswa;
        System.out.println("Total berat badan = " + total_berat + " kg ");
        System.out.println("Rata rata berat badan" +  jumlah_siswa + " siswa adalah: " + rata_rata_berat + " kg ");
    }
}
