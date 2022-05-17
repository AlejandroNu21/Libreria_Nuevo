/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alejandro.library_systemnuevo;

/**
 *
 * @author wilian
 */
public class JpDatosEscritor extends javax.swing.JPanel {

    /**
     * Creates new form JpWritterD
     */
    public JpDatosEscritor(JfrmMenu main) {
        initComponents();
        mainForm = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane11 = new javax.swing.JScrollPane();
        TblDatosEscritor = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtFechaDeceso = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtLugarNacimiento = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtLugarDeceso = new javax.swing.JTextField();
        txtIdEscritor2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        TblDatosEscritor.setModel(new javax.swing.table.DefaultTableModel(
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
        TblDatosEscritor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDatosEscritorMouseClicked(evt);
            }
        });
        TblDatosEscritor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblDatosEscritorKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(TblDatosEscritor);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);

        txtId.setEditable(false);

        jLabel70.setText("Fecha de Deceso");

        jLabel74.setText("Lugar de Nacimiento");

        jLabel72.setText("ID");

        jLabel69.setText("ID_Escritor");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setMaximumSize(new java.awt.Dimension(441, 441));
        jTextArea2.setPreferredSize(new java.awt.Dimension(441, 111));
        jScrollPane10.setViewportView(jTextArea2);

        txtIdEscritor2.setEnabled(false);

        jLabel71.setText("Fecha de Nacimiento");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel68.setText("Lugar de Deceso");

        jLabel73.setText("Biografia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(txtLugarDeceso, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel74)
                            .addComponent(jLabel70)
                            .addComponent(jLabel68)
                            .addComponent(jLabel73))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugarNacimiento)
                            .addComponent(txtFechaDeceso)
                            .addComponent(txtFechaNacimiento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(txtIdEscritor2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)))
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEscritor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaDeceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugarDeceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addGap(27, 27, 27)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11)
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //        if (txtFechaNacimiento.getText().equals("") || txtLugarNacimiento.getText().equals("")
            //            || txtFechaDeceso.getText().equals("") || txtLugarDeceso.getText().equals("") || jTextArea2.getText().equals("")) {
            //            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
            //            txtFechaNacimiento.requestFocus();
            //        } else {
            //            DatosEscritor es = new DatosEscritor();
            //            DatosEscritores esDAO = new DatosEscritores();
            //
            //            es.setIdEscritor(Integer.parseInt(txtId.getText()));
            //            es.setFecha_Nacimiento(txtFechaNacimiento.getText());
            //            es.setLugar_Nacimiento(txtLugarNacimiento.getText());
            //            es.setFecha_Deceso(txtFechaDeceso.getText());
            //            es.setLugar_Deceso(txtLugarDeceso.getText());
            //            es.setBiografia(jTextArea2.getText());
            //
            //            esDAO.AddDatosEscritor(es);
            //            Limpiar();
            //            CargaDatosEscritor();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void TblDatosEscritorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDatosEscritorMouseClicked
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
    }//GEN-LAST:event_TblDatosEscritorMouseClicked

    private void TblDatosEscritorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblDatosEscritorKeyReleased
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
    }//GEN-LAST:event_TblDatosEscritorKeyReleased

    public JfrmMenu mainForm;
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        mainForm.currentPanel = null;
        mainForm.showJPanel(new JpEscritor(mainForm));

    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDatosEscritor;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtFechaDeceso;
    private javax.swing.JTextField txtFechaNacimiento;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEscritor2;
    private javax.swing.JTextField txtLugarDeceso;
    private javax.swing.JTextField txtLugarNacimiento;
    // End of variables declaration//GEN-END:variables
}