package ujian;
import java.util.Scanner;

    public class SoalMudah1 {
    static float inputpengguna(String petunjuk){
        Scanner myObj = new Scanner(System.in);
        System.out.println(petunjuk);
        return myObj.nextFloat();        
    }
    public static void main(String[] args) {
        // membuat variabel dan perintah untuk input pengguna
        float bp = inputpengguna("Berapa Kg Berat Paket Anda : ");
        float jt= inputpengguna("Berapa KM Jarak Tempuh Paket Anda : ");
        float panjang = inputpengguna("Masukkan Panjang Paket Anda: ");
        float lebar = inputpengguna("Masukkan Lebar Paket Anda: ");
        float tinggi = inputpengguna("Masukkan Tinggi Paket Anda: ");
        float v = panjang * lebar * tinggi;
        float hargaSatuanBj;
        float hargaSatuanV;


        if (jt<=10) { //jika jarak tempuh nya kurang dari 10 km, akan dikenakan biaya 4250 per km
            hargaSatuanBj = 4250;
        }else{
            hargaSatuanBj =6000; // jika lebih dari 10 km, akan dikenakan biaya 6000 per km
        }

        
        if (v > 100 &&  v <= 200) {  //jika volume nya lebih dari 100 maka dikenakan tambahan biaya 50000
            hargaSatuanV = 50000;
        }else{
            hargaSatuanV = 0; // jika kurang dari 100 maka tidak akan dikenakan tambahan biaya
        }

        if(v > 200){
            hargaSatuanV = 150000;
        }else{
            hargaSatuanV = 0;
        }

        // output total biaya pengiriman beserta rumusnya
        System.out.println(" Total Harga Pengiriman " + ((bp*hargaSatuanBj*jt) + hargaSatuanV));  
    }
    
}