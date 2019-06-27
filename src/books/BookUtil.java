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

    /* TODO 31 : show book and and student name in BooksSoldOutDisplay */
    public static ResultSet getSoldOutBooks() throws SQLException {
        String query = "Select book_id,book_quantity,student_id from student_books";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
