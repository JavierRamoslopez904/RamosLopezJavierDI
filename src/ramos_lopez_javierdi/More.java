/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramos_lopez_javierdi;

import java.applet.AudioClip;

/**
 *
 * @author javie
 */
public class More extends javax.swing.JDialog {

    /**
     * Creates new form More
     */
    public More(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("MÁS JUGUETES");
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
        secondPanel = new javax.swing.JPanel();
        firstLabel1 = new javax.swing.JLabel();
        secondLabel1 = new javax.swing.JLabel();
        thirdPanel = new javax.swing.JPanel();
        thirdButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        fourthButton = new javax.swing.JButton();
        secondButton = new javax.swing.JButton();
        fourthPanel = new javax.swing.JPanel();
        fourthutton = new javax.swing.JButton();
        fifthButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        firstPanel.setBackground(new java.awt.Color(255, 255, 0));

        secondPanel.setBackground(new java.awt.Color(255, 255, 0));

        firstLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coquito.png"))); // NOI18N
        secondPanel.add(firstLabel1);

        secondLabel1.setFont(new java.awt.Font("Source Code Pro Black", 1, 48)); // NOI18N
        secondLabel1.setForeground(new java.awt.Color(0, 0, 102));
        secondLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondLabel1.setText("JUGUETERÍA TOBOGÁN");
        secondPanel.add(secondLabel1);

        thirdPanel.setBackground(new java.awt.Color(255, 255, 0));
        thirdPanel.setLayout(new java.awt.GridLayout(2, 2));

        thirdButton.setBackground(new java.awt.Color(255, 255, 0));
        thirdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/legolas-removebg-preview (1).png"))); // NOI18N
        thirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdButtonActionPerformed(evt);
            }
        });
        thirdPanel.add(thirdButton);

        firstButton.setBackground(new java.awt.Color(255, 255, 255));
        firstButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        firstButton.setForeground(new java.awt.Color(0, 0, 102));
        firstButton.setText("¡COMPRAR YA!");
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
        thirdPanel.add(firstButton);

        fourthButton.setBackground(new java.awt.Color(255, 255, 0));
        fourthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spiderman-removebg-preview (1).png"))); // NOI18N
        fourthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthButtonActionPerformed(evt);
            }
        });
        thirdPanel.add(fourthButton);

        secondButton.setBackground(new java.awt.Color(255, 255, 255));
        secondButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        secondButton.setForeground(new java.awt.Color(0, 0, 102));
        secondButton.setText("¡COMPRAR YA!");
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

        fourthPanel.setBackground(new java.awt.Color(255, 255, 0));

        fourthutton.setBackground(new java.awt.Color(51, 255, 0));
        fourthutton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthutton.setForeground(new java.awt.Color(0, 0, 102));
        fourthutton.setText("VOLVER");
        fourthutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthuttonActionPerformed(evt);
            }
        });
        fourthPanel.add(fourthutton);

        fifthButton.setBackground(new java.awt.Color(255, 0, 0));
        fifthButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fifthButton.setForeground(new java.awt.Color(0, 0, 0));
        fifthButton.setText(org.openide.util.NbBundle.getMessage(More.class, "Vendido.fifthButton.text")); // NOI18N
        fifthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthButtonActionPerformed(evt);
            }
        });
        fourthPanel.add(fifthButton);

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fourthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fourthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void fourthuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthuttonActionPerformed

        VentanaPrincipal vp = new VentanaPrincipal();

        this.setVisible(false);
        vp.setVisible(true);

    }//GEN-LAST:event_fourthuttonActionPerformed

    /**
     * Método que va a contener el evento que mostrará la información de la figura de Legolass
     * @param evt 
     */
    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed

         Formulario f = new Formulario();
         this.setVisible(false);
         f.setVisible(true);
       
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();

    }//GEN-LAST:event_firstButtonActionPerformed

    /**
     * Método que va a contener el evento que mostrará la información de la figura de Spiderman
     * @param evt 
     */
    private void secondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondButtonActionPerformed
        
        Formulario f = new Formulario();
        this.setVisible(false);
        f.setVisible(true);
       
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();
        
    }//GEN-LAST:event_secondButtonActionPerformed

    /**
     * Método que contendrá el sonido cuando clickemos sobre el botón de comprar
     * @param evt 
     */
    private void firstButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstButtonMouseClicked
        
        
        
    }//GEN-LAST:event_firstButtonMouseClicked

    /**
     * Método que contendrá el sonido cuando clickemos sobre el botón de comprar
     * @param evt 
     */
    private void secondButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondButtonMouseClicked
        
      
    }//GEN-LAST:event_secondButtonMouseClicked

    private void fifthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_fifthButtonActionPerformed

    private void thirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdButtonActionPerformed
        Legolas l = new Legolas();
        this.setVisible(false);
        l.setVisible(true);
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/aparicion.wav"));
        Sound.play();
    }//GEN-LAST:event_thirdButtonActionPerformed

    private void fourthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthButtonActionPerformed
        
        Spiderman s = new Spiderman();
        this.setVisible(false);
        s.setVisible(true);
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/aparicion.wav"));
        Sound.play();
        
    }//GEN-LAST:event_fourthButtonActionPerformed

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
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                More dialog = new More(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton fifthButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel firstLabel1;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JButton fourthButton;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JButton fourthutton;
    private javax.swing.JButton secondButton;
    private javax.swing.JLabel secondLabel1;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JButton thirdButton;
    private javax.swing.JPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
