
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
public class update extends javax.swing.JFrame {

    /**
     * Creates new form update
     */
    public update() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jYearChooser1 = new CalendarBean.JYearChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTF1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CB1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTF4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        m1 = new CalendarBean.JMonthChooser();
        d1 = new CalendarBean.JDayChooser();
        jTF6 = new javax.swing.JTextField();
        jTF7 = new javax.swing.JTextField();
        y1 = new CalendarBean.JYearChooser();
        y2 = new CalendarBean.JYearChooser();
        m2 = new CalendarBean.JMonthChooser();
        d2 = new CalendarBean.JDayChooser();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTF8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jTF9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTF10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel10.setText("jLabel10");

        jLabel14.setText("jLabel14");

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BOOKING NO.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));
        getContentPane().add(jTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 168, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, -1, -1));
        getContentPane().add(jTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 168, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(jTF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 168, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CUSTOMER ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 220, -1, -1));

        CB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AADHAR", "VOTER ID", "PAN" }));
        getContentPane().add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 114, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONTACT NO.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, -1, -1));
        getContentPane().add(jTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 168, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ROOM NO.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        jTF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 168, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel7.setText("UPDATE DETAILS :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CHECK IN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CHECK OUT");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));
        getContentPane().add(jTF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 177, -1));

        jTF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 175, -1));
        getContentPane().add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));
        getContentPane().add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 113, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NO OF DAYS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 415, -1, -1));
        getContentPane().add(jTF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 168, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ROOM TYPE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 124, -1, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "NON-AC" }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 113, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("BED TYPE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 170, -1, -1));

        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "DOUBLE", "DELUXE" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 113, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("CHARGES PER DAY");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        getContentPane().add(jTF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 168, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("TOTAL AMOUNT");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));
        getContentPane().add(jTF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 168, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("SHOW DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 571, -1, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("ROOM TYPE");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 342, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 168, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("BED TYPE");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 168, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("CUSTOMER ID");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 168, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 571, -1, 50));

        jButton4.setBackground(new java.awt.Color(153, 255, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("REPAY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, 50));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pictures\\u1.jpg")); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -10, 1210, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rishita","root","opjs");
    int a=Integer.parseInt(jTF1.getText());
    String b=jTF2.getText();
    String c=jTF3.getText();
    String d=CB1.getSelectedItem().toString();
    jTextField3.setText(""+d);
  
    Long e=Long.parseLong(jTF4.getText());
    int f=Integer.parseInt(jTF5.getText());
    
    String R=cb2.getSelectedItem().toString();
    String B=cb3.getSelectedItem().toString();
int k =0;
      if(R.equals("AC")&& B.equals("SINGLE")){
            k=3000;
      }else if(R.equals("NON-AC") && B.equals("SINGLE")){
        k=2500;
      }else if(R.equals("AC") && B.equals("DOUBLE")){
         k=4000;
      }else if(R.equals("NON-AC") && B.equals("DOUBLE")){
      k=4500;
        }else if(R.equals("AC") && B.equals("DELUXE")){
           k=6000;
        }else if(R.equals("NON-AC") && B.equals("DELUXE")){
              k=5000;
        } jTF9.setText(""+k);
      
    
    int a1,b1,c1;
    a1=y1.getYear();
    b1=m1.getMonth()+1;
    c1=d1.getDay();
    jTF6.setText(+a1+"-"+b1+"-"+c1);
    int a2,b2,c2;
    a2=y2.getYear();
    b2=m2.getMonth()+1;
    c2=d2.getDay();
    jTF7.setText(+a2+"-"+b2+"-"+c2);
    int nod;
        nod= c2-c1;
        jTF8.setText(""+nod);
 
    int T;
    T=nod*k;
    jTF10.setText(""+T);
    jTextField1.setText(""+R);
    jTextField2.setText(""+B);
    
    Statement stmt=con.createStatement();
    String q="update imperial set booking_no="+a+",name='"+b+"',contact_no="+e+",room_no="+f+",no_of_days="+nod+",charges_per_day="+k+",total_amount="+T+",room_type='"+R+"',bed_type='"+B+"',address='"+c+"',customer_id='"+d+"' where booking_no="+a+";";
    stmt.executeUpdate(q);
    stmt.close();
    con.close();
}
catch (Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}
JOptionPane.showMessageDialog(null,"YOUR UPDATE SUCCESSFULL");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF5ActionPerformed
      
    }//GEN-LAST:event_jTF5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
    Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rishita","root","opjs");
Statement stmt=con.createStatement();
int a=Integer.parseInt(jTF1.getText());
String q="select * from imperial where booking_no= "+a+";";
ResultSet rs=stmt.executeQuery(q);
rs.next();
String b=rs.getString("name");
String c=rs.getString("address");
String d=rs.getString("customer_id");
int e=rs.getInt("contact_no");
int f=rs.getInt("room_no");
int g=rs.getInt("no_of_days");
int h=rs.getInt("charges_per_day");
int i=rs.getInt("total_amount");
String j=rs.getString("room_type");
String k=rs.getString("bed_type");
jTF2.setText(""+b);
jTF3.setText(""+c);
jTextField3.setText(""+d);
jTF4.setText(""+e);
jTF5.setText(""+f);
jTF8.setText(""+g);
jTF9.setText(""+h);
jTF10.setText(""+i);
jTextField1.setText(""+j);
jTextField2.setText(""+k);
rs.close();
stmt.close();
con.close();
}
catch (Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


JOptionPane.showMessageDialog(null,"YOUR BALANCED AMOUNT WILL BE REFUNDED SOON");
new paymentmode().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTF1.setText("");
jTF2.setText("");
jTF3.setText("");
jTF4.setText("");
jTF5.setText("");
jTF6.setText("");
jTF7.setText("");
jTF8.setText("");
jTF9.setText("");
jTF10.setText("");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private CalendarBean.JDayChooser d1;
    private CalendarBean.JDayChooser d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF10;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    private javax.swing.JTextField jTF4;
    private javax.swing.JTextField jTF5;
    private javax.swing.JTextField jTF6;
    private javax.swing.JTextField jTF7;
    private javax.swing.JTextField jTF8;
    private javax.swing.JTextField jTF9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private CalendarBean.JYearChooser jYearChooser1;
    private CalendarBean.JMonthChooser m1;
    private CalendarBean.JMonthChooser m2;
    private CalendarBean.JYearChooser y1;
    private CalendarBean.JYearChooser y2;
    // End of variables declaration//GEN-END:variables
}
