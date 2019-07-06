package exams;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class ExamUtil {

    private ExamUtil() {
    }

    public static ResultSet getExams() throws SQLException {
        String query = "Select * from exam";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getExamsId() throws SQLException {
        String query = "Select exam_id from exam";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static ResultSet getExamsFormated() throws SQLException {
        String query = "Select CONCAT(exam_id) as 'Exam Id',CONCAT(exam_name) as 'Exam Name',"
                + "CONCAT(exam_price) as 'Exam Price',CONCAT(exam_time) as 'Exam Time' from exam";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static void createExam(String exam_name, double exam_price, Date exam_time)
            throws SQLException {
        String query = "insert into exam(exam_name,exam_price,exam_time) values(?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, exam_name);
        preparedStatement.setDouble(2, exam_price);
        preparedStatement.setDate(3, exam_time);
        preparedStatement.executeUpdate();
    }

    public static ResultSet getExamsIdAndName() throws SQLException {
        String query = "Select CONCAT('(',exam_id,') ',exam_name) from exam";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
