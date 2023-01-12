package Formularios;

import dao.Utilidades;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perea
 */
public class frmPrincipal extends javax.swing.JFrame {
    
    Utilidades misUtilidades = new Utilidades();
    
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JPanel();
        lblLinkedin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPrincipal = new javax.swing.JMenu();
        mnuCrear = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuConsultarNaves = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("linkedin.png")));
        lblLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkedinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpnEscritorioLayout.createSequentialGroup()
                .addContainerGap(1140, Short.MAX_VALUE)
                .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpnEscritorioLayout.createSequentialGroup()
                .addContainerGap(559, Short.MAX_VALUE)
                .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        mnuPrincipal.setText("Menu");

        mnuCrear.setText("Crear nave");
        mnuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuCrear);

        mnuSalir.setText("Salir");
        mnuPrincipal.add(mnuSalir);

        jMenuBar1.add(mnuPrincipal);

        mnuConsultas.setText("Consultas");

        mnuConsultarNaves.setText("Consultar naves");
        mnuConsultarNaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarNavesActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultarNaves);

        jMenuBar1.add(mnuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearActionPerformed
        frmCrearNave miFrmCrear = null;
        try {
            miFrmCrear = new frmCrearNave();
        } catch (SQLException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dpnEscritorio.add(miFrmCrear);
        miFrmCrear.show();
    }//GEN-LAST:event_mnuCrearActionPerformed

    private void mnuConsultarNavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarNavesActionPerformed
        frmConsultarNaves miFrmConsulta = new frmConsultarNaves();
        dpnEscritorio.add(miFrmConsulta);
        miFrmConsulta.show();
    }//GEN-LAST:event_mnuConsultarNavesActionPerformed

    private void lblLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkedinMouseClicked
        misUtilidades.abrirPaginaWeb("https://www.linkedin.com/in/josefperea/");
    }//GEN-LAST:event_lblLinkedinMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JMenuItem mnuConsultarNaves;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuItem mnuCrear;
    private javax.swing.JMenu mnuPrincipal;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}