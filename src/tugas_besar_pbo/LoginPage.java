
package tugas_besar_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Loginbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(31, 41, 130));
        Right.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Barbershop Bogor");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Copyright © Institut Cukur Rambut Bogor");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\OneDrive\\Dokumen\\images-removebg-preview_00000-removebg-preview.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(120, 120, 120)
                .addComponent(jLabel6)
                .addGap(51, 51, 51))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 41, 130));
        jLabel1.setText("LOGIN");

        jLabel2.setText("Email :");

        jLabel3.setText("Password :");

        Loginbutton.setBackground(new java.awt.Color(31, 41, 130));
        Loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        Loginbutton.setText("Login");
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tidak Punya Akun?");

        jButton2.setBackground(new java.awt.Color(31, 41, 130));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                .addGap(0, 165, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email)
                                    .addComponent(jLabel3)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Loginbutton))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(Loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 399, 500);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     SignupPage SignupFrame = new SignupPage();
     SignupFrame.setVisible(true);
     SignupFrame.pack();
     SignupFrame.setLocationRelativeTo(null);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
   //System.out.println("Sign Up Button Has Clicked!");
        //System.out.println("Sign Up Button Has Clicked!");
        String Email, Password, query, fname = null, passDB = null;
        String SUrl, SUser, Spass;
            SUrl = "jdbc:MySQL://localhost:3306/icrbfinal";
            SUser = "root";
            Spass = "";
            int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
            if ("".equals(email.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Harus di Isi", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(password.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password Harus di Isi", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Email = email.getText();
                Password = password.getText();
                
                query = "SELECT * FROM akun WHERE email='" + Email + "'";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    passDB = rs.getString("password");
                    fname = rs.getString("nama");
                    notFound = 1;
                    
                } 
                if(notFound == 1 && Password.equals(passDB)) {
                        homepage homeFrame = new homepage();
                        homeFrame.setUser(fname);
                        homeFrame.setVisible(true);
                        homeFrame.pack();
                        homeFrame.setLocationRelativeTo(null);
                        this.dispose();  
                } else{
                  JOptionPane.showMessageDialog(new JFrame(), "Email dan Password salah", "Error", JOptionPane.ERROR_MESSAGE);  
                }
                        
                st.execute(query);
                password.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_LoginbuttonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton Loginbutton;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

}