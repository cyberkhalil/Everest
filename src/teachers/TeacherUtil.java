package teachers;

import static db.DBConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class TeacherUtil {

    private TeacherUtil() {
    }

    public static void createTeacher(String name, String phone) throws SQLException {
        String query = "insert into teacher(teacher_name,teacher_phone) values(?,?)";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, phone);
        ps.executeUpdate();
    }

    public static ResultSet getTeachers() throws SQLException {
        String query = "Select * from teacher";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getTeachersIdAndName() throws SQLException {
        String query = "Select CONCAT('(',teacher_id,') ',teacher_name) from teacher";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

    public static ResultSet getTeachersFormated() throws SQLException {
        String query = "Select CONCAT(t.teacher_id) as 'Teacher Id',"
                + "CONCAT(t.teacher_name) as 'Teacher Name',"
                + "CONCAT(t.teacher_phone) as 'Teacher Phone',"
                + "SUM(tf.Money) as 'Balance',"
                + "(select COUNT(t.teacher_id) from teacher_courses tc "
                + "where t.teacher_id=tc.teacher_id) as 'Courses Number' "
                + "from teacher t,teachers_financials tf "
                + "where t.teacher_id=tf.teacher_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        return ps.executeQuery();
    }

}
