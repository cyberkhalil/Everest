package books;

import static db.DBConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUtil {

    public static void createBook(String name, double price, int quantity, String isbn)
            throws SQLException {

        String query = "insert into book(book_name,book_price,book_quantity,"
                + "book_isbn) values(?,?,?,?)";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.setInt(3, quantity);
        ps.setString(4, isbn);
        ps.executeUpdate();
    }

    public static void createBook(String name, double price, int quantity) throws SQLException {

        String query = "insert into book(book_name,book_price,book_quantity)"
                + " values(?,?,?)";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.setInt(3, quantity);
        ps.executeUpdate();
    }

    public static ResultSet getBooks() throws SQLException {
        String query = "Select * from book";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getBooksFormated() throws SQLException {
        String query = "Select CONCAT(book_id) as 'Book Id',"
                + "CONCAT(book_name) as 'Book Name',"
                + "CONCAT(book_price) as 'Price',"
                + "CONCAT(book_quantity) as 'Quantity',"
                + "(select SUM(sb.book_quantity) from student_books sb "
                + "where sb.book_id=b.book_id) as 'Sold',"
                + "CONCAT(b.book_isbn) as 'ISBN' "
                + "from book b";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getBooksId() throws SQLException {
        String query = "Select book_id from book";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getBooksIdAndName() throws SQLException {
        String query = "Select CONCAT('(',book_id,') ',book_name) AS book_id_and_name from book";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getSoldOutBooksFormated() throws SQLException {
        String query = "Select CONCAT('(',b.book_id,') ',b.book_name) as 'Book',"
                + "CONCAT(sb.book_quantity) as 'Quantity',"
                + "CONCAT('(',s.student_id,') ',s.student_name) as 'Student',"
                + "CONCAT(sb.buy_date) as 'Date' "
                + "from student_books sb,book b,student s "
                + "where b.book_id = sb.book_id and s.student_id= sb.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getSoldOutBooks() throws SQLException {
        String query = "Select b.book_name,sb.book_quantity,s.student_name,sb.buy_date "
                + "from student_books sb,book b,student s "
                + "where b.book_id = sb.book_id and s.student_id= sb.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static int getAvailableBooks(int bookId) throws SQLException {
        Book b = new Book(bookId);
        return b.getQuantity() - b.getSold();
    }
}
