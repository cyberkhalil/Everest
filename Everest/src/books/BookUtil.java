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

    public static Book createBook(String name, double price, int quantity)
            throws SQLException {

        String query = "insert into book(book_name,book_price,book_quantity)"
                + " values(?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, price);
        preparedStatement.setInt(3, quantity);
        preparedStatement.executeUpdate();

        query = "select max(book_id) from book";
        preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        return new Book(rs.getInt("max(book_id)"), name, price, quantity, null);
    }

    public static ResultSet getBooks() throws SQLException {
        String query = "Select * from book";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
