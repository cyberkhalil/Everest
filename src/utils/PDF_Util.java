package utils;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import static utils.gui.GUI_Util.buildTableModel;

public class PDF_Util {

    private PDF_Util() {
    }

    public static void printjTable(JTable table, String path) throws DocumentException,
            IOException {
        Document doc = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(doc, new FileOutputStream(path));
        doc.open();
        Image img = Image.getInstance(
                new PDF_Util().getClass().getResource("/Images/Everest_logo.jpg").getPath());
        img.setAlignment(Image.ALIGN_CENTER);
        doc.add(img);
        doc.add(new Paragraph("\n"));
        doc.add(new LineSeparator());
        doc.add(new Paragraph("\n"));
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
        //adding table headers
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(table.getColumnName(i));
        }
        //extracting data from the JTable and inserting it to PdfPTable
        for (int rows = 0; rows < table.getRowCount(); rows++) {
            for (int cols = 0; cols < table.getColumnCount(); cols++) {
                if (table.getModel().getValueAt(rows, cols) == null) {
                    pdfTable.addCell("");
                } else {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }
        }
        doc.add(pdfTable);
        doc.close();
    }

    public static void printResultSet(ResultSet rs, String path) throws DocumentException,
            IOException, SQLException {
        printjTable(new JTable(buildTableModel(rs)), path);
    }

}
