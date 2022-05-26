/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.DatosLibross;
import Entidades.DatosLibro;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vkaiido
 */
public class JpDatosLibro extends javax.swing.JPanel {

    /**
     * Creates new form JpBookData
     * @param main
     */
    public JpDatosLibro(JfrmMenu main) {
        initComponents();
        mainForm = main;
        carga();
    }
    
    
       public void carga() {
        String titulos[] = {"idDatos_Libro", "idLibro", "Reseña", "Precio",
            "Cantidad", "Disponible", "Año_Publicacion"};
        //Ejemplosdearreglos
        Double numero[] = new Double[7];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        DatosLibross es = new DatosLibross();
        ArrayList<DatosLibro> listar = es.ListaDatosLibros();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[7];

        while (iterador.hasNext()) {
            //CASTEAR
            DatosLibro estBucle = (DatosLibro) iterador.next();
            fila[0] = estBucle.getIdDatos_Libro();
            fila[1] = estBucle.getIdLibro();
            fila[2] = estBucle.getReseña();
            fila[3] = estBucle.getPrecio();
            fila[4] = estBucle.getCantidad();
            fila[5] = estBucle.getDisponible().name();
            fila[6] = estBucle.getAño_Publicacion();
            df.addRow(fila);
        }
        TblDatosLibro.setModel(df);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtIdDatos = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtIdLibro1 = new javax.swing.JTextField();
        txtAñoPublicacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        TblDatosLibro = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        btnRegresar.setBackground(new java.awt.Color(61, 90, 128));
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel19.setText("Disponible");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtIdDatos.setEnabled(false);

        jLabel20.setText("Año de Publicacion");

        jLabel14.setText("Reseña");

        jLabel12.setText("Id Datos");

        jScrollPane3.setMaximumSize(new java.awt.Dimension(429, 429));

        jLabel13.setText("Id Libro");

        jLabel15.setText("Precio");

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/floppy-disk.png"))); // NOI18N
        jButton3.setText("Registrar");

        jLabel18.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(22, 22, 22)
                                .addComponent(txtAñoPublicacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14))
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdLibro1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(txtIdDatos))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIdDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAñoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        TblDatosLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblDatosLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDatosLibroMouseClicked(evt);
            }
        });
        TblDatosLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblDatosLibroKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(TblDatosLibro);
        TblDatosLibro.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addGap(24, 24, 24)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    JfrmMenu mainForm;
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        mainForm.currentPanel = null;
        mainForm.showJPanel(new JpLibro(mainForm));
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void TblDatosLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDatosLibroMouseClicked
        //        isSelect = true;
        //        try {
            //            txtIdEscritor.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 0).toString());
            //            txtId.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 1).toString());
            //            txtFechaNacimiento.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 2).toString());
            //            txtLugarNacimiento.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 3).toString());
            //            txtFechaDeceso.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 4).toString());
            //            txtLugarDeceso.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 5).toString());
            //            jTextArea2.setText(TblDatosEscritor.getValueAt(TblDatosEscritor.getSelectedRow(), 6).toString());
            //
            //        } catch (Exception ex) {
            //        }
    }//GEN-LAST:event_TblDatosLibroMouseClicked

    private void TblDatosLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblDatosLibroKeyReleased
        //        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            //
            //            isSelect = true;
            //            try {
                //                int filaSeleccionada = this.TblDatosEscritor.getSelectedRow();
                //                this.txtIdEscritor.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 0).toString());
                //                this.txtId.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 1).toString());
                //                this.txtFechaNacimiento.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 2).toString());
                //                this.txtLugarNacimiento.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 3).toString());
                //                this.txtFechaDeceso.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 4).toString());
                //                this.txtLugarDeceso.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 5).toString());
                //                this.jTextArea2.setText(TblDatosEscritor.getValueAt(filaSeleccionada, 6).toString());
                //            } catch (Exception e) {
                //                JOptionPane.showMessageDialog(null, "Error al leer la tabla", "Error", JOptionPane.WARNING_MESSAGE);
                //            }
            //
            //        }
    }//GEN-LAST:event_TblDatosLibroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDatosLibro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAñoPublicacion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdDatos;
    public javax.swing.JTextField txtIdLibro1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
