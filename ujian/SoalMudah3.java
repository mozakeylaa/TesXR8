package ujian;

public class SoalMudah3 {
   
        public static void main(String[] args) {
            printMessages(); // Memanggil fungsi utama untuk mencetak pesan
        }
    
        // Fungsi untuk mencetak pesan
        public static void printMessages() {
            for (int i = 50; i >= 2; i--) {   
                if (i % 3 == 0 && i % 2 != 0) {                            // Kondisi jika i habis dibagi 3, maka kondisi ini akan selalu dipenuhi
                    System.out.println(i + ". saya angkatan 33");
                } else if (i % 3 == 0) {                                  // Kondisi bilangan kelipatan 3
                    System.out.println(i + ". saya anak moklet");
                } else {                                                  // Kondisi lainnya
                    System.out.println(i + ". saya anak wikusama");
                }
            }
            
            System.out.println("1 . saya senang");
        }
    }

