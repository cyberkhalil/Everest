package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class PreRun {

    public static void check_mysql() throws IOException, InterruptedException {
        // TODO make program run as an admin (maybe in the first time ..)
        if (!mysqlServiceExists()) {
            offer_install_mysql();
        } else {
            if (!mysqlServiceRunning()) {
                // TODO run mysql service
            }
        }
    }

    private static boolean mysqlServiceExists() throws IOException {
        Process p = Runtime.getRuntime().exec("sc query");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            if (line.trim().startsWith("SERVICE_NAME: mysql")) {
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
            if (line.startsWith("SERVICE_NAME: mysql")) {
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

    private static void offer_install_mysql() {
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
            System.out.println("Yes");
            // TODO install mysql
        } else {
            System.out.println("NO");
            // TODO stop
            System.exit(0);
        }
    }
}
