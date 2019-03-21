
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connection = null;

    public static Connection establishConnection() {
        String db = "everest";
        String url = "jdbc:mysql://localhost:3306/";
//        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
        try {
            connection = DriverManager.getConnection(url + db, "test", "test");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return connection;
    }
}
