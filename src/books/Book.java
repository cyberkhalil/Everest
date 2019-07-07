package books;

import static db.DBConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {

    private final int Id;
    private String name;
    private double price;
    private int quantity;
    private int sold;
    private String isbn;

    public Book(int bookID) throws SQLException {
        String query = "Select book_id,book_name,book_price,book_quantity,book_isbn,"
                + "(select SUM(sb.book_quantity) from student_books sb "
                + "where sb.book_id=b.book_id) as book_sold "
                + "from book b where b.book_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, bookID);
        ResultSet rs = ps.executeQuery();
        rs.next();
        this.Id = bookID;
        this.name = rs.getString("book_name");
        this.price = rs.getDouble("book_price");
        this.quantity = rs.getInt("book_quantity");
        this.sold = rs.getInt("book_sold");
        this.isbn = rs.getString("book_isbn");
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws SQLException {
        String query = "Update book set book_name =? where book_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws SQLException {
        String query = "Update book set book_price =? where book_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setDouble(1, price);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws SQLException {
        String query = "Update book set book_quantity =? where book_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, quantity);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void sell(int many) throws SQLException {

        String query = "Update book set book_sold =? where book_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        sold += many;
        try {
            ps.setInt(1, sold);
            ps.setInt(2, Id);
            ps.executeUpdate();
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
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, isbn);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.isbn = isbn;
    }

    public void delete() throws SQLException {
        String query = "Delete from book where book_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        ps.executeUpdate();
        this.name = null;
        this.price = -1;
        this.quantity = -1;
        this.isbn = null;
        this.sold = -1;
    }

    public ResultSet getSoldQuantity() throws SQLException {
        String query = "Select SUM(book_quantity) from student_books "
                + "where book_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

    public ResultSet getStudentsId() throws SQLException {
        String query = "Select student_id from student_books where book_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

    public ResultSet getStudentsIdAndName() throws SQLException {
        String query = "Select CONCAT('(',s.student_id,') ',s.student_name) "
                + "from student_books sb ,student s "
                + "where sb.book_id=? and s.student_id=sb.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

    public ResultSet getStudentsFormated() throws SQLException {
        String query = "Select CONCAT('(',s.student_id,') ',s.student_name) as 'Student',"
                + "CONCAT(sb.book_quantity) as 'Quantity Sold' "
                + "from student_books sb ,student s "
                + "where sb.book_id=? and s.student_id=sb.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }
}
