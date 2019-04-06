package exams;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam {

    private final int exam_id;
    private String exam_name;
    private double exam_price;
    private Date exam_time;

    public Exam(int exam_id) throws SQLException {
        String query = "Select * from exam where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, exam_id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        this.exam_name = rs.getString("exam_name");
        this.exam_price = rs.getDouble("exam_price");
        this.exam_id = exam_id;
        this.exam_time = rs.getDate("exam_time");

    }

    Exam(int exam_id, String exam_name, double exam_price, Date exam_time) {
        this.exam_id = exam_id;
        this.exam_name = exam_name;
        this.exam_price = exam_price;
        this.exam_time = exam_time;
    }

    public int getExam_id() {
        return exam_id;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String newExamName) throws SQLException {
        String query = "Update exam set exam_name =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, newExamName);
        preparedStatement.setInt(2, exam_id);
        preparedStatement.executeUpdate();
        this.exam_name = newExamName;
    }

    public double getExam_price() {
        return exam_price;
    }

    public void setExam_price(double newExamPrice) throws SQLException {
        String query = "Update exam set exam_price =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDouble(1, newExamPrice);
        preparedStatement.setInt(2, exam_id);
        preparedStatement.executeUpdate();
        this.exam_price = newExamPrice;
    }

    public Date getExam_time() {
        return exam_time;
    }

    public void setExam_time(Date newExamTime) throws SQLException {
        String query = "Update exam set exam_time =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDate(1, newExamTime);
        preparedStatement.setInt(2, exam_id);
        preparedStatement.executeUpdate();
        this.exam_time = newExamTime;
    }

    public void delete() throws SQLException {
        String query = "Delete from exam where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, exam_id);
        preparedStatement.executeUpdate();
        this.exam_name = "";
        this.exam_price = -1;
        this.exam_time = new Date(0);
    }
}
