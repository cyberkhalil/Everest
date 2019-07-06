package students;

import books.Book;
import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

    private final int id;
    private String name;
    private String phone;
    private int addedBy;

    public Student(int id) throws SQLException {
        String query = "Select * from student where student_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.name = rs.getString("student_name");
        this.phone = rs.getString("student_phone");
        this.addedBy = rs.getInt("student_added_by");
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAddedBy() {
        return addedBy;
    }

    public void setName(String name) throws SQLException {
        String query = "Update student set student_name=? where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.name = name;
    }

    public void setPhone(String phone) throws SQLException {
        String query = "Update student set student_phone=? where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, phone);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.phone = phone;
    }

    public void setAddedBy(int addBy) throws SQLException {
        String query = "Update student set student_added_by=? where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, addBy);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();

        this.addedBy = addBy;
    }

    public void delete() throws SQLException {
        String query = "Delete from student where student_id=?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.name = null;
        this.addedBy = -1;
        this.phone = null;
    }

    public void enrollToCourse(int courseId) throws SQLException {
        String query = "Insert into student_courses values(?,?)";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, courseId);
        preparedStatement.executeUpdate();
    }

    public ResultSet getBooksNameAndQuantity() throws SQLException {
        String query = "Select b.book_name,sb.book_quantity from student_books sb , book b"
                + " where sb.student_id=? and b.book_id=sb.book_id";

        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public ResultSet getBooksId() throws SQLException {
        String query = "Select book_id from student_books where student_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public ResultSet getCoursesIdAndName() throws SQLException {
        String query = "Select CONCAT('(',c.course_id,') ',c.course_name) as 'Courses' "
                + "from student_courses sc,course c "
                + "where sc.student_id=? and sc.course_id=c.course_id";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public void buyBook(int bookId) throws SQLException {
        buyBook(bookId, 1);
    }

    public void buyBook(int bookId, int quanitity) throws SQLException {
        if (!hasBook(bookId)) {
            String query = "Insert into student_books values(?,?,?)";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, bookId);
            ps.setInt(3, quanitity);
            ps.executeUpdate();
        } else {
            int old_quantity = bookQuantity(bookId);
            int new_quanitity = old_quantity + quanitity;
            String query = "Update student_books set book_quantity=? "
                    + "where student_id=? and book_id=?";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
            ps.setInt(1, new_quanitity);
            ps.setInt(2, id);
            ps.setInt(3, bookId);
            ps.executeUpdate();
        }
    }

    public void addToExam(int examId) throws SQLException {
        String query = "Insert into student_exams values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, examId);
        preparedStatement.executeUpdate();
    }

    public ResultSet getExamsId() throws SQLException {
        String query = "Select exam_name from student_exams where student_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public ResultSet getExamsName() throws SQLException {
        String query = "Select e.exam_name from student_exams se,exam e where se.student_id=? and "
                + "se.exam_id=e.exam_id";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public void removeFromCourse(int courseId) throws SQLException {
        String query = "Delete from student_courses where student_id=? and course_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, courseId);
        preparedStatement.executeUpdate();
    }

    public void removeFromExam(int examId) throws SQLException {
        String query = "Delete from student_exams where student_id=? and exam_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, examId);
        preparedStatement.executeUpdate();
    }

    public void removeFromBook(int bookId) throws SQLException {
        String query = "Delete from student_books where student_id=? and book_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, bookId);
        preparedStatement.executeUpdate();
    }

    public ResultSet getBalance() throws SQLException {
        String query = "Select * from students_financial where student_id=?";
        PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public boolean hasBook(int bookId) throws SQLException {
        ResultSet rs = getBooksId();
        while (rs.next()) {
            if (rs.getInt("book_id") == bookId) {
                return true;
            }
        }
        return false;
    }

    public int bookQuantity(int bookId) throws SQLException {
        String query = "Select * from student_books where student_id=? and book_id=?";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, bookId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt("book_quantity");
    }

}
