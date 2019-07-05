package courses;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class CourseUtil {

    private CourseUtil() {
    }

    public static ResultSet getCoursesFormated() throws SQLException {
        String query = "Select CONCAT(c.course_id) as 'Course Id',"
                + "CONCAT(c.course_name) as 'Course Name',"
                + "CONCAT(c.course_start_date) as 'Course Start Date',"
                + "CONCAT(c.course_end_date) as 'Course End Date',"
                + "CONCAT(c.course_price) as 'Course Price',"
                + "CONCAT(c.course_time_hour_from) as 'Course Time From',"
                + "CONCAT(c.course_time_hour_to) as 'Course Time Hour To',"
                + "CONCAT(c.course_days) as 'Course Days',"
                + "CONCAT(tc.teacher_name) as 'Course Teacher' "
                + "from course c LEFT JOIN "
                + "(select t.teacher_name,tc.course_id from teacher t,teacher_courses tc "
                + "where t.teacher_id=tc.teacher_id) tc on tc.course_id=c.course_id";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
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
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDate(2, startDate);
        preparedStatement.setDate(3, endDate);
        preparedStatement.setDouble(4, price);
        preparedStatement.setString(5, timeHourFrom);
        preparedStatement.setString(6, timeHourTo);
        preparedStatement.setString(7, days);
        preparedStatement.executeUpdate();
    }

    public static Course createCourser(String name, Date startDate, Date endDate, double price,
            String timeHourFrom, String timeHourTo, String days) throws SQLException {
        String query = "insert into course(course_name,course_start_date,"
                + "course_end_date,course_price,course_time_hour_from,"
                + "course_time_hour_to,course_days)"
                + " values(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDate(2, startDate);
        preparedStatement.setDate(3, endDate);
        preparedStatement.setDouble(4, price);
        preparedStatement.setString(5, timeHourFrom);
        preparedStatement.setString(6, timeHourTo);
        preparedStatement.setString(7, days);
        preparedStatement.executeUpdate();
        
        startDate.setTime(startDate.getTime() - 86_400_000);
        endDate.setTime(endDate.getTime() - 86_400_000);
        query = "select * from course where "
                + "course_name='" + name + "' and "
                + "course_start_date='" + startDate.toString() + "' and "
                + "course_end_date='" + endDate.toString() + "' and "
                + "course_price=" + price;
        preparedStatement = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        Course c;
        rs.next();
        c = new Course(rs.getInt("course_id"));
        return c;
    }
}
