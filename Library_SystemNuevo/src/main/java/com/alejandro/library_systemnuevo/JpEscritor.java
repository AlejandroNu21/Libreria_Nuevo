/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Escritores;
import javax.swing.JPanel;
import Entidades.Escritor;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilidades.GestionColumnas;
import utilidades.GestionEncabezadoTabla;

/**
 *
 * @author wilian
 */
public class JpEscritor extends javax.swing.JPanel {

    /**
     * Creates new form JpWriter
     */
    public JpEscritor(JfrmMenu main) {
        initComponents();
        carga();
        mainForm = main;
    }

    public void carga() {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Pais"};
        //Ejemplosdearreglos
        Double numero[] = new Double[5];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Escritores es = new Escritores();
        ArrayList<Escritor> listar = es.ListaEscritor();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Escritor estBucle = (Escritor) iterador.next();
            fila[0] = estBucle.getIdEscritor();
            fila[1] = estBucle.getCodigo_Escritor();
            fila[2] = estBucle.getNombre_Escritor();
            fila[3] = estBucle.getApellido_Escritor();
            fila[4] = estBucle.getPais_Escritor();
            df.addRow(fila);
        }
        TblEscritor.setModel(df);

        //DISEÑO TABLA
        TblEscritor.getTableHeader().setReorderingAllowed(false);
        TblEscritor.setRowHeight(30);
        TblEscritor.setGridColor(new java.awt.Color(0, 0, 0));

        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = TblEscritor.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        TblEscritor.setTableHeader(jtableHeader);

        TblEscritor.setDefaultRenderer(Object.class, new GestionColumnas());
    }

        public void cargaBusq() {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Pais"};
        //Ejemplosdearreglos
        Double numero[] = new Double[5];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Escritores es = new Escritores();
        ArrayList<Escritor> listar = es.BusquedaEscritor(txtBusqEs.getText());

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Escritor estBucle = (Escritor) iterador.next();
            fila[0] = estBucle.getIdEscritor();
            fila[1] = estBucle.getCodigo_Escritor();
            fila[2] = estBucle.getNombre_Escritor();
            fila[3] = estBucle.getApellido_Escritor();
            fila[4] = estBucle.getPais_Escritor();
            df.addRow(fila);
        }
        TblEscritor.setModel(df);

        //DISEÑO TABLA
        TblEscritor.getTableHeader().setReorderingAllowed(false);
        TblEscritor.setRowHeight(30);
        TblEscritor.setGridColor(new java.awt.Color(0, 0, 0));

        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = TblEscritor.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        TblEscritor.setTableHeader(jtableHeader);

        TblEscritor.setDefaultRenderer(Object.class, new GestionColumnas());
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
        btnNuevoEscritor = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TblEscritor = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnDatosEscritor = new javax.swing.JButton();
        txtBusqEs = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 540));

        jLabel1.setText("GESTIÓN DE ESCRITORES");

        btnNuevoEscritor.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevoEscritor.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoEscritor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-file.png"))); // NOI18N
        btnNuevoEscritor.setText("Nuevo");
        btnNuevoEscritor.setContentAreaFilled(false);
        btnNuevoEscritor.setOpaque(true);
        btnNuevoEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEscritorActionPerformed(evt);
            }
        });

        TblEscritor.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TblEscritor.setModel(new javax.swing.table.DefaultTableModel(
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
        TblEscritor.setGridColor(new java.awt.Color(0, 0, 0));
        TblEscritor.setSelectionBackground(new java.awt.Color(161, 220, 173));
        TblEscritor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEscritorMouseClicked(evt);
            }
        });
        TblEscritor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblEscritorKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(TblEscritor);

        btnUpdate.setBackground(new java.awt.Color(238, 108, 77));
        btnUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setOpaque(true);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash (1).png"))); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setContentAreaFilled(false);
        btnEliminar1.setOpaque(true);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnDatosEscritor.setBackground(new java.awt.Color(61, 90, 128));
        btnDatosEscritor.setForeground(new java.awt.Color(255, 255, 255));
        btnDatosEscritor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profiles.png"))); // NOI18N
        btnDatosEscritor.setText("Datos de escritor");
        btnDatosEscritor.setContentAreaFilled(false);
        btnDatosEscritor.setOpaque(true);
        btnDatosEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosEscritorActionPerformed(evt);
            }
        });

        btnBusqueda.setBackground(new java.awt.Color(41, 50, 65));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBusqueda.setText("Buscar");
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.setOpaque(true);
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(txtBusqEs, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBusqueda)
                        .addGap(200, 200, 200)
                        .addComponent(btnNuevoEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDatosEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNuevoEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusqEs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatosEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEscritorActionPerformed
        JfrmEscritorCrud frm = new JfrmEscritorCrud();
        frm.jpE = this;
        frm.setVisible(true);
    }//GEN-LAST:event_btnNuevoEscritorActionPerformed

    private void TblEscritorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEscritorMouseClicked
        /*        isSelect = true;
        try {
            new JfrmEscritorCrud()
            txtIdEscritor.setText(TblEscritor.getValueAt(TblEscritor.getSelectedRow(), 0).toString());
            txtCodigoEscritor.setText(TblEscritor.getValueAt(TblEscritor.getSelectedRow(), 1).toString());
            txtNombreEscritor.setText(TblEscritor.getValueAt(TblEscritor.getSelectedRow(), 2).toString());
            txtApellidoEscritor.setText(TblEscritor.getValueAt(TblEscritor.getSelectedRow(), 3).toString());
            txtPaisEscritor.setText(TblEscritor.getValueAt(TblEscritor.getSelectedRow(), 4).toString());

        } catch (Exception ex) {
        }*/
    }//GEN-LAST:event_TblEscritorMouseClicked

    private void TblEscritorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblEscritorKeyReleased
//        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
//
//            isSelect = true;
//            try {
//                int filaSeleccionada = this.TblEscritor.getSelectedRow();
//                Id = Integer.parseInt(TblEscritor.getValueAt(filaSeleccionada, 0).toString());
//                this.txtIdEscritor.setText(TblEscritor.getValueAt(filaSeleccionada, 0).toString());
//                this.txtCodigoEscritor.setText(TblEscritor.getValueAt(filaSeleccionada, 1).toString());
//                this.txtNombreEscritor.setText(TblEscritor.getValueAt(filaSeleccionada, 2).toString());
//                this.txtApellidoEscritor.setText(TblEscritor.getValueAt(filaSeleccionada, 3).toString());
//                this.txtPaisEscritor.setText(TblEscritor.getValueAt(filaSeleccionada, 4).toString());
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Error al leer la tabla", "Error", JOptionPane.WARNING_MESSAGE);
//            }
//
//        }
    }//GEN-LAST:event_TblEscritorKeyReleased

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        if (TblEscritor.getSelectedRowCount() > 0) {
            Escritor es = new Escritor();
            Escritores esDAO = new Escritores();
            int selectedRow = TblEscritor.getSelectedRow();
            es.setIdEscritor(Integer.parseInt(TblEscritor.getValueAt(selectedRow, 0).toString()));

            esDAO.DeleteEscritor(es);
            carga();
            //isSelect = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed
    public JfrmMenu mainForm;
    private void btnDatosEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosEscritorActionPerformed
        if (TblEscritor.getSelectedRowCount() > 0) {
            mainForm.currentPanel = null;
            JpDatosEscritor jp = new JpDatosEscritor(mainForm);

            int selectedRow = TblEscritor.getSelectedRow();
            jp.txtId.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 0)));

            mainForm.showJPanel(jp);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }

        // }
    }//GEN-LAST:event_btnDatosEscritorActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (TblEscritor.getSelectedRowCount() > 0) {

            //Escritores esc = new Escritores();
            JfrmEscritorCrud frmOp = new JfrmEscritorCrud();
            int selectedRow = TblEscritor.getSelectedRow();
            frmOp.txtIdEscritor1.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 0)));
            frmOp.Id = Integer.parseInt(String.valueOf(TblEscritor.getValueAt(selectedRow, 0)));
            frmOp.txtCodigoEscritor.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 1)));
            frmOp.txtNombreEscritor.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 2)));
            frmOp.txtApellidoEscritor.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 3)));
            frmOp.txtPaisEscritor.setText(String.valueOf(TblEscritor.getValueAt(selectedRow, 4)));
            frmOp.jpE = this;
            frmOp.lblesc.setText("Actualizar Escritor");
            //frmOp.mostrarImagen();
            frmOp.setVisible(true);

            //isSelect = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        cargaBusq();
    }//GEN-LAST:event_btnBusquedaActionPerformed

    public boolean isSelect = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblEscritor;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnDatosEscritor;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnNuevoEscritor;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField txtBusqEs;
    // End of variables declaration//GEN-END:variables
}
