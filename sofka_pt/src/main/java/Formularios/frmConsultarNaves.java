package Formularios;

import dao.ConsultasDaoJDBC;
import dao.TipoNaveDaoJDBC;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelDTO.NaveDTO;

/**
 *
 * @author Perea
 */
public class frmConsultarNaves extends javax.swing.JInternalFrame {

    TipoNaveDaoJDBC miTipo = new TipoNaveDaoJDBC();
    ConsultasDaoJDBC miConsulta = new ConsultasDaoJDBC();
    DefaultTableModel miTabla = new DefaultTableModel();
    
    public frmConsultarNaves() {
        initComponents();
    }
    
    //Metodo para llenar la tabla segun la consulta
    public void llenarTabla(List<NaveDTO> miNave) throws SQLException {
        String[] cabecera = {"Id", "Nombre", "Tipo de nave", "Peso", "Tipo de combustible", "Empuje", "Cap. Pasajeros"};
        miTabla = new DefaultTableModel(null, cabecera);

        String tabla[] = new String[7];
        miTabla.setRowCount(0);

        for (NaveDTO nave : miNave) {
            tabla[0] = String.valueOf(nave.getIdNave());
            tabla[1] = nave.getNombreNave();
            tabla[2] = miTipo.selectNameById(nave.getTipoNave());
            tabla[3] = String.valueOf(nave.getPesoNave());
            tabla[4] = nave.getCombustible();
            tabla[5] = String.valueOf(nave.getEmpuje());
            tabla[6] = String.valueOf(nave.getCapPasajeros());
            miTabla.addRow(tabla);
        }
        tableNaves.setModel(miTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkNombre = new javax.swing.JCheckBox();
        checkPeso = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        txtPesoHasta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPesoDesde = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNaves = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("CONSULTAR MIS NAVES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("-");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 20, -1));

        checkNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        checkNombre.setText("Nombre");
        checkNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkNombreItemStateChanged(evt);
            }
        });
        checkNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNombreActionPerformed(evt);
            }
        });
        jPanel3.add(checkNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        checkPeso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        checkPeso.setText("Peso");
        checkPeso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkPesoItemStateChanged(evt);
            }
        });
        jPanel3.add(checkPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        txtNombre.setEnabled(false);
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 220, -1));

        txtPesoHasta.setEnabled(false);
        jPanel3.add(txtPesoHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 50, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Consultar por:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Entre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        txtPesoDesde.setEnabled(false);
        jPanel3.add(txtPesoDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 50, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 90, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 170));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableNaves.setBackground(new java.awt.Color(102, 153, 255));
        tableNaves.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tableNaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableNaves.setRowHeight(40);
        jScrollPane1.setViewportView(tableNaves);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 330));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 770, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!checkNombre.isSelected() && !checkPeso.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Debe escoger al menos una opcion a consultar");
            return;
        }
        
        if(txtNombre.getText().isEmpty() && checkNombre.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Digite al menos una letra o numero a consultar");
            txtNombre.requestFocusInWindow();
            return;
        }
        
        if(txtPesoDesde.getText().isEmpty() && checkPeso.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Digite desde que peso quiere consultar");
            txtPesoDesde.requestFocusInWindow();
            return;
        }
        
        if(txtPesoHasta.getText().isEmpty() && checkPeso.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Digite hasta que peso quiere consultar");
            txtPesoHasta.requestFocusInWindow();
            return;
        }

        int desde = Integer.valueOf(txtPesoDesde.getText());
        int hasta = Integer.valueOf(txtPesoHasta.getText());
        
        if(checkNombre.isSelected() && checkPeso.isSelected()){
            try {
                llenarTabla(miConsulta.selectByNombreAndPeso(txtNombre.getText(), desde, hasta));
            } catch (SQLException ex) {
                Logger.getLogger(frmConsultarNaves.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(checkNombre.isSelected() && !checkPeso.isSelected()){
            try {
                llenarTabla(miConsulta.selectByNombre(txtNombre.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(frmConsultarNaves.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(checkPeso.isSelected() && !checkNombre.isSelected()){
            try {
                llenarTabla(miConsulta.selectByPeso(desde, hasta));
            } catch (SQLException ex) {
                Logger.getLogger(frmConsultarNaves.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Metodo para saber cuando ha sido seleccionado o no el checkbox y habilitar los textfields
    private void checkNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkNombreItemStateChanged
        if(checkNombre.isSelected()){
            txtNombre.setEnabled(true);
        } else{
            txtNombre.setEnabled(false);
        }
    }//GEN-LAST:event_checkNombreItemStateChanged

    //Metodo para saber cuando ha sido seleccionado o no el checkbox y habilitar los textfields
    private void checkPesoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkPesoItemStateChanged
        if(checkPeso.isSelected()){
            txtPesoDesde.setEnabled(true);
            txtPesoHasta.setEnabled(true);
        } else{
            txtPesoDesde.setEnabled(false);
            txtPesoHasta.setEnabled(false);
        }
    }//GEN-LAST:event_checkPesoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox checkNombre;
    private javax.swing.JCheckBox checkPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNaves;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPesoDesde;
    private javax.swing.JTextField txtPesoHasta;
    // End of variables declaration//GEN-END:variables
}
