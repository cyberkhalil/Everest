package exams;

import static db.DBConnection.getConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam {

    private final int Id;
    private String name;
    private double price;
    private Date time;

    public Exam(int ID) throws SQLException {
        String query = "Select * from exam where exam_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setInt(1, ID);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.name = rs.getString("exam_name");
        this.price = rs.getDouble("exam_price");
        this.Id = ID;
        this.time = rs.getDate("exam_time");
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newExamName) throws SQLException {
        String query = "Update exam set exam_name =? where exam_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setString(1, newExamName);
        preparedStatement.setInt(2, Id);
        preparedStatement.executeUpdate();
        this.name = newExamName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newExamPrice) throws SQLException {
        String query = "Update exam set exam_price =? where exam_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setDouble(1, newExamPrice);
        preparedStatement.setInt(2, Id);
        preparedStatement.executeUpdate();
        this.price = newExamPrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date newExamTime) throws SQLException {
        String query = "Update exam set exam_time =? where exam_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setDate(1, newExamTime);
        preparedStatement.setInt(2, Id);
        preparedStatement.executeUpdate();
        this.time = newExamTime;
    }

    public void delete() throws SQLException {
        String query = "Delete from exam where exam_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setInt(1, Id);
        preparedStatement.executeUpdate();
        this.name = null;
        this.price = -1;
        this.time = null;
    }

    public ResultSet getStudentsId() throws SQLException {
        String query = "Select student_id from student_exams where exam_id=?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setInt(1, Id);
        return preparedStatement.executeQuery();
    }

    public ResultSet getStudentsIdAndName() throws SQLException {
        String query = "Select CONCAT('(',s.student_id,') ',s.student_name) "
                + "from student_exams se,student s "
                + "where s.student_id=se.student_id and se.exam_id=?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setInt(1, Id);
        return preparedStatement.executeQuery();
    }

    public ResultSet getStudentsFormated() throws SQLException {
        String query = "Select CONCAT('(',s.student_id,') ',s.student_name) AS 'Student' "
                + "from student_exams se,student s "
                + "where exam_id=? and s.student_id=se.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

    public ResultSet getStudentsName() throws SQLException {
        String query = "Select s.student_name from student_exams se,student s "
                + "where exam_id=? and s.student_id=se.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

}
