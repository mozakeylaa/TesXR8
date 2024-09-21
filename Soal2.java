import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int jumlah_siswa;
        int nilai_siswa;
        int absensi_siswa;
        double total_semua_nilai = 0;
        double rata_rata_siswa;

        Scanner s = new Scanner (System.in);
        System.out.println("Jumlah Siswa");
        jumlah_siswa = s.nextInt();
        System.out.println("----------------------------");
        for(absensi_siswa = 1; absensi_siswa <= jumlah_siswa; absensi_siswa++){
            System.out.println("Masukkan nilai siswa ke-" + absensi_siswa +":");
            nilai_siswa = s.nextInt();
            total_semua_nilai += nilai_siswa;
        }
        System.out.println("-----------------------------");
        rata_rata_siswa = total_semua_nilai/jumlah_siswa;
        System.out.println("Rata rata nilai dari"+ jumlah_siswa+ "siswa adalah:" +rata_rata_siswa);
    }
}
