/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimemanagement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhardwaj
 */
public class status extends javax.swing.JFrame {

    /**
     * Creates new form status
     */
    public status() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fir = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cs = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        arr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FIR STATUS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(201, 11, 191, 42);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 61, 23);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Enter your FIR Code");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(136, 77, 168, 21);

        fir.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fir.setForeground(new java.awt.Color(204, 0, 204));
        fir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firActionPerformed(evt);
            }
        });
        getContentPane().add(fir);
        fir.setBounds(358, 71, 120, 27);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(284, 129, 91, 29);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 510));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Arresting Date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 360, 121, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Is Case Solved?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 310, 124, 21);

        cs.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cs.setForeground(new java.awt.Color(51, 51, 255));
        cs.setText("YES/NO");
        jPanel1.add(cs);
        cs.setBounds(330, 310, 62, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Date of Complaint");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 260, 150, 21);

        doc.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        doc.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(doc);
        doc.setBounds(330, 250, 350, 30);

        ad.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ad.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(ad);
        ad.setBounds(330, 350, 380, 30);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 420, 130, 29);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Is Criminal Arrested?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 210, 173, 21);

        arr.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        arr.setForeground(new java.awt.Color(51, 51, 255));
        arr.setText("YES/NO");
        jPanel1.add(arr);
        arr.setBounds(330, 210, 62, 21);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CitizenPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String firid=fir.getText();
        String arrested="NO",csol="",adate="",cdate="";
        try{
            Connection con=null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",authorization.username,authorization.password);
            PreparedStatement pst=con.prepareStatement("Select arrested,case_solved,arresting_date,complaint_date from firdetails where firid=?");
            pst.setString(1, firid);
            ResultSet x=pst.executeQuery();
            while(x.next()){
                arrested=x.getString(1);
                csol=x.getString(2);
                adate=x.getString(3);
                cdate=x.getString(4);
            }
            con.close();
            arr.setText(arrested);
            doc.setText(cdate);
            ad.setText(adate);
            cs.setText(csol);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad;
    private javax.swing.JLabel arr;
    private javax.swing.JLabel cs;
    private javax.swing.JLabel doc;
    private javax.swing.JTextField fir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
