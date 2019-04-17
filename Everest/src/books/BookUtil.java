package books;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUtil {

    public static Book createBook(
            String name, double price, int quantity, String isbn)
            throws SQLException {

        String query = "select max(book_id) from exam";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        int newBookId = rs.getInt("max(book_id)") + 1;

        query = "insert into exam(book_id,book_name,book_price,book_quantity"
                + ",book_isbn) values(?,?,?,?)";
        preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, newBookId);
        preparedStatement.setString(2, name);
        preparedStatement.setDouble(3, price);
        preparedStatement.setInt(4, quantity);
        preparedStatement.setString(5, isbn);
        preparedStatement.executeUpdate();

        return new Book(newBookId, name, price, quantity, isbn);
    }

    public static ResultSet getBooks() throws SQLException {
        String query = "Select * from book";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
