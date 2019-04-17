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

    public static Exam createExam(
            String exam_name, double exam_price, Date exam_time)
            throws SQLException {
        String query = "select max(exam_id) from exam";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        int newExamId = rs.getInt("max(exam_id)") + 1;

        query = "insert into exam(exam_id,exam_name,exam_price,exam_time)"
                + " values(?,?,?,?)";
        preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, newExamId);
        preparedStatement.setString(2, exam_name);
        preparedStatement.setDouble(3, exam_price);
        preparedStatement.setDate(4, exam_time);
        preparedStatement.executeUpdate();

        return new Exam(newExamId, exam_name, exam_price, exam_time);
    }
}
