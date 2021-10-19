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
public class PlaymobilBombero extends javax.swing.JFrame {

    /**
     * Creates new form PlaymobilBombero
     */
    public PlaymobilBombero() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PLAYMOBIL BOMBERO");
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
        compraBoton = new javax.swing.JButton();
        fourthutton1 = new javax.swing.JButton();
        fifthButton = new javax.swing.JButton();

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
        thirdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bomba-removebg-preview (2).png"))); // NOI18N
        thirdPanel.add(thirdLabel);

        fourthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 48)); // NOI18N
        fourthLabel.setForeground(new java.awt.Color(0, 0, 102));
        fourthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthLabel.setText("PRECIO : 23.99€");
        thirdPanel.add(fourthLabel);

        fifthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 48)); // NOI18N
        fifthLabel.setForeground(new java.awt.Color(0, 0, 102));
        fifthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fifthLabel.setText("DESCRIPCIÓN : Bombero");
        thirdPanel.add(fifthLabel);

        sixthLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 48)); // NOI18N
        sixthLabel.setForeground(new java.awt.Color(0, 0, 102));
        sixthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixthLabel.setText("Nombre : Playmobil Bombero");
        thirdPanel.add(sixthLabel);

        fourthPanel.setBackground(new java.awt.Color(255, 255, 0));

        compraBoton.setBackground(new java.awt.Color(51, 255, 0));
        compraBoton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        compraBoton.setForeground(new java.awt.Color(0, 0, 102));
        compraBoton.setText("COMPRAR");
        compraBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraBotonActionPerformed(evt);
            }
        });
        fourthPanel.add(compraBoton);

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

        fifthButton.setBackground(new java.awt.Color(255, 0, 0));
        fifthButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fifthButton.setForeground(new java.awt.Color(0, 0, 0));
        fifthButton.setText(org.openide.util.NbBundle.getMessage(PlaymobilBombero.class, "Vendido.fifthButton.text")); // NOI18N
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
                    .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fourthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
     * Método que contendrá el botón para que vuelva atrás
     * @param evt 
     */
    private void fourthutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthutton1ActionPerformed

        Playmobil p = new Playmobil(this,true);

        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_fourthutton1ActionPerformed

    private void fifthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_fifthButtonActionPerformed

    private void compraBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraBotonActionPerformed

        Formulario f = new Formulario();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_compraBotonActionPerformed

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
            java.util.logging.Logger.getLogger(PlaymobilBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaymobilBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaymobilBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaymobilBombero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaymobilBombero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compraBoton;
    private javax.swing.JButton fifthButton;
    private javax.swing.JLabel fifthLabel;
    private javax.swing.JLabel firstLabel1;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel fourthLabel;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JButton fourthutton1;
    private javax.swing.JLabel secondLabel1;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JLabel sixthLabel;
    private javax.swing.JLabel thirdLabel;
    private javax.swing.JPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
