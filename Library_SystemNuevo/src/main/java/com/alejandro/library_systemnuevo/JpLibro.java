/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Libros;
import Entidades.Libro;
import ViewModel.LibroVM;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wilian
 */
public class JpLibro extends javax.swing.JPanel {

    /**
     * Creates new form JpBook
     */
    public JpLibro(JfrmMenu main) {
        
        initComponents();
        carga();
        mainForm = main;
    }
    

    public void carga() {
        String titulos[] = {"Id", "Codigo", "Editorial", "Titulo", "Escritor", "Categoria", "Genero", "SubGenero", "Clasificacion"};
        //Ejemplosdearreglos
        Double numero[] = new Double[9];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Libros es = new Libros();
        ArrayList<LibroVM> listar = es.ListaLibro();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[9];

        while (iterador.hasNext()) {
            //CASTEAR
            LibroVM estBucle = (LibroVM) iterador.next();
            fila[0] = estBucle.getIdLibro();
            fila[1] = estBucle.getCodigo_Libro();
            fila[2] = estBucle.getNombre_Editorial();
            fila[3] = estBucle.getTitulo();
            fila[4] = estBucle.getNombre_Escritor();
            fila[5] = estBucle.getCategoria().name();
            fila[6] = estBucle.getGenero().name();
            fila[7] = estBucle.getSubGenero().name();
            fila[8] = estBucle.getClasificacion();
            df.addRow(fila);
        }
        jTable1.setModel(df);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNuevoLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDatosLibro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 540));

        jButton3.setBackground(new java.awt.Color(238, 108, 77));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(161, 220, 173));
        jScrollPane1.setViewportView(jTable1);

        btnNuevoLibro.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevoLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-file.png"))); // NOI18N
        btnNuevoLibro.setText("Nuevo");
        btnNuevoLibro.setContentAreaFilled(false);
        btnNuevoLibro.setOpaque(true);
        btnNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLibroActionPerformed(evt);
            }
        });

        jLabel1.setText("GESTIÓN DE LIBROS");

        btnDatosLibro.setBackground(new java.awt.Color(61, 90, 128));
        btnDatosLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDatosLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnDatosLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profiles.png"))); // NOI18N
        btnDatosLibro.setText("Datos del libro");
        btnDatosLibro.setContentAreaFilled(false);
        btnDatosLibro.setOpaque(true);
        btnDatosLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1.getSelectedRowCount() > 0) {
            JfrmLibroCrud frm = new JfrmLibroCrud();
            
            int selectedRow = jTable1.getSelectedRow();
            frm.txtIdLibro.setText(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
            frm.txtCodigoLibro.setText(String.valueOf(jTable1.getValueAt(selectedRow, 1)));
            frm.CmbEdi.setSelectedItem(String.valueOf(jTable1.getValueAt(selectedRow, 2)));
            frm.txtTitulo.setText(String.valueOf(jTable1.getValueAt(selectedRow, 3)));
            frm.CmbEsc.setSelectedItem(String.valueOf(jTable1.getValueAt(selectedRow, 4)));
            frm.CmbCat.setSelectedItem(String.valueOf(jTable1.getValueAt(selectedRow, 5)));
            frm.CmbGen.setSelectedItem(String.valueOf(jTable1.getValueAt(selectedRow, 6)));
            frm.CmbSub.setSelectedItem(String.valueOf(jTable1.getValueAt(selectedRow, 7)));
            frm.txtClasificacion.setText(String.valueOf(jTable1.getValueAt(selectedRow, 8)));
            
            frm.jpL = this;
            frm.setVisible(true);

            //isSelect = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLibroActionPerformed
        
        JfrmLibroCrud frm = new JfrmLibroCrud();
        frm.jpL = this;
        frm.setVisible(true);
    }//GEN-LAST:event_btnNuevoLibroActionPerformed

    JfrmMenu mainForm;
    
    private void btnDatosLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosLibroActionPerformed
        if (jTable1.getSelectedRowCount() > 0) {
            mainForm.currentPanel = null;
            JpDatosLibro jp = new JpDatosLibro(mainForm);
            
            int selectedRow = jTable1.getSelectedRow();
            jp.txtIdLibro1.setText(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
            
            
            mainForm.showJPanel(jp);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
        
        
    }//GEN-LAST:event_btnDatosLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatosLibro;
    private javax.swing.JButton btnNuevoLibro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
