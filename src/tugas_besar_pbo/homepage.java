/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_besar_pbo;

import java.awt.Color;




public class homepage extends javax.swing.JFrame {

  Color DefaultColor,ClickedColor;
  
    public homepage() {
        initComponents(); 
        DefaultColor=new Color(255,255,255);
        ClickedColor=new Color(204,204,204);
        
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(DefaultColor);
        
        Stats.setBackground(DefaultColor);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JLabel();
        Stats = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Menu_3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Menu_2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Menu_4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Menu_5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Menu_6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pesanan_frame = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard_Admin");

        Jpanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        Jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        User.setText("user");
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        LogoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-cross-48 (1).png")); // NOI18N
        LogoutButton.setText("jLabel2");
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 44, -1));

        Stats.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\profile.png")); // NOI18N
        Stats.setText("Status");
        Stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StatsMousePressed(evt);
            }
        });
        jPanel1.add(Stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Jpanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jPanel2.setBackground(new java.awt.Color(31, 41, 130));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_3.setBackground(new java.awt.Color(255, 255, 255));
        Menu_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_3MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel3.setText("Menu 3");

        javax.swing.GroupLayout Menu_3Layout = new javax.swing.GroupLayout(Menu_3);
        Menu_3.setLayout(Menu_3Layout);
        Menu_3Layout.setHorizontalGroup(
            Menu_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Menu_3Layout.setVerticalGroup(
            Menu_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(Menu_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, -1));

        Menu_2.setBackground(new java.awt.Color(255, 255, 255));
        Menu_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_2MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel4.setText("Menu 2");

        javax.swing.GroupLayout Menu_2Layout = new javax.swing.GroupLayout(Menu_2);
        Menu_2.setLayout(Menu_2Layout);
        Menu_2Layout.setHorizontalGroup(
            Menu_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Menu_2Layout.setVerticalGroup(
            Menu_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(Menu_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        Menu_4.setBackground(new java.awt.Color(255, 255, 255));
        Menu_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_4MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel5.setText("Menu 4");

        javax.swing.GroupLayout Menu_4Layout = new javax.swing.GroupLayout(Menu_4);
        Menu_4.setLayout(Menu_4Layout);
        Menu_4Layout.setHorizontalGroup(
            Menu_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Menu_4Layout.setVerticalGroup(
            Menu_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(Menu_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, -1));

        Menu_5.setBackground(new java.awt.Color(255, 255, 255));
        Menu_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_5MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel6.setText("Menu 5");

        javax.swing.GroupLayout Menu_5Layout = new javax.swing.GroupLayout(Menu_5);
        Menu_5.setLayout(Menu_5Layout);
        Menu_5Layout.setHorizontalGroup(
            Menu_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Menu_5Layout.setVerticalGroup(
            Menu_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(Menu_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 170, -1));

        Menu_6.setBackground(new java.awt.Color(255, 255, 255));
        Menu_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_6MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel7.setText("Menu 6");

        javax.swing.GroupLayout Menu_6Layout = new javax.swing.GroupLayout(Menu_6);
        Menu_6.setLayout(Menu_6Layout);
        Menu_6Layout.setHorizontalGroup(
            Menu_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        Menu_6Layout.setVerticalGroup(
            Menu_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(Menu_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 170, -1));

        pesanan_frame.setBackground(new java.awt.Color(255, 255, 255));
        pesanan_frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesanan_frameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesanan_frameMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images\\icons8-menu-24.png")); // NOI18N
        jLabel8.setText("Pesanan");

        javax.swing.GroupLayout pesanan_frameLayout = new javax.swing.GroupLayout(pesanan_frame);
        pesanan_frame.setLayout(pesanan_frameLayout);
        pesanan_frameLayout.setHorizontalGroup(
            pesanan_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesanan_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        pesanan_frameLayout.setVerticalGroup(
            pesanan_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel2.add(pesanan_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, -1));

        Jpanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 560));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Jpanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 660, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void pesanan_frameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesanan_frameMousePressed
        pesanan_frame.setBackground(ClickedColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(DefaultColor);
    }//GEN-LAST:event_pesanan_frameMousePressed

    private void Menu_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_2MousePressed
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(ClickedColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu_2MousePressed

    private void Menu_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_3MousePressed
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(ClickedColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu_3MousePressed

    private void Menu_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_4MousePressed
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(ClickedColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu_4MousePressed

    private void Menu_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_5MousePressed
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(ClickedColor);
        Menu_6.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu_5MousePressed

    private void Menu_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_6MousePressed
        pesanan_frame.setBackground(DefaultColor);
        Menu_2.setBackground(DefaultColor);
        Menu_3.setBackground(DefaultColor);
        Menu_4.setBackground(DefaultColor);
        Menu_5.setBackground(DefaultColor);
        Menu_6.setBackground(ClickedColor);
    }//GEN-LAST:event_Menu_6MousePressed

    private void pesanan_frameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesanan_frameMouseClicked

        pesanan_frame pesanan_frame1=new pesanan_frame ();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(pesanan_frame1).setVisible(true);
           
    }//GEN-LAST:event_pesanan_frameMouseClicked

    private void StatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseClicked
        
        profilframe profil_frame1=new profilframe ();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(profil_frame1).setVisible(true);
    }//GEN-LAST:event_StatsMouseClicked

    private void StatsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMousePressed
        Stats.setBackground(ClickedColor);
    }//GEN-LAST:event_StatsMousePressed
    public void setUser(String Name) {
        User.setText(Name);
    }
    
    public void setStats(String stats ) {
        Stats.setText(stats);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JPanel Menu_2;
    private javax.swing.JPanel Menu_3;
    private javax.swing.JPanel Menu_4;
    private javax.swing.JPanel Menu_5;
    private javax.swing.JPanel Menu_6;
    private javax.swing.JLabel Stats;
    private javax.swing.JLabel User;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pesanan_frame;
    // End of variables declaration//GEN-END:variables

}
