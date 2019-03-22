package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static boolean isConnected = false;
    private static Connection connection;

    public static Connection getConnection() {
        if (isConnected) {
            return connection;
        }
        return null;
    }

    public static Connection establishConnection() throws SQLException {
        String db = "everest";
        String url = "jdbc:mysql://localhost:3306/";
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
        try {
            connection = DriverManager.getConnection(url + db + unicode, "test", "test");
            isConnected = true;
        } catch (SQLException exception) {
            isConnected = false;
            throw exception;
        }
        return connection;
    }
}
