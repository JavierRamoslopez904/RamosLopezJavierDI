package ramos_lopez_javierdi;

import java.applet.AudioClip;
/**
 *
 * @author javie
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setTitle("Juguetería Tobogán");
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPanel = new javax.swing.JPanel();
        secondPaneñ = new javax.swing.JPanel();
        firstButton = new javax.swing.JButton();
        firstText = new javax.swing.JLabel();
        thirdPanel = new javax.swing.JPanel();
        firstImage = new javax.swing.JLabel();
        secondImage = new javax.swing.JLabel();
        thirdImage = new javax.swing.JLabel();
        secondButton = new javax.swing.JButton();
        thirdButton = new javax.swing.JButton();
        fourthButton = new javax.swing.JButton();
        fourthPanel = new javax.swing.JPanel();
        fifthButton = new javax.swing.JButton();
        sixthButton = new javax.swing.JButton();
        seventhButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstPanel.setBackground(new java.awt.Color(255, 255, 0));

        secondPaneñ.setBackground(new java.awt.Color(255, 255, 0));

        firstButton.setBackground(new java.awt.Color(255, 255, 0));
        firstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/toy (2).png"))); // NOI18N
        firstButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstButtonMouseClicked(evt);
            }
        });
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });
        secondPaneñ.add(firstButton);

        firstText.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        firstText.setForeground(new java.awt.Color(0, 0, 102));
        firstText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstText.setText("Juguetería Tobogán");
        secondPaneñ.add(firstText);

        thirdPanel.setBackground(new java.awt.Color(255, 255, 0));
        thirdPanel.setLayout(new java.awt.GridLayout(2, 3));

        firstImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Playmobil_logo.svg_1_1.png"))); // NOI18N
        thirdPanel.add(firstImage);

        secondImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lego (1) (1) (1) (1).png"))); // NOI18N
        thirdPanel.add(secondImage);

        thirdImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bob__2_-removebg-preview (1).png"))); // NOI18N
        thirdPanel.add(thirdImage);

        secondButton.setBackground(new java.awt.Color(0, 255, 0));
        secondButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        secondButton.setForeground(new java.awt.Color(0, 0, 153));
        secondButton.setText("PLAYMOBIL");
        secondButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondButtonMouseClicked(evt);
            }
        });
        secondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondButtonActionPerformed(evt);
            }
        });
        thirdPanel.add(secondButton);

        thirdButton.setBackground(new java.awt.Color(0, 255, 0));
        thirdButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        thirdButton.setForeground(new java.awt.Color(0, 0, 153));
        thirdButton.setText("LEGO");
        thirdButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirdButtonMouseClicked(evt);
            }
        });
        thirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdButtonActionPerformed(evt);
            }
        });
        thirdPanel.add(thirdButton);

        fourthButton.setBackground(new java.awt.Color(0, 255, 0));
        fourthButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthButton.setForeground(new java.awt.Color(0, 0, 153));
        fourthButton.setText("BOB ESPONJA");
        fourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthButtonActionPerformed(evt);
            }
        });
        thirdPanel.add(fourthButton);

        fourthPanel.setBackground(new java.awt.Color(255, 255, 0));

        fifthButton.setBackground(new java.awt.Color(255, 255, 0));
        fifthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telefono__1_-removebg-preview (2)_1.png"))); // NOI18N
        fifthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthButtonActionPerformed(evt);
            }
        });
        fourthPanel.add(fifthButton);

        sixthButton.setBackground(new java.awt.Color(0, 255, 0));
        sixthButton.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        sixthButton.setForeground(new java.awt.Color(0, 0, 153));
        sixthButton.setText("VER MÁS JUGUETES");
        sixthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixthButtonActionPerformed(evt);
            }
        });
        fourthPanel.add(sixthButton);

        seventhButton.setBackground(new java.awt.Color(255, 255, 0));
        seventhButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/google (1).png"))); // NOI18N
        seventhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seventhButtonActionPerformed(evt);
            }
        });
        fourthPanel.add(seventhButton);

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fourthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondPaneñ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(secondPaneñ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fourthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondButtonActionPerformed

    private void thirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thirdButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstButtonActionPerformed

    /**
     * Método que recibirá por parámetro un evento, y se encargará de mostrar un audio para el primer botón
     * @param evt 
     */
    private void firstButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstButtonMouseClicked
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/bienvenidos.wav"));
        Sound.play();
       
    }//GEN-LAST:event_firstButtonMouseClicked

    /**
     * Método que recibirá por parámtro un evento y mostrará un audio para el botón de playmobil
     * @param evt 
     */
    private void secondButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondButtonMouseClicked
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/playmobil.wav"));
        Sound.play();
        
        Playmobil p = new Playmobil(this,true);
        
        p.setVisible(true);
    }//GEN-LAST:event_secondButtonMouseClicked

    /**
     * Método que recibirá un evento y mostrará un audio para el botón de LEGO
     * @param evt 
     */
    private void thirdButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirdButtonMouseClicked
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/lego.wav"));
        Sound.play();
        
        Lego l = new Lego(this,true);
        
        l.setVisible(true);
        
    }//GEN-LAST:event_thirdButtonMouseClicked

    /**
     * Método que recibirá un evento y mostrará un audio para el botón de BOB ESPONJA
     * @param evt 
     */
    private void fourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/bobo.wav"));
        Sound.play();
        
        Bob b = new Bob(this,true);
        
        b.setVisible(true);
        
    }//GEN-LAST:event_fourthButtonActionPerformed

    /**
     * Método que recibirá un evento y se mostrará un audio para el botón de MÁS JUGUETES
     * @param evt 
     */
    private void sixthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixthButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/foun.wav"));
        Sound.play();
        
        More m = new More(this,true);
        
        m.setVisible(true);
        
    }//GEN-LAST:event_sixthButtonActionPerformed

    /**
     * Método que va a tener un botón, el cual contendrá el sonido de un teléfono marcando
     * @param evt 
     */
    private void fifthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthButtonActionPerformed
       
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/telefono.wav"));
        Sound.play();
        
    }//GEN-LAST:event_fifthButtonActionPerformed

    /**
     * Método que va a tener un botón, el cual contendrá un sonido de sorpresa
     * @param evt 
     */
    private void seventhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seventhButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/sorpresa.wav"));
        Sound.play();
        
    }//GEN-LAST:event_seventhButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fifthButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel firstImage;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel firstText;
    private javax.swing.JButton fourthButton;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JButton secondButton;
    private javax.swing.JLabel secondImage;
    private javax.swing.JPanel secondPaneñ;
    private javax.swing.JButton seventhButton;
    private javax.swing.JButton sixthButton;
    private javax.swing.JButton thirdButton;
    private javax.swing.JLabel thirdImage;
    private javax.swing.JPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
