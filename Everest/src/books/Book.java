package books;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {

    private final int id;
    private String name;
    private double price;
    private int quantity;
    private int sold;
    private String isbn;

    public Book(int bookID) throws SQLException {
        String query = "Select * from book where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, bookID);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.id = bookID;
        this.name = rs.getString("book_name");
        this.price = rs.getDouble("book_price");
        this.quantity = rs.getInt("book_quantity");
        this.sold = rs.getInt("book_sold");
        this.isbn = rs.getString("book_isbn");
    }

    Book(int ID, String name, double price, int quantity, String isbn) {
        this.id = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sold = 0;
        this.isbn = isbn;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws SQLException {
        String query = "Update book set book_name =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws SQLException {
        String query = "Update book set book_price =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDouble(1, price);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws SQLException {
        String query = "Update book set book_quantity =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, quantity);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) throws SQLException {
        String query = "Update book set book_sold =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, sold);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.sold = sold;
    }

    public void sell(int many) throws SQLException {

        String query = "Update book set book_sold =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        sold += many;
        try {
            preparedStatement.setInt(1, sold);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            sold -= many;
            throw ex;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) throws SQLException {
        String query = "Update book set book_isbn =? where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, isbn);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.isbn = isbn;
    }

    public void delete() throws SQLException {
        String query = "Delete from book where book_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.name = "";
        this.price = -1;
        this.quantity = -1;
        this.isbn = "";
        this.sold = -1;
    }

}
