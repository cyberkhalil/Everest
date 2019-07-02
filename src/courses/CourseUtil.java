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

    public static ResultSet getCoursesFormated() throws SQLException {
        String query = "Select CONCAT(course_id) as 'Course Id',"
                + "CONCAT(course_name) as 'Course Name',"
                + "CONCAT(course_start_date) as 'Course Start Date',"
                + "CONCAT(course_end_date) as 'Course End Date',"
                + "CONCAT(course_price) as 'Course Price',"
                + "CONCAT(course_time_hour_from) as 'Course Time From',"
                + "CONCAT(course_time_hour_to) as 'Course Time Hour To',"
                + "CONCAT(course_days) as 'Course Days' "
                + "from course";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getCoursesId() throws SQLException {
        String query = "Select course_id from course";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getCoursesIdAndName() throws SQLException {
        String query = "Select CONCAT('(',course_id,') ',course_name) from course";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static void createCourse(String name, Date startDate, Date endDate, double price,
            String timeHourFrom, String timeHourTo, String days) throws SQLException {
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
