
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;


/* @author radoi ovidiu*/
public class TwoPlayersGame extends javax.swing.JFrame {

    JButton b1, b2, b3;
    boolean firstTurn = true;
    static User player1, player2, turn;
    List<JButton> buttons;

    public TwoPlayersGame(User u1, User u2) {
        initComponents();
        GUIUtils.center(this);
        buttons = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        player1 = new User(u1);
        player2 = new User(u2);
        GUIUtils.setBackground(BG, "C:\\Radoi Ovidiu\\Facultate\\Java Curs\\BackGround TTT.jpg");
        selectTurn();
        setLabels();
    }

    private void selectTurn() {
        if (firstTurn == true) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                turn = player1;
            }
            if (random == 1) {
                turn = player2;

            }
            firstTurn = false;
        } else {
            if (turn.getNume().equals(player1.getNume())) {
                turn = player2;
            } else {
                turn = player1;
            }
        }
        lbTurn.setText("");
        lbTurn.setText(turn.getNume() + "'s Turn");
    }

    private void setLabels() {
        lbPlayer1.setText(player1.getNume());
        lbPlayer2.setText(player2.getNume());
    }

    private void disableButtons(JButton b1, JButton b2, JButton b3) {
        lbTurn.setText(turn.getNume() + " Wins!");
        for (JButton btn : buttons) {
            if (btn.equals(b3) || btn.equals(b2) || btn.equals(b1)) {
                btn.setBackground(Color.green);
            } else {
                btn.setEnabled(false);
            }
        }

    }

    private boolean verifyWin() {
        if (btn1.getText().equals(btn3.getText()) && btn1.getText().equals(btn2.getText()) && !btn1.getText().equals("")) {
            disableButtons(btn1, btn2, btn3);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn4.getText().equals(btn5.getText()) && btn4.getText().equals(btn6.getText()) && !btn4.getText().equals("")) {
            disableButtons(btn4, btn5, btn6);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn7.getText().equals(btn8.getText()) && btn7.getText().equals(btn9.getText()) && !btn7.getText().equals("")) {
            disableButtons(btn7, btn8, btn9);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;

        }
        if (btn1.getText().equals(btn4.getText()) && btn1.getText().equals(btn7.getText()) && !btn1.getText().equals("")) {
            disableButtons(btn1, btn4, btn7);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn2.getText().equals(btn5.getText()) && btn2.getText().equals(btn8.getText()) && !btn2.getText().equals("")) {
            disableButtons(btn2, btn5, btn8);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn3.getText().equals(btn6.getText()) && btn3.getText().equals(btn9.getText()) && !btn3.getText().equals("")) {
            disableButtons(btn3, btn6, btn9);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn1.getText().equals(btn5.getText()) && btn1.getText().equals(btn9.getText()) && !btn1.getText().equals("")) {
            disableButtons(btn1, btn5, btn9);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        if (btn3.getText().equals(btn5.getText()) && btn3.getText().equals(btn7.getText()) && !btn3.getText().equals("")) {
            disableButtons(btn3, btn5, btn7);
            GameFinished2Players dialog = new GameFinished2Players(this, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            return true;
        }
        return false;
    }

    private boolean verifyDraw() {
        for (JButton b : buttons) {
            if (b.getText().equals("")) {
                return false;
            }
        }
        disableButtons(b1, b2, b3);
        lbTurn.setText("It is a draw!");
        GameFinished2Players dialog = new GameFinished2Players(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        return true;
    }

    public static User getPlayer1() {
        return new User(player1);
    }

    public static User getPlayer2() {
        return new User(player2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbPlayer2 = new javax.swing.JLabel();
        lbPlayer1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbTurn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        lbPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        lbPlayer2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        lbPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lbPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayer2.setText("Computer");

        lbPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        lbPlayer1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        lbPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        lbPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayer1.setText("Player1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(lbPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lbPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 430, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lbTurn.setBackground(new java.awt.Color(0, 0, 0));
        lbTurn.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        lbTurn.setForeground(new java.awt.Color(255, 255, 255));
        lbTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 850, 490));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (btn1.getText().trim().equals("")) {
            btn1.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (btn2.getText().trim().equals("")) {
            btn2.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (btn3.getText().trim().equals("")) {
            btn3.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (btn4.getText().trim().equals("")) {
            btn4.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (btn5.getText().trim().equals("")) {
            btn5.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (btn6.getText().trim().equals("")) {
            btn6.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (btn7.getText().trim().equals("")) {
            btn7.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (btn8.getText().trim().equals("")) {
            btn8.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (btn9.getText().trim().equals("")) {
            btn9.setText(turn.getEchipa().toUpperCase());
            if (verifyDraw() == false && verifyWin() == false) {
                selectTurn();
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(TwoPlayersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoPlayersGame(player1, player2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbPlayer1;
    private javax.swing.JLabel lbPlayer2;
    private javax.swing.JLabel lbTurn;
    // End of variables declaration//GEN-END:variables
}
