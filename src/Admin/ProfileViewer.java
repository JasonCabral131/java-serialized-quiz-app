/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
public class ProfileViewer extends javax.swing.JFrame {

   String AdminID = "";
   AdminAndUserModule admin;
   public ArrayList<AdminAndUserModule> arrayAdmin;
    public ProfileViewer() {
        initComponents();
         arrayAdmin=new ArrayList<>();
         lbl_generate1.hide();
         fillArrayList();
         DisplayInformation(new Service().loginAdminOrUserID);
         this.setFocusable(rootPaneCheckingEnabled);
         System.out.println(AdminID);
    }

     public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream(new File("AdminAndUser.ser"));
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayAdmin);                 
                      System.out.println(" Updated");
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              
      }
     
     public void Alldeletor(){
         arrayAdmin.clear();
     }
public void fillArrayList()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("AdminAndUser.ser"));
                    ObjectInputStream stream=new ObjectInputStream(fileInputStream);
                    for(Object objectPerson : (ArrayList)stream.readObject())
                    {
                       AdminAndUserModule personReading =(AdminAndUserModule) objectPerson;
                        arrayAdmin.add(personReading);
                    }
                    fileInputStream.close();
                    stream.close();
            }catch(IOException e){
                System.out.println("FileNotFound");   
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
    }
        public void DisplayInformation(String userID){
                    for(int i = 0; i < arrayAdmin.size() ; i++){
                               if(arrayAdmin.get(i).getId().equals(userID)){
                                   hiding();
                                   welcome_user.setText(arrayAdmin.get(i).getUsername());
                                   txt_username.setText(arrayAdmin.get(i).getUsername());
                                   txt_firstname.setText(arrayAdmin.get(i).getFirstname());
                                   txt_lastname.setText(arrayAdmin.get(i).getLastname());
                                   AdminID = arrayAdmin.get(i).getId();
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

        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        welcome_user = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        close = new javax.swing.JLabel();
        lbl_generate1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        welcome_user.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        welcome_user.setForeground(new java.awt.Color(0, 204, 204));
        welcome_user.setText("Jason Cabral");
        jPanel1.add(welcome_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 370, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, 30));

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

        jLabel28.setFont(new java.awt.Font("Bell MT", 3, 28)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 204, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ViewUser.png"))); // NOI18N
        jLabel28.setText("Welcome back");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 100));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
                for(int i = 0; i < arrayAdmin.size() ; i++){
                    if(arrayAdmin.get(i).getId().equals(AdminID)){
                        arrayAdmin.get(i).setUsername(username);
                        arrayAdmin.get(i).setLastname(lastname);
                        arrayAdmin.get(i).setFirstname(firstname);
                        new Service().loginUsername = username;
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
            String oldPass = JOptionPane.showInputDialog(null, "Enter your old password", "Password Authenticator", JOptionPane.WARNING_MESSAGE);
            if(oldPass != null ){
                if(!oldPass.isEmpty()){
                    if(isOldPasswordSame(oldPass)){
                        if(!isUsernameExist(username)){
                            for(int i = 0; i < arrayAdmin.size() ; i++){
                                if(arrayAdmin.get(i).getId().equals(AdminID)){
                                    arrayAdmin.get(i).setUsername(username);
                                    arrayAdmin.get(i).setLastname(lastname);
                                    arrayAdmin.get(i).setFirstname(firstname);
                                    arrayAdmin.get(i).setPassword(new Service().md5_Password(password));
                                    new Service().loginUsername = username;
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
                        JOptionPane.showMessageDialog(null, "Invalid old Password not the same", "Password Authenticator",  JOptionPane.WARNING_MESSAGE);
                    }
                }
            }else{
                System.out.println("null");
            }
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

     public boolean isUsernameExist(String username){
        boolean isExist = false;
                      for(int i = 0; i < arrayAdmin.size() ; i++){
                               if(!arrayAdmin.get(i).getId().equals(AdminID)){
                                            if(arrayAdmin.get(i).getUsername().equals(username)){
                                                isExist = true;
                                                break;
                                            }
                               }
                           }
        return isExist;
    }
    
  public boolean isOldPasswordSame(String password){
        boolean isTrue = false;
                      for(int i = 0; i < arrayAdmin.size() ; i++){
                               if(arrayAdmin.get(i).getId().equals(AdminID)){
                                         if(arrayAdmin.get(i).getPassword().equals(new Service().md5_Password(password))){
                                             isTrue = true;
                                             break;
                                         }
                               }
                           }
        return isTrue;
    }
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
            java.util.logging.Logger.getLogger(ProfileViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
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
    private javax.swing.JLabel welcome_user;
    // End of variables declaration//GEN-END:variables
}
