/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_bangladesh;

import java.awt.Color;
import javax.swing.JFrame;
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author joyultimates
 */
public class login extends javax.swing.JFrame {

    
    ImageIcon ii,icon;
static String USERID,Password;

    public login() {
        initComponents();
         icon = new ImageIcon(getClass().getResource("image\\bangladesh map_316px.png"));
         setIconImage(icon.getImage()); // set java frame icon
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));  // to make background transparent
       jPanel1.setBackground(new Color(0,0,0,0));
        
        AnimationClass anim = new AnimationClass();
        anim.jLabelYUp(200, 50, 100, 2, jLabelHello);
        
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
        jLabeMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelHello = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabeMin.setFont(new java.awt.Font("Adobe Devanagari", 1, 24)); // NOI18N
        jLabeMin.setForeground(new java.awt.Color(255, 255, 102));
        jLabeMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/image/minimize.png"))); // NOI18N
        jLabeMin.setToolTipText("");
        jLabeMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabeMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabeMinMouseExited(evt);
            }
        });
        jPanel1.add(jLabeMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 20));

        jLabelClose.setFont(new java.awt.Font("Adobe Devanagari", 0, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/image/close.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jTextField2.setBackground(new java.awt.Color(53, 59, 72));
        jTextField2.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 255));
        jTextField2.setText("Enter your user id");
        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 204, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 290, 20));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(53, 59, 72));
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 255));
        jPasswordField1.setText("Enter your password");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 290, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 204, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 290, 20));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile no. :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jTextField1.setBackground(new java.awt.Color(53, 59, 72));
        jTextField1.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 255));
        jTextField1.setText("valid mobile no.");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 204, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 290, 20));

        jButton1.setBackground(new java.awt.Color(53, 59, 72));
        jButton1.setForeground(new java.awt.Color(53, 59, 72));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/login-button-png-18022.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 80, 30));

        jButton3.setBackground(new java.awt.Color(53, 59, 72));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/sign-up-button-png-28490.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 70, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/Untitled.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -40, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hello_bangladesh/login.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 900, 450));

        jLabelHello.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabelHello.setForeground(new java.awt.Color(230, 35, 118));
        jLabelHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHello.setText("Voice of Bangladesh");
        jLabelHello.setToolTipText("");
        jLabelHello.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabelHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int choice=0;
       USERID=jTextField2.getText();
                Password=new String(jPasswordField1.getPassword());
                        //System.out.println(name);
                      //  System.out.println(password);
                if(USERID.isEmpty()|| USERID.isEmpty())
                    JOptionPane.showMessageDialog(null,"Field Is Empty");
                else
                    choice =JOptionPane.showConfirmDialog(null, "Confirm");
               
                if(choice == 0 )
                {
                    DatabaseOperation operation1 = new DatabaseOperation();
                    operation1.connect();
                    //file.writeInfoToFile(name,password);
                    //if(file1.checkInfoFromFile(USERID, Password))
                    if(operation1.checkData(USERID, Password))    
                    {
                       
                    JOptionPane.showMessageDialog(null,"Matched");
                    otp otp = new otp();
                    otp.setVisible(true);
                    this.dispose();
                    }
                     else JOptionPane.showMessageDialog(null,"Not Matched");
                }   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        signup signup = new signup();
       signup.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void jLabeMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabeMinMouseClicked

    private void jLabeMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeMinMouseEntered
        ii = new ImageIcon(getClass().getResource("image\\minimize1.png"));
        jLabeMin.setIcon(ii);
    }//GEN-LAST:event_jLabeMinMouseEntered

    private void jLabeMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeMinMouseExited
        ii = new ImageIcon(getClass().getResource("image\\minimize.png"));
        jLabeMin.setIcon(ii);
    }//GEN-LAST:event_jLabeMinMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        ii = new ImageIcon(getClass().getResource("image\\close1.png"));
        jLabelClose.setIcon(ii);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        ii = new ImageIcon(getClass().getResource("image\\close.png"));
        jLabelClose.setIcon(ii);
    }//GEN-LAST:event_jLabelCloseMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabeMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelHello;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}