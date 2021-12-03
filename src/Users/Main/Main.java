/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users.Main;

import Admin.CreatingQuiz.QuizItem;
import Admin.ProfileViewer;
import Admin.Service;
import Login.LoginForm;
import Users.EasyLevel.QuizEasyLevel;
import Users.HardLevel.QuizHardLevel;
import Users.InsaneLevel.QuizInsaneLevel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author Jason
 */
public class Main extends javax.swing.JFrame {

    public static boolean windowOpen = false;
    
          QuizResult quizResult;
          ArrayList<QuizResult> arrayQuizResult; 
    public Main() {
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

        jpl_main = new javax.swing.JPanel();
        jpl_dashboard = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpl_admin = new javax.swing.JPanel();
        lbl_admin = new javax.swing.JLabel();
        jpl_creatingQuiz = new javax.swing.JPanel();
        lbl_creatingQuiz = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
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
        jLabel28 = new javax.swing.JLabel();
        jpl_Home = new javax.swing.JPanel();
        lbl_Home = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_easy = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_insane = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_hard = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl_minimize = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpl_main.setBackground(new java.awt.Color(255, 255, 255));
        jpl_main.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpl_mainMouseDragged(evt);
            }
        });
        jpl_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpl_mainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpl_mainMousePressed(evt);
            }
        });
        jpl_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        jpl_dashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(51, 204, 255));
        lbl_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LeaderBoardGILID.png"))); // NOI18N
        lbl_dashboard.setText("Leaderboard");
        lbl_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_dashboardMouseExited(evt);
            }
        });
        jpl_dashboard.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jpl_main.add(jpl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 360, 110));

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

        jpl_main.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 170));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jpl_main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 50, 60));

        jpl_admin.setBackground(new java.awt.Color(245, 245, 245));
        jpl_admin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(153, 153, 153));
        lbl_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingHard.png"))); // NOI18N
        lbl_admin.setText("Hard");
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
        jpl_admin.add(lbl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jpl_main.add(jpl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 360, 110));

        jpl_creatingQuiz.setBackground(new java.awt.Color(245, 245, 245));
        jpl_creatingQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_creatingQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_creatingQuiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_creatingQuiz.setForeground(new java.awt.Color(153, 153, 153));
        lbl_creatingQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_creatingQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingEasy.png"))); // NOI18N
        lbl_creatingQuiz.setText("Easy");
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

        jpl_main.add(jpl_creatingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 110));
        jpl_main.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 1250, 10));

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
        jLabel27.setText("Login as: User");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
        );

        jpl_main.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 1240, 40));

        jLabel28.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Leaderboard");
        jpl_main.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 280, 60));

        jpl_Home.setBackground(new java.awt.Color(245, 245, 245));
        jpl_Home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Home.setForeground(new java.awt.Color(153, 153, 153));
        lbl_Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingInsane.png"))); // NOI18N
        lbl_Home.setText("Insane");
        lbl_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_HomeMouseExited(evt);
            }
        });
        jpl_Home.add(lbl_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jpl_main.add(jpl_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 360, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jpl_main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 360, 150));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lola.png"))); // NOI18N
        jpl_main.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 160, 130));

        jLabel29.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Leaderboard");
        jpl_main.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 170, 40));

        jLabel31.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trophy.png"))); // NOI18N
        jpl_main.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, 60, 40));

        jLabel32.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trophy.png"))); // NOI18N
        jpl_main.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 60, 40));
        jpl_main.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 280, 20));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hardLeaderBoard.png"))); // NOI18N
        jpl_main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 160, 130));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/easyLeaderBoard.png"))); // NOI18N
        jpl_main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 160, 130));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insaneLeaderBoard.png"))); // NOI18N
        jpl_main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 210, 160, 130));
        jpl_main.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 270, 10));
        jpl_main.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 270, 10));
        jpl_main.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 380, 270, 10));

        txt_easy.setColumns(20);
        txt_easy.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_easy.setForeground(new java.awt.Color(255, 0, 51));
        txt_easy.setRows(10);
        txt_easy.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_easy.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_easy.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_easy.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane1.setViewportView(txt_easy);

        jpl_main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 380, 320));

        txt_insane.setColumns(20);
        txt_insane.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_insane.setForeground(new java.awt.Color(255, 0, 51));
        txt_insane.setRows(10);
        txt_insane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_insane.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_insane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_insane.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane2.setViewportView(txt_insane);

        jpl_main.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 390, 380, 320));

        txt_hard.setColumns(20);
        txt_hard.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        txt_hard.setForeground(new java.awt.Color(255, 0, 51));
        txt_hard.setRows(10);
        txt_hard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_hard.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_hard.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_hard.setMargin(new java.awt.Insets(2, 30, 2, 2));
        jScrollPane3.setViewportView(txt_hard);

        jpl_main.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 380, 320));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LeaderBoard.png"))); // NOI18N
        jpl_main.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 160, 70));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/angry.png"))); // NOI18N
        jpl_main.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 160, 130));

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Top 10 Easy Category");
        jpl_main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 300, 30));

        jLabel34.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Top 10 Hard Category");
        jpl_main.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 300, 30));

        jLabel35.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Top 10 Insane Category");
        jpl_main.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 350, 300, 30));

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
        jpl_main.add(lbl_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 0, 30, 40));

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
        jpl_main.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 0, 30, 40));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.jpg"))); // NOI18N
        jpl_main.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1240, 720));

        getContentPane().add(jpl_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 ProfileViewer pv =     new ProfileViewer();
    private void lbl_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseClicked
       

        
    }//GEN-LAST:event_lbl_dashboardMouseClicked

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
       
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseClicked
       new Starting().whereToQuizLevel = "hard";
            new Start().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_lbl_adminMouseClicked

    private void lbl_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseEntered
        setColor(  jpl_admin,   lbl_admin);
        resetColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_adminMouseEntered

    private void lbl_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseExited
        resetColor(jpl_admin,   lbl_admin);
        setColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_adminMouseExited

    private void lbl_creatingQuizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseEntered
         setColor(   jpl_creatingQuiz,     lbl_creatingQuiz);
        resetColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_creatingQuizMouseEntered

    private void lbl_creatingQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseExited
         resetColor(jpl_creatingQuiz,     lbl_creatingQuiz);
        setColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_creatingQuizMouseExited

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

    private void lbl_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseClicked
       new Starting().whereToQuizLevel = "insane";
            new Start().setVisible(true);
            this.dispose(); 
    }//GEN-LAST:event_lbl_HomeMouseClicked

    private void lbl_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseEntered
        setColor(   jpl_Home,    lbl_Home);
        resetColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_HomeMouseEntered

    private void lbl_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseExited
        resetColor( jpl_Home,    lbl_Home);
        setColor(jpl_dashboard,  lbl_dashboard);
    }//GEN-LAST:event_lbl_HomeMouseExited

    private void lbl_creatingQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseClicked
            new Starting().whereToQuizLevel = "easy";
            new Start().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_lbl_creatingQuizMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 
        
        if(pv.isActive()){
            pv.setVisible(false);
        }else{
            pv.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked
int xx, xy;
    private void jpl_mainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpl_mainMousePressed
        xx = evt.getX();
            xy = evt.getY();
    }//GEN-LAST:event_jpl_mainMousePressed

    private void jpl_mainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpl_mainMouseExited
         
    }//GEN-LAST:event_jpl_mainMouseExited

    private void jpl_mainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpl_mainMouseDragged
       int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jpl_mainMouseDragged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
                
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpl_Home;
    private javax.swing.JPanel jpl_admin;
    private javax.swing.JPanel jpl_creatingQuiz;
    private javax.swing.JPanel jpl_dashboard;
    private javax.swing.JPanel jpl_main;
    private javax.swing.JLabel lbl_Home;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_creatingQuiz;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_time;
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
