package run;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.URLConnection;
import static run.DbUtil.getSchemaVersion;

public class PreRun {

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

    private static boolean isLastRelease() throws SQLException, IOException {
        String page = getHTML("https://justpaste.it/4l27h");
        String allVersions = page.substring(
                page.indexOf("Everest Program"), page.indexOf("End Versions!"));
        return allVersions.contains("Last Version : " + getSchemaVersion());
    }

    private static void updateJar() throws IOException {
        String page = getHTML("https://justpaste.it/4l27h");
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

        JOptionPane.showMessageDialog(null, "Update Done Sucessfully !");
    }

    private static boolean downloadEverest(String lastVersionUrlToEnd) {
        try {
            String jarLink = lastVersionUrlToEnd.substring(0, lastVersionUrlToEnd.indexOf("}"));
            URL website = new URL(jarLink);
            File jarDist = new File("C:\\Everest\\Everest.jar");
            jarDist.getParentFile().mkdir();
            try (InputStream in = website.openStream()) {
                Files.copy(in, jarDist.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (Exception ex)// Not just IO
        {
            System.out.println(ex);
            return false;
        }
        return true;
    }

    private static boolean downloadRun(String lastVersionUrlToEnd) throws IOException, MalformedURLException {
        String runLink;
        try {
            String temp = lastVersionUrlToEnd.substring(lastVersionUrlToEnd.indexOf("run:") + 4);
            runLink = temp.substring(0, temp.indexOf("}"));
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
        URL website = new URL(runLink);
        File runDist = new File("C:\\Everest\\Run.jar");
        try (InputStream in = website.openStream()) {
            Files.copy(in, runDist.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        return true;
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

    public static String getHTML(String urlToRead) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
