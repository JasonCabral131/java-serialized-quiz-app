/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;
import Admin.CreatingQuiz.Easy.Easy;
import Admin.showingQuiz.ShowEasy;
import Login.LoginForm;
import Users.Main.QuizResult;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author Jason
 */
public class Dashboard extends javax.swing.JFrame {

     QuizResult quizResult;
          ArrayList<QuizResult> arrayQuizResult; 
    public Dashboard() {
        this.setTitle("Knowledge");
         arrayQuizResult = new ArrayList<>();
        initComponents();
        this.setFocusable(rootPaneCheckingEnabled);
        showDate();
        showTime();
          txt_easy.setEnabled(false);
        txt_hard.setEnabled(false);
        txt_insane.setEnabled(false);
        fillArrayListQuizResult();
        DescendingEasy();
        DescendingHard();
        DescendingInsane();
    }

      public void fillArrayListQuizResult()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("QuizResult.ser"));
                    ObjectInputStream stream=new ObjectInputStream(fileInputStream);
                    for(Object objectPerson : (ArrayList)stream.readObject())
                    {
                       QuizResult quizR =(QuizResult) objectPerson;
                        arrayQuizResult.add(quizR);
                    }

            }catch(IOException e){
                System.out.println("FileNotFound");   
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
    }
      public void DescendingEasy(){
           Comparator<QuizResult> feeComparator = (quizR1, quizR2) -> (int) (quizR1.getScore() - quizR2.getScore());
            arrayQuizResult.sort(Collections.reverseOrder(feeComparator));
            int counter = 1;
            for(QuizResult QR: arrayQuizResult){
                if(counter != 11){
                    if(!QR.getScore().equals(0)){
                         if(QR.getLevel().equals("easy")){
                        String ValueOf = txt_easy.getText();
                    ValueOf += "\n  " + counter + ". " + QR.getUsername() + "( " + QR.getScore() + ")  - " + QR.getDate();
                    txt_easy.setText(ValueOf);
                    counter ++;
                    }
                    }
                   
                    
                    
                }
                    
            }
      }
       public void DescendingHard(){
           Comparator<QuizResult> feeComparator = (quizR1, quizR2) -> (int) (quizR1.getScore() - quizR2.getScore());
            arrayQuizResult.sort(Collections.reverseOrder(feeComparator));
            int counter = 1;
            for(QuizResult QR: arrayQuizResult){
                if(counter != 11){
                    if(!QR.getScore().equals(0)){
                           if(QR.getLevel().equals("hard")){
                        String ValueOf = txt_hard.getText();
                    ValueOf += "\n  " + counter + ". " + QR.getUsername() + "( " + QR.getScore() + ")  - " + QR.getDate();
                    txt_hard.setText(ValueOf);
                    counter ++;
                    }
                    }
                 
                    
                    
                }
                    
            }
      }
        public void DescendingInsane(){
           Comparator<QuizResult> feeComparator = (quizR1, quizR2) -> (int) (quizR1.getScore() - quizR2.getScore());
            arrayQuizResult.sort(Collections.reverseOrder(feeComparator));
            int counter = 1;
            for(QuizResult QR: arrayQuizResult){
                if(counter != 11){
                    if(!QR.getScore().equals(0)){
                          if(QR.getLevel().equals("insane")){
                        String ValueOf = txt_insane.getText();
                        ValueOf += "\n  " + counter + ". " + QR.getUsername() + "( " + QR.getScore() + ")  - " + QR.getDate();
                        txt_insane.setText(ValueOf);
                        counter ++;
                     }
                    }
                  
                    
                    
                }
                    
            }
      }
   
 void showDate()
        {
            Date d= new Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            lbl_date.setText(s.format(d));
        }
        void showTime()
        {
           new Timer(0, new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                     Date d= new Date();
             SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
             lbl_time.setText(s.format(d));
                }

            
            }).start();
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
        jpl_dashboard = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpl_admin = new javax.swing.JPanel();
        lbl_admin = new javax.swing.JLabel();
        jpl_users = new javax.swing.JPanel();
        lbl_users = new javax.swing.JLabel();
        jpl_showingQuiz = new javax.swing.JPanel();
        lbl_showQuiz = new javax.swing.JLabel();
        jpl_creatingQuiz = new javax.swing.JPanel();
        lbl_creatingQuiz = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_easy = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_hard = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_insane = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        lbl_minimize = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
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

        jpl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        jpl_dashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(51, 204, 255));
        lbl_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LeaderBoardGILID.png"))); // NOI18N
        lbl_dashboard.setText("Leaderboard");
        jpl_dashboard.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 360, 110));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 140));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACLC COLLEGE ");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 250, -1));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 10));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, 10));

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Taclocban Inc.");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 170));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 220, 10));

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Top 10 Easy Category");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 300, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, 50, 50));

        jpl_admin.setBackground(new java.awt.Color(245, 245, 245));
        jpl_admin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(153, 153, 153));
        lbl_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin.png"))); // NOI18N
        lbl_admin.setText("Admin");
        lbl_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_adminMouseExited(evt);
            }
        });
        jpl_admin.add(lbl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jPanel1.add(jpl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 360, 110));

        jpl_users.setBackground(new java.awt.Color(245, 245, 245));
        jpl_users.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_users.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_users.setForeground(new java.awt.Color(153, 153, 153));
        lbl_users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/multipleUser.png"))); // NOI18N
        lbl_users.setText("Users      ");
        lbl_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_usersMouseExited(evt);
            }
        });
        jpl_users.add(lbl_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 360, 110));

        jpl_showingQuiz.setBackground(new java.awt.Color(245, 245, 245));
        jpl_showingQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_showingQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_showQuiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_showQuiz.setForeground(new java.awt.Color(153, 153, 153));
        lbl_showQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_showQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/showQuiz.png"))); // NOI18N
        lbl_showQuiz.setText("Show Quiz");
        lbl_showQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_showQuizMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_showQuizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_showQuizMouseExited(evt);
            }
        });
        jpl_showingQuiz.add(lbl_showQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_showingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 360, 110));

        jpl_creatingQuiz.setBackground(new java.awt.Color(245, 245, 245));
        jpl_creatingQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_creatingQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_creatingQuiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_creatingQuiz.setForeground(new java.awt.Color(153, 153, 153));
        lbl_creatingQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_creatingQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/createQuiz.png"))); // NOI18N
        lbl_creatingQuiz.setText("Create Quiz");
        lbl_creatingQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_creatingQuizMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_creatingQuizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_creatingQuizMouseExited(evt);
            }
        });
        jpl_creatingQuiz.add(lbl_creatingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_creatingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 110));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insaneLeaderBoard.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 160, 130));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/easyLeaderBoard.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 160, 130));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hardLeaderBoard.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 160, 130));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 1160, 10));

        jLabel16.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Top 10 Hard Category");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 300, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 220, 10));

        jLabel17.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Top 10 Insane Category");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 300, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 350, 220, 10));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-time-18.png"))); // NOI18N

        lbl_date.setText("Date");

        lbl_time.setText("Time");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-polyline-20.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel26.setText("Logout");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Male_User_16.png"))); // NOI18N
        jLabel27.setText("Login as: Admin");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_date)
                .addGap(51, 51, 51)
                .addComponent(lbl_time)
                .addGap(95, 95, 95)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 1150, 40));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LeaderBoard.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 160, 70));

        jLabel28.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 204, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Stay Safe & Healthy");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 220, 30));

        jLabel29.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Leaderboard");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 170, 40));

        jLabel31.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trophy.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, 60, 40));

        jLabel32.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trophy.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 60, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 280, 20));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, -1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lola.png"))); // NOI18N
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 160, 130));

        txt_easy.setColumns(20);
        txt_easy.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_easy.setForeground(new java.awt.Color(255, 0, 51));
        txt_easy.setRows(10);
        txt_easy.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_easy.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_easy.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_easy.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane2.setViewportView(txt_easy);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 360, 310));

        txt_hard.setColumns(20);
        txt_hard.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_hard.setForeground(new java.awt.Color(255, 0, 51));
        txt_hard.setRows(10);
        txt_hard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_hard.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_hard.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_hard.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane3.setViewportView(txt_hard);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 360, 310));

        txt_insane.setColumns(20);
        txt_insane.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_insane.setForeground(new java.awt.Color(255, 0, 51));
        txt_insane.setRows(10);
        txt_insane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_insane.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_insane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_insane.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane4.setViewportView(txt_insane);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 360, 310));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/angry.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 80, 160, 130));

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
        jPanel1.add(lbl_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 0, 30, 40));

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
        jPanel1.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, 30, 40));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1150, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
       int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to exit", "Logout Exit",JOptionPane.YES_NO_OPTION);
        if(p == 0){
              if(pv.isVisible()){              
                pv.dispose();
            }
            this.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void lbl_creatingQuizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseEntered
       setColor(jpl_creatingQuiz, lbl_creatingQuiz);
       resetColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_creatingQuizMouseEntered

    private void lbl_creatingQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseExited
       resetColor(jpl_creatingQuiz, lbl_creatingQuiz);
       setColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_creatingQuizMouseExited

    private void lbl_showQuizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_showQuizMouseEntered
       setColor(jpl_showingQuiz, lbl_showQuiz);
       resetColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_showQuizMouseEntered

    private void lbl_showQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_showQuizMouseExited
      resetColor(jpl_showingQuiz, lbl_showQuiz);
       setColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_showQuizMouseExited

    private void lbl_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_usersMouseEntered
        setColor( jpl_users,  lbl_users);
       resetColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_usersMouseEntered

    private void lbl_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_usersMouseExited
        resetColor(jpl_users,  lbl_users);
       setColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_usersMouseExited

    private void lbl_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseEntered
       setColor(  jpl_admin,   lbl_admin);
       resetColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_adminMouseEntered

    private void lbl_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseExited
     resetColor(jpl_admin,   lbl_admin);
       setColor(jpl_dashboard, lbl_dashboard);
    }//GEN-LAST:event_lbl_adminMouseExited

    private void lbl_creatingQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseClicked
        this.dispose();
        
            new Easy().setVisible(true);
       
    }//GEN-LAST:event_lbl_creatingQuizMouseClicked

    private void lbl_showQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_showQuizMouseClicked
       this.dispose();
       new ShowEasy().setVisible(true);
    }//GEN-LAST:event_lbl_showQuizMouseClicked
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

    private void lbl_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseClicked
     this.dispose();
     new Admin().setVisible(true);
    }//GEN-LAST:event_lbl_adminMouseClicked

    private void lbl_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_usersMouseClicked
        this.dispose();
        new Users().setVisible(true);
    }//GEN-LAST:event_lbl_usersMouseClicked
    ProfileViewer pv =     new ProfileViewer();
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
  
        
        if(pv.isActive()){
            pv.setVisible(false);
        }else{
            pv.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void lbl_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseEntered
        lbl_minimize.setForeground(Color.red);
    }//GEN-LAST:event_lbl_minimizeMouseEntered

    private void lbl_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseExited
        lbl_minimize.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_lbl_minimizeMouseExited

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered

    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited

    }//GEN-LAST:event_lbl_exitMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpl_admin;
    private javax.swing.JPanel jpl_creatingQuiz;
    private javax.swing.JPanel jpl_dashboard;
    private javax.swing.JPanel jpl_showingQuiz;
    private javax.swing.JPanel jpl_users;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_creatingQuiz;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_showQuiz;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_users;
    private javax.swing.JTextArea txt_easy;
    private javax.swing.JTextArea txt_hard;
    private javax.swing.JTextArea txt_insane;
    // End of variables declaration//GEN-END:variables
    void setColor(JPanel panel, JLabel label) {
       panel.setBackground(new Color(204,204, 204));
       label.setForeground(new Color(51, 204, 255));
    }
       void resetColor(JPanel panel, JLabel label) {
       panel.setBackground(new Color(245,245, 245));
       label.setForeground(new Color(153,153,153));
    }

}
