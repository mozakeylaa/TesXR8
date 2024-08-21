
import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        int jam_kerja;
        int Tarif_Per_Jam;
        double bruto;
        double netto;
        double pembagi = 10;
        double Hasil_Akhir;
        Scanner scan_aja = new Scanner(System.in);

        System.out.println("Berapa Lama Jam Kerja: ");
        jam_kerja = scan_aja.nextInt();
        System.out.println("Tarif Per Jam Kerjanya");
        Tarif_Per_Jam = scan_aja.nextInt();
        bruto = jam_kerja * Tarif_Per_Jam;
        System.out.println("Bruto adalah"+ bruto);
        pembagi = pembagi/100;
        netto = bruto * pembagi;
        System.out.println(" Netto adalah "+ netto);
        Hasil_Akhir = bruto - netto;
        System.out.println(" Hasil Akhir adalah "+Hasil_Akhir);

    }
    
}