package students;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUtil {

    public static void createStudent(String name, String phone, int addedBy) throws SQLException {
        String query = "Insert into student(student_name,student_phone,"
                + "student_added_by) values(?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, phone);
        preparedStatement.setInt(3, addedBy);
        preparedStatement.executeUpdate();
    }

    public static void createStudent(String name, String phone) throws SQLException {
        String query = "Insert into student(student_name,student_phone) values(?,?)";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, phone);
        ps.executeUpdate();
    }

    public static ResultSet getStudents() throws SQLException {
        String query = "Select * from student";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getStudentsFormated() throws SQLException {
        String query = "select CONCAT(s.student_id) as 'Student Id',"
                + "CONCAT(s.student_name) as 'Student Name',"
                + "CONCAT(s.student_phone) as 'Student Phone',"
                + "CONCAT(s.student_added_by) as 'Student Added By',"
                + "CONVERT(ifnull((select SUM(sf.Money) "
                + "from students_financials sf "
                + "where s.student_id=sf.student_id),'0') using utf8) as 'Balance' "
                + "from student s";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getStudentsId() throws SQLException {
        String query = "Select student_id from student";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getStudentsIdAndName() throws SQLException {
        String query = "Select CONCAT('(',student_id,') ',student_name) from student";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

}
