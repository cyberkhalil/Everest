package students;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {

    private final int id;
    private String name;
    private String phone;
    private int addedBy;

    public Student(int id) {
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

}
