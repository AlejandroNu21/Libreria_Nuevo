/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import DAO.*;
import Entidades.Libro;
import ViewModel.LibroVM;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilidades.GestionColumnas;
import utilidades.GestionEncabezadoTabla;

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
        String titulos[] = {"Id", "Codigo", "Editorial", "Titulo", "Escritor", "Categoria", "Genero", "SubGenero", "Clasificacion", "Cantidad","Precio", "Descripcion"};
        Double numero[] = new Double[12];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        LibrosDAO es = new LibrosDAO();
        ArrayList<LibroVM> listar = es.busquedaLibros(txtBusquedalibro.getText());

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[12];

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
            fila[9] = estBucle.getCantidad();
            fila[10] = estBucle.getPrecio();
            fila[11] = estBucle.getDescripcion();
            df.addRow(fila);
        }
        Tbl_Libro.setModel(df);

        Tbl_Libro.getTableHeader().setReorderingAllowed(false);
        Tbl_Libro.setRowHeight(30);
        Tbl_Libro.setGridColor(new java.awt.Color(0, 0, 0));

        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = Tbl_Libro.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        Tbl_Libro.setTableHeader(jtableHeader);

        Tbl_Libro.setDefaultRenderer(Object.class, new GestionColumnas());
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Libro = new javax.swing.JTable();
        btnNuevoLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBusquedalibro = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 540));

        btnActualizar.setBackground(new java.awt.Color(238, 108, 77));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
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

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Tbl_Libro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tbl_Libro.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_Libro.setGridColor(new java.awt.Color(0, 0, 0));
        Tbl_Libro.setSelectionBackground(new java.awt.Color(161, 220, 173));
        jScrollPane1.setViewportView(Tbl_Libro);

        btnNuevoLibro.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevoLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-file.png"))); // NOI18N
        btnNuevoLibro.setText("Nuevo");
        btnNuevoLibro.setContentAreaFilled(false);
        btnNuevoLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoLibro.setOpaque(true);
        btnNuevoLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoLibroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevoLibroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevoLibroMouseReleased(evt);
            }
        });
        btnNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLibroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 65));
        jLabel1.setText("GESTIÓN DE LIBROS");

        txtBusquedalibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedalibroActionPerformed(evt);
            }
        });
        txtBusquedalibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedalibroKeyPressed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBusquedalibro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBusqueda)
                        .addGap(56, 56, 56)
                        .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusquedalibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (Tbl_Libro.getSelectedRowCount() > 0) {
            JfrmLibroCrud frm = new JfrmLibroCrud();

            int selectedRow = Tbl_Libro.getSelectedRow();
            frm.txtIdLibro.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 0)));
            frm.IdL = Integer.parseInt(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 0)));
            frm.txtCodigoLibro.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 1)));
            frm.CmbEdi.setSelectedItem(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 2)));
            frm.txtTitulo.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 3)));
            frm.CmbEsc.setSelectedItem(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 4)));
            frm.CmbCat.setSelectedItem(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 5)));
            frm.CmbGen.setSelectedItem(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 6)));
            frm.CmbSub.setSelectedItem(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 7)));
            frm.txtClasificacion.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 8)));
            frm.txtCant.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 9)));
            frm.txtprecio.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 10)));
            frm.txtdesc.setText(String.valueOf(Tbl_Libro.getValueAt(selectedRow, 11)));
            frm.lblLib.setText("Actualizar Libro");
            frm.jpL = this;
            frm.setVisible(true);

            //isSelect = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (Tbl_Libro.getSelectedRowCount() > 0) {
            Libro ls = new Libro();
            LibrosDAO lbDAO = new LibrosDAO();
            int selectedRow = Tbl_Libro.getSelectedRow();
            ls.setIdLibro(Integer.parseInt(Tbl_Libro.getValueAt(selectedRow, 0).toString()));
 int response = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este libro?", "Eliminar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
            lbDAO.DeleteLibro(ls);
            carga();
            }
            if (response == JOptionPane.NO_OPTION) {
                repaint();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLibroActionPerformed

        JfrmLibroCrud frm = new JfrmLibroCrud();
        frm.jpL = this;
        frm.setVisible(true);
    }//GEN-LAST:event_btnNuevoLibroActionPerformed

    JfrmMenu mainForm;

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        //cargaBusqueda();
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

    private void btnNuevoLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLibroMouseEntered
        btnNuevoLibro.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnNuevoLibroMouseEntered

    private void btnNuevoLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLibroMouseExited
        btnNuevoLibro.setBackground(new Color(0, 153, 51));
    }//GEN-LAST:event_btnNuevoLibroMouseExited

    private void btnNuevoLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLibroMousePressed
        btnNuevoLibro.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnNuevoLibroMousePressed

    private void btnNuevoLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLibroMouseReleased
        btnBusqueda.setBackground(new Color(0, 153, 51));
    }//GEN-LAST:event_btnNuevoLibroMouseReleased

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(238, 108, 77));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        btnActualizar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnActualizarMousePressed

    private void btnActualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseReleased
        btnActualizar.setBackground(new Color(238, 108, 77));
    }//GEN-LAST:event_btnActualizarMouseReleased

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        btnEliminar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        btnEliminar.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void txtBusquedalibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedalibroKeyPressed
carga();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedalibroKeyPressed

    private void txtBusquedalibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedalibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedalibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tbl_Libro;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusquedalibro;
    // End of variables declaration//GEN-END:variables
}
