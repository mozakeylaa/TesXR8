package ujian;

import java.util.Arrays;
import java.util.Scanner;

public class SoalSulit3 {
    static int  inputpengguna(String petunjuk){                    //string petunjuk memberikan perintah untuk pengguna memasukkan inputan 
        Scanner myObj = new Scanner(System.in);
        System.out.println(petunjuk);
        return myObj.nextInt();   
}
public static void main(String[] args) {
    int data_asli[] = {1,3,3,3,2,2,4};
    int data[] = data_asli;                                   //Array data adalah data yg diolah dari data asli
    Arrays.sort(data);                                       //setiap pengolahan data diawali dengan sort sebagai syarat untuk memudahkan dalam mengolah

    int pengingat = data [0]-1;  
    // int max = 0;
    // int elemen = data[0];

    //perulangan untuk mendeteksi frekuensi
    for(int i = 0; i<data.length; i++){                  // perulangan pokok yang dimulai dari elemen array 0 - nilai yang di input pengguna
        int pointer = data[i];                          // di variabel pointer = data[i] berfungsi sebagai penampung elemen yang sedang di periksa
        if(pointer != pengingat){                      // untuk mengingat bilangan sebelumnya sudah pernah dihitung apa belum 

            int jumlah = 1;                           // karena di mulai dari dirinya sendiri
            for(int j = i+1; j< data.length; j++){   // perulangan kedua, berfungsi untuk membandingkan dengan elemen berikutnya
              if(pointer == data[j]){               // membandingkan dengan elemen di data [j]
                jumlah = jumlah + 1;               // menambahkan nilai 1 ke variabel jumlah, setiap kali ditemukan elemen lain yang sama dengan pointer
              }
            }

           //membuat output
           System.out.println("angka " + data[i] + " muncul " + jumlah + " kali "); 
           pengingat = pointer;          

           //mencari modus
          //  if (max < jumlah) {
          //   max = jumlah;
          //   elemen = data[i];
            
          //  }
        }
    }
    // System.out.println("angka " + elemen + " sebagai modus karena muncul sebanyak " + max);
    // for(int i = 0; i<data.length; i++){
    //     System.out.print(data_asli[i]+" ");
    // }
  }
}
