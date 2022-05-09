/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Categoria_beans;
import Beans.GeneroLiterario_beans;
import Beans.Subgenero_beans;
import Entidades.Categoria;
import Entidades.generoLiterario;
import Entidades.subGeneroLiterario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author COREI5 10TH GEN
 */
public class FrmOpciones extends javax.swing.JFrame {

    /**
     * Creates new form FrmOpciones
     */
    public FrmOpciones() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        btnCategoria = new javax.swing.JButton();
        btnGeneroLiterario = new javax.swing.JButton();
        btnSubGeneroLiterario = new javax.swing.JButton();
        btnSubGeneroLiterario1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarGeneroLiterario = new javax.swing.JButton();
        txtGeneroLiterario = new javax.swing.JTextField();
        txtIdGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblGeneroLiterario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnActualizarGenero = new javax.swing.JButton();
        btnEliminarGenero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCategoria = new javax.swing.JTable();
        txtIdCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarCategoria = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnActualizarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblSubGenero = new javax.swing.JTable();
        txtSubGeneroLiterario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSubGenero = new javax.swing.JButton();
        txtIdSubGenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarSubGen = new javax.swing.JButton();
        btnEliminarSubGen = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnCategoria.setBackground(new java.awt.Color(51, 153, 255));
        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnGeneroLiterario.setBackground(new java.awt.Color(51, 153, 255));
        btnGeneroLiterario.setText("Genero Literario");
        btnGeneroLiterario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroLiterarioActionPerformed(evt);
            }
        });

        btnSubGeneroLiterario.setBackground(new java.awt.Color(51, 153, 255));
        btnSubGeneroLiterario.setText("Sub Genero Literario");
        btnSubGeneroLiterario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubGeneroLiterarioActionPerformed(evt);
            }
        });

        btnSubGeneroLiterario1.setBackground(new java.awt.Color(255, 102, 102));
        btnSubGeneroLiterario1.setText("Regresar");
        btnSubGeneroLiterario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubGeneroLiterario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubGeneroLiterario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(btnGeneroLiterario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSubGeneroLiterario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btnSubGeneroLiterario1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 640));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encabezado.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1000, 180));

        btnAgregarGeneroLiterario.setBackground(java.awt.Color.blue);
        btnAgregarGeneroLiterario.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        btnAgregarGeneroLiterario.setForeground(new java.awt.Color(254, 254, 255));
        btnAgregarGeneroLiterario.setText("Agregar");
        btnAgregarGeneroLiterario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGeneroLiterarioActionPerformed(evt);
            }
        });

        txtGeneroLiterario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtIdGenero.setEditable(false);
        txtIdGenero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel5.setText("Id");

        TblGeneroLiterario.setModel(new javax.swing.table.DefaultTableModel(
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
        TblGeneroLiterario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblGeneroLiterarioMouseClicked(evt);
            }
        });
        TblGeneroLiterario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblGeneroLiterarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TblGeneroLiterario);

        jLabel6.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel6.setText("G. Literario");

        btnActualizarGenero.setText("Actualizar");

        btnEliminarGenero.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGeneroLiterario)
                            .addComponent(txtIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAgregarGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnActualizarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        jTabbedPane1.addTab("Genero Literario", jPanel3);

        TblCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        TblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCategoriaMouseClicked(evt);
            }
        });
        TblCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblCategoriaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TblCategoria);

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel3.setText("Id");

        btnAgregarCategoria.setBackground(java.awt.Color.blue);
        btnAgregarCategoria.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        btnAgregarCategoria.setForeground(new java.awt.Color(254, 254, 255));
        btnAgregarCategoria.setText("Agregar");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        txtCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel4.setText("Categoria:");

        btnActualizarCategoria.setText("Actualizar");

        btnEliminarCategoria.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnActualizarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Categoria", jPanel2);

        TblSubGenero.setModel(new javax.swing.table.DefaultTableModel(
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
        TblSubGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblSubGeneroMouseClicked(evt);
            }
        });
        TblSubGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblSubGeneroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(TblSubGenero);

        txtSubGeneroLiterario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel7.setText("S. G. Literario");

        btnSubGenero.setBackground(java.awt.Color.blue);
        btnSubGenero.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        btnSubGenero.setForeground(new java.awt.Color(254, 254, 255));
        btnSubGenero.setText("Agregar");
        btnSubGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubGeneroActionPerformed(evt);
            }
        });

        txtIdSubGenero.setEditable(false);
        txtIdSubGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Id");

        btnActualizarSubGen.setText("Actualizar");

        btnEliminarSubGen.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubGeneroLiterario, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtIdSubGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnSubGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnActualizarSubGen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarSubGen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(txtIdSubGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(63, 63, 63)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubGeneroLiterario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarSubGen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarSubGen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SubGenero Literario", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 1000, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed

    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnGeneroLiterarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroLiterarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGeneroLiterarioActionPerformed

    private void btnSubGeneroLiterarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubGeneroLiterarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubGeneroLiterarioActionPerformed

    private void TblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCategoriaMouseClicked
        isSelect = true;
        try {
            txtIdCategoria.setText(TblCategoria.getValueAt(TblCategoria.getSelectedRow(), 0).toString());
            txtCategoria.setText(TblCategoria.getValueAt(TblCategoria.getSelectedRow(), 1).toString());

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_TblCategoriaMouseClicked

    private void TblCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblCategoriaKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSeleccionada = this.TblCategoria.getSelectedRow();

            try {
                this.txtIdCategoria.setText(TblCategoria.getValueAt(filaSeleccionada, 0).toString());
                this.txtCategoria.setText(TblCategoria.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_TblCategoriaKeyReleased

    public void cargaCategoria() {
        LimpiarCategoria();
        String titulos[] = {"Id", "Categoria"};
        //Ejemplosdearreglos
        Double numero[] = new Double[3];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Categoria_beans es = new Categoria_beans();
        ArrayList<Categoria> listar = es.ListaCat();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Categoria estBucle = (Categoria) iterador.next();
            fila[0] = estBucle.getIdCategoria();
            fila[1] = estBucle.getCategoria();
            df.addRow(fila);
        }
        TblCategoria.setModel(df);
    }

    public void LimpiarCategoria() {
        txtCategoria.setText("");
    }


    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        Categoria es = new Categoria();
        Categoria_beans esDAO = new Categoria_beans();

        es.setCategoria(txtCategoria.getText());
        esDAO.AddCategoria(es);
        cargaCategoria();
        LimpiarCategoria();
        txtCategoria.requestFocus();
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    public void cargaGeneroLiterario() {
        LimpiarGeneroLiterario();
        String titulos[] = {"Id", "Categoria"};
        //Ejemplosdearreglos
        Double numero[] = new Double[3];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Categoria_beans es = new Categoria_beans();
        ArrayList<Categoria> listar = es.ListaCat();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            Categoria estBucle = (Categoria) iterador.next();
            fila[0] = estBucle.getIdCategoria();
            fila[1] = estBucle.getCategoria();
            df.addRow(fila);
        }
        TblCategoria.setModel(df);
    }

    public void LimpiarGeneroLiterario() {
        txtCategoria.setText("");
    }


    private void btnAgregarGeneroLiterarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGeneroLiterarioActionPerformed
        if (txtGeneroLiterario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
            txtGeneroLiterario.requestFocus();
        } else {
            generoLiterario es = new generoLiterario();
            GeneroLiterario_beans esDAO = new GeneroLiterario_beans();

            es.setGenero_Literario(txtGeneroLiterario.getText());

            esDAO.AddGenero(es);
            LimpiarGeneroLiterario();
            cargaGeneroLiterario();
        }
    }//GEN-LAST:event_btnAgregarGeneroLiterarioActionPerformed

    private void TblGeneroLiterarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblGeneroLiterarioMouseClicked
        isSelect = true;
        try {
            txtIdGenero.setText(TblGeneroLiterario.getValueAt(TblGeneroLiterario.getSelectedRow(), 0).toString());
            txtGeneroLiterario.setText(TblGeneroLiterario.getValueAt(TblGeneroLiterario.getSelectedRow(), 1).toString());

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_TblGeneroLiterarioMouseClicked

    private void TblGeneroLiterarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblGeneroLiterarioKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSeleccionada = this.TblGeneroLiterario.getSelectedRow();

            try {
                this.txtIdGenero.setText(TblGeneroLiterario.getValueAt(filaSeleccionada, 0).toString());
                this.txtGeneroLiterario.setText(TblGeneroLiterario.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_TblGeneroLiterarioKeyReleased

    private void TblSubGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblSubGeneroMouseClicked
        isSelect = true;
        try {
            txtIdSubGenero.setText(TblSubGenero.getValueAt(TblSubGenero.getSelectedRow(), 0).toString());
            txtSubGeneroLiterario.setText(TblSubGenero.getValueAt(TblSubGenero.getSelectedRow(), 1).toString());

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_TblSubGeneroMouseClicked

    private void TblSubGeneroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblSubGeneroKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSeleccionada = this.TblSubGenero.getSelectedRow();

            try {
                this.txtIdSubGenero.setText(TblSubGenero.getValueAt(filaSeleccionada, 0).toString());
                this.txtSubGeneroLiterario.setText(TblSubGenero.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_TblSubGeneroKeyReleased

     public void cargaSubGenero() {
        LimpiarSubGenero();
        String titulos[] = {"Id", "Sub Genero Literario"};
        //Ejemplosdearreglos
        Double numero[] = new Double[3];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        Subgenero_beans es = new Subgenero_beans();
        ArrayList<subGeneroLiterario> listar = es.MostrarSubGeneroLiterario();

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[5];

        while (iterador.hasNext()) {
            //CASTEAR
            subGeneroLiterario estBucle = (subGeneroLiterario) iterador.next();
            fila[0] = estBucle.getIdSugeneroLiterario();
            fila[1] = estBucle.getSubgenero_Literario();
            df.addRow(fila);
        }
        TblSubGenero.setModel(df);
    }

    public void LimpiarSubGenero() {
        txtSubGeneroLiterario.setText("");
    }
    
    private void btnSubGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubGeneroActionPerformed

        if (txtSubGeneroLiterario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            subGeneroLiterario sub = new subGeneroLiterario();
            Subgenero_beans subDAO = new Subgenero_beans();
            sub.setSubgenero_Literario(txtSubGeneroLiterario.getText());
            subDAO.AgregarSubGeneroLiterario(sub);
            LimpiarSubGenero();
            cargaSubGenero();
            txtSubGeneroLiterario.requestFocus();
        }
    }//GEN-LAST:event_btnSubGeneroActionPerformed

    private void btnSubGeneroLiterario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubGeneroLiterario1ActionPerformed
        FrmSistemaMenu AbrirFrm = new FrmSistemaMenu();
        AbrirFrm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSubGeneroLiterario1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOpciones().setVisible(true);
            }
        });
    }

    public boolean isSelect = false;
    int Id = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblCategoria;
    private javax.swing.JTable TblGeneroLiterario;
    private javax.swing.JTable TblSubGenero;
    private javax.swing.JButton btnActualizarCategoria;
    private javax.swing.JButton btnActualizarGenero;
    private javax.swing.JButton btnActualizarSubGen;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarGeneroLiterario;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnEliminarGenero;
    private javax.swing.JButton btnEliminarSubGen;
    private javax.swing.JButton btnGeneroLiterario;
    private javax.swing.JButton btnSubGenero;
    private javax.swing.JButton btnSubGeneroLiterario;
    private javax.swing.JButton btnSubGeneroLiterario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtGeneroLiterario;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdGenero;
    private javax.swing.JTextField txtIdSubGenero;
    private javax.swing.JTextField txtSubGeneroLiterario;
    // End of variables declaration//GEN-END:variables
}
