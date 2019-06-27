package courses;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class CourseUtil {

    private CourseUtil() {
    }

    public static ResultSet getCourses() throws SQLException {
        String query = "Select * from course";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
    
    public static ResultSet getCoursesId() throws SQLException {
        String query = "Select course_id from course";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static void createCourse(String name, Date startDate, Date endDate,
            double price, String timeHourFrom, String timeHourTo, String days)
            throws SQLException {
        String query = "insert into course(course_name,course_start_date,"
                + "course_end_date,course_price,course_time_hour_from,"
                + "course_time_hour_to,course_days)"
                + " values(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDate(2, startDate);
        preparedStatement.setDate(3, endDate);
        preparedStatement.setDouble(4, price);
        preparedStatement.setString(5, timeHourFrom);
        preparedStatement.setString(6, timeHourTo);
        preparedStatement.setString(7, days);
        preparedStatement.executeUpdate();
    }
}
