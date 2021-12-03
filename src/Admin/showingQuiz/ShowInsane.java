/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.showingQuiz;

import Admin.*;
import Admin.CreatingQuiz.Easy.*;
import Admin.CreatingQuiz.Hard.Hard;
import Admin.CreatingQuiz.Insane.*;
import Admin.CreatingQuiz.Model;
import Admin.CreatingQuiz.QuizItem;
import Admin.CreatingQuiz.ViewQuiz;
import Login.LoginForm;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
/**
 *
 * @author Jason
 */
public class ShowInsane extends javax.swing.JFrame {

     QuizItem quizItem;
         ArrayList<QuizItem> arrayQuizItem;
    public ShowInsane() {

        initComponents();
        this.setTitle("Knowledge");
        arrayQuizItem=new ArrayList<>();
        this.setFocusable(rootPaneCheckingEnabled);
        showDate();
        showTime();
         fillArrayList();
        displayList();
        btn_search1.hide();
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
        
         public void fillArrayList()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File("InsaneQuestion.ser"));
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
      public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream("InsaneQuestion.ser");
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayQuizItem);                 
                      System.out.println("Quiz Item Delete");
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              arrayQuizItem.clear();
              fillArrayList();
      }
      public void displayList(){
          arrayQuizItem.clear();
           fillArrayList();
          DefaultTableModel model = (DefaultTableModel) tbl_showQuiz.getModel();
        for(QuizItem quiz: arrayQuizItem){
                int lengthQuestion = (quiz.getQuestion().length() > 20 ) ? 20 : quiz.getQuestion().length();
                int lengthChoice1  = (quiz.getChoice1().length() > 20 ) ? 20 : quiz.getChoice1().length();
                int lengthChoice2  = (quiz.getChoice2().length() > 20 ) ? 20 : quiz.getChoice2().length();
                int lengthChoice3  = (quiz.getChoice3().length() > 20 ) ? 20 : quiz.getChoice3().length();
                int lengthChoice4  = (quiz.getChoice4().length() > 20 ) ? 20 : quiz.getChoice4().length();
           model.addRow(new Object[]{
                                        quiz.getQuizID(), 
                                        (quiz.getQuestion().substring(0,  lengthQuestion ) + "..." ) , 
                                        (quiz.getChoice1().substring(0, lengthChoice1 ) + "..." ),
                                        (quiz.getChoice2().substring(0, lengthChoice2 ) + "..." ),
                                        (quiz.getChoice3().substring(0,  lengthChoice3  ) + "..." ),
                                        (quiz.getChoice4().substring(0,  lengthChoice4  ) + "..." ),
                                         quiz.getAnswer()
                                    });
        }
        
    }
      public void TableRemoveElement(){
            DefaultTableModel model = (DefaultTableModel)tbl_showQuiz.getModel();
             model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
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
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_search = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_showQuiz = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_search1 = new javax.swing.JLabel();
        btn_search = new javax.swing.JLabel();
        btn_reload = new javax.swing.JButton();
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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, 50, 50));

        jpl_admin.setBackground(new java.awt.Color(204, 204, 204));
        jpl_admin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(51, 204, 255));
        lbl_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingInsane.png"))); // NOI18N
        lbl_admin.setText("Insane");
        lbl_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_adminMouseExited(evt);
            }
        });
        jpl_admin.add(lbl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 110));

        jPanel1.add(jpl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 360, 110));

        jpl_creatingQuiz.setBackground(new java.awt.Color(245, 245, 245));
        jpl_creatingQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpl_creatingQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_creatingQuiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_creatingQuiz.setForeground(new java.awt.Color(153, 153, 153));
        lbl_creatingQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_creatingQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingHard.png"))); // NOI18N
        lbl_creatingQuiz.setText("Hard");
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
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 1200, 10));

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
        jLabel28.setText("QUIZ LEVEL : INSANE");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 250, 30));

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

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-22.png"))); // NOI18N
        jButton4.setText("Create New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 180, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 102));
        jButton6.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-25.png"))); // NOI18N
        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 180, 50));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-22.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 180, 50));

        lbl_search.setText("SEARCH ID:");
        jPanel1.add(lbl_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 230, -1, -1));

        txt_search.setBackground(new java.awt.Color(231, 231, 231));
        txt_search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 220, 230, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 250, 260, 10));

        tbl_showQuiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_showQuiz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QUESTION", "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "ANSWER"
            }
        ));
        tbl_showQuiz.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tbl_showQuiz.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_showQuiz);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 281, 1150, 420));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingInsane.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, 170));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QuizHead.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 650, 150));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creatingInsane.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 40, -1, 170));

        btn_search1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-25 (1).png"))); // NOI18N
        btn_search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_search1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_search1MouseExited(evt);
            }
        });
        jPanel1.add(btn_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 210, 40, 40));

        btn_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-25.png"))); // NOI18N
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_searchMouseExited(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 210, 40, 40));

        btn_reload.setBackground(new java.awt.Color(153, 255, 255));
        btn_reload.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        btn_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-process-25.png"))); // NOI18N
        btn_reload.setText("Reload");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 180, 50));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1190, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
       int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to exit", "Logout Exit",JOptionPane.YES_NO_OPTION);
        if(p == 0){
             
           this.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void lbl_creatingQuizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseEntered
       setColor(jpl_creatingQuiz, lbl_creatingQuiz);
       resetColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_creatingQuizMouseEntered

    private void lbl_creatingQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseExited
       resetColor(jpl_creatingQuiz, lbl_creatingQuiz);
       setColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_creatingQuizMouseExited

    private void lbl_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseEntered
    
    }//GEN-LAST:event_lbl_adminMouseEntered

    private void lbl_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminMouseExited
       
    }//GEN-LAST:event_lbl_adminMouseExited

    private void lbl_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseEntered
        setColor(   jpl_Home,    lbl_Home);
       resetColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_HomeMouseEntered

    private void lbl_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseExited
        resetColor( jpl_Home,    lbl_Home);
       setColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_HomeMouseExited

    private void lbl_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_HomeMouseClicked
       this.dispose();
       new Dashboard().setVisible(true);
    }//GEN-LAST:event_lbl_HomeMouseClicked

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        setColor(   jpl_dashboard,     lbl_dashboard);
       resetColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
       resetColor( jpl_dashboard,     lbl_dashboard);
       setColor(jpl_admin, lbl_admin);
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseClicked
        this.dispose();
       new ShowEasy().setVisible(true);
    }//GEN-LAST:event_lbl_dashboardMouseClicked

    private void lbl_creatingQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_creatingQuizMouseClicked
        this.dispose();
        new ShowHard().setVisible(true);
    }//GEN-LAST:event_lbl_creatingQuizMouseClicked

    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        lbl_search.hide();
    }//GEN-LAST:event_txt_searchFocusGained

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
        if(txt_search.getText().trim().equals("")){
            lbl_search.show();
        }
    }//GEN-LAST:event_txt_searchFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
      new Insane().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search1MouseClicked
        TableRemoveElement();
        DefaultTableModel model = (DefaultTableModel) tbl_showQuiz.getModel();
        String searchVal  = txt_search.getText();
        for(QuizItem quiz: arrayQuizItem){
            if(quiz.getQuizID().contains(searchVal)){
                int lengthQuestion = (quiz.getQuestion().length() > 20 ) ? 20 : quiz.getQuestion().length();
                int lengthChoice1  = (quiz.getChoice1().length() > 20 ) ? 20 : quiz.getChoice1().length();
                int lengthChoice2  = (quiz.getChoice2().length() > 20 ) ? 20 : quiz.getChoice2().length();
                int lengthChoice3  = (quiz.getChoice3().length() > 20 ) ? 20 : quiz.getChoice3().length();
                int lengthChoice4  = (quiz.getChoice4().length() > 20 ) ? 20 : quiz.getChoice4().length();
                model.addRow(new Object[]{
                    quiz.getQuizID(),
                    (quiz.getQuestion().substring(0,  lengthQuestion ) + "..." ) ,
                    (quiz.getChoice1().substring(0, lengthChoice1 ) + "..." ),
                    (quiz.getChoice2().substring(0, lengthChoice2 ) + "..." ),
                    (quiz.getChoice3().substring(0,  lengthChoice3  ) + "..." ),
                    (quiz.getChoice4().substring(0,  lengthChoice4  ) + "..." ),
                    quiz.getAnswer()
                });
            }
        }
    }//GEN-LAST:event_btn_search1MouseClicked

    private void btn_search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_search1MouseEntered

    private void btn_search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search1MouseExited
        btn_search1.hide();
        btn_search.show();
    }//GEN-LAST:event_btn_search1MouseExited

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseEntered
        btn_search.hide();
        btn_search1.show();
    }//GEN-LAST:event_btn_searchMouseEntered

    private void btn_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseExited

    }//GEN-LAST:event_btn_searchMouseExited

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        btn_search1.hide();
        btn_search.show();
        txt_search.setText(null);
        lbl_search.show();
        TableRemoveElement();
        displayList();
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if(tbl_showQuiz.getSelectionModel().isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "SELECT A QUESTION TO DELETE" , "DELETE VALIDATOR", WIDTH, null);
            }else{
                int index  = tbl_showQuiz.getSelectedRow();
                TableModel model = tbl_showQuiz.getModel();
                String quizId  = model.getValueAt(index, 0).toString();
                
                int p = JOptionPane.showConfirmDialog(null, "Are you sure u want to delete this quiz?" , "DELETE QUIZ" , JOptionPane.YES_NO_OPTION);
                
                    if(p == 0){
                           for(int i = 0; i < arrayQuizItem.size() ; i++){
                               if(arrayQuizItem.get(i).getQuizID().contains(quizId)){
                                    arrayQuizItem.remove(i);
                                   JOptionPane.showMessageDialog(null, "Successfully Deleted");
                                   break;
                               }
                           }
                    }
                    SavingandRetrieving();
                    TableRemoveElement();
                    displayList();
                    
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            if(tbl_showQuiz.getSelectionModel().isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "SELECT A QUESTION" , "View  VALIDATOR", WIDTH, null);
            }else{
                int index  = tbl_showQuiz.getSelectedRow();
                TableModel model = tbl_showQuiz.getModel();
                String quizId  = model.getValueAt(index, 0).toString();
                 new Model().quizID = quizId;
                 new Model().level = "InsaneQuestion.ser";
    
                      new ViewQuiz().setVisible(true);
                
        }
    }//GEN-LAST:event_jButton6ActionPerformed
int xx , xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
     xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged
   ProfileViewer pv =     new ProfileViewer();
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
   
        
        if(pv.isActive()){
            pv.setVisible(false);
        }else{
            pv.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(ShowInsane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowInsane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowInsane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowInsane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowInsane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btn_reload;
    private javax.swing.JLabel btn_search;
    private javax.swing.JLabel btn_search1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jpl_Home;
    private javax.swing.JPanel jpl_admin;
    private javax.swing.JPanel jpl_creatingQuiz;
    private javax.swing.JPanel jpl_dashboard;
    private javax.swing.JLabel lbl_Home;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_creatingQuiz;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_search;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTable tbl_showQuiz;
    private javax.swing.JTextField txt_search;
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
