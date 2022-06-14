/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import DAO.EditorialsDao;
import Entidades.Editorial;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilidades.GestionColumnas;
import utilidades.GestionEncabezadoTabla;

/**
 *
 * @author Vkaiido
 */
public class JpEditorial extends javax.swing.JPanel {

    private JPanel contentPane;
    private JScrollPane jscrollpane;
    /**
     * Creates new form JpEditorial
     */
    public JpEditorial() {
        initComponents();
        carga();
    }
    
    public void carga() {
        String titulos[] = {"Id", "Codigo", "Nombre", "Direccion", "Telefono"};
        //Ejemplosdearreglos
        Double numero[] = new Double[5];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        EditorialsDao es = new EditorialsDao();
        ArrayList<Editorial> listar = es.ListaEditorial();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Editorial estBucle = (Editorial) iterador.next();
            fila[0] = estBucle.getIdEditorial();
            fila[1] = estBucle.getCodigoEditorial();
            fila[2] = estBucle.getNombre_Editorial();
            fila[3] = estBucle.getDireccion_Editorial();
            fila[4] = estBucle.getTelefono_Editorial();
            df.addRow(fila);
        }
        TblEditorial.setModel(df);
        
        
        TblEditorial.getTableHeader().setReorderingAllowed(false);
        TblEditorial.setRowHeight(30);
        TblEditorial.setGridColor(new java.awt.Color(0, 0, 0));
        
        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = TblEditorial.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        TblEditorial.setTableHeader(jtableHeader);
        
        TblEditorial.setDefaultRenderer(Object.class, new GestionColumnas());
    }
    
        public void carga2() {
        String titulos[] = {"Id", "Codigo", "Nombre", "Direccion", "Telefono"};
        //Ejemplosdearreglos
        Double numero[] = new Double[5];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        EditorialsDao es = new EditorialsDao();
        ArrayList<Editorial> listar = es.BusquedaEditorial(txtBusqueda.getText());

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Editorial estBucle = (Editorial) iterador.next();
            fila[0] = estBucle.getIdEditorial();
            fila[1] = estBucle.getCodigoEditorial();
            fila[2] = estBucle.getNombre_Editorial();
            fila[3] = estBucle.getDireccion_Editorial();
            fila[4] = estBucle.getTelefono_Editorial();
            df.addRow(fila);
        }
        TblEditorial.setModel(df);
        
        
        TblEditorial.getTableHeader().setReorderingAllowed(false);
        TblEditorial.setRowHeight(30);
        TblEditorial.setGridColor(new java.awt.Color(0, 0, 0));
        
        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = TblEditorial.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        TblEditorial.setTableHeader(jtableHeader);
        
        TblEditorial.setDefaultRenderer(Object.class, new GestionColumnas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblEditorial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNuevaEditorial = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btmBorrar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        TblEditorial.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TblEditorial.setModel(new javax.swing.table.DefaultTableModel(
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
        TblEditorial.setGridColor(new java.awt.Color(0, 0, 0));
        TblEditorial.setSelectionBackground(new java.awt.Color(161, 220, 173));
        jScrollPane1.setViewportView(TblEditorial);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 65));
        jLabel1.setText("GESTIÓN DE EDITORIALES");

        btnNuevaEditorial.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevaEditorial.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-file.png"))); // NOI18N
        btnNuevaEditorial.setText("Nuevo");
        btnNuevaEditorial.setContentAreaFilled(false);
        btnNuevaEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaEditorial.setOpaque(true);
        btnNuevaEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaEditorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaEditorialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevaEditorialMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevaEditorialMouseReleased(evt);
            }
        });
        btnNuevaEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEditorialActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(238, 108, 77));
        btnActualizar.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(254, 254, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setOpaque(true);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnActualizarMouseReleased(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btmBorrar.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrar.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btmBorrar.setForeground(new java.awt.Color(254, 254, 255));
        btmBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash (1).png"))); // NOI18N
        btmBorrar.setText("Eliminar");
        btmBorrar.setContentAreaFilled(false);
        btmBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmBorrar.setOpaque(true);
        btmBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmBorrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btmBorrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btmBorrarMouseReleased(evt);
            }
        });
        btmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarActionPerformed(evt);
            }
        });

        btnBusqueda.setBackground(new java.awt.Color(41, 50, 65));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBusqueda.setText("Buscar");
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusqueda.setOpaque(true);
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBusquedaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseReleased(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevaEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaEditorialActionPerformed
        JfrmEditorialCrud frm = new JfrmEditorialCrud();
        frm.jp = this;
        frm.setVisible(true);
    }//GEN-LAST:event_btnNuevaEditorialActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (TblEditorial.getSelectedRowCount() > 0) {

            JfrmEditorialCrud frm = new JfrmEditorialCrud();
            int selectedRow = TblEditorial.getSelectedRow();
            frm.txtIdEditorial1.setText(String.valueOf(TblEditorial.getValueAt(selectedRow, 0)));
            frm.txtCodigoEditorial.setText(String.valueOf(TblEditorial.getValueAt(selectedRow, 1)));
            frm.txtNombreEditorial.setText(String.valueOf(TblEditorial.getValueAt(selectedRow, 2)));
            frm.txtDireccionEditorial.setText(String.valueOf(TblEditorial.getValueAt(selectedRow, 3)));
            frm.txtTelefonoEditorial.setText(String.valueOf(TblEditorial.getValueAt(selectedRow, 4)));
            frm.lblInCl.setText("Actualizar Editorial");
            frm.jp = this;
            frm.setVisible(true);

            //isSelect = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarActionPerformed
        if (TblEditorial.getSelectedRowCount()>0) {
             Editorial es = new Editorial();
            EditorialsDao esDAO = new EditorialsDao();
            int selectedRow =TblEditorial.getSelectedRow();
            es.setIdEditorial(Integer.parseInt(TblEditorial.getValueAt(selectedRow, 0).toString()));
            int response = JOptionPane.showConfirmDialog(null,"¿Desea eliminar la editorial?","Eliminar",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if(response==JOptionPane.YES_OPTION){
             esDAO.DeleteEditorial(es);
             carga();
            }if(response==JOptionPane.NO_OPTION){
            repaint();
                         
                         }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
            }
    }//GEN-LAST:event_btmBorrarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        carga2();
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseEntered
        btnBusqueda.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnBusquedaMouseEntered

    private void btnBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseExited
        btnBusqueda.setBackground(new Color(41, 50, 65));
    }//GEN-LAST:event_btnBusquedaMouseExited

    private void btnBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMousePressed
         btnBusqueda.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnBusquedaMousePressed

    private void btnBusquedaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseReleased
        btnBusqueda.setBackground(new Color(41, 50, 65));
    }//GEN-LAST:event_btnBusquedaMouseReleased

    private void btnNuevaEditorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEditorialMouseEntered
        btnNuevaEditorial.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnNuevaEditorialMouseEntered

    private void btnNuevaEditorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEditorialMouseExited
        btnNuevaEditorial.setBackground(new Color(0, 153, 51));
    }//GEN-LAST:event_btnNuevaEditorialMouseExited

    private void btnNuevaEditorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEditorialMousePressed
        btnNuevaEditorial.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnNuevaEditorialMousePressed

    private void btnNuevaEditorialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEditorialMouseReleased
        btnNuevaEditorial.setBackground(new Color(0, 153, 51));
    }//GEN-LAST:event_btnNuevaEditorialMouseReleased

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
         btnActualizar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(238,108,77));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        btnActualizar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnActualizarMousePressed

    private void btnActualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseReleased
        btnActualizar.setBackground(new Color(238,108,77));
    }//GEN-LAST:event_btnActualizarMouseReleased

    private void btmBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmBorrarMouseEntered
        btmBorrar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btmBorrarMouseEntered

    private void btmBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmBorrarMouseExited
        btmBorrar.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_btmBorrarMouseExited

    private void btmBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmBorrarMousePressed
        btmBorrar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btmBorrarMousePressed

    private void btmBorrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmBorrarMouseReleased
        btmBorrar.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_btmBorrarMouseReleased
//public boolean isSelect = false;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblEditorial;
    private javax.swing.JButton btmBorrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnNuevaEditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

  
}
