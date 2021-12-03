/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.CreatingQuiz.Hard;

import Admin.*;
import Admin.CreatingQuiz.Easy.*;
import Admin.CreatingQuiz.Insane.Insane;
import Admin.CreatingQuiz.QuizItem;
import Login.LoginForm;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jason
 */
public class Hard extends javax.swing.JFrame {

    QuizItem quizItem;
    ArrayList<QuizItem> arrayQuizItem;
    public Hard() {
        initComponents();
          arrayQuizItem=new ArrayList<>();
        this.setTitle("Knowledge");
        this.setFocusable(rootPaneCheckingEnabled);
        showDate();
        showTime();
         fillArrayList();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_quiz = new javax.swing.JLabel();
        txt_create_quiz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_choice1 = new javax.swing.JLabel();
        txt_choice1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lbl_choice2 = new javax.swing.JLabel();
        txt_choice2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        lbl_choice3 = new javax.swing.JLabel();
        txt_choice3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_choice4 = new javax.swing.JLabel();
        txt_choice4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lbl_correct = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        txt_correct = new javax.swing.JTextField();
        lbl_correctValidator = new javax.swing.JLabel();
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

        jpl_dashboard.setBackground(new java.awt.Color(245, 245, 245));
        jpl_dashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(153, 153, 153));
        lbl_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingEasy.png"))); // NOI18N
        lbl_dashboard.setText("Easy");
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

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, 60, 60));

        jpl_admin.setBackground(new java.awt.Color(245, 245, 245));
        jpl_admin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(153, 153, 153));
        lbl_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingInsane.png"))); // NOI18N
        lbl_admin.setText("Insane");
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

        jPanel1.add(jpl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, 110));

        jpl_creatingQuiz.setBackground(new java.awt.Color(204, 204, 204));
        jpl_creatingQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_creatingQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_creatingQuiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_creatingQuiz.setForeground(new java.awt.Color(51, 204, 255));
        lbl_creatingQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_creatingQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingHard.png"))); // NOI18N
        lbl_creatingQuiz.setText("Hard");
        lbl_creatingQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_creatingQuizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_creatingQuizMouseExited(evt);
            }
        });
        jpl_creatingQuiz.add(lbl_creatingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_creatingQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 110));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 58, 1200, -1));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
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
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 1190, 40));

        jLabel28.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 204, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("QUIZ LEVEL : Hard");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 220, 60));

        jpl_Home.setBackground(new java.awt.Color(245, 245, 245));
        jpl_Home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Home.setForeground(new java.awt.Color(153, 153, 153));
        lbl_Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home.png"))); // NOI18N
        lbl_Home.setText("Home");
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
        jpl_Home.add(lbl_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jPanel1.add(jpl_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 360, 110));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 360, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingHard.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, -1, 170));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QuizHead.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 650, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingHard.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, 170));

        lbl_quiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_quiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_quiz.setText("Create Quiz");
        lbl_quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_quizMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 170, 50));

        txt_create_quiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_create_quiz.setBorder(null);
        txt_create_quiz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_create_quizFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_create_quizFocusLost(evt);
            }
        });
        jPanel1.add(txt_create_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 1030, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CreatingQuiz.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 1080, 20));

        lbl_choice1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice1.setText("Choice 1");
        lbl_choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 170, 40));

        txt_choice1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice1.setBorder(null);
        txt_choice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice1FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 940, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 1000, 20));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceA.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        lbl_choice2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice2.setText("Choice 2");
        lbl_choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 150, 40));

        txt_choice2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice2.setBorder(null);
        txt_choice2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice2FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 920, 50));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 1000, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceB.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, 50));

        lbl_choice3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice3.setText("Choice 3");
        lbl_choice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 130, 40));

        txt_choice3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice3.setBorder(null);
        txt_choice3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice3FocusLost(evt);
            }
        });
        txt_choice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_choice3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 940, 50));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ChoiceC.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, 50));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 1000, 20));

        lbl_choice4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice4.setText("Choice 4");
        lbl_choice4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice4MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 110, 40));

        txt_choice4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice4.setBorder(null);
        txt_choice4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice4FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 940, 50));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceD.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 60, 50));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 1000, 20));

        lbl_correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_correct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_correct.setText("Correct");
        lbl_correct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_correctMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 90, 50));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 370, 20));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correct.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 60, 50));

        btn_create.setBackground(new java.awt.Color(102, 255, 102));
        btn_create.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        jPanel1.add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 640, 200, 50));

        txt_correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_correct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_correct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_correctFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_correctFocusLost(evt);
            }
        });
        txt_correct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correctKeyTyped(evt);
            }
        });
        jPanel1.add(txt_correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 310, 50));

        lbl_correctValidator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_correctValidator.setForeground(new java.awt.Color(255, 0, 51));
        lbl_correctValidator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_correctValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 370, 20));

        jLabel29.setFont(new java.awt.Font("Bell MT", 3, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CREATING QUIZ");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 410, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 760));

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
      
    }//GEN-LAST:event_lbl_creatingQuizMouseEntered

    private void lbl_creatingQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseExited
   
    }//GEN-LAST:event_lbl_creatingQuizMouseExited

    private void lbl_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseEntered
       setColor(  jpl_admin,   lbl_admin);
       resetColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_adminMouseEntered

    private void lbl_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseExited
        resetColor(jpl_admin,   lbl_admin);
       setColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_adminMouseExited

    private void lbl_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseEntered
        setColor(   jpl_Home,    lbl_Home);
       resetColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_HomeMouseEntered

    private void lbl_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseExited
        resetColor( jpl_Home,    lbl_Home);
       setColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_HomeMouseExited

    private void lbl_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseClicked
       this.dispose();
       new Dashboard().setVisible(true);
    }//GEN-LAST:event_lbl_HomeMouseClicked

    private void lbl_quizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_quizMouseClicked
        lbl_quiz.hide();
    }//GEN-LAST:event_lbl_quizMouseClicked

    private void txt_create_quizFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_create_quizFocusGained
        lbl_quiz.hide();
    }//GEN-LAST:event_txt_create_quizFocusGained

    private void txt_create_quizFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_create_quizFocusLost
        if(txt_create_quiz.getText().trim().equals("")){
            lbl_quiz.show();
        }
    }//GEN-LAST:event_txt_create_quizFocusLost

    private void lbl_choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_choice1MouseClicked
        lbl_choice1.hide();
    }//GEN-LAST:event_lbl_choice1MouseClicked

    private void txt_choice1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice1FocusGained
        lbl_choice1.hide();
    }//GEN-LAST:event_txt_choice1FocusGained

    private void txt_choice1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice1FocusLost
        if(txt_choice1.getText().trim().equals("")){
            lbl_choice1.show();
        }
    }//GEN-LAST:event_txt_choice1FocusLost

    private void lbl_choice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_choice2MouseClicked
        lbl_choice2.hide();
    }//GEN-LAST:event_lbl_choice2MouseClicked

    private void txt_choice2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice2FocusGained
        lbl_choice2.hide();
    }//GEN-LAST:event_txt_choice2FocusGained

    private void txt_choice2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice2FocusLost
        if(txt_choice2.getText().trim().equals("")){
            lbl_choice2.show();
        }
    }//GEN-LAST:event_txt_choice2FocusLost

    private void lbl_choice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_choice3MouseClicked
        lbl_choice3.hide();
    }//GEN-LAST:event_lbl_choice3MouseClicked

    private void txt_choice3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice3FocusGained
        lbl_choice3.hide();
    }//GEN-LAST:event_txt_choice3FocusGained

    private void txt_choice3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice3FocusLost
        if(txt_choice3.getText().trim().equals("")){
            lbl_choice3.show();
        }
    }//GEN-LAST:event_txt_choice3FocusLost

    private void txt_choice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_choice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_choice3ActionPerformed

    private void lbl_choice4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_choice4MouseClicked
        lbl_choice4.hide();
    }//GEN-LAST:event_lbl_choice4MouseClicked

    private void txt_choice4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice4FocusGained
        lbl_choice4.hide();
    }//GEN-LAST:event_txt_choice4FocusGained

    private void txt_choice4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_choice4FocusLost
        if(txt_choice4.getText().trim().equals("")){
            lbl_choice4.show();
        }
    }//GEN-LAST:event_txt_choice4FocusLost

    private void lbl_correctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_correctMouseClicked
        lbl_correct.hide();
    }//GEN-LAST:event_lbl_correctMouseClicked

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        setColor(jpl_dashboard, lbl_dashboard);
       resetColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        resetColor(jpl_dashboard, lbl_dashboard);
       setColor(jpl_creatingQuiz, lbl_creatingQuiz);
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseClicked
       this.dispose();
     
            new Easy().setVisible(true);
      
    }//GEN-LAST:event_lbl_dashboardMouseClicked

    private void lbl_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseClicked
       this.dispose();
       new Insane().setVisible(true);
    }//GEN-LAST:event_lbl_adminMouseClicked

    private void txt_correctFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_correctFocusGained
        lbl_correct.hide();
    }//GEN-LAST:event_txt_correctFocusGained

    private void txt_correctFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_correctFocusLost
        if(txt_correct.getText().trim().equals("")){
            lbl_correct.show();
        }
    }//GEN-LAST:event_txt_correctFocusLost

    private void txt_correctKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correctKeyTyped
       int value = txt_correct.getText().length();
        
        if(value > 0){
            evt.consume();
        }
     
        String input =Character.toString(evt.getKeyChar()).toUpperCase();
        if((input.equals("A")) || (input.equals("B")) || (input.equals("C")) || (input.equals("D"))){
          lbl_correctValidator.hide();
        }else{
             Toolkit.getDefaultToolkit().beep();
             lbl_correctValidator.show();
              lbl_correctValidator.setText("Character must be ('A', 'B', 'C', 'D')");
            evt.consume();
        }
    }//GEN-LAST:event_txt_correctKeyTyped
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

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        String question = txt_create_quiz.getText();
        String choice1 = txt_choice1.getText();
        String choice2 = txt_choice2.getText();
        String choice3 = txt_choice3.getText();
        String choice4 = txt_choice4.getText();
        String answer = txt_correct.getText().toUpperCase();
        String quizID =  QuizIdGenerator();
        
        if(question.isEmpty() || choice1.isEmpty() || choice2.isEmpty() || choice3.isEmpty() || choice4.isEmpty() || answer.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Complete All the Details", "Validation", WIDTH, null);
            return;
        }
        quizItem  = new QuizItem(quizID, question,choice1 , choice2, choice3, choice4, answer);
        arrayQuizItem.add(quizItem);
        JOptionPane.showMessageDialog(null, "Created Successfully", "Success", WIDTH, null);
         txt_create_quiz.setText(null);
         txt_choice1.setText(null);
         txt_choice2.setText(null);
         txt_choice3.setText(null);
         txt_choice4.setText(null);
         txt_correct.setText(null);
         lbl_quiz.show();
         lbl_choice1.show();
          lbl_choice2.show();
            lbl_choice3.show();
          lbl_choice4.show();
          lbl_correct.show();
        
        SavingandRetrieving();
        System.out.println(quizID);
    }//GEN-LAST:event_btn_createActionPerformed
ProfileViewer pv =     new ProfileViewer();
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     
        
        if(pv.isActive()){
            pv.setVisible(false);
        }else{
            pv.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    
     public String   QuizIdGenerator(){
         String id = "";
         Date now = new Date();
         int year = now.getYear();
         int date = now.getDate();
         int month = now.getMonth()+ 1;
             if(arrayQuizItem.isEmpty()){
                id = "hard" + (year + 1900) + "-"+  month + "/"+date+ "-" + "1101";
        }else{
             int lastQuizIdIndex =  arrayQuizItem.size() - 1;
            String QuizValueID =  arrayQuizItem.get(lastQuizIdIndex).getQuizID();
            String [] arrayLastId = QuizValueID.split("-", -1);
            id = "hard" + (year + 1900) + "-"+  month+ "/"+date+ "-" + (Integer.parseInt(arrayLastId[2]) + 1);
        }
           
         return id;
     }
      
      public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream("HardQuestion.ser");
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayQuizItem);                 
                      System.out.println("Quiz Item Saved");
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              arrayQuizItem.clear();
              fillArrayList();
      }
  
        public void fillArrayList()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("HardQuestion.ser"));
                    ObjectInputStream stream=new ObjectInputStream(fileInputStream);
                    for(Object objectPerson : (ArrayList)stream.readObject())
                    {
                       QuizItem personReading =(QuizItem) objectPerson;
                        arrayQuizItem.add(personReading);
                    }

            }catch(IOException e){
                System.out.println("FileNotFound");   
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
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
            java.util.logging.Logger.getLogger(Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpl_Home;
    private javax.swing.JPanel jpl_admin;
    private javax.swing.JPanel jpl_creatingQuiz;
    private javax.swing.JPanel jpl_dashboard;
    private javax.swing.JLabel lbl_Home;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_choice1;
    private javax.swing.JLabel lbl_choice2;
    private javax.swing.JLabel lbl_choice3;
    private javax.swing.JLabel lbl_choice4;
    private javax.swing.JLabel lbl_correct;
    private javax.swing.JLabel lbl_correctValidator;
    private javax.swing.JLabel lbl_creatingQuiz;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_quiz;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txt_choice1;
    private javax.swing.JTextField txt_choice2;
    private javax.swing.JTextField txt_choice3;
    private javax.swing.JTextField txt_choice4;
    private javax.swing.JTextField txt_correct;
    private javax.swing.JTextField txt_create_quiz;
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
