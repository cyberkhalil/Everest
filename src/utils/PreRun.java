package utils;

import static db.DB_Util.applySchema;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static db.DB_Util.checkSchema;
import static db.DB_Util.checkSchemaVersion;
import java.net.URISyntaxException;
import java.net.URLConnection;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static db.DB_Util.runDB_UpdateScript;

public class PreRun {

    private static final String RUN_JAR = "Run.jar";
    private static final String EVEREST_PATH = "C:\\Everest\\";
    private static final String EVEREST_JAR_PATH = EVEREST_PATH + "Everest.jar";
    private static final String EVEREST_VERSION_PATH = EVEREST_PATH + "Version";

    public static void PreRunCheck() throws IOException, InterruptedException, SQLException,
            URISyntaxException {
        if (!new File(EVEREST_JAR_PATH).exists()) {
            final File runFile = new File(RUN_JAR);
            if (runFile.exists() && JOptionPane.showConfirmDialog(null, "Do you want to copy "
                    + "Everest app to C:\\Everest & create Desktop shortcut ?")
                    == JOptionPane.YES_OPTION) {
                final File jarFile = new File(PreRun.class.getProtectionDomain().getCodeSource()
                        .getLocation().toURI());
                final File CopyDist = new File(EVEREST_JAR_PATH);
                CopyDist.getParentFile().mkdir();
                Files.copy(jarFile.toPath(), CopyDist.toPath(), REPLACE_EXISTING);
                final File symbolic = new File(
                        System.getProperty("user.home") + "/Desktop/Everest.jar");
                Files.copy(runFile.toPath(), symbolic.toPath(), REPLACE_EXISTING);
            }
        } else {
            final File runFile = new File(RUN_JAR);
            final File symbolic = new File(
                    System.getProperty("user.home") + "/Desktop/Everest.jar");
            if (runFile.exists() && symbolic.exists()) {
                Files.copy(runFile.toPath(), symbolic.toPath(), REPLACE_EXISTING);
            }
        }

        if (!mysqlServiceExists()) {
            if (isInternetConnected()) {
                offer_install_mysql();
            } else {
                JOptionPane.showMessageDialog(null, "Internet Must be connected to continue using "
                        + "this program in a propper way.");
                System.exit(0);
            }
        } else {
            if (!mysqlServiceRunning()) {
                JOptionPane.showMessageDialog(null, "MySQL service isn't running,"
                        + " Please run it then press ok to start this program");
            }
            if (!checkSchema()) {
                if (JOptionPane.showConfirmDialog(null, "Everest database doesn't exist,"
                        + " Do you want to create it ?") == JOptionPane.YES_OPTION) {
                    applySchema();
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry but you can't use this program"
                            + " without creating everest database");
                }
                return;
            }
            if (!checkSchemaVersion(getEverestVersion())) {
                runDB_UpdateScript();
            }
        }
    }

    public static double getEverestVersion() throws NumberFormatException {
        try {
            return Double.parseDouble(IO_Util.readFile(EVEREST_VERSION_PATH));
        } catch (IOException ex) {
            return -1;
        }
    }

    private static boolean mysqlServiceExists() throws IOException {
        Process p = Runtime.getRuntime().exec("sc query");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().startsWith("SERVICE_NAME: MySQL")) {
                return true;
            }
        }
        return false;
    }

    private static boolean mysqlServiceRunning() throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("sc query");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = reader.readLine().trim()) != null) {
            if (line.startsWith("SERVICE_NAME: MySQL")) {
                while (!(line = reader.readLine().trim()).equals("")) {
                    if (line.startsWith("STATE")) {
                        switch (line.substring(line.indexOf(":") + 1, line.indexOf(":") + 4)
                                .trim()) {
                            case "1":
                                break;
                            case "2":
                                Thread.currentThread().wait(10000);
                                return mysqlServiceRunning();
                            case "3":
                                break;
                            case "4":
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void offer_install_mysql() throws MalformedURLException, IOException {
        JOptionPane.showMessageDialog(
                null,
                "You don't have mysql on your system ! \n"
                + " To run this program you have to provide a connection "
                + "to mysql database or install mysql service");

        int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                "MySQL is required to use this program \n"
                + " Do you agree to install MySQL ?",
                "MySQL Installion Request",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, //Icon icon,
                new Object[]{"Yes", "No"},
                "Yes");
        if (choice == 0) {
            download_mysql();
        } else {
            System.exit(0);
        }
    }

    private static void download_mysql() throws MalformedURLException, IOException {
        final String link = "https://dev.mysql.com/get/Downloads/"
                + "MySQLInstaller/mysql-installer-community-8.0.15.0.msi";
        new Thread(() -> {
            JOptionPane.showMessageDialog(null, "Wait until mysql downloading finish ..");
        }).start();
        File dist = new File("C:\\MySQL\\mysql-installer-community-8.msi");
        dist.getParentFile().mkdir();
        if (IO_Util.saveUrl(dist.toString(), link, true)) {
            JOptionPane.showMessageDialog(null, "Go To C:\\MySQL and install mysql"
                    + "\n Use username : root and password : mysql");
        } else {
            JOptionPane.showMessageDialog(null, "Error in downloading MySql");
        }
    }

    private static boolean isInternetConnected() {
        try {
            final URL url = new URL("https://www.facebook.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
