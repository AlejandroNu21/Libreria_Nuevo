/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import DAO.ClientesDao;
import Entidades.clientes;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Vkaiido
 */
public class JfrmClienteCrud extends javax.swing.JFrame {

    /**
     * Creates new form JfrmCustomerCrud
     */
    public JfrmClienteCrud() {
        initComponents();
        setBackground(new Color(0,0,0,0) );
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
        jLabel33 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        txtEdadCliente = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        pnlHeaderCl = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInCl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVO CLIENTE");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 400));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel33.setText("Codigo Cliente ");

        txtCodigoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCodigoCliente.setMaximumSize(new java.awt.Dimension(500, 0));
        txtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoClienteKeyTyped(evt);
            }
        });

        txtNombreCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreCliente.setMaximumSize(new java.awt.Dimension(500, 0));

        jLabel34.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel34.setText("Nombre ");

        jLabel36.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel36.setText("Apellido");

        txtApellidoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtApellidoCliente.setMaximumSize(new java.awt.Dimension(500, 0));

        txtEdadCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEdadCliente.setMaximumSize(new java.awt.Dimension(500, 0));
        txtEdadCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadClienteKeyTyped(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel37.setText("Edad");

        jLabel35.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel35.setText("Direccion");

        txtDireccionCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDireccionCliente.setMaximumSize(new java.awt.Dimension(500, 0));
        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel39.setText("Telefono");

        txtTelefonoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefonoCliente.setMaximumSize(new java.awt.Dimension(500, 0));
        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(61, 90, 128));
        btnGuardar.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(254, 254, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/floppy-disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGuardarMouseReleased(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblIdCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdCliente.setText("Id Cliente ");

        txtIdCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdCliente.setEnabled(false);
        txtIdCliente.setMaximumSize(new java.awt.Dimension(500, 0));
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });

        pnlHeaderCl.setBackground(new java.awt.Color(41, 50, 65));
        pnlHeaderCl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderClMouseDragged(evt);
            }
        });
        pnlHeaderCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderClMousePressed(evt);
            }
        });

        lblCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_dark.png"))); // NOI18N

        lblInCl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblInCl.setForeground(new java.awt.Color(255, 255, 255));
        lblInCl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInCl.setText("Insertar Cliente");

        javax.swing.GroupLayout pnlHeaderClLayout = new javax.swing.GroupLayout(pnlHeaderCl);
        pnlHeaderCl.setLayout(pnlHeaderClLayout);
        pnlHeaderClLayout.setHorizontalGroup(
            pnlHeaderClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderClLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInCl, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderClLayout.setVerticalGroup(
            pnlHeaderClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHeaderClLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInCl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel33)
                            .addGap(33, 33, 33)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel36)
                                .addComponent(jLabel37))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEdadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35)
                                .addComponent(jLabel39))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblIdCliente)
                            .addGap(35, 35, 35)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeaderCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeaderCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        txtIdCliente.setText("");
        txtCodigoCliente.setText("");
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtEdadCliente.setText("");
        txtDireccionCliente.setText("");
        txtTelefonoCliente.setText("");
        txtCodigoCliente.requestFocus();
    }

    private void txtEdadClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadClienteKeyTyped
        if(txtEdadCliente.getText().length() >= 3){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEdadClienteKeyTyped

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtTelefonoCliente.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtCodigoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoClienteKeyTyped
        if (txtCodigoCliente.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCodigoClienteKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clientes cl = new clientes();
        ClientesDao clDAO = new ClientesDao();

        if (txtCodigoCliente.getText().equals("") || txtNombreCliente.getText().equals("")
                || txtApellidoCliente.getText().equals("") || txtEdadCliente.getText().equals("")
                || txtDireccionCliente.getText().equals("") || txtTelefonoCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "LLene todos los campos");

        } else {
           if (txtIdCliente.getText().equals("")) {

                cl.setDocumento_cliente(txtCodigoCliente.getText());
                cl.setNombre_cliente(txtNombreCliente.getText());
                cl.setApellido_cliente(txtApellidoCliente.getText());
                cl.setEdad_cliente(Integer.parseInt(txtEdadCliente.getText()));
                cl.setDireccion_cliente(txtDireccionCliente.getText());
                cl.setTelefono_cliente(txtTelefonoCliente.getText());
                clDAO.AddCliente(cl);
                limpiar();

            } else {

                cl.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
                cl.setDocumento_cliente(txtCodigoCliente.getText());
                cl.setNombre_cliente(txtNombreCliente.getText());
                cl.setApellido_cliente(txtApellidoCliente.getText());
                cl.setEdad_cliente(Integer.parseInt(txtEdadCliente.getText()));
                cl.setDireccion_cliente(txtDireccionCliente.getText());
                cl.setTelefono_cliente(txtTelefonoCliente.getText());

                clDAO.UpdateCliente(cl);

                this.setVisible(false);

            }
            jpC.carga();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteKeyTyped

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
         btnGuardar.setBackground(new Color(75, 163, 252));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(61,90,128));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        btnGuardar.setBackground(new Color(41, 50, 65));
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseReleased
        btnGuardar.setBackground(new Color(61,90,128));
    }//GEN-LAST:event_btnGuardarMouseReleased
int x;
int y;
    private void pnlHeaderClMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderClMousePressed
        x= evt.getX();
        y=evt.getY();
        
    }//GEN-LAST:event_pnlHeaderClMousePressed

    private void pnlHeaderClMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderClMouseDragged
        int xx;
        int yy;
        xx=evt.getXOnScreen();
        yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_pnlHeaderClMouseDragged

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
            java.util.logging.Logger.getLogger(JfrmClienteCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmClienteCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmClienteCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmClienteCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmClienteCrud().setVisible(true);
            }
        });
    }
    public JpClientes jpC;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIdCliente;
    public javax.swing.JLabel lblInCl;
    private javax.swing.JPanel pnlHeaderCl;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtCodigoCliente;
    public javax.swing.JTextField txtDireccionCliente;
    public javax.swing.JTextField txtEdadCliente;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
