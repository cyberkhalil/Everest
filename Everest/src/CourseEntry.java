
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CourseEntry {

    static userEntry e = new userEntry();
    static Student std = new Student();
    static getDate date = new getDate();

    public static void createCourse(Course c, String CourseName, String CourseDay1,
            String CourseDay2, String CourseDay3, double CoursePrice, int CourseStartDay, int CourseStartMonth,
            int CourseStartYear, int CourseEndDay, int CourseEndMonth, int CourseEndYear, String CourseStartHour,
            String CourseEndHour, double ExamCost) {

        String CourseDays = CourseDay1 + "," + CourseDay2 + "," + CourseDay3;
        String startDate = date.getDate(CourseStartDay, CourseStartMonth, CourseStartYear);
        String endDate = date.getDate(CourseEndDay, CourseEndMonth, CourseEndYear);
        try {
            //---------
            //Connection conn = null;
            Connection doConnection = login.getConnection();

            String query = " insert into course (CourseName,CourseDateStart,CoursePrice,"
                    + "CourseDays,HourFrom ,HourTo,CourseDateEnd)"
                    + " values (?,?,?,?,?,?,?)";
            // create the mysql insert preparedstatement

            PreparedStatement preparedStmt1 = doConnection.prepareStatement(query);
            preparedStmt1.setString(1, c.getCourseName());
            preparedStmt1.setString(2, startDate);
            preparedStmt1.setDouble(3, c.getCoursePrice());
            preparedStmt1.setString(4, CourseDays);
            preparedStmt1.setString(5, c.getHourFrom());
            preparedStmt1.setString(6, c.getHourTo());
            preparedStmt1.setString(7, endDate);
            preparedStmt1.execute();
            CourseEntry.createExam(CourseName, ExamCost);
            JOptionPane.showMessageDialog(null, "Course has been added sucessfully");
            //---------------
            // return "Successfully Data Insert";
        } catch (SQLException | HeadlessException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            //  return ex;
        }
    }

    public static void createExam(String ExamName, double ExamPrice) {
        try {
            Connection doConnection = login.getConnection();
            String query = " insert into exam (ExamName,ExamPrice) values (?,?)";
            PreparedStatement preparedStmt1 = doConnection.prepareStatement(query);
            preparedStmt1.setString(1, ExamName);
            preparedStmt1.setDouble(2, ExamPrice);
            preparedStmt1.execute();
        } catch (SQLException | HeadlessException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

}
