package courses;

import static db.DBConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {

    private final int Id;
    private String name;
    private String status;
    private String startDate;
    private String endDate;
    private double price;
    private String timeHourFrom;
    private String timeHourTo;
    private String days;

    public Course(int ID) throws SQLException {
        String query = "Select * from course where course_id= ?";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setInt(1, ID);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.Id = rs.getInt("course_id");
        this.name = rs.getString("course_name");
        this.status = rs.getString("course_status");
        this.startDate = rs.getString("course_start_date");
        this.endDate = rs.getString("course_end_date");
        this.price = rs.getDouble("course_price");
        this.timeHourFrom = rs.getString("course_time_hour_from");
        this.timeHourTo = rs.getString("course_time_hour_to");
        this.days = rs.getString("course_days");
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    public String getTimeHourFrom() {
        return timeHourFrom;
    }

    public String getTimeHourTo() {
        return timeHourTo;
    }

    public String getDays() {
        return days;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws SQLException {
        String query = "Update course set course_status=? where course_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, status);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.status = status;
    }

    public void setName(String name) throws SQLException {
        String query = "Update course set course_name =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.name = name;
    }

    public void setStartDate(String startDate) throws SQLException {
        String query = "Update course set course_start_date =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, startDate);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) throws SQLException {
        String query = "Update course set course_end_date =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, endDate);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.endDate = endDate;
    }

    public void setPrice(double price) throws SQLException {
        String query = "Update course set course_price =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setDouble(1, price);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.price = price;
    }

    public void setTimeHourFrom(String timeHourFrom) throws SQLException {
        String query = "Update course set course_time_hour_from =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, timeHourFrom);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.timeHourFrom = timeHourFrom;
    }

    public void setTimeHourTo(String timeHourTo) throws SQLException {
        String query = "Update course set course_time_hour_to =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, timeHourTo);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.timeHourTo = timeHourTo;
    }

    public void setDays(String days) throws SQLException {
        String query = "Update course set course_days =? where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, days);
        ps.setInt(2, Id);
        ps.executeUpdate();
        this.days = days;
    }

    public void delete() throws SQLException {
        String query = "Delete from course where course_id= ?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        ps.executeUpdate();
        this.days = null;
        this.endDate = null;
        this.name = null;
        this.status = null;
        this.startDate = null;
        this.timeHourFrom = null;
        this.timeHourTo = null;
        this.price = -1;
    }

    public ResultSet getStudentsId() throws SQLException {
        String query = "Select student_id from student_courses where course_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }

    public ResultSet getStudentsFormated() throws SQLException {
        String query = "Select cs.course_id,s.student_id,s.student_name "
                + "from student_courses cs,student s "
                + "where course_id=? and s.student_id=cs.student_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, Id);
        return ps.executeQuery();
    }
}
