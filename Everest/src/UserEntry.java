
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserEntry {

    Student s = new Student();

    public void userEntry() {
    }

    public String createUser(User u, String str1, String str2, String Str3) {
        try {
            Connection connect = DBConnection.getConnection();
            String query = " insert into user (Username,Password,Privilege)"
                    + " values (?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, u.getUsername());
            preparedStmt.setString(2, u.getPassword());
            preparedStmt.setString(3, Str3);
            preparedStmt.execute();
            return "Successfully Data Insert";
        } catch (SQLException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            return " Data Insert Fail";
        }
    }

    public void createStudent(Student s, String name, int ID, int phone, String paymentMethod, double paid, double totalprice, double discount, double net) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = " insert into Student(StdName,IDCardNum,StdPhoneNum,paymentMethod,AddedBy,discount)"
                    + " values (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, s.getName());
            preparedStmt.setInt(2, ID);
            preparedStmt.setInt(3, s.getPhoneNumber());
            preparedStmt.setString(4, s.getPaymentMethod());
            preparedStmt.setString(5, Login.CurrentUser);
            preparedStmt.setDouble(6, s.getDiscount());
            preparedStmt.execute();

            String query2 = "select Max(StdID)as stdId from student";
            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
            ResultSet rs = preparedStmt2.executeQuery();
            int StdID = 0;
            while (rs.next()) {
                StdID = rs.getInt("stdId");
            }
            double remaindCash = paid - StudentJFrame.net;
            String query3 = " insert into invoice(StdId_fk,TotalPrice,paymentValue,Net,remaindCash)"
                    + " values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query3);
            ps.setInt(1, StdID);
            ps.setDouble(2, StudentJFrame.totalprice);
            ps.setDouble(3, paid);
            ps.setDouble(4, net);
            ps.setDouble(5, remaindCash);
            ps.execute();

            String query4 = " insert into payments(StdId_fk,paymentValue,remaindCash,Net)"
                    + " values (?,?,?,?)";
            PreparedStatement ps2 = conn.prepareStatement(query4);
            ps2.setInt(1, StdID);
            ps2.setDouble(2, paid);
            ps2.setDouble(3, remaindCash);
            ps2.setDouble(4, net);
            ps2.execute();

        } catch (SQLException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public int getItemID(String item, int std) {
        int id = 0;
        Connection conn = DBConnection.getConnection();
        try {
            switch (item) {
                case "Book": {
                    String query1 = "select BookId from book where student_id_fk = ?";
                    PreparedStatement ps = conn.prepareStatement(query1);
                    ps.setInt(1, std);
                    ResultSet rs = ps.executeQuery();
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "No data found");
                    }
                    while (rs.next()) {
                        id = rs.getInt("BookId");
                    }
                    break;
                }
                case "Course": {
                    String query1 = "select course_id_fk from student_course where student_id_fk = ?";
                    PreparedStatement ps = conn.prepareStatement(query1);
                    ps.setInt(1, std);
                    ResultSet rs = ps.executeQuery();
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "No data found");
                    }
                    while (rs.next()) {
                        id = rs.getInt("course_id_fk");
                    }
                    break;
                }
                case "Exam": {
                    String query1 = "select Exam_ID from student_exam where Std_ID = ?";
                    PreparedStatement ps = conn.prepareStatement(query1);
                    ps.setInt(1, std);
                    ResultSet rs = ps.executeQuery();
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "No data found");
                    }
                    while (rs.next()) {
                        id = rs.getInt("Exam_ID");
                    }
                    break;
                }
                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int getMaxPaymentID() {
        int paymentID = 0;
        Connection conn = DBConnection.getConnection();
        try {
            String query1 = "select max(PaymentNo)as id from payments";
            PreparedStatement ps = conn.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                paymentID = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paymentID;
    }

    public void addItem(String Item, int ItemID) {
        ItemID = 0;
        Connection conn = DBConnection.getConnection();
        int paymentID = this.getMaxPaymentID();
        try {
            String query2 = "insert into payment_item (PaymentID,Item,ItemID) values (?,?,?)";
            PreparedStatement ps2 = conn.prepareStatement(query2);
            ps2.setInt(1, paymentID);
            ps2.setString(2, Item);
            ps2.setInt(3, ItemID);
            ps2.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void createBook(Book b) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = " insert into book (BookId,BookName,price)"
                    + " values (?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, b.getBookId());
            preparedStmt.setString(2, b.getBookName());
            preparedStmt.setDouble(3, b.getPrice());
            // execute the preparedstatement
            preparedStmt.execute();
            //return "Successfully Data Insert";
        } catch (SQLException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            //return " Data Insert Fail";
        }
    }

    public String addToStudentCourse(int str1, int str3) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = " insert into student_course (student_id_fk,course_id_fk)"
                    + " values (?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, str3);
            preparedStmt.setInt(2, str1);
            // execute the preparedstatement
            preparedStmt.execute();
            return "Successfully Data Insertion";

        } catch (SQLException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            return " Data Insert Failed";
        }
    }
}
