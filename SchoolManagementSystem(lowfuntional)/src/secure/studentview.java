/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Nazibur
 */
public class studentview extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form studentview
     */
    public studentview() {
        initComponents();
        setTitle("School Management");
        setIcon();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        closebtn = new javax.swing.JButton();
        feetxt = new javax.swing.JTextField();
        fintxt = new javax.swing.JTextField();
        restxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        refbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/suuu.png"))); // NOI18N
        jLabel5.setText("Students Inforamation Checking");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 780, 90);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Insert ID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 120, 130, 40);

        idbox.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        idbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idboxActionPerformed(evt);
            }
        });
        idbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idboxKeyReleased(evt);
            }
        });
        jPanel1.add(idbox);
        idbox.setBounds(180, 120, 290, 40);

        closebtn.setBackground(new java.awt.Color(255, 204, 0));
        closebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closebtn.setText("CLOSE");
        closebtn.setPreferredSize(new java.awt.Dimension(41, 23));
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel1.add(closebtn);
        closebtn.setBounds(690, 450, 100, 40);

        feetxt.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jPanel1.add(feetxt);
        feetxt.setBounds(30, 270, 210, 50);

        fintxt.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        fintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fintxtActionPerformed(evt);
            }
        });
        jPanel1.add(fintxt);
        fintxt.setBounds(280, 270, 210, 50);

        restxt.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jPanel1.add(restxt);
        restxt.setBounds(540, 270, 200, 50);

        jLabel2.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel2.setText("ফিসঃ ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 220, 160, 30);

        jLabel3.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel3.setText("ফাইনঃ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 220, 100, 30);

        jLabel4.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel4.setText("রেজাল্টঃ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 220, 100, 30);

        refbtn.setBackground(new java.awt.Color(218, 207, 198));
        refbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        refbtn.setText("REFRESH");
        refbtn.setPreferredSize(new java.awt.Dimension(41, 23));
        refbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refbtnActionPerformed(evt);
            }
        });
        jPanel1.add(refbtn);
        refbtn.setBounds(290, 370, 190, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/44.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idboxActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_idboxActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void fintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fintxtActionPerformed

    private void idboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idboxKeyReleased
        // TODO add your handling code here:
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root","");
            
            String sql = "SELECT * FROM studentup WHERE ID=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, idbox.getText());
            
                rs = pst.executeQuery();
            
                
                    if(rs.next()){
                
                        String fe = rs.getString("Fees");
                        feetxt.setText(fe);
                        String fi = rs.getString("Fine");
                        fintxt.setText(fi);
                        String re = rs.getString("Result");
                        restxt.setText(re);
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_idboxKeyReleased

    private void refbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refbtnActionPerformed
        // TODO add your handling code here:
        fintxt.setText("");
        feetxt.setText("");
        restxt.setText("");
        
    }//GEN-LAST:event_refbtnActionPerformed

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
            java.util.logging.Logger.getLogger(studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JTextField feetxt;
    private javax.swing.JTextField fintxt;
    private javax.swing.JTextField idbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton refbtn;
    private javax.swing.JTextField restxt;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dgre.png"))); //To change body of generated methods, choose Tools | Templates.
    }

}
