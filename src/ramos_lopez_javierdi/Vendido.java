/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramos_lopez_javierdi;

import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author javie
 */
public class Vendido extends javax.swing.JDialog {

    /**
     * Creates new form Vendido
     */
    public Vendido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(800,700);
        setTitle("CAMBIO LOOK AND FEEL");
        setLocationRelativeTo(null);
        
        // Añadimos al combo box los items que vaya a tener
        firstCombo.addItem("Bernstein");
        firstCombo.addItem("Aero");
        firstCombo.addItem("Aluminium");
        firstCombo.addItem("HiFi");
        firstCombo.addItem("McWin");
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
        firstLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstCombo = new javax.swing.JComboBox<>();
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
        secondLabel1.setText(org.openide.util.NbBundle.getMessage(Vendido.class, "Vendido.secondLabel1.text")); // NOI18N
        secondPanel.add(secondLabel1);

        thirdPanel.setBackground(new java.awt.Color(255, 255, 0));
        thirdPanel.setLayout(new java.awt.GridLayout(3, 1));

        firstLabel.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        firstLabel.setForeground(new java.awt.Color(0, 0, 153));
        firstLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstLabel.setText(org.openide.util.NbBundle.getMessage(Vendido.class, "Vendido.firstLabel.text")); // NOI18N
        thirdPanel.add(firstLabel);

        jLabel1.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(Vendido.class, "Vendido.jLabel1.text")); // NOI18N
        thirdPanel.add(jLabel1);

        firstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstComboActionPerformed(evt);
            }
        });
        thirdPanel.add(firstCombo);

        fourthPanel.setBackground(new java.awt.Color(255, 255, 0));

        fourthutton.setBackground(new java.awt.Color(51, 255, 0));
        fourthutton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fourthutton.setForeground(new java.awt.Color(0, 0, 102));
        fourthutton.setText(org.openide.util.NbBundle.getMessage(Vendido.class, "Vendido.fourthutton.text")); // NOI18N
        fourthutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthuttonActionPerformed(evt);
            }
        });
        fourthPanel.add(fourthutton);

        fifthButton.setBackground(new java.awt.Color(255, 0, 0));
        fifthButton.setFont(new java.awt.Font("Source Code Pro Black", 1, 36)); // NOI18N
        fifthButton.setForeground(new java.awt.Color(0, 0, 0));
        fifthButton.setText(org.openide.util.NbBundle.getMessage(Vendido.class, "Vendido.fifthButton.text")); // NOI18N
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
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fourthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void firstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstComboActionPerformed

        int seleccion = firstCombo.getSelectedIndex();
        try {

            // Dependiendo del click que hagamos, va a coger una opción u otra, para ello usamos un switch
            switch (seleccion) {

                case 0:

                // Creación de unobjeto de la clase Font
                Font f = new Font("Sitka Banner", BOLD, 32);

                // Con la clase UIManager, y el método setLookAndFeel, vamos a cambiar la fuente que ha sido importada y
                // añadida a la librería previamente
                UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

                // Y con la clase SwingUtitlites y el método updateComponentTreeUI, vamos a actualizar y aplicar el tema
                // previamente importada
                SwingUtilities.updateComponentTreeUI(this);
                firstLabel.setFont(f);

                break;

                case 1:

                // Creación de unobjeto de la clase Font
                Font f1 = new Font("Sikta Display", BOLD, 24);

                // Con la clase UIManager, y el método setLookAndFeel, vamos a cambiar la fuente que ha sido importada y
                // añadida a la librería previamente
                UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

                // Y con la clase SwingUtitlites y el método updateComponentTreeUI, vamos a actualizar y aplicar el tema
                // previamente importada
                SwingUtilities.updateComponentTreeUI(this);
                firstLabel.setFont(f1);

                break;

                case 2:

                // Creación de unobjeto de la clase Font
                Font f2 = new Font("Sikta Heading", BOLD, 32);

                // Con la clase UIManager, y el método setLookAndFeel, vamos a cambiar la fuente que ha sido importada y
                // añadida a la librería previamente
                UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

                // Y con la clase SwingUtitlites y el método updateComponentTreeUI, vamos a actualizar y aplicar el tema
                // previamente importada
                SwingUtilities.updateComponentTreeUI(this);
                firstLabel.setFont(f2);

                break;

                case 3:

                // Creación de unobjeto de la clase Font
                Font f3 = new Font("SimSun", BOLD, 32);

                // Con la clase UIManager, y el método setLookAndFeel, vamos a cambiar la fuente que ha sido importada y
                // añadida a la librería previamente
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

                // Y con la clase SwingUtitlites y el método updateComponentTreeUI, vamos a actualizar y aplicar el tema
                // previamente importada
                SwingUtilities.updateComponentTreeUI(this);

                firstLabel.setFont(f3);

                break;

                case 4:

                // Creación de unobjeto de la clase Font
                Font f4 = new Font("Showcard Gotic", BOLD, 32);

                // Con la clase UIManager, y el método setLookAndFeel, vamos a cambiar la fuente que ha sido importada y
                // añadida a la librería previamente
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

                // Y con la clase SwingUtitlites y el método updateComponentTreeUI, vamos a actualizar y aplicar el tema
                // previamente importada
                SwingUtilities.updateComponentTreeUI(this);

                firstLabel.setFont(f4);

                break;

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_firstComboActionPerformed

    /**
     * Método para cerrar la aplicación
     * @param evt 
     */
    private void fifthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthButtonActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_fifthButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Vendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vendido dialog = new Vendido(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> firstCombo;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel firstLabel1;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JButton fourthutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel secondLabel1;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
