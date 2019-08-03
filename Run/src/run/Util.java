package run;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Util {

    private static Connection conn;
    private static final String JUST_PASTE_IT_URL = "https://justpaste.it/4l27h";
    private static final String EVEREST_JAR_PATH = "C:\\Everest\\Everest.jar";

    public static void prerun_check() throws Exception {
        if (isInternetConnected()) {
            if (!isLastRelease()) {
                if (JOptionPane.showConfirmDialog(null, "Everest has new version, do you want "
                        + "to Download it ?") == JOptionPane.YES_OPTION) {
                    updateJar();
                }
            }
        }
    }

    private static void updateJar() throws IOException {
        String page = getHTML(JUST_PASTE_IT_URL);
        String allVersions = page.substring(
                page.indexOf("Everest Program"), page.indexOf("End Versions!"));
        String lastVersionToEnd = allVersions.substring(allVersions.indexOf("lastVersion"));
        String lastVersion = lastVersionToEnd.substring(0, lastVersionToEnd.indexOf("]"));
        String lastVersionUrlToEnd = lastVersion.substring(lastVersion.indexOf("https"));
        new Thread(() -> {
            JOptionPane.showMessageDialog(null, "Wait until Everest downloading finish ..");
        }).start();
        if (downloadEverest(lastVersionUrlToEnd)) {
            downloadRun(lastVersionUrlToEnd);
        }
    }

    private static boolean downloadEverest(String lastVersionUrlToEnd)
            throws IOException, MalformedURLException {
        String jarLink;
        try {
            jarLink = lastVersionUrlToEnd.substring(0, lastVersionUrlToEnd.indexOf("}"));
        } catch (Exception ex)// Not just IO
        {
            System.out.println(ex);
            return false;
        }
        File jarDist = new File(EVEREST_JAR_PATH);
        jarDist.getParentFile().mkdir();
        saveUrl(jarDist.toString(), jarLink, true);
        return true;
    }

    private static boolean downloadRun(String lastVersionUrlToEnd)
            throws IOException, MalformedURLException {
        String runLink;
        try {
            String temp = lastVersionUrlToEnd.substring(lastVersionUrlToEnd.indexOf("run:") + 4);
            runLink = temp.substring(0, temp.indexOf("}"));
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
        File runDist = new File("C:\\Everest\\Run.jar");
        runDist.getParentFile().mkdir();
        saveUrl(runDist.toString(), runLink, true);
        return true;
    }

    private static boolean isLastRelease() throws SQLException, IOException {
        String page = getHTML(JUST_PASTE_IT_URL);
        String allVersions = page.substring(
                page.indexOf("Everest Program"), page.indexOf("End Versions!"));
        return allVersions.contains("Last Version : " + getSchemaVersion());
    }

    private static boolean isInternetConnected() {
        try {
            final URL url = new URL("https://www.facebook.com");
            final URLConnection urlConn = url.openConnection();
            urlConn.connect();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public static String getHTML(String urlToRead) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
        httpUrlConn.setRequestMethod("GET");
        httpUrlConn.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream()))) {
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

    public static DisplayProgressBar displayProgressBar(String title, String labelTxt,
            UpdateProgressBarOperation upbo) {
        // title = Everest Updater
        // labelTxt = Downloading File ..
        DisplayProgressBar frame = new DisplayProgressBar(title, labelTxt, upbo);
        frame.setVisible(true);
        return frame;
    }

    public static abstract interface UpdateProgressBarOperation {

        /**
         * @param progressBar
         * @param progressBarLabel
         * @return true to close or false to not close
         */
        abstract boolean updateBar(JProgressBar progressBar, JLabel progressBarLabel);
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

    public static void saveUrl(String filename, String urlString)
            throws MalformedURLException, IOException {
        saveUrl(filename, urlString, false);
    }

    public static void saveUrl(String filename, String urlString, boolean gui_mode)
            throws MalformedURLException, IOException {
        Download download = new Download(new URL(urlString), new File(filename));
        if (gui_mode) {
            displayProgressBar("Everest Downloader", "Downloading File" + filename + " ..",
                    (progressBar, progressBarLbl) -> {
                        switch (download.getStatus()) {
                            case 2:
                                progressBar.setValue(100);
                                progressBarLbl.setText("100%");
                                JOptionPane.showMessageDialog(null, "Download Completed");
                                return true;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Download Cancelled");
                                return true;
                            case 4:
                                System.out.println("Download Error");
                                return true;
                            default:
                                progressBar.setValue((int) download.getProgress());
                                progressBarLbl.setText(download.getProgress() + "%");
                                return false;
                        }
                    });
        }
    }
}
