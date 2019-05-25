package teachers;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class TeacherUtil {

    private TeacherUtil() {
    }

    public void createTeacher(String name, String phone) throws SQLException {

        String query = "insert into teacher(teacher_name,teacher_phone) "
                + "values(?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, phone);
        preparedStatement.executeUpdate();
    }

    public static ResultSet getTeachers() throws SQLException {
        String query = "Select * from teacher";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

}