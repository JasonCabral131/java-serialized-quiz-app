package Login;

import Admin.AdminAndUserModule;
import Admin.Dashboard;
import Admin.Service;
import Users.Main.Main;
import java.awt.Color;
import java.awt.Component;
import  java.io.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class LoginForm extends javax.swing.JFrame {
    Info  info = new Info();
    ArrayList<AdminAndUserModule> arrayAdmin;
    public LoginForm() {
        initComponents();
         this.setTitle("Knowledge");
         arrayAdmin=new ArrayList<>();
        
        hidePass.hide();
         fillArrayList();
       
     this.setFocusable(rootPaneCheckingEnabled);
    }
        public void fillArrayList()  {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("AdminAndUser.ser"));
                    ObjectInputStream stream=new ObjectInputStream(fileInputStream);
                    for(Object objectAdmin : (ArrayList)stream.readObject())
                    {
                       AdminAndUserModule module = (AdminAndUserModule) objectAdmin;
                        arrayAdmin.add(module);
                    }
                           copy();
            }catch(IOException e){
                System.out.println("FileNotFound");   
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_minimize = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_password = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        hidePass = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        createAccount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_minimize.setForeground(new java.awt.Color(204, 204, 204));
        lbl_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_minimize.setText("_");
        lbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseExited(evt);
            }
        });
        jPanel1.add(lbl_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 30, 40));

        lbl_exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 0, 51));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });
        jPanel1.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 30, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/amalogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 240));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACLC COLLEGE TACLOBAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 630, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 620, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("students");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 130, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 330, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 440, 20));

        lbl_password.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password.setText("Enter Password");
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 140, 40));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-keepass-30.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 30, 40));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/username.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 30, 40));

        lbl_username.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        lbl_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_username.setText("Enter Username");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 150, 40));

        txt_username.setBackground(new java.awt.Color(231, 231, 231));
        txt_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 400, 40));

        txt_password.setBackground(new java.awt.Color(231, 231, 231));
        txt_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 360, 40));

        hidePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-closed-eye-25.png"))); // NOI18N
        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassMouseClicked(evt);
            }
        });
        jPanel1.add(hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 400, 40, 30));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-25.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 400, 40, 30));

        btn_login.setBackground(new java.awt.Color(51, 255, 255));
        btn_login.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Sign in");
        btn_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 350, 60));

        createAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createAccount.setForeground(new java.awt.Color(104, 204, 255));
        createAccount.setText("click here....");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountMouseExited(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Don't have an Account? ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, -1, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 440, 20));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ACLCLOGOGO.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 460, 310));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/border.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 700, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("a week!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 230, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("financial assistance ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 250, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("offered to qualified");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 240, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Scholarship  and  ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 230, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Class are");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 220, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("only 3 days");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 230, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 40));

        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("Copyright @Jason P. Cabral");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseEntered
       lbl_minimize.setForeground(Color.red);
    }//GEN-LAST:event_lbl_minimizeMouseEntered

    private void lbl_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseExited
        lbl_minimize.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_lbl_minimizeMouseExited
 int xx , xy ;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xx = evt.getX();
     xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
     
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
       
    }//GEN-LAST:event_lbl_exitMouseExited

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseClicked
       this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
       hidePass.show();
       showPass.hide();
       txt_password.setEchoChar((char) 0);
    }//GEN-LAST:event_showPassMouseClicked

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked
       hidePass.hide();
       showPass.show();
       txt_password.setEchoChar('*');
    }//GEN-LAST:event_hidePassMouseClicked

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
          lbl_username.hide();
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        if( txt_username.getText().trim().equals("")){
            lbl_username.show();
      }
    }//GEN-LAST:event_txt_usernameFocusLost

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
       lbl_password.hide();
    }//GEN-LAST:event_txt_passwordFocusGained

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
      if(txt_password.getText().trim().equals("")){
           lbl_password.show();
      }
    }//GEN-LAST:event_txt_passwordFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
          String username = txt_username.getText();
          String password = txt_password.getText();
         String AdminOrUserID ="";
          if(username.isEmpty() || password.isEmpty()){
              JOptionPane.showMessageDialog(null, "Username & Password Must not be Empty!!", "Login Authenticator", JOptionPane.WARNING_MESSAGE); 
              return;
          }
           boolean isLogin = false;
           String toWhere = "";
            for(AdminAndUserModule admin_User: arrayAdmin){
                    if(admin_User.getUsername().equals(username) && admin_User.getPassword().equals(new Service().md5_Password(password))){
                        isLogin = true;
                        toWhere = admin_User.getUser();
                        AdminOrUserID = admin_User.getId();
                    }
            }
            if(isLogin){
                    
                            if(toWhere.equals("admin")){
                                new Service().loginUsername = username;
                                new Service().loginAdminOrUserID =  AdminOrUserID;
                                new Dashboard().setVisible(true);
                                this.dispose();
                                
                            }else if (toWhere.equals( "user")){
                                 new Service().loginUsername = username;
                                 new Service().loginAdminOrUserID =  AdminOrUserID;
                                 new Main().setVisible(true);
                                  this.dispose();                              
                            }
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid Email & Password", "Login Authenticator", JOptionPane.WARNING_MESSAGE);                    
                    }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
     
        
        if(info.isActive()){
            info.setVisible(false);
        }else{
              info.setVisible(true);
        }
           
               
           
     
    }//GEN-LAST:event_jLabel16MouseClicked

    private void createAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseEntered
       createAccount.setForeground(new Color(51,255,0));
    }//GEN-LAST:event_createAccountMouseEntered

    private void createAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseExited
      createAccount.setForeground(new Color(104,204,255));
    }//GEN-LAST:event_createAccountMouseExited

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
       new CreateAccount().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_createAccountMouseClicked

        
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel createAccount;
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel showPass;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
   public void copy(){
        
          copyright.setText("Copyright @Jason P.Cabral");
    }
}
