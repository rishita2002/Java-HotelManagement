import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class generatebill extends javax.swing.JFrame {
    private int CVV;

    /**
     * Creates new form generatebill
     */
    public generatebill() {
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
        jTF1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTF4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 194, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("GRAND TOTAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 102));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("DISPLAY ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENTER YOUR CVV");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 102));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("MOVE TO HOME PAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 210, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ENTER BOOKING NO.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jTF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 194, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("# ENTER FOLLOWING TWO DETAILS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, -1));

        jButton4.setBackground(new java.awt.Color(204, 255, 102));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setText("CLEAR TEXT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 140, 50));

        l4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 200, 30));

        jButton5.setBackground(new java.awt.Color(204, 255, 102));
        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton5.setText("PAYMENT SUCCESSFULL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 210, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CUSTOMER NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        l5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ENTER CUSTOMER ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));
        getContentPane().add(jTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ENTER CARD NUMBER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));
        getContentPane().add(jTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pictures\\krabi-best-beach-resorts.jpg.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rishita","root","opjs");
    Statement stmt=con.createStatement();
    int a;
    a=Integer.parseInt(jTF1.getText());
    int b=Integer.parseInt(jTF4.getText());
int d=Integer.parseInt(jTF5.getText()); 
int e=Integer.parseInt(jTF7.getText());
    String q1="select name,total_amount from imperial where booking_no="+a+";";
    ResultSet rs=stmt.executeQuery(q1);
    if(rs.next()){
        String c=rs.getString("name");
        int h=rs.getInt("total_amount");
       l5.setText(""+c);
       l4.setText(""+h);
    }

    else{
        JOptionPane.showMessageDialog(null,"ENTERED BOOKING NUMBER DOES NOT EXIST");
    }
    String q2="update imperial set CVV=' "+b+"'  where booking_no="+a+";";
    String q3="update imperial set customer_id='"+d+"' where booking_no="+a+";";
    String q4="update imperial set card_no='"+e+"' where booking_no="+a+";";
       stmt.executeUpdate(q2);
       stmt.executeUpdate(q3);
       stmt.executeUpdate(q4);
       rs.close();
       stmt.close();
       con.close();
       
    }   
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
       }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new bookings().setVisible(true);  
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTF1.setText("");
jTF4.setText("");
l4.setText("");
l5.setText("");
jTF5.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String z =jTF1.getText();
            new bill(z).setVisible(true);
            this.setVisible(false);
            String a=l5.getText();
            JOptionPane.showMessageDialog(null,"PAYMENT SUCCESSFULL USER '"+a+"'");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(generatebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generatebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generatebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generatebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generatebill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF4;
    private javax.swing.JTextField jTF5;
    private javax.swing.JTextField jTF7;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    // End of variables declaration//GEN-END:variables
}
