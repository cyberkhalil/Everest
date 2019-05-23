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
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public static void createExam(
            String exam_name, double exam_price, Date exam_time)
            throws SQLException {

        String query = "insert into exam(exam_name,exam_price,exam_time)"
                + " values(?,?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, exam_name);
        preparedStatement.setDouble(2, exam_price);
        preparedStatement.setDate(3, exam_time);
        preparedStatement.executeUpdate();

    }
}
