package ujian;
import java.util.Scanner;

    public class SoalSulit1 {
    //function yang digunakan untuk pengguna menginputkan variabel
    static double inputpengguna(String petunjuk){ //string petunjuk memberikan perintah untuk pengguna memasukkan inputan 
        Scanner myObj = new Scanner(System.in);
        System.out.println(petunjuk);
        return myObj.nextInt();   
}
    public static void main(String[] args) {
        double jumlah_siswa = inputpengguna("Masukkan Jumlah Siswa: "); // deklarasi dari function diatas
        double jumlah_nilai = 0;
        double masukkan;
        
        for(int i = 0; i < jumlah_siswa; i++){ 
            System.out.print("Masukkan nilai siswa " + (i+1) + ":"); //(i+1) agar menampilkan angka mulai dari 1, bukan dari 0
            masukkan = inputpengguna(""); // deklarasi dari function diatas
            jumlah_nilai = jumlah_nilai + masukkan;
        }
        System.out.println("Jumlah siswa: " + jumlah_siswa); //jumlah siswa
        System.out.println("Rata-rata : " + (jumlah_nilai/jumlah_siswa)); //rumus rata rata yaitu total nilai siswa dibagi dengan jumlah siswa

    }
}
