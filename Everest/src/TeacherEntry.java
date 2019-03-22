
import db.DBConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TeacherEntry {

    Teacher teacher = new Teacher();

    public String createTeacher(Teacher t, String str1, int int2, int int3) {
        try {
            //Connection conn = null;
            Connection connect = DBConnection.getConnection();
            String query = " insert into teacher (TeacherName,TeacherPhoneNumber)"
                    + " values (?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt;
            preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, str1);
            preparedStmt.setInt(2, int2);
            // execute the preparedstatement
            preparedStmt.execute();
            //------------------------
            String query2 = "select TeacherId from teacher where TeacherName = ?";
            PreparedStatement preparedStmt2;
            preparedStmt2 = connect.prepareStatement(query2);
            preparedStmt2.setString(1, str1);
            ResultSet rs = preparedStmt2.executeQuery();
            rs.next();
            int TeacherId = rs.getInt("TeacherId");
            //-----------
            String query3 = "update course SET Teacher_TeacherId = ? where CourseId = ?";
            PreparedStatement preparedStmt3 = connect.prepareStatement(query3);
            preparedStmt3.setInt(1, TeacherId);
            preparedStmt3.setInt(2, int3);
            preparedStmt3.executeUpdate();
            JOptionPane.showMessageDialog(null, "Teacher Has Been Added Sucessfully");
            return "Successfully Data Insert";
            //----------------------------------    
        } catch (HeadlessException | SQLException ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            return " Data Insert Fail";
        }

    }

}
