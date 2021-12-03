/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.UserUtils;

import Admin.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class ViewUser extends javax.swing.JFrame {
    String UserID = "";
    AdminAndUserModule userModule;
    ArrayList<AdminAndUserModule> arrayUser;
    public ViewUser() {
        initComponents();
         arrayUser=new ArrayList<>();
         lbl_generate1.hide();
         fillArrayList();
         DisplayUser( new Service().username );
         System.out.println(new Service().username);
         System.out.println(UserID);
    }
      public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream("AdminAndUser.ser");
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayUser);                 
                      System.out.println(" Updated");
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              
      }
public void fillArrayList()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("AdminAndUser.ser"));
                    ObjectInputStream stream=new ObjectInputStream(fileInputStream);
                    for(Object objectPerson : (ArrayList)stream.readObject())
                    {
                       AdminAndUserModule personReading =(AdminAndUserModule) objectPerson;
                        arrayUser.add(personReading);
                    }

            }catch(IOException e){
                System.out.println("FileNotFound");   
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
    }
        public void DisplayUser(String username){
                    for(int i = 0; i < arrayUser.size() ; i++){
                               if(arrayUser.get(i).getUsername().equals(username)){
                                   hiding();
                                   txt_username.setText(arrayUser.get(i).getUsername());
                                   txt_firstname.setText(arrayUser.get(i).getFirstname());
                                   txt_lastname.setText(arrayUser.get(i).getLastname());
                                   UserID = arrayUser.get(i).getId();
                                   break;
                               }
                           }
        }
        public void hiding(){
                lbl_username.hide();
               
                lbl_firstname.hide();
                lbl_lastname.hide();
               
        }
  int xx , xy ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        lbl_generate1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_generate = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_lastname = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

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

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(153, 153, 153));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 100));

        lbl_generate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_generate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-stumbleupon-35.png"))); // NOI18N
        lbl_generate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_generate1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_generate1MouseExited(evt);
            }
        });
        jPanel1.add(lbl_generate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 40, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 900, 20));

        lbl_generate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generate35.png"))); // NOI18N
        lbl_generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_generateMouseEntered(evt);
            }
        });
        jPanel1.add(lbl_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 40, 40));

        lbl_password.setText("New Password");
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 90, 40));

        txt_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 320, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-keepass-30.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 40, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 410, 10));

        lbl_lastname.setText("New Lastname");
        jPanel1.add(lbl_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 90, 40));

        txt_lastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_lastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_lastnameFocusLost(evt);
            }
        });
        jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 370, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name-25 .png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 410, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 410, 20));

        lbl_firstname.setText("New Firstname");
        jPanel1.add(lbl_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 40));

        txt_firstname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_firstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_firstnameFocusLost(evt);
            }
        });
        jPanel1.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 370, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-name-30.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 40));

        lbl_username.setText("New Username");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 40));

        txt_username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 370, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 410, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/username.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 40));

        btn_view.setBackground(new java.awt.Color(255, 255, 102));
        btn_view.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-25.png"))); // NOI18N
        btn_view.setText("Update");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 160, 50));

        jLabel29.setFont(new java.awt.Font("Bell MT", 3, 28)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/multipleUser.png"))); // NOI18N
        jLabel29.setText("View User");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setForeground(Color.red);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_closeMouseExited

    private void lbl_generate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generate1MouseClicked
        String generatedPass = new Service().autoGeneratedPassword();
        lbl_password.hide();
        txt_password.setText(generatedPass);
    }//GEN-LAST:event_lbl_generate1MouseClicked

    private void lbl_generate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generate1MouseExited
        lbl_generate1.hide();
        lbl_generate.show();
    }//GEN-LAST:event_lbl_generate1MouseExited

    private void lbl_generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generateMouseEntered
        lbl_generate.hide();
        lbl_generate1.show();
    }//GEN-LAST:event_lbl_generateMouseEntered

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained

        lbl_password.hide();
    }//GEN-LAST:event_txt_passwordFocusGained

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        if( txt_password.getText().trim().equals("")){
            lbl_password.show();
        }
    }//GEN-LAST:event_txt_passwordFocusLost

    private void txt_lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lastnameFocusGained
        lbl_lastname.hide();
    }//GEN-LAST:event_txt_lastnameFocusGained

    private void txt_lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lastnameFocusLost
        if(  txt_lastname.getText().trim().equals("")){
            lbl_lastname.show();
        }
    }//GEN-LAST:event_txt_lastnameFocusLost

    private void txt_firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_firstnameFocusGained
        lbl_firstname.hide();
    }//GEN-LAST:event_txt_firstnameFocusGained

    private void txt_firstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_firstnameFocusLost
        if(  txt_firstname.getText().trim().equals("")){
            lbl_firstname.show();
        }
    }//GEN-LAST:event_txt_firstnameFocusLost

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        lbl_username.hide();
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        if(txt_username.getText().trim().equals("")){
            lbl_username.show();
        }
    }//GEN-LAST:event_txt_usernameFocusLost

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
            String username = txt_username.getText();
            String lastname = txt_lastname.getText();
            String firstname = txt_firstname.getText();
            String password = txt_password.getText();
        if(txt_password.getText().trim().equals("")){
                           if(!isUsernameExist(username)){
                                              for(int i = 0; i < arrayUser.size() ; i++){
                                                if(arrayUser.get(i).getId().equals(UserID)){
                                                        arrayUser.get(i).setUsername(username);
                                                        arrayUser.get(i).setLastname(lastname);
                                                        arrayUser.get(i).setFirstname(firstname);
                                                            SavingandRetrieving();
                                                            JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATED", "UPDATE SUCCESS", WIDTH, null);
                                                            this.dispose();
                                                        break;
                                                }
                                        }
                           }else{
                                   JOptionPane.showMessageDialog(null, "Username Already Existed", "Username Authenticator",  JOptionPane.WARNING_MESSAGE);
                          }
            }else{
          
                                                 for(int i = 0; i < arrayUser.size() ; i++){
                                                        if(arrayUser.get(i).getId().equals(UserID)){
                                                                arrayUser.get(i).setUsername(username);
                                                                arrayUser.get(i).setLastname(lastname);
                                                                arrayUser.get(i).setFirstname(firstname);
                                                                arrayUser.get(i).setPassword(new Service().md5_Password(password));
                                                                    SavingandRetrieving();
                                                                     JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATED", "UPDATE SUCCESS", WIDTH, null);
                                                                    this.dispose();
                                                                break;
                                                        }
                                                    }
                                      
            }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          xx = evt.getX();
     xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged
        
    public boolean isUsernameExist(String username){
        boolean isExist = false;
                      for(int i = 0; i < arrayUser.size() ; i++){
                               if(!arrayUser.get(i).getId().equals(UserID)){
                                            if(arrayUser.get(i).getUsername().equals(username)){
                                                isExist = true;
                                                break;
                                            }
                               }
                           }
        return isExist;
    }
    
  public boolean isOldPasswordSame(String password){
        boolean isTrue = false;
                      for(int i = 0; i < arrayUser.size() ; i++){
                               if(arrayUser.get(i).getId().equals(UserID)){
                                         if(arrayUser.get(i).getPassword().equals(new Service().md5_Password(password))){
                                             isTrue = true;
                                             break;
                                         }
                               }
                           }
        return isTrue;
    }
    
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
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_firstname;
    private javax.swing.JLabel lbl_generate;
    private javax.swing.JLabel lbl_generate1;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
