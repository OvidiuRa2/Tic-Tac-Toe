
import java.awt.Frame;

/* @author radoi ovidiu*/
public class GameFinished2Players extends javax.swing.JDialog {

     Frame frameToClose;

    public GameFinished2Players(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        frameToClose=parent;
        initComponents();
        GUIUtils.setBackground(BG, "C:\\Radoi Ovidiu\\Facultate\\Java Curs\\BackGround TTT.jpg");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRestart2Players = new javax.swing.JButton();
        btnMainMenu2Players = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Do you want to play again?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 380, 40));

        btnRestart2Players.setBackground(new java.awt.Color(0, 0, 0));
        btnRestart2Players.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        btnRestart2Players.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart2Players.setText("Restart");
        btnRestart2Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestart2PlayersActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestart2Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 30));

        btnMainMenu2Players.setBackground(new java.awt.Color(0, 0, 0));
        btnMainMenu2Players.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        btnMainMenu2Players.setForeground(new java.awt.Color(255, 255, 255));
        btnMainMenu2Players.setText("Main Menu");
        btnMainMenu2Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenu2PlayersActionPerformed(evt);
            }
        });
        getContentPane().add(btnMainMenu2Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, 30));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestart2PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestart2PlayersActionPerformed
        dispose();
        frameToClose.dispose();
        TwoPlayersGame twg = new TwoPlayersGame(TwoPlayersGame.getPlayer1(), TwoPlayersGame.getPlayer2());
        twg.setVisible(true);
    }//GEN-LAST:event_btnRestart2PlayersActionPerformed

    private void btnMainMenu2PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenu2PlayersActionPerformed
        dispose();
        frameToClose.dispose();
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
    }//GEN-LAST:event_btnMainMenu2PlayersActionPerformed

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
            java.util.logging.Logger.getLogger(GameFinished2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFinished2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFinished2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFinished2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameFinished2Players dialog = new GameFinished2Players(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnMainMenu2Players;
    private javax.swing.JButton btnRestart2Players;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
