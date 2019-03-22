
import db.DBConnection;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class invoiceToPdf {

    static Connection Conn = DBConnection.getConnection();

    public static void main(String[] args) {
        try {
            invoicetopdf();
            //ReceiptToPdf();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void invoicetopdf() throws FileNotFoundException {
        try { //Invoice_CourseName
            String r11_jasperFile = "E:/reports/Invoice/Invoice_CourseDays.jasper";
            String r11_xmlFile = "E:/reports/Invoice/Invoice_CourseDays.jrxml";

            String r12_jasperFile = "E:/reports/Invoice/Invoice_CourseTime.jasper";
            String r12_xmlFile = "E:/reports/Invoice/Invoice_CourseTime.jrxml";

            String r1_jasperFile = "E:/reports/Invoice/Invoice_BookName.jasper";
            String r1_xmlFile = "E:/reports/Invoice/Invoice_BookName.jrxml";

            String r2_jasperFile = "E:/reports/Invoice/Invoice_BookPrice.jasper";
            String r2_xmlFile = "E:/reports/Invoice/Invoice_BookPrice.jrxml";

            String r3_jasperFile = "E:/reports/Invoice/Invoice_PaymentValue.jasper";
            String r3_xmlFile = "E:/reports/Invoice/Invoice_PaymentValue.jrxml";

            String r33_jasperFile = "E:/reports/Invoice/Invoice_PaymentValue2.jasper";
            String r33_xmlFile = "E:/reports/Invoice/Invoice_PaymentValue2.jrxml";

            String r4_jasperFile = "E:/reports/Invoice/Invoice_remaindCash.jasper";
            String r4_xmlFile = "E:/reports/Invoice/Invoice_remaindCash.jrxml";

            String r5_jasperFile = "E:/reports/Invoice/Invoice_CourseName-price.jasper";
            String r5_xmlFile = "E:/reports/Invoice/Invoice_CourseName-price.jrxml";

            String r6_jasperFile = "E:/reports/Invoice/Invoice_ExamCost.jasper";
            String r6_xmlFile = "E:/reports/Invoice/Invoice_ExamCost.jrxml";

            String r7_jasperFile = "E:/reports/Invoice/Invoice_IDNum.jasper";
            String r7_xmlFile = "E:/reports/Invoice/Invoice_IDNum.jrxml";

            String r8_jasperFile = "E:/reports/Invoice/Invoice_stdName.jasper";
            String r8_xmlFile = "E:/reports/Invoice/Invoice_stdName.jrxml";

            String r9_jasperFile = "E:/reports/Invoice/Invoice_PhoneNum.jasper";
            String r9_xmlFile = "E:/reports/Invoice/Invoice_PhoneNum.jrxml";

            String r10_jasperFile = "E:/reports/Invoice/Invoice_TotalPrice.jasper";
            String r10_xmlFile = "E:/reports/Invoice/Invoice_TotalPrice.jrxml";

            String r111_jasperFile = "E:/reports/Invoice/Invoice_discount.jasper";
            String r111_xmlFile = "E:/reports/Invoice/Invoice_discount.jrxml";

            String r112_jasperFile = "E:/reports/Invoice/Invoice_Net.jasper";
            String r112_xmlFile = "E:/reports/Invoice/Invoice_Net.jrxml";

            String r_jasperFile = "E:/reports/Invoice/Invoice.jasper";
            String r_xmlFile = "E:/reports/Invoice/Invoice.jrxml";
            String FilePath = "E:/New_invoice.pdf";

            JasperCompileManager.compileReportToFile(r1_xmlFile, r1_jasperFile);

            JasperCompileManager.compileReportToFile(r2_xmlFile, r2_jasperFile);

            JasperCompileManager.compileReportToFile(r3_xmlFile, r3_jasperFile);
            JasperCompileManager.compileReportToFile(r33_xmlFile, r33_jasperFile);
            JasperCompileManager.compileReportToFile(r4_xmlFile, r4_jasperFile);

            JasperCompileManager.compileReportToFile(r5_xmlFile, r5_jasperFile);

            JasperCompileManager.compileReportToFile(r6_xmlFile, r6_jasperFile);

            JasperCompileManager.compileReportToFile(r7_xmlFile, r7_jasperFile);

            JasperCompileManager.compileReportToFile(r8_xmlFile, r8_jasperFile);

            JasperCompileManager.compileReportToFile(r9_xmlFile, r9_jasperFile);

            JasperCompileManager.compileReportToFile(r10_xmlFile, r10_jasperFile);

            JasperCompileManager.compileReportToFile(r11_xmlFile, r11_jasperFile);
            JasperCompileManager.compileReportToFile(r12_xmlFile, r12_jasperFile);
            JasperCompileManager.compileReportToFile(r111_xmlFile, r111_jasperFile);
            JasperCompileManager.compileReportToFile(r112_xmlFile, r112_jasperFile);
            JasperCompileManager.compileReportToFile(r_xmlFile, r_jasperFile);
            System.out.println("Compiling has been done sucessfully");

            JasperPrint jasperPrint1 = JasperFillManager.fillReport(r1_jasperFile, null, Conn);
            JasperPrint jasperPrint2 = JasperFillManager.fillReport(r2_jasperFile, null, Conn);
            JasperPrint jasperPrint3 = JasperFillManager.fillReport(r3_jasperFile, null, Conn);
            JasperPrint jasperPrint33 = JasperFillManager.fillReport(r33_jasperFile, null, Conn);
            JasperPrint jasperPrint4 = JasperFillManager.fillReport(r4_jasperFile, null, Conn);
            JasperPrint jasperPrint5 = JasperFillManager.fillReport(r5_jasperFile, null, Conn);
            JasperPrint jasperPrint6 = JasperFillManager.fillReport(r6_jasperFile, null, Conn);
            JasperPrint jasperPrint7 = JasperFillManager.fillReport(r7_jasperFile, null, Conn);
            JasperPrint jasperPrint8 = JasperFillManager.fillReport(r8_jasperFile, null, Conn);
            JasperPrint jasperPrint9 = JasperFillManager.fillReport(r9_jasperFile, null, Conn);
            JasperPrint jasperPrint10 = JasperFillManager.fillReport(r10_jasperFile, null, Conn);
            JasperPrint jasperPrint11 = JasperFillManager.fillReport(r11_jasperFile, null, Conn);
            JasperPrint jasperPrint12 = JasperFillManager.fillReport(r12_jasperFile, null, Conn);
            JasperPrint jasperPrint13 = JasperFillManager.fillReport(r111_jasperFile, null, Conn);
            JasperPrint jasperPrint14 = JasperFillManager.fillReport(r112_jasperFile, null, Conn);
            JasperPrint jasperPrint = JasperFillManager.fillReport(r_jasperFile, null, Conn);
            System.out.println("filling has been done sucessfully");
            JRExporter exporter = new JRPdfExporter();

            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);

            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
                    new FileOutputStream(FilePath)); // your output goes here
            exporter.exportReport();

            JOptionPane.showMessageDialog(
                    null, "Invoice has been exported sucessfully,Click Ok to preview the invoice");

            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(FilePath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        } catch (JRException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex);
        }
    }

    public static void ReceiptToPdf() throws FileNotFoundException {
        try {
            String Receipt_r1_jasperFile = "E:/reports/Receipt/ID_Num.jasper";
            String Receipt_r1_xmlFile = "E:/reports/Receipt/ID_Num.jrxml";
            String Receipt_r2_jasperFile = "E:/reports/Receipt/Invoice_subreport1.jasper";
            String Receipt_r2_xmlFile = "E:/reports/Receipt/Invoice_subreport1.jrxml";
            String Receipt_r3_jasperFile = "E:/reports/Receipt/Invoice_subreport2.jasper";
            String Receipt_r3_xmlFile = "E:/reports/Receipt/Invoice_subreport2.jrxml";
            String Receipt_r4_jasperFile = "E:/reports/Receipt/Invoice_subreport3.jasper";
            String Receipt_r4_xmlFile = "E:/reports/Receipt/Invoice_subreport3.jrxml";
            String Receipt_r5_jasperFile = "E:/reports/Receipt/Receipt_IDNum.jasper";
            String Receipt_r5_xmlFile = "E:/reports/Receipt/Receipt_IDNum.jrxml";
            String Receipt_r6_jasperFile = "E:/reports/Receipt/Receipt_StdName.jasper";
            String Receipt_r6_xmlFile = "E:/reports/Receipt/Receipt_StdName.jrxml";
            String Receipt_r7_jasperFile = "E:/reports/Receipt/Receipt_StdPhoneNum.jasper";
            String Receipt_r7_xmlFile = "E:/reports/Receipt/Receipt_StdPhoneNum.jrxml";
            String Receipt_r8_jasperFile = "E:/reports/Receipt/Invoice_subreport4.jasper";
            String Receipt_r8_xmlFile = "E:/reports/Receipt/Invoice_subreport4.jrxml";
            String Receipt_r9_jasperFile = "E:/reports/Receipt/Invoice_subreport5.jasper";
            String Receipt_r9_xmlFile = "E:/reports/Receipt/Invoice_subreport5.jrxml";
            String Receipt_r10_jasperFile = "E:/reports/Receipt/Invoice_subreport6.jasper";
            String Receipt_r10_xmlFile = "E:/reports/Receipt/Invoice_subreport6.jrxml";
            String Receipt_r11_jasperFile = "E:/reports/Receipt/Invoice.jasper";
            String Receipt_r11_xmlFile = "E:/reports/Receipt/Invoice.jrxml";
            String ReceiptFilePath = "E:/Receipt_New_invoice.pdf";

            JasperCompileManager.compileReportToFile(Receipt_r1_xmlFile, Receipt_r1_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r2_xmlFile, Receipt_r2_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r3_xmlFile, Receipt_r3_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r4_xmlFile, Receipt_r4_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r5_xmlFile, Receipt_r5_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r6_xmlFile, Receipt_r6_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r7_xmlFile, Receipt_r7_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r8_xmlFile, Receipt_r8_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r9_xmlFile, Receipt_r9_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r10_xmlFile, Receipt_r10_jasperFile);
            JasperCompileManager.compileReportToFile(Receipt_r11_xmlFile, Receipt_r11_jasperFile);

            System.out.println("Compiling has been done sucessfully");
            JasperPrint jasperPrint1 = JasperFillManager.fillReport(Receipt_r1_jasperFile, null, Conn);
            JasperPrint jasperPrint2 = JasperFillManager.fillReport(Receipt_r2_jasperFile, null, Conn);
            JasperPrint jasperPrint3 = JasperFillManager.fillReport(Receipt_r3_jasperFile, null, Conn);
            JasperPrint jasperPrint4 = JasperFillManager.fillReport(Receipt_r4_jasperFile, null, Conn);
            JasperPrint jasperPrint5 = JasperFillManager.fillReport(Receipt_r5_jasperFile, null, Conn);
            JasperPrint jasperPrint6 = JasperFillManager.fillReport(Receipt_r6_jasperFile, null, Conn);
            JasperPrint jasperPrint7 = JasperFillManager.fillReport(Receipt_r7_jasperFile, null, Conn);
            JasperPrint jasperPrint8 = JasperFillManager.fillReport(Receipt_r8_jasperFile, null, Conn);
            JasperPrint jasperPrint9 = JasperFillManager.fillReport(Receipt_r9_jasperFile, null, Conn);
            JasperPrint jasperPrint10 = JasperFillManager.fillReport(Receipt_r10_jasperFile, null, Conn);
            JasperPrint jasperPrint11 = JasperFillManager.fillReport(Receipt_r11_jasperFile, null, Conn);
            System.out.println("filling has been done sucessfully");
            JRExporter exporter = new JRPdfExporter();

            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint11);

            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(ReceiptFilePath)); // your output goes here
            exporter.exportReport();

            JOptionPane.showMessageDialog(null, "Receipt has been exported sucessfully,Click Ok to preview the invoice");

            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(ReceiptFilePath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        } catch (JRException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex);
        }

    }

}
