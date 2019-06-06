package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;

public class PreRun {

    public static void check_mysql() throws IOException, InterruptedException {
        if (!mysqlServiceExists()) {
            offer_install_mysql();
        } else {
            if (!mysqlServiceRunning()) {
                JOptionPane.showMessageDialog(null, "MySQL service isn't "
                        + "running , Please run it to start this program");
            }
            // TODO 26 : check user & schema & run schema sql if not exist
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
                        switch (line.substring(line.indexOf(":") + 1, line.indexOf(":") + 4).trim()) {
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

    private static void download_mysql()
            throws MalformedURLException, IOException {
        final String link = "https://dev.mysql.com/get/Downloads/"
                + "MySQLInstaller/mysql-installer-community-8.0.15.0.msi";
        JOptionPane.showMessageDialog(null, "Downloading MySQL..");
        URL website = new URL(link);
        File dist = new File("C:\\MySQL\\mysql-installer-community-8.msi");
        dist.getParentFile().mkdir();
        try (InputStream in = website.openStream()) {
            Files.copy(in, dist.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        JOptionPane.showMessageDialog(null, "Go To C:\\MySQL and install mysql"
                + "\n Use username : root and password : mysql");
    }
}
