package db;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static utils.IO_Util.readFile;

public final class DbUtil {

    private static final File SCHEMA_FILE = new File(new DbUtil().getClass()
            .getResource("everest.sql").getFile());
    private static Connection conn;

    private DbUtil() {
    }

    public static boolean checkSchema() throws SQLException {
        String query = "Select SCHEMA_NAME From INFORMATION_SCHEMA.SCHEMATA"
                + " WHERE SCHEMA_NAME = 'Everest'";
        conn = DriverManager.getConnection("jdbc:mysql://localhost?"
                + "useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "mysql");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            if (rs.getString("SCHEMA_NAME").equalsIgnoreCase("Everest")) {
                return true;
            }
        }
        return false;
    }

    public static void applySchema() throws IOException, SQLException {
        String universityDB = readFile(SCHEMA_FILE.toString(), StandardCharsets.UTF_8);

        for (String line : universityDB.split(";")) {
            if (line.isEmpty()) {
                continue;
            }
            PreparedStatement statment = conn.prepareStatement(line);
            try {
                statment.executeUpdate();
            } catch (SQLException ex) {
                if ("42000".equals(ex.getSQLState())) // dropping non exist table .. 
                {
                    continue;
                }
                System.out.println(line);
                throw ex;
            }
        }
    }

    public static String[] resultSetToSigleColoumnArray(ResultSet rs) throws SQLException {
        ArrayList<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            arrayList.add(rs.getString(1));
        }
        return arrayList.toArray(new String[1]);
    }
}
