import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int bilangan_awal = 6;
        int bilangan_akhir = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan awal");
        bilangan_awal = input.nextInt();
        System.out.println("Masukkan bilangan akhir");
        bilangan_akhir = input.nextInt ();
        System.out.println("------------------------------");
        while(bilangan_awal <= bilangan_akhir){
            System.out.println(bilangan_awal+",");
            bilangan_awal = 6;
        }
    }
}
