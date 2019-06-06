package users;

import db.DBConnection;
import utils.Hashing;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.security.auth.login.LoginException;

public class User {

    private final int id;
    private String name;
    private String passwordMD5;
    private String privilege;

    public User(String username, String password)
            throws SQLException, LoginException {
        try {
            password = Hashing.toMD5(password);
            String query = "select * from user where user_name =? ";

            PreparedStatement preparedStatement
                    = DBConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();

            this.name = rs.getString("user_name");
            this.passwordMD5 = rs.getString("user_password");
            this.id = rs.getInt("user_id");
            this.privilege = rs.getString("user_privilege");
        } catch (SQLException ex) {
            // TODO 30: check static Strings and put in PublicStaticFinals util class
            if (ex.getMessage().equals("Illegal operation on empty result set.")) {
                throw new LoginException("Entered username is inncorrect !");
            } else {
                throw ex;
            }
        }

        if (password == null ? passwordMD5 != null
                : !password.equals(passwordMD5)) {
            throw new LoginException("Entered password is incorrect !");
        }
    }

    User(String username) throws SQLException {
        String query = "select * from user where user_name =? ";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, username);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        this.name = rs.getString("user_name");
        this.passwordMD5 = rs.getString("user_password");
        this.id = rs.getInt("user_id");
        this.privilege = rs.getString("user_privilege");
    }

    User(int userId) throws SQLException {
        String query = "select * from user where user_id =? ";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, userId);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();

        this.name = rs.getString("user_name");
        this.passwordMD5 = rs.getString("user_password");
        this.id = rs.getInt("user_id");
        this.privilege = rs.getString("user_privilege");
    }

    public String getUsername() {
        return name;
    }

    public String getPassword() {
        return passwordMD5;
    }

    public void setPassword(String password) throws SQLException {
        password = Hashing.toMD5(password);
        String query = "Update user set user_password =? where user_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, password);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.passwordMD5 = password;
    }

    /**
     * @return the userID
     */
    public int getUserId() {
        return id;
    }

    public String getPrivilege() {
        return privilege;
    }

    void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public void setUsername(String newUsername) throws SQLException {
        String query = "Update user set user_name =? where user_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, newUsername);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.name = newUsername;
    }

    public boolean isAdmin() {
        return "Admin".equals(privilege);
    }

    public void delete() throws SQLException {
        String query = "Delete user where user_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        this.passwordMD5 = null;
        this.privilege = null;
        this.name = null;
    }
}
