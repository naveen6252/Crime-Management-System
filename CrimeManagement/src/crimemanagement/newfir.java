/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimemanagement;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Bhardwaj
 */
public class newfir extends javax.swing.JFrame {

    /**
     * Creates new form newfir
     */
    public newfir() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ps = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ad = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ev = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cime Management System");
        setMinimumSize(new java.awt.Dimension(600, 540));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 29, 59, 23);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("First Name ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 87, 96, 21);

        fn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn);
        fn.setBounds(121, 81, 150, 40);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 87, 87, 21);

        ps.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ps.setForeground(new java.awt.Color(153, 0, 153));
        ps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Police Station", "Rohini", "Begumpur", "PitamPura", "Narela", "NSP", "Punjabi Baag", "Dwarka", "Rajouri", "AzadPur" }));
        getContentPane().add(ps);
        ps.setBounds(21, 451, 180, 27);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("FIR REGISTRATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 20, 310, 42);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 204));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 450, 145, 29);

        ad.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        jPanel1.add(ad);
        ad.setBounds(250, 150, 295, 60);

        ph.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        jPanel1.add(ph);
        ph.setBounds(250, 230, 190, 27);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Phone No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 230, 87, 21);

        ln.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(ln);
        ln.setBounds(420, 80, 150, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("Reason of Complaint");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 290, 171, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 65, 21);

        rs.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsActionPerformed(evt);
            }
        });
        jPanel1.add(rs);
        rs.setBounds(250, 280, 295, 40);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setText("Area of Crime");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 340, 115, 21);

        ar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });
        jPanel1.add(ar);
        ar.setBounds(250, 330, 295, 40);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Evidence");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 390, 75, 21);

        ev.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evActionPerformed(evt);
            }
        });
        jPanel1.add(ev);
        ev.setBounds(250, 380, 295, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void rsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arActionPerformed

    private void evActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String fname=fn.getText();
        String lname=ln.getText();
        String address=ad.getText();
        String phone=ph.getText();
        String reason=rs.getText();
        String area=ar.getText();
        String evidence=ev.getText();
        String PoliceSt=(String) ps.getSelectedItem();
        String arrested="NO";
        String case_solved="NO";
        String Arresting_date="";
        Date date=new Date();
        String cdate=date.toLocaleString();
        Random r=new Random();
        String firid= "fir"+r.nextInt(1000);
        try{
            Connection con=null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",authorization.username,authorization.password);
            PreparedStatement pst=con.prepareStatement("Insert into firdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, address);
            pst.setString(4, phone);
            pst.setString(5, reason);
            pst.setString(6, area);
            pst.setString(7, evidence);
            pst.setString(8, PoliceSt);
            pst.setString(9, arrested);
            pst.setString(10, case_solved);
            pst.setString(11, Arresting_date);
            pst.setString(12, cdate);
            pst.setString(13, firid);
            int x=pst.executeUpdate();
            if(x>0){
                JOptionPane.showMessageDialog(this, "Successfully Registered");
            }
            JOptionPane.showMessageDialog(this,"Your FIR Code is: "+firid);
            con.close();
            this.dispose();
            new CitizenPage().setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CitizenPage().setVisible(true);
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
            java.util.logging.Logger.getLogger(newfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newfir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField ar;
    private javax.swing.JTextField ev;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField ph;
    private javax.swing.JComboBox<String> ps;
    private javax.swing.JTextField rs;
    // End of variables declaration//GEN-END:variables
}
