public class Book {
    protected String title;
    protected int year;
    protected double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
        title = "";
        year = 0;
        price = 0.0;

    }

    public Book(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public void print() {
        System.out.println("Judul Buku" + title);
        System.out.println("Tahun Buku" + year);
        System.out.println("Harga Buku" + price);

    }
}
