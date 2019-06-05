package students;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

    private final int id;
    private String name;
    private String phone;
    private int addedBy;

    public Student(int id) throws SQLException {
        String query = "Select * from student where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.name = rs.getString("student_name");
        this.phone = rs.getString("student_phone");
        this.addedBy = rs.getInt("student_added_by");
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAddedBy() {
        return addedBy;
    }

    public void setName(String name) throws SQLException {
        String query = "Update student set student_name=? where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.name = name;
    }

    public void setPhone(String phone) throws SQLException {
        String query = "Update student set student_phone=? where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, phone);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.phone = phone;
    }

    public void setAddedBy(int addBy) throws SQLException {
        String query = "Update student set student_added_by=?"
                + " where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, addBy);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.addedBy = addBy;
    }

    public void delete() throws SQLException {
        String query = "Delete from student where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.name = null;
        this.addedBy = -1;
        this.phone = null;
    }

    /**
     * TODO 3 : implement this
     */
    public void addToCourse(int courseId) {

    }


    /*
     * TODO 8 : implement this
     */
    public ResultSet getBooks() {
        return null;
    }

    /*
     * TODO 9 : implement this
     */
    public ResultSet getCourses() {
        return null;
    }

    /*
     * TODO 10 : implement this
     */
    public void buyBook(int bookId) {
    }
}
