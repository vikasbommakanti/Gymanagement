
package gymmanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static gymmanagement.GymManagement.*;
import static gymmanagement.Trainerregister.loadtrainer;

public class MainLogin extends javax.swing.JFrame {

    public static ArrayList<TrainerDetails> U1 = new ArrayList<TrainerDetails>();
    public static ArrayList<TrainerDetails> B1 = new ArrayList<TrainerDetails>();
    public static ArrayList<TrainerDetails> G1 = new ArrayList<TrainerDetails>();
    public static ArrayList<TrainerDetails> U2 = new ArrayList<TrainerDetails>();
    public static ArrayList<TrainerDetails> B2 = new ArrayList<TrainerDetails>();
    public static ArrayList<TrainerDetails> G2 = new ArrayList<TrainerDetails>();
    public static HashMap<String, String> AdminL = new HashMap<String, String>();
    public static HashMap<String, String> TrainerL = new HashMap<String, String>();
    public static HashMap<String, String> CustomerL = new HashMap<String, String>();
    public static HashMap<String, TrainerDetails> TrainerO = new HashMap<>();
    public static HashMap<String, UserDetails> CustomerO = new HashMap<>();

    public MainLogin() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        AdminLogin = new javax.swing.JRadioButton();
        TrainerLogin = new javax.swing.JRadioButton();
        CustomerLogin = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 26)); // NOI18N
        jLabel2.setText("Welcome To FITORBIT");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username");

        jButton3.setText("Forgot your password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        AdminLogin.setSelected(true);
        AdminLogin.setText("Admin");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        TrainerLogin.setText("Trainer");

        CustomerLogin.setText("Customer");
        CustomerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerLoginActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/image/WhatsApp Image 2022-11-16 at 12.12.00 PM.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TrainerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(user))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminLogin)
                            .addComponent(TrainerLogin)
                            .addComponent(CustomerLogin))
                        .addGap(16, 16, 16)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (user.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else {
            try {
                String username = user.getText().trim();
                String password = pass.getText().trim();
                if (AdminLogin.isSelected()) {
                    if (AdminL.containsKey(username)) {
                        if (AdminL.get(username).equals(password)) {
                            new AdminFront().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No Such Username Exist");
                    }
                } else if (TrainerLogin.isSelected()) {
                    if (TrainerL.containsKey(username)) {
                        if (TrainerL.get(username).equals(password)) {
                            GymManagement.T = TrainerO.get(username);
                            new Trainer().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No Such Username Exist");
                    }
                } else if (CustomerLogin.isSelected()) {
                    if (CustomerL.containsKey(username)) {
                        if (CustomerL.get(username).equals(password)) {
                            U = CustomerO.get(username);
                            new UserForm().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No Such Username Exist");
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        
    }//GEN-LAST:event_passActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        ButtonGroup GP1 = new ButtonGroup();
        GP1.add(AdminLogin);
        GP1.add(TrainerLogin);
        GP1.add(CustomerLogin);
        AdminL.put("admin", "1234");
        loadtrainer();
        UserLogin.load();
        

    }//GEN-LAST:event_formWindowOpened

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
       
        
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void CustomerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerLoginActionPerformed
        
    }//GEN-LAST:event_CustomerLoginActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminLogin;
    private javax.swing.JRadioButton CustomerLogin;
    private javax.swing.JRadioButton TrainerLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
