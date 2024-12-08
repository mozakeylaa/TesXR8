package ujian;

import java.util.Scanner;

public class SoalSulit2 {
    
      static int inputpengguna(String petunjuk){
        Scanner myObj = new Scanner(System.in);
        System.out.println(petunjuk);
        return myObj.nextInt();        
    }
    public static void main(String[] args) {
        
        int n = inputpengguna("Masukan jumlah elemen dalam array : ");
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        boolean adaDuplikat = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (array[i] == array[j]) {
                    adaDuplikat = true;
                    System.out.println("Duplikat ditemukan pada element : " + array[i]);
                    break; 
                }
            }
            if (adaDuplikat) {
                break; 
            }
        }
        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen duplikat dalam array.");
        }
    }
    
}


