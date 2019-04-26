package courses;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {

    private final int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private double price;
    private String timeHourFrom;
    private String timeHourTo;
    private String days;

    public Course(int id) throws SQLException {
        String query = "Select * from course where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.id = rs.getInt("course_id");
        this.name = rs.getString("course_name");
        this.startDate = rs.getDate("course_start_date");
        this.endDate = rs.getDate("course_end_date");
        this.price = rs.getDouble("course_price");
        this.timeHourFrom = rs.getString("course_time_hour_from");
        this.timeHourTo = rs.getString("course_time_hour_to");
        this.days = rs.getString("course_days");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
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

    public void setName(String name) throws SQLException {
        String query = "Update course set course_name =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.name = name;
    }

    public void setStartDate(Date startDate) throws SQLException {
        String query = "Update course set course_start_date =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDate(1, startDate);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) throws SQLException {
        String query = "Update course set course_end_date =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDate(1, endDate);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.endDate = endDate;
    }

    public void setPrice(double price) throws SQLException {
        String query = "Update course set course_price =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDouble(1, price);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.price = price;
    }

    public void setTimeHourFrom(String timeHourFrom) throws SQLException {
        String query = "Update course set course_time_hour_from =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, timeHourFrom);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.timeHourFrom = timeHourFrom;
    }

    public void setTimeHourTo(String timeHourTo) throws SQLException {
        String query = "Update course set course_time_hour_to =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, timeHourTo);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.timeHourTo = timeHourTo;
    }

    public void setDays(String days) throws SQLException {
        String query = "Update course set course_days =? where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, days);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.days = days;
    }

    public void delete() throws SQLException {
        String query = "Delete from course where course_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.days = null;
        this.endDate = null;
        this.name = null;
        this.startDate = null;
        this.timeHourFrom = null;
        this.timeHourTo = null;
        this.price = -1;
    }
}
