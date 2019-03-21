
public class Book {

    private int BookId;
    private String BookName;
    private double price;
    //private double discount;

    public int getBookId() {
        return BookId;
    }

    public Book() {

    }

    public Book(int BookId, String BookName, double price) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.price = price;

    }

    public Book(int BookId, String BookName) {
        this.BookId = BookId;
        this.BookName = BookName;
    }

    public void setBookId(int BookId) {
        this.BookId = BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
