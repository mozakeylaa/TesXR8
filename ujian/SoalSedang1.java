package ujian;

import java.util.Scanner;

    public class SoalSedang1 {
    static int inputpengguna(String petunjuk){
        Scanner myObj = new Scanner(System.in);
        System.out.println(petunjuk);
        return myObj.nextInt();        
    }
    public static void main(String[] args) {
        int n = inputpengguna("Masukkan n (nilai n harus bilangan bulat positif!) : "); //perintah untuk user menginputkan nilai n
        int faktorial = 1; // membuat variabel faktorial dengan tipe data int
        for(int i=1 ; i<=n ; i++ ){ //membuat perulangan dari for
            faktorial = faktorial*i ; // variabel faktorial akan melakukan proses perulangan sesuai dengan jumlah angka yang di input pengguna
        }
        System.out.println(n + "! = " + faktorial  ); //output nilai n yang telah di input pengguna ditambah tanda faktorial yaitu !, sama dengan hasil variabel faktorial nya 
    }
    
}

