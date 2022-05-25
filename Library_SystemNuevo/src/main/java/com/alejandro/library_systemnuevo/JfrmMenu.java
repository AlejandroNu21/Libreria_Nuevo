/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author wilian
 */
public class JfrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form JfrmSystemMenu
     */
    public JfrmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        lblBanner.setIcon(new ImageIcon(imagenBanner.getImage().getScaledInstance(lblBanner.getWidth(), lblBanner.getHeight(), Image.SCALE_SMOOTH)));
        
        lblLogo.setIcon(new ImageIcon(imagenLogo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    final ImageIcon imagenBanner = new ImageIcon(getClass().getResource("/Imagenes/banner.png"));
    final ImageIcon imagenLogo = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
    
    
    
    @Override
    public Image getIconImage () {
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.jpeg"));
        
        return retValue;
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
        btnAgregarLibro = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnEditoriales = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnPrestamo = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnLector = new javax.swing.JButton();
        btnEscritor1 = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        JpMain = new javax.swing.JPanel();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.controlHighlight);
        setPreferredSize(new java.awt.Dimension(1236, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 731));

        btnAgregarLibro.setBackground(new java.awt.Color(61, 90, 128));
        btnAgregarLibro.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnAgregarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarLibro.setText("Libro");
        btnAgregarLibro.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                btnAgregarLibroHierarchyChanged(evt);
            }
        });
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        btnCompra.setBackground(new java.awt.Color(61, 90, 128));
        btnCompra.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setText("Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnEditoriales.setBackground(new java.awt.Color(61, 90, 128));
        btnEditoriales.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnEditoriales.setForeground(new java.awt.Color(255, 255, 255));
        btnEditoriales.setText("Editoriales");
        btnEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorialesActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(61, 90, 128));
        btnClientes.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(61, 90, 128));
        btnVentas.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnPrestamo.setBackground(new java.awt.Color(61, 90, 128));
        btnPrestamo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setText("Prestamo");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnLector.setBackground(new java.awt.Color(61, 90, 128));
        btnLector.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnLector.setForeground(new java.awt.Color(255, 255, 255));
        btnLector.setText("Lector");
        btnLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLectorActionPerformed(evt);
            }
        });

        btnEscritor1.setBackground(new java.awt.Color(61, 90, 128));
        btnEscritor1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnEscritor1.setForeground(new java.awt.Color(255, 255, 255));
        btnEscritor1.setText("Escritor");
        btnEscritor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscritor1ActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(61, 90, 128));
        btnUsuarios.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEditoriales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEscritor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLector, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEscritor1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpMain.setBackground(new java.awt.Color(255, 255, 255));
        JpMain.setPreferredSize(new java.awt.Dimension(1050, 540));
        JpMain.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                JpMainComponentResized(evt);
            }
        });

        javax.swing.GroupLayout JpMainLayout = new javax.swing.GroupLayout(JpMain);
        JpMain.setLayout(JpMainLayout);
        JpMainLayout.setHorizontalGroup(
            JpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1064, Short.MAX_VALUE)
        );
        JpMainLayout.setVerticalGroup(
            JpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasaDelLibro.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JPanel currentPanel;
    public void showJPanel(JPanel form){
        //currentPanel = null;
        if (currentPanel==null) {
            
            currentPanel = form;
            //form.setLocation(0,0);
            JpMain.removeAll(); 
            form.setSize(JpMain.getWidth(), JpMain.getHeight());
            
            JpMain.add(form, BorderLayout.CENTER);
            JpMain.revalidate();
            JpMain.repaint();          
            
        }
    } 
 
    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        currentPanel = null;
        showJPanel(new JpLibro(formMain));
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        currentPanel = null;
        showJPanel(new JpCustomer());
    }//GEN-LAST:event_btnClientesActionPerformed


    private void JpMainComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JpMainComponentResized
        if (currentPanel != null) {
            
            JpMain.removeAll(); 
            currentPanel.setSize(JpMain.getWidth(), JpMain.getHeight());
            
            JpMain.add(currentPanel, BorderLayout.CENTER);
            JpMain.revalidate();
            JpMain.repaint();
            //System.out.println(JpMain.getWidth()+" "+JpMain.getHeight());       
        }
        
        

    }//GEN-LAST:event_JpMainComponentResized
    JfrmMenu formMain = this;
    private void btnEscritor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscritor1ActionPerformed
        currentPanel = null;
        showJPanel(new JpEscritor(formMain));
    }//GEN-LAST:event_btnEscritor1ActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        currentPanel = null;
        showJPanel(new JpPrestamo());
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLectorActionPerformed
        currentPanel = null;
        showJPanel(new JpLector());
    }//GEN-LAST:event_btnLectorActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        currentPanel = null;
        showJPanel(new JpVentas1());
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorialesActionPerformed
        currentPanel = null;
        showJPanel(new JpEditorial());
    }//GEN-LAST:event_btnEditorialesActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        currentPanel = null;
        showJPanel(new JpCompras1());
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnAgregarLibroHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_btnAgregarLibroHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLibroHierarchyChanged

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
            java.util.logging.Logger.getLogger(JfrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpMain;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnEditoriales;
    private javax.swing.JButton btnEscritor1;
    private javax.swing.JButton btnLector;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
