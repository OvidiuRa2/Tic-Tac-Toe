
/* @author radoi ovidiu*/
public class Name_Team_2Players extends javax.swing.JFrame {

    User user1, user2;

    public Name_Team_2Players() {
        initComponents();
        GUIUtils.setBackground(BG, "C:\\Radoi Ovidiu\\Facultate\\Java Curs\\BackGround TTT.jpg");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfNume2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnxPlayer2 = new javax.swing.JButton();
        btn0Player2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNume1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnxPlayer1 = new javax.swing.JButton();
        btn0Player1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 170, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel3.setBackground(new java.awt.Color(31, 47, 84));
        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter your name:");

        tfNume2.setBackground(new java.awt.Color(0, 0, 0));
        tfNume2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        tfNume2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(31, 47, 84));
        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose your team:");

        btnxPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        btnxPlayer2.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnxPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        btnxPlayer2.setText("X");
        btnxPlayer2.setBorder(null);
        btnxPlayer2.setOpaque(true);
        btnxPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxPlayer2ActionPerformed(evt);
            }
        });

        btn0Player2.setBackground(new java.awt.Color(0, 0, 0));
        btn0Player2.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn0Player2.setForeground(new java.awt.Color(255, 255, 255));
        btn0Player2.setText("O");
        btn0Player2.setOpaque(true);
        btn0Player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0Player2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(tfNume2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnxPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn0Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tfNume2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn0Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 270, 320));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel1.setBackground(new java.awt.Color(31, 47, 84));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter your name:");

        tfNume1.setBackground(new java.awt.Color(0, 0, 0));
        tfNume1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        tfNume1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(31, 47, 84));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose your team:");

        btnxPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        btnxPlayer1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btnxPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btnxPlayer1.setText("X");
        btnxPlayer1.setBorder(null);
        btnxPlayer1.setOpaque(true);
        btnxPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxPlayer1ActionPerformed(evt);
            }
        });

        btn0Player1.setBackground(new java.awt.Color(0, 0, 0));
        btn0Player1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        btn0Player1.setForeground(new java.awt.Color(255, 255, 255));
        btn0Player1.setText("O");
        btn0Player1.setOpaque(true);
        btn0Player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0Player1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(tfNume1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnxPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn0Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tfNume1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn0Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 320));

        jLabel5.setBackground(new java.awt.Color(31, 47, 84));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 230, 40));

        jLabel6.setBackground(new java.awt.Color(31, 47, 84));
        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Player1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    private void btnxPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxPlayer1ActionPerformed
        if (tfNume1.getText().trim().equals("") || tfNume2.getText().trim().equals("")) {
            TFEmptyDialog info = new TFEmptyDialog(this, true);
            info.setVisible(true);
        } else {
            user1 = new User(tfNume1.getText().trim(), "x");
            user2 = new User(tfNume2.getText().trim(), "0");
            dispose();
            TwoPlayersGame tpg = new TwoPlayersGame(user1, user2);
            tpg.setVisible(true);
        }
    }//GEN-LAST:event_btnxPlayer1ActionPerformed

    private void btn0Player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0Player1ActionPerformed
        if (tfNume1.getText().trim().equals("") || tfNume2.getText().trim().equals("")) {
            TFEmptyDialog info = new TFEmptyDialog(this, true);
            info.setVisible(true);
        } else {
            user1 = new User(tfNume1.getText().trim(), "0");
            user2 = new User(tfNume2.getText().trim(), "x");
            dispose();
            TwoPlayersGame tpg = new TwoPlayersGame(user1, user2);
            tpg.setVisible(true);
        }
    }//GEN-LAST:event_btn0Player1ActionPerformed

    private void btn0Player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0Player2ActionPerformed
        if (tfNume1.getText().trim().equals("") || tfNume2.getText().trim().equals("")) {
            TFEmptyDialog info = new TFEmptyDialog(this, true);
            info.setVisible(true);
        } else {
            user1 = new User(tfNume1.getText().trim(), "x");
            user2 = new User(tfNume2.getText().trim(), "0");
            dispose();
            TwoPlayersGame tpg = new TwoPlayersGame(user1, user2);
            tpg.setVisible(true);
        }
    }//GEN-LAST:event_btn0Player2ActionPerformed

    private void btnxPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxPlayer2ActionPerformed
        if (tfNume1.getText().trim().equals("") || tfNume2.getText().trim().equals("")) {
            TFEmptyDialog info = new TFEmptyDialog(this, true);
            info.setVisible(true);
        } else {
            user1 = new User(tfNume1.getText().trim(), "0");
            user2 = new User(tfNume2.getText().trim(), "x");
            dispose();
            TwoPlayersGame tpg = new TwoPlayersGame(user1, user2);
            tpg.setVisible(true);
        }
    }//GEN-LAST:event_btnxPlayer2ActionPerformed

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
            java.util.logging.Logger.getLogger(Name_Team_2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Name_Team_2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Name_Team_2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Name_Team_2Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Name_Team_2Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btn0Player1;
    private javax.swing.JButton btn0Player2;
    private javax.swing.JButton btnxPlayer1;
    private javax.swing.JButton btnxPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfNume1;
    private javax.swing.JTextField tfNume2;
    // End of variables declaration//GEN-END:variables
}
