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
public class case_solved extends javax.swing.JFrame {

    /**
     * Creates new form case_solved
     */
    public case_solved() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fir = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doarr = new javax.swing.JLabel();
        evd = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cr = new javax.swing.JLabel();
        ph = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        na = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setMinimumSize(new java.awt.Dimension(620, 500));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 153));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 1, 61, 23);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("SOLVED CASES DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(132, 1, 387, 42);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Enter FIR Code");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(124, 61, 119, 21);

        fir.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fir.setForeground(new java.awt.Color(153, 0, 255));
        getContentPane().add(fir);
        fir.setBounds(308, 61, 229, 27);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(308, 106, 79, 27);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(124, 190, 65, 21);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Phone No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(124, 227, 87, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Crime");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(124, 266, 49, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Evidence");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(124, 305, 75, 21);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Date Of Complaint");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(124, 344, 153, 21);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Date Of Arresting");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(124, 383, 146, 21);

        doarr.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        doarr.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(doarr);
        doarr.setBounds(330, 380, 221, 33);

        evd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        evd.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(evd);
        evd.setBounds(330, 303, 221, 30);

        doc.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        doc.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(doc);
        doc.setBounds(330, 340, 221, 33);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        cr.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cr.setForeground(new java.awt.Color(0, 0, 255));

        ph.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ph.setForeground(new java.awt.Color(0, 0, 255));

        add.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 255));

        na.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        na.setForeground(new java.awt.Color(0, 0, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(na, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String firid=fir.getText();
        String casesol="a";
        String name=null,address=null,phone=null,crime=null,evidence=null,dateofcomp=null,dateofarrest=null;
        try{
        Connection con=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",authorization.username,authorization.password);
        PreparedStatement pst=con.prepareStatement("select *from firdetails where firid=?");
        pst.setString(1, firid);
        ResultSet x=pst.executeQuery();
            while (x.next()) {
                    casesol = x.getString(10);
                    name=(x.getString(1) + " " + x.getString(2));
                    address=(x.getString(3));
                    phone=(x.getString(4));
                    crime=(x.getString(5));
                    evidence=(x.getString(7));
                    dateofcomp=(x.getString(12));
                    dateofarrest=(x.getString(11));
            }
            if (casesol.equals("a")){
                    JOptionPane.showMessageDialog(this, "FIR Code Not Found!");
             }
            else if (casesol.equals("NO")) {
                    JOptionPane.showMessageDialog(this,"This Case is Not Solved!");
             }
            else{
                na.setText(name);
                add.setText(address);
                ph.setText(phone);
                cr.setText(crime);
                evd.setText(evidence);
                doc.setText(dateofcomp);
                doarr.setText(dateofarrest);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new policepage().setVisible(true);
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
            java.util.logging.Logger.getLogger(case_solved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(case_solved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(case_solved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(case_solved.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new case_solved().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel cr;
    private javax.swing.JLabel doarr;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel evd;
    private javax.swing.JTextField fir;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel na;
    private javax.swing.JLabel ph;
    // End of variables declaration//GEN-END:variables
}
