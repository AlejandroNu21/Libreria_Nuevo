/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Lectores;
import Entidades.Lector;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author wilian
 */
public class JfrmLectorCrud extends javax.swing.JFrame {

    /**
     * Creates new form JfrmLectorCrud
     */
    public JfrmLectorCrud() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txtIdLector = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtNombreLector = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtApellidoLector = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtEdadLector = new javax.swing.JTextField();
        txtDireccionLector = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtTelefonoLector = new javax.swing.JTextField();
        txtCodigoLector = new javax.swing.JTextField();
        btnAgregar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel52.setText("Id");

        txtIdLector.setEditable(false);
        txtIdLector.setEnabled(false);

        jLabel49.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel49.setText("Codigo Lector ");

        txtNombreLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel53.setText("Nombre ");

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel47.setText("Apellido");

        txtApellidoLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel48.setText("Edad");

        txtEdadLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEdadLector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadLectorKeyTyped(evt);
            }
        });

        txtDireccionLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel50.setText("Direccion");

        jLabel51.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel51.setText("Telefono");

        txtTelefonoLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefonoLector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoLectorKeyTyped(evt);
            }
        });

        txtCodigoLector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCodigoLector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoLectorKeyTyped(evt);
            }
        });

        btnAgregar2.setBackground(java.awt.Color.blue);
        btnAgregar2.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(254, 254, 255));
        btnAgregar2.setText("Agregar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel53))
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtDireccionLector, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtEdadLector)
                    .addComponent(txtApellidoLector)
                    .addComponent(txtIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoLector)
                    .addComponent(txtNombreLector)
                    .addComponent(txtTelefonoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtIdLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadLectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadLectorKeyTyped
        if(txtEdadLector.getText().length() >= 3){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEdadLectorKeyTyped

    private void txtTelefonoLectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoLectorKeyTyped
        if(txtTelefonoLector.getText().length() >= 8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoLectorKeyTyped

    private void txtCodigoLectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoLectorKeyTyped
        if(txtCodigoLector.getText().length() >= 8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCodigoLectorKeyTyped

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        Lector es = new Lector();
        Lectores esDAO = new Lectores();

        if (txtCodigoLector.getText().equals("") || txtNombreLector.getText().equals("")
                || txtApellidoLector.getText().equals("") || txtEdadLector.getText().equals("")
                || txtDireccionLector.getText().equals("") || txtTelefonoLector.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
            txtCodigoLector.requestFocus();
        } else {
            if (txtIdLector.getText().equals("")) {

                es.setCodigoLector(txtCodigoLector.getText());
                es.setNombre_Lector(txtNombreLector.getText());
                es.setApellido_Lector(txtApellidoLector.getText());
                es.setEdad(txtEdadLector.getText());
                es.setDireccion(txtDireccionLector.getText());
                es.setTelefono(txtTelefonoLector.getText());

                esDAO.AddLector(es);
                this.setVisible(false);

            } else {

                es.setIdLector(Integer.parseInt(txtIdLector.getText()));
                es.setCodigoLector(txtCodigoLector.getText());
                es.setNombre_Lector(txtNombreLector.getText());
                es.setApellido_Lector(txtApellidoLector.getText());
                es.setEdad(txtEdadLector.getText());
                es.setDireccion(txtDireccionLector.getText());
                es.setTelefono(txtTelefonoLector.getText());

                esDAO.UpdateLector(es);

                this.setVisible(false);

            }
            jpL.carga();
        
    
        }
    }//GEN-LAST:event_btnAgregar2ActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmLectorCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmLectorCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmLectorCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmLectorCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmLectorCrud().setVisible(true);
            }
        });
    }
public JpLector jpL ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellidoLector;
    public javax.swing.JTextField txtCodigoLector;
    public javax.swing.JTextField txtDireccionLector;
    public javax.swing.JTextField txtEdadLector;
    public javax.swing.JTextField txtIdLector;
    public javax.swing.JTextField txtNombreLector;
    public javax.swing.JTextField txtTelefonoLector;
    // End of variables declaration//GEN-END:variables
}
