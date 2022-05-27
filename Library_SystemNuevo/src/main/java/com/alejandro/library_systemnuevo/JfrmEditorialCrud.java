/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import Beans.Editorials;
import Entidades.Editorial;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Vkaiido
 */
public class JfrmEditorialCrud extends javax.swing.JFrame {

    /**
     * Creates new form JfrmEditorial
     */
    public JfrmEditorialCrud() {
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
        jLabel32 = new javax.swing.JLabel();
        txtIdEditorial1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtCodigoEditorial = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDireccionEditorial = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtTelefonoEditorial = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 300));
        setMinimumSize(new java.awt.Dimension(470, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel32.setText("Id");

        txtIdEditorial1.setEditable(false);
        txtIdEditorial1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtIdEditorial1.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel28.setText("Codigo Editorial ");

        txtCodigoEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCodigoEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEditorialKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel29.setText("Nombre ");

        txtNombreEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel30.setText("Direccion ");

        txtDireccionEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel31.setText("Telefono ");

        txtTelefonoEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefonoEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEditorialKeyTyped(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(61, 90, 128));
        btnAgregar.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(254, 254, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/floppy-disk.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel29))
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtTelefonoEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtIdEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel32))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtIdEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
    
    //public String numeros;
        public void limpiar() {
        txtIdEditorial1.setText("");
        txtCodigoEditorial.setText("");
        txtNombreEditorial.setText("");
        txtDireccionEditorial.setText("");
        txtTelefonoEditorial.setText("");
        txtCodigoEditorial.requestFocus();
    }
    
    private void txtCodigoEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEditorialKeyTyped
        if(txtCodigoEditorial.getText().length() >= 8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCodigoEditorialKeyTyped

    private void txtTelefonoEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEditorialKeyTyped
        if(txtTelefonoEditorial.getText().length() >= 8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoEditorialKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
                Editorial es = new Editorial();
            Editorials esDAO = new Editorials();
            
        if (txtCodigoEditorial.getText().equals("") || txtNombreEditorial.getText().equals("")
            || txtDireccionEditorial.getText().equals("") || txtTelefonoEditorial.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
            txtCodigoEditorial.requestFocus();
        } else { 
            if(txtIdEditorial1.getText().equals("")){

            es.setCodigoEditorial(txtCodigoEditorial.getText());
            es.setNombre_Editorial(txtNombreEditorial.getText());
            es.setDireccion_Editorial(txtDireccionEditorial.getText());
            es.setTelefono_Editorial(txtTelefonoEditorial.getText());

            esDAO.AddEditorial(es);
            limpiar();
            
            }else{

            es.setIdEditorial(Integer.parseInt(txtIdEditorial1.getText()));
            es.setCodigoEditorial(txtCodigoEditorial.getText());
            es.setNombre_Editorial(txtNombreEditorial.getText());
            es.setDireccion_Editorial(txtDireccionEditorial.getText());
            es.setTelefono_Editorial(txtTelefonoEditorial.getText());

            esDAO.UpdateEditorial(es);

                this.setVisible(false);
                
            }
            jp.carga();
            
            //Ejemplo de crear otro metodo el cual no va a recargar la tabla
            /*JpEditorial jprueba = new JpEditorial();
            jprueba.carga();*/
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmEditorialCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmEditorialCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmEditorialCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmEditorialCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmEditorialCrud().setVisible(true);
            }
        });
    }
    public JpEditorial jp ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtCodigoEditorial;
    public javax.swing.JTextField txtDireccionEditorial;
    public javax.swing.JTextField txtIdEditorial1;
    public javax.swing.JTextField txtNombreEditorial;
    public javax.swing.JTextField txtTelefonoEditorial;
    // End of variables declaration//GEN-END:variables
}
