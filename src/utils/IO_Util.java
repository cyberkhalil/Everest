package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import utils.gui.DisplayProgressBar;
import static utils.gui.GUI_Util.displayProgressBar;

public final class IO_Util {

    private IO_Util() {
    }

    public static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(file.toString()));
        return new String(encoded, encoding);
    }

    public static void writeFile(File file, String text, Charset encoding) throws IOException {
        try (PrintWriter out = new PrintWriter(file)) {
            out.println(text);
        }
    }

    public static void writeFile(String file, String text, Charset encoding) throws IOException {
        try (PrintWriter out = new PrintWriter(file)) {
            out.println(text);
        }
    }

    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, "UTF-8");
    }

    public static String readStream(InputStream is, Charset encoding) throws IOException {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
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

    public static boolean saveUrl(String filename, String urlString)
            throws MalformedURLException, IOException {
        return saveUrl(filename, urlString, false);
    }

    public static boolean saveUrl(String filename, String urlString, boolean gui_mode)
            throws MalformedURLException, IOException {
        Download download = new Download(new URL(urlString), new File(filename));
        if (gui_mode) {
            DisplayProgressBar frame = displayProgressBar("Everest Downloader",
                    "Downloading File (" + new File(filename).getName() + ") ..",
                    (progressBar, progressBarLbl) -> {
                        switch (download.getStatus()) {
                            case 2:
                                progressBar.setValue(100);
                                progressBarLbl.setText("Done (100%)");
                                JOptionPane.showMessageDialog(null, "Download Completed");
                                return true;
                            case 3:
                                progressBarLbl.setText("Download Cancelled");
                                JOptionPane.showMessageDialog(null, "Download Cancelled");
                                return true;
                            case 4:
                                progressBarLbl.setText("Download Error");
                                JOptionPane.showMessageDialog(null, "Download Error");
                                return true;
                            default:
                                progressBar.setValue((int) download.getProgress());
                                progressBarLbl.setText(
                                        (download.getProgress() + "00000").substring(0, 5) + "%");
                                return false;
                        }
                    });
            while (true) {
                switch (frame.jLabel2.getText()) {
                    case "Done (100%)":
                        return true;
                    case "Download Cancelled":
                        return false;
                    case "Download Error":
                        return false;
                }
            }
        }
        return false;
    }
}
