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
public class PlaymobilGuardian extends javax.swing.JFrame {

    /**
     * Creates new form PlaymobilGuardian
     */
    public PlaymobilGuardian() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PLAYMOBIL GUARDIÁN");
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
        thirdLabel = new javax.swing.JLabel();
        fourthLabel = new javax.swing.JLabel();
        fifthLabel = new javax.swing.JLabel();
        sixthLabel = new javax.swing.JLabel();
        fourthPanel = new javax.swing.JPanel();
        fourthutton = new javax.swing.JButton();
        fourthutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        thirdPanel.setLayout(new java.awt.GridLayout(4, 1));

        thirdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardian-removebg-preview (1) (1) (1).png"))); // NOI18N
        thirdPanel.add(thirdLabel);

        fourthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthLabel.setForeground(new java.awt.Color(0, 0, 102));
        fourthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthLabel.setText("PRECIO : 19.99€");
        thirdPanel.add(fourthLabel);

        fifthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fifthLabel.setForeground(new java.awt.Color(0, 0, 102));
        fifthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fifthLabel.setText("DESCRIPCIÓN  : Guardián de la ciudadela");
        thirdPanel.add(fifthLabel);

        sixthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        sixthLabel.setForeground(new java.awt.Color(0, 0, 102));
        sixthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixthLabel.setText("UNIDADES : 2");
        thirdPanel.add(sixthLabel);

        fourthPanel.setBackground(new java.awt.Color(255, 255, 0));

        fourthutton.setBackground(new java.awt.Color(51, 255, 0));
        fourthutton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthutton.setForeground(new java.awt.Color(0, 0, 102));
        fourthutton.setText("COMPRAR");
        fourthutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourthuttonMouseClicked(evt);
            }
        });
        fourthutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthuttonActionPerformed(evt);
            }
        });
        fourthPanel.add(fourthutton);

        fourthutton1.setBackground(new java.awt.Color(51, 255, 0));
        fourthutton1.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthutton1.setForeground(new java.awt.Color(0, 0, 102));
        fourthutton1.setText("VOLVER");
        fourthutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthutton1ActionPerformed(evt);
            }
        });
        fourthPanel.add(fourthutton1);

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
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    /**
     * Método que contiene un evento que nos llevará al formulario para realizar la compra
     * @param evt 
     */
    private void fourthuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthuttonActionPerformed
            
        Formulario f = new Formulario();
        
        this.setVisible(false);
        f.setVisible(true);
        
    }//GEN-LAST:event_fourthuttonActionPerformed

    /**
     * Método que contendrá el botón para que se vuelva atrás en la aplicación
     * @param evt 
     */
    private void fourthutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthutton1ActionPerformed

        Playmobil p = new Playmobil(this,true);

        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_fourthutton1ActionPerformed

  
    /**
     * Método que contendrá el sonido cuando clickemos sobre el botón de comprar
     * @param evt 
     */
    private void fourthuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourthuttonMouseClicked
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();
        
    }//GEN-LAST:event_fourthuttonMouseClicked

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
            java.util.logging.Logger.getLogger(PlaymobilGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaymobilGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaymobilGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaymobilGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaymobilGuardian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fifthLabel;
    private javax.swing.JLabel firstLabel1;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel fourthLabel;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JButton fourthutton;
    private javax.swing.JButton fourthutton1;
    private javax.swing.JLabel secondLabel1;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JLabel sixthLabel;
    private javax.swing.JLabel thirdLabel;
    private javax.swing.JPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
