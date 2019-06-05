package utils.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class GUI_Util {

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        ArrayList<String> columnNames = new ArrayList<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        ArrayList<Object[]> data = new ArrayList<>();
        while (rs.next()) {
            Object[] data1 = new Object[columnCount];
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                data1[columnIndex - 1] = (rs.getObject(columnIndex));
            }
            data.add(data1);
        }
        return new DefaultTableModel(
                data.toArray(new Object[data.size()][columnCount]),
                columnNames.toArray()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // for preventing any cell edit
                return false;
            }
        };
    }

    public static DefaultComboBoxModel buildComboBoxModel(ResultSet rs)
            throws SQLException {

        ArrayList<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            arrayList.add(rs.getString(1));
        }
        return new DefaultComboBoxModel(arrayList.toArray());
    }

    public static void link_frame_to_button(JFrame frame, JButton button) {
        button.setEnabled(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                button.setEnabled(true);
            }
        });
    }

    public static void promoteSpinner(String title, String label,
            SpinnerNumberModel spinnerNumberModel, String button,
            DoSomethingWithSpinner dsws) {
        JFrame promoteFrame
                = new PromoteSpinner(title, label, spinnerNumberModel, button, dsws);
        promoteFrame.setVisible(true);
    }

    public static JFrame promoteComboBox(String title, String labelTxt,
            String buttonTxt, ComboBoxModel comboBoxModel,
            DoSomethingWithComboBox dswcb) {

        JFrame promoteFrame = new PromoteComboBox(
                title, labelTxt, comboBoxModel, buttonTxt, dswcb);

        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteDatePicker(String title, String labelTxt,
            String buttonTxt, DoSomethingWithDatePicker dswdp) {

        JFrame promoteFrame
                = new PromoteDatePicker(title, labelTxt, buttonTxt, dswdp);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteFormatedTextField(String title, String labelTxt,
            String format, String buttonTxt,
            DoSomethingWithFormatedTextField dswftf) {

        JFrame promoteFrame = new PromoteFormatedTextField(
                title, labelTxt, format, buttonTxt, dswftf);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static abstract interface DoSomethingWithSpinner {

        /**
         * @param spinnerValue the value of the spinner
         * @return true to close or false to not close
         */
        abstract boolean doSomething(double spinnerValue);
    }

    public static abstract interface DoSomethingWithComboBox {

        /**
         * @param choice
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String choice);
    }

    public static abstract interface DoSomethingWithDatePicker {

        /**
         * @param DateInMillis
         * @return true to close or false to not close
         */
        abstract boolean doSomething(long DateInMillis);
    }

    public static abstract interface DoSomethingWithFormatedTextField {

        /**
         * @param formatedText
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String formatedText);
    }
}
