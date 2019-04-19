package users;

import db.DBConnection;
import utils.Hashing;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NoPermissionException;

/**
 *
 * @author User
 */
public final class UserUtil {

    private UserUtil() {
    }

    public static User getUser(User admin, String username)
            throws SQLException, NoPermissionException {
        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        return new User(username);
    }

    public static User getUser(User admin, int userId)
            throws SQLException, NoPermissionException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        return new User(userId);
    }

    public static void createUser(User admin, String newUsername, String newPassword,
            String newPrivilege) throws NoPermissionException, SQLException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        newPassword = Hashing.toMD5(newPassword);

        Connection connect = DBConnection.getConnection();
        String query = " insert into user (user_name,user_password,user_privilege)"
                + " values (?,?,?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = connect.prepareStatement(query);
        preparedStmt.setString(1, newUsername);
        preparedStmt.setString(2, newPassword);
        preparedStmt.setString(3, newPrivilege);
        preparedStmt.execute();
    }

    public static ResultSet getUsersId(User admin)
            throws SQLException, NoPermissionException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        String query = "select user_id from user ";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }

    public static ResultSet getUsersResultSet(User admin)
            throws SQLException, NoPermissionException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        String query = "select user_id,user_name,user_privilege from user ";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();

        return rs;
    }

    public static void deleteUser(User admin, User u)
            throws NoPermissionException, SQLException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        if (u.isAdmin() && UserUtil.getNumberOfAdminUsers(admin) == 1) {
            throw new NoPermissionException(
                    "You Can't delete the last Admin user");
        }
        String query = "delete from user where user_id=? ";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, u.getUserId());
        preparedStatement.executeUpdate();

    }

    public static int getNumberOfUsers(User admin)
            throws NoPermissionException, SQLException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        String query = "select count(*) from user";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();
        result.next();
        return result.getInt("count(*)");
    }

    public static int getNumberOfAdminUsers(User admin)
            throws NoPermissionException, SQLException {

        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }
        String query = "select count(*) from user where user_privilege=?";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, "Admin");
        ResultSet result = preparedStatement.executeQuery();
        result.next();
        return result.getInt("count(*)");
    }

    public static void setUserPrivilege(
            User admin, User user, String newPrivilege)
            throws NoPermissionException, SQLException {
        if (!admin.isAdmin()) {
            throw new NoPermissionException(
                    "You must be admin to do this operation");
        }

        String query = "Update user set user_privilege=? where user_id=? ";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, newPrivilege);
        preparedStatement.setInt(2, user.getUserId());
        preparedStatement.executeUpdate();
        user.setPrivilege(newPrivilege);
    }
}
