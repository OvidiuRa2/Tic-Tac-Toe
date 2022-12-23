
import java.awt.Frame;


/* @author radoi ovidiu*/
public class gameFinished extends javax.swing.JDialog {
    Frame frameToClose;
    public gameFinished(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        frameToClose=parent;
        initComponents();
        GUIUtils.setBackground(BG, "C:\\Radoi Ovidiu\\Facultate\\Java Curs\\BackGround TTT.jpg");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Do you want to play again?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 380, 40));

        btnRestart.setBackground(new java.awt.Color(0, 0, 0));
        btnRestart.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 30));

        btnMainMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMainMenu.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, 30));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        dispose();
        frameToClose.dispose();
        OnePlayerGame opg = new  OnePlayerGame(OnePlayerGame.getPlayer1());
        opg.setVisible(true);
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        dispose();
        frameToClose.dispose();
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

   
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
            java.util.logging.Logger.getLogger(gameFinished.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameFinished.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameFinished.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameFinished.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gameFinished dialog = new gameFinished(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
