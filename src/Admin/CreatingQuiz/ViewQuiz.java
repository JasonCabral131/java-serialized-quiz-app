/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.CreatingQuiz;

import Admin.CreatingQuiz.Easy.Easy;
import java.awt.Toolkit;
import  java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Jason
 */
public class ViewQuiz extends javax.swing.JFrame {
       
         QuizItem quizItem;
         ArrayList<QuizItem> arrayQuizItem;
    public ViewQuiz() {
         arrayQuizItem=new ArrayList<>();
        initComponents();
         fillArrayList();
        DisplayQuestioner(new Model().quizID);
        
        this.setFocusable(rootPaneCheckingEnabled);      
    }
        public void fillArrayList()   {
         try{
                   FileInputStream fileInputStream=new FileInputStream(new File(new Model().level));
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
        public void DisplayQuestioner(String quizId){
                    for(int i = 0; i < arrayQuizItem.size() ; i++){
                               if(arrayQuizItem.get(i).getQuizID().contains(quizId)){
                                   hiding();
                                   txt_create_quiz.setText(arrayQuizItem.get(i).getQuestion());
                                   txt_choice1.setText(arrayQuizItem.get(i).getChoice1());
                                   txt_choice2.setText(arrayQuizItem.get(i).getChoice2());
                                   txt_choice3.setText(arrayQuizItem.get(i).getChoice3());
                                   txt_choice4.setText(arrayQuizItem.get(i).getChoice4());
                                   txt_correct.setText(arrayQuizItem.get(i).getAnswer());
                                   
                                   break;
                               }
                           }
        }
        public void hiding(){
                lbl_quiz.hide();
                lbl_choice1.hide();
                lbl_choice2.hide();
                lbl_choice3.hide();
                lbl_choice4.hide();
                lbl_correct.hide();
        }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_quiz = new javax.swing.JLabel();
        txt_create_quiz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_choice1 = new javax.swing.JLabel();
        txt_choice1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_choice2 = new javax.swing.JLabel();
        txt_choice2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        lbl_choice3 = new javax.swing.JLabel();
        txt_choice3 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        lbl_choice4 = new javax.swing.JLabel();
        txt_choice4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lbl_correct = new javax.swing.JLabel();
        txt_correct = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lbl_correctValidator = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QuizHead.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 530, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QuizHeaderIcon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 160));

        lbl_quiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_quiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_quiz.setText("Create Quiz");
        lbl_quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_quizMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 170, 50));

        txt_create_quiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_create_quiz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_create_quiz.setBorder(null);
        txt_create_quiz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_create_quizFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_create_quizFocusLost(evt);
            }
        });
        jPanel1.add(txt_create_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1030, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CreatingQuiz.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1080, 20));

        lbl_choice1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice1.setText("Choice 1");
        lbl_choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 170, 40));

        txt_choice1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_choice1.setBorder(null);
        txt_choice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice1FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 940, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceA.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 1000, 20));

        lbl_choice2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice2.setText("Choice 2");
        lbl_choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 150, 40));

        txt_choice2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_choice2.setBorder(null);
        txt_choice2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice2FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 920, 50));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 1000, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceB.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, 50));

        lbl_choice3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice3.setText("Choice 3");
        lbl_choice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 130, 40));

        txt_choice3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        jPanel1.add(txt_choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 940, 50));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 1000, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ChoiceC.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 50));

        lbl_choice4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_choice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_choice4.setText("Choice 4");
        lbl_choice4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_choice4MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 110, 40));

        txt_choice4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_choice4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_choice4.setBorder(null);
        txt_choice4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_choice4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_choice4FocusLost(evt);
            }
        });
        jPanel1.add(txt_choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 940, 50));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/choiceD.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 60, 50));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 1000, 20));

        lbl_correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_correct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_correct.setText("Correct");
        lbl_correct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_correctMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 80, 50));

        txt_correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_correct.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        jPanel1.add(txt_correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 310, 50));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correct.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 60, 50));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 370, 20));

        lbl_correctValidator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_correctValidator.setForeground(new java.awt.Color(255, 0, 51));
        lbl_correctValidator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_correctValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 370, 20));

        btn_view.setBackground(new java.awt.Color(255, 255, 102));
        btn_view.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-25.png"))); // NOI18N
        btn_view.setText("Update");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, 180, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QuizHeaderIcon.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
            String question = txt_create_quiz.getText();
            String choice1 = txt_choice1.getText();
            String choice2 = txt_choice2.getText();
            String choice3 = txt_choice3.getText();
            String choice4 = txt_choice4.getText();
            String answer = txt_correct.getText().toUpperCase();
            String quizID =new Model().quizID;
        
        if(question.isEmpty() || choice1.isEmpty() || choice2.isEmpty() || choice3.isEmpty() || choice4.isEmpty() || answer.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Complete All the Details", "Validation", WIDTH, null);
            return;
        }
              
        toUpdate();
    }//GEN-LAST:event_btn_viewActionPerformed
  int xx , xy ;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
     xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x -xx , y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
    
    }//GEN-LAST:event_jLabel5MouseDragged
    public void toUpdate(){
                            
                            String question = txt_create_quiz.getText();
                            String choice1 = txt_choice1.getText();
                            String choice2 = txt_choice2.getText();
                            String choice3 = txt_choice3.getText();
                            String choice4 = txt_choice4.getText();
                            String answer = txt_correct.getText().toUpperCase();
                            String quizID =new Model().quizID;
                            for(int i = 0; i < arrayQuizItem.size() ; i++){
                               if(arrayQuizItem.get(i).getQuizID().contains(quizID)){                                 
                                        arrayQuizItem.get(i).setQuestion(question);
                                        arrayQuizItem.get(i).setChoice1(choice1);
                                        arrayQuizItem.get(i).setChoice2(choice2);
                                        arrayQuizItem.get(i).setChoice3(choice3);
                                        arrayQuizItem.get(i).setChoice4(choice4);
                                        arrayQuizItem.get(i).setAnswer(answer);
                                        SavingandRetrieving();
                                        JOptionPane.showMessageDialog(null, "\tUpdated Successfully", "Success Message", JOptionPane.PLAIN_MESSAGE);
                                        this.dispose();
                                   break;
                               }
                           }
    }
    
    public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream(new Model().level);
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayQuizItem);                 
                      System.out.println("Quiz Item Updated");
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              arrayQuizItem.clear();
            
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
            java.util.logging.Logger.getLogger(ViewQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_choice1;
    private javax.swing.JLabel lbl_choice2;
    private javax.swing.JLabel lbl_choice3;
    private javax.swing.JLabel lbl_choice4;
    private javax.swing.JLabel lbl_correct;
    private javax.swing.JLabel lbl_correctValidator;
    private javax.swing.JLabel lbl_quiz;
    private javax.swing.JTextField txt_choice1;
    private javax.swing.JTextField txt_choice2;
    private javax.swing.JTextField txt_choice3;
    private javax.swing.JTextField txt_choice4;
    private javax.swing.JTextField txt_correct;
    private javax.swing.JTextField txt_create_quiz;
    // End of variables declaration//GEN-END:variables
}
