/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users.HardLevel;

import Admin.CreatingQuiz.QuizItem;
import Admin.ProfileViewer;
import Admin.Service;
import Login.LoginForm;
import Users.EasyLevel.*;
import Users.Main.Congratulation;
import Users.Main.Correct;
import Users.Main.Main;

import Users.Main.QuizResult;
import Users.Main.SorryNextTime;
import Users.Main.Start;
import Users.Main.Starting;
import Users.Main.WrongAlert;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.control.CheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jason
 */
public class QuizHardLevel extends javax.swing.JFrame {
       public static boolean windowOpen = false;
        
        QuizItem quizItem;
         ArrayList<QuizItem> arrayQuizItem; 
         
          boolean alreadyShow  = false;
          
          
         QuizResult quizResult;
          ArrayList<QuizResult> arrayQuizResult;        
          
          
          
         int counterTime = 25;
         String Answer = "";
         int QuizStart = 0;
         int WrongAnswer = 0;
         int Score = 0;
    public QuizHardLevel() {
        this.setTitle("Knowledge");
        arrayQuizItem=new ArrayList<>();
        arrayQuizResult = new ArrayList<>();
        initComponents();
        this.setFocusable(rootPaneCheckingEnabled);

        fillArrayList();
        fillArrayListQuizResult();
       Collections.shuffle(arrayQuizItem); 
                    displayQCA();
        

        System.out.println(new Service().loginUsername);
        timer.start();
    }
        Correct correct = new Correct();
    WrongAlert wA = new WrongAlert();
    public void correctAlert(){
        if(correct.isActive()){
            correct.setVisible(false);
        }else{
             correct.counter = 0;
            correct.timer.start();
            correct.pack();
            correct.setVisible(true);
        }
    }
    
    public void wrongAlert(String correct){
          if(wA.isActive()){
            wA.setVisible(false);
        }else{
              wA.counter = 0;
            wA.timer.start();
            wA.lbl_correct.setText("Correct Answer: " + correct );
            wA.pack();
            wA.setVisible(true);
        }
    }
      public void SoundStart(){
      
            String sound = "sound/Correct.mp3";
            MP3Player  correct = new MP3Player(new File(sound));
             correct.play();
    }
      public void Wrong(){
      
            String sound = "sound/Wrong.mp3";
            MP3Player  wrong = new MP3Player(new File(sound));
             wrong.play();
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
     public void SavingandRetrieving(){
              try{    
                    FileOutputStream outFile = new FileOutputStream("QuizResult.ser");
                            ObjectOutputStream outObj =   new ObjectOutputStream(outFile);
                             outObj.writeObject(arrayQuizResult);                                     
                       outObj.close();
                }catch(IOException e) {
                    System.out.println(e);
                }
              
      }
    
     Timer timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            counterTime --;
            if(counterTime == 0){
                wrongAlert(arrayQuizItem.get(QuizStart).getAnswer());   
                QuizStart++;
                WrongAnswer++; 
                Wrong();
                 deSelector();
                lifeDescreaser();
                 btnNextStopper(QuizStart);
                 displayQCA();
                  counterTime = 25;
            }
            
            lbl_quizTime.setText("" + counterTime);
        }      
    });
 String showDate()
        {
            Date d= new Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            return s.format(d);
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
         
         public void displayQCA(){
                for(int counterQuiz = 0 ; counterQuiz < arrayQuizItem.size() ; counterQuiz++){                            
                            if(counterQuiz == QuizStart){
                                    lbl_question.setText(""+ (counterQuiz + 1)+". " +arrayQuizItem.get(counterQuiz).getQuestion());
                                    lbl_choice1.setText(arrayQuizItem.get(counterQuiz).getChoice1());
                                    lbl_choice2.setText(arrayQuizItem.get(counterQuiz).getChoice2());
                                    lbl_choice3.setText(arrayQuizItem.get(counterQuiz).getChoice3());
                                    lbl_choice4.setText(arrayQuizItem.get(counterQuiz).getChoice4());
                                    break;
                            }
                }
         }
         
         public void corrector(){
              for(int counterQuiz = 0 ; counterQuiz < arrayQuizItem.size() ; counterQuiz++){                            
                         
                                 if(counterQuiz == QuizStart){
                                            if(arrayQuizItem.get(counterQuiz).getAnswer().contains(Answer)){
                                                SoundStart();
                                                correctAlert();
                                                 QuizStart++;
                                                 deSelector();
                                                 displayQCA();
                                                 counterTime = 25;
                                                 Score += 1;
                                                 NumberFormat nf = NumberFormat.getNumberInstance();
                                                 String formatedScore = nf.format(Score * 10000);
                                                 lbl_score.setText(formatedScore);
                                                 btnNextStopper( QuizStart);
                                                 correctAlert();
                                                 break;
                                            }else{  
                                                Wrong();
                                                        wrongAlert(arrayQuizItem.get(counterQuiz).getAnswer());
                                                     
                                                         QuizStart++;
                                                         WrongAnswer++;                                      
                                                         lifeDescreaser();   
                                                          
                                                         if(WrongAnswer != 4){                                                              
                                                                deSelector();
                                                                displayQCA(); 
                                                                counterTime = 25;
                                                        }
                                                         btnNextStopper( QuizStart);
                                                            if(WrongAnswer == 4){
                                                            wrongAlert(arrayQuizItem.get(counterQuiz).getAnswer());
                                                        }
                                                  break;

                                            }
                                  
                            

                                 }  
                }
                btnNextStopper( QuizStart);    
         }
        
        public void btnNextStopper(int quizWhere){
             if(quizWhere  == arrayQuizItem.size()  ){
                          btn_next.setText("Done");
                          btn_next.setForeground(Color.GRAY);
                          btn_next.setEnabled(false);
                          timer.stop();
                          if(Score < 1){
                              if(!alreadyShow){
                                  alreadyShow = true;
                                  String username = new Service().loginUsername;
                                  int ScoreTotal = Score * 10000;
                                  String date = showDate();
                                   quizResult = new QuizResult(username, ScoreTotal, date, "hard" );
                                   arrayQuizResult.add(quizResult);
                                    SavingandRetrieving();
                                    
                                    new SorryNextTime().setVisible(true);
                                    
                                    this.dispose();
                              }
                             
                          }else{
                              
                              if(!alreadyShow){
                                   alreadyShow = true;
                                   
                                               String username = new Service().loginUsername;
                                                int ScoreTotal = Score * 10000;
                                                String date = showDate();
                                                 quizResult = new QuizResult(username, ScoreTotal, date, "hard" );
                                                 arrayQuizResult.add(quizResult); 
                                                 SavingandRetrieving();
                                               
                                                Congratulation congrats =   new Congratulation();
                                                NumberFormat nf = NumberFormat.getNumberInstance();
                                                 String formatedScore = nf.format(Score * 10000);
                                                congrats.congrats_score.setText("You win " +formatedScore+" Pesos");
                                                congrats.pack();
                                                congrats.setVisible(true);
                                                   
                                                this.dispose();
                              }
                             
                          }
                          
                 }else if(WrongAnswer == 4){
                                                
                                                btn_next.setText("Done");
                                                btn_next.setForeground(Color.GRAY);
                                                btn_next.setEnabled(false);
                                                timer.stop();
                          if(Score < 1){
                                if(!alreadyShow){
                                    
                                     alreadyShow = true;
                                                String username = new Service().loginUsername;
                                                int ScoreTotal = Score * 10000;
                                                String date = showDate();
                                                 quizResult = new QuizResult(username, ScoreTotal, date, "hard" );
                                                  arrayQuizResult.add(quizResult);
                                                 SavingandRetrieving();
                                              
                                                  
                                                new SorryNextTime().setVisible(true);
                                                   
                                                this.dispose();
                              }
                               
                          }else{
                                if(!alreadyShow){
                                    
                                     alreadyShow = true;
                                                String username = new Service().loginUsername;
                                                int ScoreTotal = Score * 10000;
                                                String date = showDate();
                                                 quizResult = new QuizResult(username, ScoreTotal, date, "hard" );
                                                 arrayQuizResult.add(quizResult); 
                                                 SavingandRetrieving();
                                                 
                                                Congratulation congrats =   new Congratulation();
                                                NumberFormat nf = NumberFormat.getNumberInstance();
                                                 String formatedScore = nf.format(Score * 10000);
                                                congrats.congrats_score.setText("You win " +formatedScore+" Pesos");
                                                congrats.pack();
                                                congrats.setVisible(true);
                                                 
                                                this.dispose();
                              }
                               
                          }
                 }
        }
         public void lifeDescreaser(){
                            if(WrongAnswer == 1){
                                            heart1.hide();
                             }else if (WrongAnswer == 2){
                                             heart2.hide();
                             }else if (WrongAnswer == 3){
                                             heart3.hide();
                             }else if (WrongAnswer == 4){
                                             heart4.hide();
                             }
         }
         public void deSelector(){
             ck_A.setSelected(false);
              ck_B.setSelected(false);
               ck_C.setSelected(false);
                ck_D.setSelected(false);
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_quizTime = new javax.swing.JLabel();
        lbl_score = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        heart4 = new javax.swing.JLabel();
        heart3 = new javax.swing.JLabel();
        heart2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        heart1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbl_choice4 = new javax.swing.JLabel();
        ck_D = new javax.swing.JCheckBox();
        ck_A = new javax.swing.JCheckBox();
        ck_B = new javax.swing.JCheckBox();
        ck_C = new javax.swing.JCheckBox();
        lbl_question = new javax.swing.JLabel();
        lbl_choice1 = new javax.swing.JLabel();
        lbl_choice2 = new javax.swing.JLabel();
        lbl_choice3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        btn_next = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_quizTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_quizTime.setForeground(new java.awt.Color(0, 204, 255));
        lbl_quizTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_quizTime.setText("25");
        jPanel1.add(lbl_quizTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 60, 60));

        lbl_score.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_score.setText("0");
        jPanel1.add(lbl_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 290, 100));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Time.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        heart4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-heart-100.png"))); // NOI18N
        jPanel1.add(heart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        heart3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-heart-100.png"))); // NOI18N
        jPanel1.add(heart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        heart2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-heart-100.png"))); // NOI18N
        jPanel1.add(heart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 540, 20));

        heart1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-heart-100.png"))); // NOI18N
        jPanel1.add(heart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 390, 20));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Score:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 100, 100));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 1110, 20));

        lbl_choice4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_choice4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_choice4.setText("Charles Darwin");
        jPanel1.add(lbl_choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 1070, 40));

        ck_D.setBackground(new java.awt.Color(231, 231, 231));
        ck_D.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ck_D.setText("D.");
        ck_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ck_DMouseClicked(evt);
            }
        });
        jPanel1.add(ck_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, 40));

        ck_A.setBackground(new java.awt.Color(231, 231, 231));
        ck_A.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ck_A.setText("A.");
        ck_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ck_AMouseClicked(evt);
            }
        });
        jPanel1.add(ck_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 40));

        ck_B.setBackground(new java.awt.Color(231, 231, 231));
        ck_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ck_B.setText("B.");
        ck_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ck_BMouseClicked(evt);
            }
        });
        jPanel1.add(ck_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 40));

        ck_C.setBackground(new java.awt.Color(231, 231, 231));
        ck_C.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ck_C.setText("C.");
        ck_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ck_CMouseClicked(evt);
            }
        });
        jPanel1.add(ck_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 40));

        lbl_question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_question.setText("1.Who is The Father of Computer?");
        jPanel1.add(lbl_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1140, 40));

        lbl_choice1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_choice1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_choice1.setText("Charles Babbage");
        jPanel1.add(lbl_choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 1050, 40));

        lbl_choice2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_choice2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_choice2.setText("Leanardo Mang Tomas");
        jPanel1.add(lbl_choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 1070, 40));

        lbl_choice3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_choice3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_choice3.setText("Charlie Chaplin");
        jPanel1.add(lbl_choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 1070, 40));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 1150, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 1110, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 1110, 20));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 1110, 20));

        btn_next.setBackground(new java.awt.Color(51, 255, 51));
        btn_next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel1.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 210, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scorex.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, 90));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if(!ck_A.isSelected() && !ck_B.isSelected() && !ck_C.isSelected() && !ck_D.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select your answer!", "ANSWER VALIDATOR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        corrector();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void ck_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ck_CMouseClicked
        if(ck_C.isSelected()){
            ck_A.setSelected(false);
            ck_B.setSelected(false);
            ck_D.setSelected(false);
            Answer = "C";
        }
    }//GEN-LAST:event_ck_CMouseClicked

    private void ck_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ck_BMouseClicked
        if(ck_B.isSelected()){
            ck_A.setSelected(false);
            ck_C.setSelected(false);
            ck_D.setSelected(false);
            Answer = "B";
        }
    }//GEN-LAST:event_ck_BMouseClicked

    private void ck_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ck_AMouseClicked
        if(ck_A.isSelected()){
            ck_B.setSelected(false);
            ck_C.setSelected(false);
            ck_D.setSelected(false);
            Answer = "A";
        }
    }//GEN-LAST:event_ck_AMouseClicked

    private void ck_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ck_DMouseClicked
        if(ck_D.isSelected()){
            ck_A.setSelected(false);
            ck_C.setSelected(false);
            ck_B.setSelected(false);
            Answer = "D";
        }
    }//GEN-LAST:event_ck_DMouseClicked
  ProfileViewer pv =     new ProfileViewer();
  
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
            java.util.logging.Logger.getLogger(QuizHardLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizHardLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizHardLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizHardLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizHardLevel().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btn_next;
    private javax.swing.JCheckBox ck_A;
    private javax.swing.JCheckBox ck_B;
    private javax.swing.JCheckBox ck_C;
    private javax.swing.JCheckBox ck_D;
    private javax.swing.JLabel heart1;
    private javax.swing.JLabel heart2;
    private javax.swing.JLabel heart3;
    private javax.swing.JLabel heart4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
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
    private javax.swing.JLabel lbl_question;
    private javax.swing.JLabel lbl_quizTime;
    private javax.swing.JLabel lbl_score;
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
