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
public class Playmobil extends javax.swing.JDialog {

    /**
     * Creates new form Playmobil
     */
    public Playmobil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SECCIÓN DE PLAYMOBILS");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPanel1 = new javax.swing.JPanel();
        secondPanel1 = new javax.swing.JPanel();
        firstLabel1 = new javax.swing.JLabel();
        secondLabel1 = new javax.swing.JLabel();
        thirdPanel1 = new javax.swing.JPanel();
        thirdLabel1 = new javax.swing.JLabel();
        fourthPanel1 = new javax.swing.JPanel();
        sixthButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        eigthButton = new javax.swing.JButton();
        ninthButton1 = new javax.swing.JButton();
        fifthButton = new javax.swing.JButton();
        eigthButton1 = new javax.swing.JButton();
        fifthPanel1 = new javax.swing.JPanel();
        tenthButton = new javax.swing.JButton();
        tenthButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        firstPanel1.setBackground(new java.awt.Color(255, 255, 0));

        secondPanel1.setBackground(new java.awt.Color(255, 255, 0));

        firstLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coquito.png"))); // NOI18N
        secondPanel1.add(firstLabel1);

        secondLabel1.setFont(new java.awt.Font("Source Code Pro Black", 1, 48)); // NOI18N
        secondLabel1.setForeground(new java.awt.Color(0, 0, 102));
        secondLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondLabel1.setText("JUGUETERÍA TOBOGÁN");
        secondPanel1.add(secondLabel1);

        thirdPanel1.setBackground(new java.awt.Color(255, 255, 0));

        thirdLabel1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 36)); // NOI18N
        thirdLabel1.setForeground(new java.awt.Color(0, 0, 102));
        thirdLabel1.setText("¡¡CLICKA SOBRE UN PLAYMOBIL!!");
        thirdPanel1.add(thirdLabel1);

        fourthPanel1.setBackground(new java.awt.Color(255, 255, 0));
        fourthPanel1.setLayout(new java.awt.GridLayout(3, 2));

        sixthButton.setBackground(new java.awt.Color(255, 255, 0));
        sixthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/romanuco-removebg-preview (1).png"))); // NOI18N
        sixthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixthButtonActionPerformed(evt);
            }
        });
        fourthPanel1.add(sixthButton);

        firstButton.setBackground(new java.awt.Color(255, 255, 255));
        firstButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        firstButton.setForeground(new java.awt.Color(0, 0, 102));
        firstButton.setText("¡COMPRAR YA!");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });
        fourthPanel1.add(firstButton);

        eigthButton.setBackground(new java.awt.Color(255, 255, 0));
        eigthButton.setForeground(new java.awt.Color(255, 255, 0));
        eigthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardianuco-removebg-preview (1).png"))); // NOI18N
        eigthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthButtonActionPerformed(evt);
            }
        });
        fourthPanel1.add(eigthButton);

        ninthButton1.setBackground(new java.awt.Color(255, 255, 255));
        ninthButton1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 36)); // NOI18N
        ninthButton1.setForeground(new java.awt.Color(0, 0, 102));
        ninthButton1.setText("¡COMPRAR YA!");
        ninthButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ninthButton1MouseClicked(evt);
            }
        });
        ninthButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninthButton1ActionPerformed(evt);
            }
        });
        fourthPanel1.add(ninthButton1);

        fifthButton.setBackground(new java.awt.Color(255, 255, 0));
        fifthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bomba-removebg-preview (2).png"))); // NOI18N
        fifthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthButtonActionPerformed(evt);
            }
        });
        fourthPanel1.add(fifthButton);

        eigthButton1.setBackground(new java.awt.Color(255, 255, 255));
        eigthButton1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 36)); // NOI18N
        eigthButton1.setForeground(new java.awt.Color(0, 0, 102));
        eigthButton1.setText("¡COMPRAR YA!");
        eigthButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eigthButton1MouseClicked(evt);
            }
        });
        eigthButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthButton1ActionPerformed(evt);
            }
        });
        fourthPanel1.add(eigthButton1);

        fifthPanel1.setBackground(new java.awt.Color(255, 255, 0));

        tenthButton.setBackground(new java.awt.Color(0, 255, 0));
        tenthButton.setFont(new java.awt.Font("Source Sans Pro Black", 1, 24)); // NOI18N
        tenthButton.setForeground(new java.awt.Color(0, 0, 102));
        tenthButton.setText("VOLVER");
        tenthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthButtonActionPerformed(evt);
            }
        });
        fifthPanel1.add(tenthButton);

        tenthButton1.setBackground(new java.awt.Color(255, 0, 0));
        tenthButton1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 24)); // NOI18N
        tenthButton1.setForeground(new java.awt.Color(0, 0, 102));
        tenthButton1.setText("CERRAR");
        tenthButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthButton1ActionPerformed(evt);
            }
        });
        fifthPanel1.add(tenthButton1);

        javax.swing.GroupLayout firstPanel1Layout = new javax.swing.GroupLayout(firstPanel1);
        firstPanel1.setLayout(firstPanel1Layout);
        firstPanel1Layout.setHorizontalGroup(
            firstPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fifthPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        firstPanel1Layout.setVerticalGroup(
            firstPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourthPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(fifthPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que contendrá el evento que haga que la aplicación vuelva un paso atrás
     * @param evt 
     */
    private void tenthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthButtonActionPerformed
        
        VentanaPrincipal vp = new VentanaPrincipal();
        
        this.setVisible(false);
        vp.setVisible(true);
        
      
        
    }//GEN-LAST:event_tenthButtonActionPerformed

    /**
     * Método que contendrá el evento que haga que la aplicación vaya a comprar el guardiáns
     * @param evt 
     */
    private void ninthButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninthButton1ActionPerformed
        
        Formulario f = new Formulario();
        
        this.setVisible(false);
        f.setVisible(true);
        
    }//GEN-LAST:event_ninthButton1ActionPerformed

    /**
     * Método que contendrá el botón que te llevará a la página del playmobil bombero
     * @param evt 
     */
    private void eigthButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eigthButton1ActionPerformed
        
        Formulario f = new Formulario();
        
        this.setVisible(false);
        f.setVisible(true);
        
        
    }//GEN-LAST:event_eigthButton1ActionPerformed

    /**
     * Método que contendrá el sonido cuando clickemos sobre el botón de comprar
     * @param evt 
     */
    private void ninthButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninthButton1MouseClicked
         
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();
        
    }//GEN-LAST:event_ninthButton1MouseClicked

    /**
     * Método que contendrá el sonido cuando clickemos sobre el botón de comprar
     * @param evt 
     */
    private void eigthButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eigthButton1MouseClicked
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();
        
    }//GEN-LAST:event_eigthButton1MouseClicked

    private void tenthButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthButton1ActionPerformed
       
        System.exit(0);
        
    }//GEN-LAST:event_tenthButton1ActionPerformed

    private void sixthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixthButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/aparicion.wav"));
        Sound.play();
        
        PlaymobilGuerrero pg = new PlaymobilGuerrero();
        
        this.setVisible(false);
        pg.setVisible(true);
        
    }//GEN-LAST:event_sixthButtonActionPerformed

    private void eigthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eigthButtonActionPerformed
        
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/aparicion.wav"));
        Sound.play();
        
        PlaymobilGuardian pg = new PlaymobilGuardian();
        
        this.setVisible(false);
        pg.setVisible(true);
        
    }//GEN-LAST:event_eigthButtonActionPerformed

    private void fifthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/aparicion.wav"));
        Sound.play();
        
        PlaymobilBombero pb = new PlaymobilBombero();
        
        this.setVisible(false);
        pb.setVisible(true);
        
    }//GEN-LAST:event_fifthButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/audios/DINERO.wav"));
        Sound.play();
        
        Formulario f = new Formulario();
        
        this.setVisible(false);
        f.setVisible(true);
        
    }//GEN-LAST:event_firstButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Playmobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playmobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playmobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playmobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Playmobil dialog = new Playmobil(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton eigthButton;
    private javax.swing.JButton eigthButton1;
    private javax.swing.JButton fifthButton;
    private javax.swing.JPanel fifthPanel1;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel firstLabel1;
    private javax.swing.JPanel firstPanel1;
    private javax.swing.JPanel fourthPanel1;
    private javax.swing.JButton ninthButton1;
    private javax.swing.JLabel secondLabel1;
    private javax.swing.JPanel secondPanel1;
    private javax.swing.JButton sixthButton;
    private javax.swing.JButton tenthButton;
    private javax.swing.JButton tenthButton1;
    private javax.swing.JLabel thirdLabel1;
    private javax.swing.JPanel thirdPanel1;
    // End of variables declaration//GEN-END:variables
}
