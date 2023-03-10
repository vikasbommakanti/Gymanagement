
package gymmanagement;

import static gymmanagement.MainLogin.*;
import static gymmanagement.TrainerDetails.tr;
import static gymmanagement.UserDetails.user;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Trainerregister extends javax.swing.JFrame {

    public Trainerregister() {
        initComponents();
         String[] Com = new String[2];
        Com[0]="Male";
        Com[1]="Female";
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(Com));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ag = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        confirmpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Email");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTER");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contact No");

        ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Age");

        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ag, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 260, Short.MAX_VALUE)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmpass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nam, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        
    }//GEN-LAST:event_userActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        
    }//GEN-LAST:event_emailActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        
    }//GEN-LAST:event_namActionPerformed

    boolean validate(String email) {
        String reg = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

        return email.matches(reg);
    }

    static void loadtrainer() {
        File fd = new File("src/gymmanagement/trainer");

        try {
            Scanner s = new Scanner(fd);
            while (s.hasNextLine()) {
                String d=s.nextLine();
                String [] input=d.split(" ");
                String name=input[0];
                
                String use=input[1];
                String gen=input[2];
                String age=input[3];
                String con=input[4];
                String ema=input[5];
                String ps=input[6];
                
      
                //UserDetails us=new UserDetails(names,userName,password,gender,age,address);
                //JOptionPane.showMessageDialog(null,u);
                TrainerDetails obj = new TrainerDetails(name, use, gen, age, con, ema, ps);
                //JOptionPane.showMessageDialog(null,u);
                
                TrainerL.put(use,ps);
                TrainerO.put(use,obj);
                if (gen.equalsIgnoreCase("male")) {
                            obj.u1 = 4;
                            obj.b1 = 4;
                            obj.u2 = 4;
                            obj.b2 = 4;
                            U1.add(obj);
                            B1.add(obj);
                            B2.add(obj);
                            U2.add(obj);
                            
                        } else {
                            obj.u1 = 4;
                            obj.g1 = 4;
                            obj.u2 = 4;
                            obj.g2 = 4;
                            U1.add(obj);
                            G1.add(obj);
                            G2.add(obj);
                            U2.add(obj);

                        }
                
            }
        } catch (Exception e) {
            System.out.println("IO Exception");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (nam.getText().isEmpty() || user.getText().isEmpty() || ag.getText().isEmpty() || contactno.getText().isEmpty() || email.getText().isEmpty() || confirmpass.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else {
            try {
                String name = nam.getText().trim();
                String username = user.getText().trim();
                String gen = (String) combo.getSelectedItem();
                String ema = email.getText().trim();
                String password = pass.getText().trim();
                String contact = contactno.getText().trim();
                String age = ag.getText().trim();
                String cpassword = confirmpass.getText().trim();
                File fd = new File("src/gymmanagement/trainer");
                Scanner scan = new Scanner(fd);

                if (!password.equals(cpassword)) {
                    JOptionPane.showMessageDialog(null, "Password doesn't matches");
                } else if (!validate(ema)) {
                    JOptionPane.showMessageDialog(null, "Enter a valid email Id");
                } else {

                    TrainerDetails obj = new TrainerDetails(name, username, gen, age, contact, ema, password);
                    int flag = 1;
                    int n = tr.size();
                    for (int i = 0; i < n; i++) {

                        if (tr.get(i).getUsername().equals(username)) {
                            flag = 0;
                            JOptionPane.showMessageDialog(null, "Username already exists Please enter the username again");
                            break;

                        }
                    }
                    if (flag == 1) {

                        tr.add(obj);
                        TrainerL.put(username, password);
                        TrainerO.put(username, obj);
                        FileWriter f = new FileWriter("src/gymmanagement/trainer", true);
                   
                        f.append(name + " " + username + " " + gen + " " + age + " " + contact + " " + ema + " " + password + "\n");
                        f.close();
                        if (gen.equalsIgnoreCase("male")) {
                            obj.u1 = 4;
                            obj.b1 = 4;
                            obj.u2 = 4;
                            obj.b2 = 4;
                            U1.add(obj);
                            B1.add(obj);
                            B2.add(obj);
                            U2.add(obj);
                            
                        } else {
                            obj.u1 = 4;
                            obj.g1 = 4;
                            obj.u2 = 4;
                            obj.g2 = 4;
                            U1.add(obj);
                            G1.add(obj);
                            G2.add(obj);
                            U2.add(obj);

                        }
                        JOptionPane.showMessageDialog(null, "Succesfully Added");
                        new Trainer().setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Enter username or password is wrong");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Trainerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainerregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainerregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ag;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nam;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
