package ujian;


    import java.util.Scanner;

    public class SoalMudah2 {
        //function yang digunakan untuk pengguna menginputkan variabel
        static int inputpengguna(String petunjuk){ // string petunjuk sebagai perintah pengguna untuk memasukkan inputan
            Scanner myObj = new Scanner(System.in);
            System.out.println(petunjuk);
            return myObj.nextInt();        
    
        }
        public static void main(String[] args) {
            System.out.println("Menentukan bilangan ganjil atau genap");
            int nilai = inputpengguna("Masukkan bilangan: ");
            float hasil = nilai % 2;
            if(hasil==0){
                System.out.println("nilai bilangannya genap");
            }else{
                System.out.println("nilai bilangannya ganjil");
            }
        }
    }
