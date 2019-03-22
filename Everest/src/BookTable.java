
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BookTable extends javax.swing.JFrame {

    Connection conn = DBConnection.getConnection();
    Book book;
    int BookId = 0;
    String BookName = null;
    double price = 0;
    int stdID = 0;
    int stdID_fk = 0;
    int StudentID = 0;
    String stdName = null;

    public BookTable() {
        initComponents();
        show_Book();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public ArrayList<Book> booktList() {
        ArrayList<Book> arrayList = new ArrayList<>();
        try {
            // TODO check why there is error here..
            String query = "select * from book where student_id_fk IS NOT NULL";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookId = rs.getInt("BookId");
                BookName = rs.getString("BookName");
                price = rs.getDouble("Price");
                stdID = rs.getInt("student_id_fk");
                book = new Book(BookId, BookName, price);
                System.out.println(BookId + " " + BookName + " " + price + " " + stdID);
                arrayList.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }

    public void show_Book() {
        ArrayList<String> StdName = new ArrayList<>();
        ArrayList<Book> arrayList = booktList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Book.getModel();
        Object[] rObjects = new Object[4];

        for (int i = 0; i < arrayList.size(); i++) {
            try {
                String query1 = "select StdName from student where StdID =(select student_id_fk from book where BookId = ?  AND student_id_fk IS NOT NULL)";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setInt(1, arrayList.get(i).getBookId());
                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    stdName = rs1.getString("StdName");
                    StdName.add(stdName);
                    System.out.println(stdName);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookTableJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            rObjects[0] = arrayList.get(i).getBookId();
            rObjects[1] = arrayList.get(i).getBookName();
            rObjects[2] = arrayList.get(i).getPrice();
            rObjects[3] = StdName.get(i);
            model.addRow(rObjects);
        }
    }

    public void excuteSQLQuery(String Query, String message) {
        Connection conn = DBConnection.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(Query) == 1) {
                DefaultTableModel model = (DefaultTableModel) jTable_Display_Book.getModel();
                model.setRowCount(0);
                show_Book();
                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Do not " + message);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Book = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Display_Book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Price", "Student Name"
            }
        ));
        jTable_Display_Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_BookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Book);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Everest Training center");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_BookMouseClicked
        // TODO add your handling code here:
        int i = jTable_Display_Book.getSelectedRow();
        TableModel tableModel = jTable_Display_Book.getModel();
//        IDTF.setText(tableModel.getValueAt(i, 0).toString());
//        nameTF.setText(tableModel.getValueAt(i, 1).toString());
        //priceTF.setText(tableModel.getValueAt(i, 2).toString());
        // student_nameTF.setText(tableModel.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable_Display_BookMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Book;
    // End of variables declaration//GEN-END:variables
}
