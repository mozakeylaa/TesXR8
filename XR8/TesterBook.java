import java.util.Scanner;

public class TesterBook {
    public static void main(String[] args) {
        int pilihan;
        String pilihan2;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Jenis Buku: \n 1.Textbook \n 2.Novel");
        pilihan = input.nextInt();
        if (pilihan == 1) {
        System.out.println("Title: ");
        String title = input.next();
        System.out.println("Year: ");
        int year = input.nextInt();
        System.out.println("Price: ");
        double price = input.nextDouble(); 
        System.out.println("Subject: ");
        String subject = input.next();
        System.out.println("Apakah memilih Biografi? (Ya/Tidak)");
        pilihan2 = input.next();     
       
        switch (pilihan2) {
            case "Ya":
                System.out.println("About: ");
                String about = input.next();
                if(year < 2011){
                    System.out.println("diskon anda 50%");
                    price = price-(price*0.5);
                }else if(year >= 2011 && year < 2020){
                    System.out.println("diskon anda 20%");
                    price = price-(price*0.2);
                }
               Biografi bgrph= new Biografi(title,year,price,subject,about);
               bgrph.print();
            case ("Tidak"):
            if(year < 2011){
            System.out.println("diskon anda 50%");
            price = price-(price*0.5);
            }else if(year >= 2011 && year < 2020){
            System.out.println("diskon anda 20%");
            price = price-(price*0.2);
        }
            TextBook ssdk= new TextBook(title,year,price,subject);
            ssdk.print();
                break;
        
            default:
                break;
        }
        } else if (pilihan == 2) {
            System.out.println("Title: ");
            String title = input.next();
            System.out.println("Year: ");
            int year = input.nextInt();
            System.out.println("Price: ");
            double price = input.nextDouble(); 
            System.out.println("Genre: ");
            String genre = input.next();

            if(year < 2011){
                System.out.println("diskon anda 50%");
                price = price-(price*0.5);
            }else if(year >= 2011 && year < 2020){
                System.out.println("diskon anda 20%");
                price = price-(price*0.2);
            }
            
            Novel nvl= new Novel(title,year,price,genre);
            nvl.print();

}

}
}
