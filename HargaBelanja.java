import java.util.Scanner;

public class HargaBelanja {
   public static void main(String[] args) {
        
      double diskon;
      int harga_barang;
      int total_barang;
      int total_harga;

      Scanner scan_aja = new Scanner(System.in);

      System.out.println("Selamat datang di program menghitung harga diskon: ");

      System.out.println("Inputkan harga Barang: ");
      harga_barang = scan_aja.nextInt();

      System.out.println("total barangnya berapa: ");
      total_barang = scan_aja.nextInt();

      total_harga = harga_barang * total_barang;

      System.out.println("Total harga adalah "+ total_harga);

      System.out.println("Inputkan Diskon: ");
      diskon = scan_aja.nextDouble();
      diskon = diskon / 100 * total_harga;

      double harga_akhir = total_harga - diskon;

      System.out.println("Harga total barang akhir adalah: "+harga_akhir);




   
   }
}
