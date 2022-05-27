/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Lectores;
import Entidades.Lector;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wilian
 */
public class JpLector extends javax.swing.JPanel {

    /**
     * Creates new form JpLector
     */
    public JpLector() {
        initComponents();
        carga();
    }

     public void carga() {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Edad", "Direccion", "Telefono"};
        //Ejemplosdearreglos
        Double numero[] = new Double[7];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Lectores es = new Lectores();
        ArrayList<Lector> listar = es.ListaLector();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[7];

        while (iterador.hasNext()) {
            //CASTEAR
            Lector estBucle = (Lector) iterador.next();
            fila[0] = estBucle.getIdLector();
            fila[1] = estBucle.getCodigoLector();
            fila[2] = estBucle.getNombre_Lector();
            fila[3] = estBucle.getApellido_Lector();
            fila[4] = estBucle.getEdad();
            fila[5] = estBucle.getDireccion();
            fila[6] = estBucle.getTelefono();
            df.addRow(fila);
        }
        TblLector.setModel(df);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNuevoLector = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblLector = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("GESTIÓN DE LECTORES");

        btnNuevoLector.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevoLector.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-file.png"))); // NOI18N
        btnNuevoLector.setText("Nuevo");
        btnNuevoLector.setContentAreaFilled(false);
        btnNuevoLector.setOpaque(true);
        btnNuevoLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLectorActionPerformed(evt);
            }
        });

        TblLector.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TblLector.setModel(new javax.swing.table.DefaultTableModel(
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
        TblLector.setGridColor(new java.awt.Color(0, 0, 0));
        TblLector.setSelectionBackground(new java.awt.Color(161, 220, 173));
        jScrollPane1.setViewportView(TblLector);

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(254, 254, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash (1).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setOpaque(true);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar1.setBackground(new java.awt.Color(238, 108, 77));
        btnActualizar1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnActualizar1.setForeground(new java.awt.Color(254, 254, 255));
        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setContentAreaFilled(false);
        btnActualizar1.setOpaque(true);
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLectorActionPerformed
        JfrmLectorCrud frm = new JfrmLectorCrud();
        frm.jpL = this;
        frm.setVisible(true);
    }//GEN-LAST:event_btnNuevoLectorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 if (TblLector.getSelectedRowCount()>0) {
             Lector es = new Lector();
        Lectores esDAO = new Lectores();
            int selectedRow =TblLector.getSelectedRow();
            es.setIdLector(Integer.parseInt(TblLector.getValueAt(selectedRow, 0).toString()));

             esDAO.DeleteLector(es);
             carga();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
if (TblLector.getSelectedRowCount() > 0) {

            JfrmLectorCrud frm = new JfrmLectorCrud();
            int selectedRow = TblLector.getSelectedRow();
            frm.txtIdLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 0)));
            frm.txtCodigoLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 1)));
            frm.txtNombreLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 2)));
            frm.txtApellidoLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 3)));
            frm.txtEdadLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 4)));
            frm.txtDireccionLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 5)));
            frm.txtTelefonoLector.setText(String.valueOf(TblLector.getValueAt(selectedRow, 6)));
            frm.jpL = this;
            frm.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblLector;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoLector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
