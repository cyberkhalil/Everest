package run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DbUtil {

    private static Connection conn;

    private DbUtil() {
    }

    public static Connection establishConnection() throws SQLException {
        String db = "everest";
        String url = "jdbc:mysql://localhost:3306/";
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
        String time = "&useLegacyDatetimeCode=false&serverTimezone=America/New_York";

        try {
            conn = DriverManager.getConnection(url + db + unicode + time, "test", "test");
        } catch (SQLException exception) {
            throw exception;
        }
        return conn;
    }

    public static double getSchemaVersion() throws SQLException {
        if (conn == null) {
            conn = establishConnection();
        }
        String query = "Select version from version";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        double version = rs.getDouble("version");
        return version;
    }

}
