package db;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static utils.IO_Util.readStream;

public final class DB_Util {

    private static final InputStream SCHEMA_FILE = new DB_Util().getClass()
            .getResourceAsStream("everest.sql");
    private static Connection conn;

    private DB_Util() {
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
                conn = DBConnection.establishConnection();
                return true;
            }
        }
        return false;
    }

    public static boolean checkSchemaVersion(double version) throws SQLException {
        String query = "Select version from version";
        Statement statement = conn.createStatement();
        try {
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            return rs.getDouble("version") >= version;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1146) {
                return false;
            } else {
                throw ex;
            }
        }
    }

    public static double getSchemaVersion() throws SQLException {
        String query = "Select version from version";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        double version = rs.getDouble("version");
        return version;
    }

    public static void runDB_UpdateScript() throws SQLException, IOException {
        String universityDB = readStream(DBConnection.class.getResourceAsStream("updates.sql"),
                StandardCharsets.UTF_8);

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
                throw ex;
            }
        }
    }

    public static void applySchema() throws IOException, SQLException {
        String universityDB = readStream(SCHEMA_FILE, StandardCharsets.UTF_8);

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
