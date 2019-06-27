package books;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUtil {

    public static void createBook(
            String name, double price, int quantity, String isbn)
            throws SQLException {

        String query = "insert into book(book_name,book_price,book_quantity,"
                + "book_isbn) values(?,?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, price);
        preparedStatement.setInt(3, quantity);
        preparedStatement.setString(4, isbn);
        preparedStatement.executeUpdate();
    }

    public static void createBook(String name, double price, int quantity)
            throws SQLException {

        String query = "insert into book(book_name,book_price,book_quantity)"
                + " values(?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, price);
        preparedStatement.setInt(3, quantity);
        preparedStatement.executeUpdate();
    }

    public static ResultSet getBooks() throws SQLException {
        String query = "Select * from book";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getBooksId() throws SQLException {
        String query = "Select book_id from book";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getSoldOutBooks() throws SQLException {
        String query = "Select b.book_name,sb.book_quantity,s.student_name"
                + " from student_books sb,book b,student s"
                + " where b.book_id = sb.book_id"
                + " and s.student_id= sb.student_id";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
