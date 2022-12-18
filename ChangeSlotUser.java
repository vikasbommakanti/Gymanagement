
package gymmanagement;
import static gymmanagement.MainLogin.CustomerL;
import static gymmanagement.MainLogin.CustomerO;
import static gymmanagement.MainLogin.*;
import static gymmanagement.UserDetails.*;
import static gymmanagement.UserLogin.*;
import static gymmanagement.UserRegister.*;
import static gymmanagement.GymManagement.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ChangeSlotUser extends javax.swing.JFrame {

    /**
     * Creates new form ChnageSlotUser
     */
    public ChangeSlotUser() {
        initComponents();
        trainers();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slot = new javax.swing.JComboBox<>();
        trainer = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        slot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M1)Unisex", "(M2)Male", "(M3)Female", "(E1)Unisex", "(E2)Male", "(E3)Female" }));
        slot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotActionPerformed(evt);
            }
        });

        trainer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        trainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainerActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Slot");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Trainer");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton1)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addGap(360, 360, 360))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trainer, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slot, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(trainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(102, 102, 102)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void trainers(){
        
           String [] str=new String [chec.size()];
           int i=0;
            for(TrainerDetails A: chec){
                if(choice==1){
                    if(A.u1>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
                if(choice==2){
                    if(A.b1>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
                if(choice==3){
                    if(A.g1>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
                if(choice==4){
                    if(A.u2>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
                if(choice==5){
                    if(A.b2>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
                if(choice==6){
                    if(A.g2>0){
                        str[i]=A.getUsername();
                        i++;
                    }
                }
                
            }
        
           trainer.setModel(new javax.swing.DefaultComboBoxModel<>(str)); 
    }
    
    int choice=1;
    ArrayList<TrainerDetails>chec=U1;
    
    private void slotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotActionPerformed
        // TODO add your handling code here:
        
        if(slot.getSelectedIndex()==0)
        {
            choice=1;
            chec=U1;
        }

        if(slot.getSelectedIndex()==1)
        {
            choice=2;
            chec=B1;
        }
        if(slot.getSelectedIndex()==2)
        {
            choice=3;
            chec=G1;
        }

        if(slot.getSelectedIndex()==3)
        {
            choice=4;
            chec=U2;
        }

        if(slot.getSelectedIndex()==4)
        {
            choice=5;
            chec=B2;
        }

        if(slot.getSelectedIndex()==5)
        {
            choice=6;
            chec=G2;
        }

        trainers();
        System.out.println(U1.size());
        System.out.println(B1.size());
        System.out.println(G1.size());
        System.out.println(U2.size());
        System.out.println(B2.size());
        System.out.println(G2.size());
    }//GEN-LAST:event_slotActionPerformed

    private void trainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_trainerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        TrainerDetails obj=TrainerO.get((String)trainer.getSelectedItem());
        //U.setAssT(obj);
        if(obj==null || U==null){
            System.out.println((String)trainer.getSelectedItem());
            this.dispose();
        }
        obj=U.getAssT();
        obj.Cust.remove(U.getUs());
        if(true){
        if(U.getCh()==1){
            obj.u1+=1;
        }

        if(U.getCh()==2){
            obj.b1+=1;
        }

        if(U.getCh()==3){
            obj.g1+=1;
        }

        if(U.getCh()==4){
            obj.u2+=1;
        }

        if(U.getCh()==5){
            obj.b2+=1;
        }
        if(U.getCh()==6){
            obj.g2+=1;
        }
        }
        obj=TrainerO.get((String)trainer.getSelectedItem());
        U.setAssT(obj);
        
        if(choice==1){
            obj.u1-=1;
        }
        
        if(choice==2){
            obj.b1-=1;
        }
        
        if(choice==3){
            obj.g1-=1;
        }
        
        if(choice==4){
            obj.u2-=1;
        }
        
        if(choice==5){
            obj.b2-=1;
        }
        if(choice==6){
            obj.g2-=1;
        }
        
        U.setTrain(U.getAssT().getUsername());
        UserForm r=new UserForm();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);  
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeSlotUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSlotUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSlotUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSlotUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeSlotUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JComboBox<String> slot;
    private javax.swing.JComboBox<String> trainer;
    // End of variables declaration//GEN-END:variables
}
