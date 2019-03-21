
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Course {

    private String CourseDays;
    private String startDate;
    private String endDate;
    private String CourseName;
    private String CourseDay1;
    private String CourseDay2;
    private String CourseDay3;
    private double CoursePrice;
    private int CourseStartDay;
    private int CourseStartMonth;
    private int CourseStartYear;
    private int CourseEndDay;
    private int CourseEndMonth;
    private int CourseEndYear;
    private String CourseStartHour;
    private String CourseEndHour;
    private String TeacherName;
    private double examCost;
    private double Discount;

    public Course() {

    }

    public Course(int courseId,String CourseName, String startDate, String endDate, double CoursePrice, String CourseStartHour,
            String CourseEndHour, String CourseDays) {
        this.courseId=courseId;
        this.CourseName=CourseName;
        this.startDate=startDate;
        this.endDate=endDate;
        this.CoursePrice=CoursePrice;
        this.CourseStartHour=CourseStartHour;
        this.CourseEndHour=CourseEndHour;
        this.CourseDays=CourseDays;
        //this.examCost=examCost;
      
    }

    getDate date = new getDate();
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseDay1() {
        return CourseDay1;
    }

    public void setCourseDay1(String CourseDay1) {
        this.CourseDay1 = CourseDay1;
    }

    public String getCourseDay2() {
        return CourseDay2;
    }

    public void setCourseDay2(String CourseDay2) {
        this.CourseDay2 = CourseDay2;
    }

    public double getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(double CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    public int getCourseStartDay() {
        return CourseStartDay;
    }

    public void setCourseStartDay(int CourseStartDay) {
        this.CourseStartDay = CourseStartDay;
    }

    public int getCourseStartMonth() {
        return CourseStartMonth;
    }

    public void setCourseStartMonth(int CourseStartMonth) {
        this.CourseStartMonth = CourseStartMonth;
    }

    public int getCourseStartYear() {
        return CourseStartYear;
    }

    public void setCourseStartYear(int CourseStartYear) {
        this.CourseStartYear = CourseStartYear;
    }

    public int getCourseEndDay() {
        return CourseEndDay;
    }

    public void setCourseEndDay(int CourseEndDay) {
        this.CourseEndDay = CourseEndDay;
    }

    public int getCourseEndMonth() {
        return CourseEndMonth;
    }

    public void setCourseEndMonth(int CourseEndMonth) {
        this.CourseEndMonth = CourseEndMonth;
    }

    public int getCourseEndYear() {
        return CourseEndYear;
    }

    public void setCourseEndYear(int CourseEndYear) {
        this.CourseEndYear = CourseEndYear;
    }

    public String getCourseStartHour() {
        return CourseStartHour;
    }

    public void setCourseStartHour(String CourseStartHour) {
        this.CourseStartHour = CourseStartHour;
    }

    public String getCourseEndHour() {
        return CourseEndHour;
    }

    public void setCourseEndHour(String CourseEndHour) {
        this.CourseEndHour = CourseEndHour;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    public String getHourFrom() {
        return HourFrom;
    }

    public void setHourFrom(String HourFrom) {
        this.HourFrom = HourFrom;
    }

    public String getHourTo() {
        return HourTo;
    }

    public void setHourTo(String HourTo) {
        this.HourTo = HourTo;
    }

    private String HourTo = this.getCourseEndHour();

    public String getCourseDays() {
        return CourseDays;
    }

    public void setCourseDays(String CourseDays) {
        this.CourseDays = CourseDays;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    private String HourFrom = this.getCourseStartHour();

    /**
     * @return the examCost
     */
    public double getExamCost() {
        return examCost;
    }

    public void setExamCost(double examCost) {
        this.examCost = examCost;
    }

    public String getCourseDay3() {
        return CourseDay3;
    }

    public void setCourseDay3(String CourseDay3) {
        this.CourseDay3 = CourseDay3;
    }

    public getDate getDate() {
        return date;
    }

    public void setDate(getDate date) {
        this.date = date;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }
    
}
