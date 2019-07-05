package teachers;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher {

    private final int id;
    private String name;
    private String phone;

    public Teacher(int id) throws SQLException {
        String query = "Select * from teacher where teacher_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.name = rs.getString("teacher_name");
        this.phone = rs.getString("teacher_phone");
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

    public void setName(String name) throws SQLException {
        String query = "Update teacher set teacher_name=? where teacher_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.name = name;
    }

    public void setPhone(String phone) throws SQLException {
        String query = "Update teacher set teacher_phone=? where teacher_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, phone);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.phone = phone;
    }

    public void delete() throws SQLException {
        String query = "Delete from teacher where teacher_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.name = null;
        this.phone = null;
    }

    public ResultSet getCoursesId() throws SQLException {
        String query = "Select course_id from teacher_courses where teacher_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public void enrollToCourse(int courseId) throws SQLException {
        String query = "Insert into teacher_courses values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, courseId);
        preparedStatement.executeUpdate();
    }

    public ResultSet getCoursesIdAndName() throws SQLException {
        String query = "Select CONCAT('(',c.course_id,') ',c.course_name) as '(Course Id) & Name' "
                + "from teacher_courses tc,course c "
                + "where tc.teacher_id=? and tc.course_id=c.course_id";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public void removeFromCourse(int courseId) throws SQLException {
        String query = "Delete from teacher_courses where teacher_id=? and course_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, courseId);
        preparedStatement.executeUpdate();
    }

    public ResultSet getCoursesFormated() throws SQLException {
        String query = "Select c.course_id,c.course_name from teacher_courses tc,course c "
                + "where tc.teacher_id=? and tc.course_id=c.course_id";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }
}
