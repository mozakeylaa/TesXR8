public class DVD extends Product{
    int length;
    String rating;
    String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD(){
        super();
        length = 0;
        rating = "";
        studio = "";   
    }
    public DVD(int number, String name, int quantity, double price, int length, String rating, String studio){
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio; 
    }
}
