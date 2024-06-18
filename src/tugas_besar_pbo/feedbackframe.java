package tugas_besar_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class feedbackframe extends javax.swing.JInternalFrame {

    public feedbackframe() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JtextRating = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtextKomentar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JtextName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtextID = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(930, 550));

        jPanel1.setBackground(new java.awt.Color(31, 41, 130));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Feedback");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rating :");

        JtextRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextRatingActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Komentar :");

        JtextKomentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextKomentarActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(31, 41, 130));
        jButton1.setText("Kirim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(404, 404, 404))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextRating)
                    .addComponent(JtextKomentar)
                    .addComponent(JtextName)
                    .addComponent(JtextID, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtextID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtextName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtextRating, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtextKomentar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextRatingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nama = this.JtextName.getText();
int rating = Integer.parseInt(this.JtextRating.getText()); // Mengubah rating menjadi int
String komentar = this.JtextKomentar.getText();
int pesananID = Integer.parseInt(this.JtextID.getText()); // Mengambil nilai pesananID dari input

String query;
String SUrl, SUser, Spass;
SUrl = "jdbc:mysql://localhost:3306/institutcrb";
SUser = "root";
Spass = "";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(SUrl, SUser, Spass);

    // Periksa apakah pesananID ada di tabel pesanan
    query = "SELECT COUNT(*) FROM pesanan WHERE PesananID = ?";
    PreparedStatement pstCheck = con.prepareStatement(query);
    pstCheck.setInt(1, pesananID);
    ResultSet rsCheck = pstCheck.executeQuery();
    rsCheck.next();
    int count = rsCheck.getInt(1);

    if (count == 0) {
        throw new Exception("PesananID tidak ditemukan di tabel pesanan");
    }

    // Jika pesananID ditemukan, lanjutkan dengan memasukkan data ke tabel feedback
    query = "INSERT INTO feedback (PesananID, Rating, Komentar, Nama) VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
    pst.setInt(1, pesananID);
    pst.setInt(2, rating); // Mengubah pst.setString(2, rating) menjadi pst.setInt(2, rating)
    pst.setString(3, komentar);
    pst.setString(4, nama);

    pst.executeUpdate();
    ResultSet rs = pst.getGeneratedKeys();
    if (rs.next()) {
        int feedbackID = rs.getInt(1);
        System.out.println("Inserted Feedback ID: " + feedbackID);
    }
    JOptionPane.showMessageDialog(null, "Data berhasil dikirim!", "Sukses", JOptionPane.INFORMATION_MESSAGE);


    con.close();
} catch (Exception e) {
    System.out.println("Error!" + e.getMessage());
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtextKomentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextKomentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextKomentarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextID;
    private javax.swing.JTextField JtextKomentar;
    private javax.swing.JTextField JtextName;
    private javax.swing.JTextField JtextRating;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
