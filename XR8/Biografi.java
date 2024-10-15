public class Biografi extends TextBook {
    String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    public Biografi(){
        super();
        about = "";
    }
    public Biografi(String title,int year, double price, String about, String subject){
        super(title, year, price, subject);
        this.about = about;
    }
    public void print(){
        super.print();
        System.out.println("about: " +about);
}
}

























