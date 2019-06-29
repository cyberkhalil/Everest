package students;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUtil {

    public static void createStudent(String name, String phone, int addedBy)
            throws SQLException {
        String query = "Insert into student(student_name,student_phone,"
                + "student_added_by) values(?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, phone);
        preparedStatement.setInt(3, addedBy);
        preparedStatement.executeUpdate();
    }

    public static void createStudent(String name, String phone)
            throws SQLException {
        String query = "Insert into student(student_name,student_phone)"
                + " values(?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, phone);
        preparedStatement.executeUpdate();
    }

    public static ResultSet getStudents() throws SQLException {
        String query = "Select * from student";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getStudentsId() throws SQLException {
        String query = "Select student_id from student";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getStudentsIdAlongWithName() throws SQLException {
        String query = "Select CONCAT('(',student_id,') ',student_name) from student";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

}
