/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandro.library_systemnuevo;

import DAO.ClientesDao;
import DAO.LibrosDAO;
import Entidades.clientes;
import ViewModel.LibroVM;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilidades.GestionColumnas;
import utilidades.GestionEncabezadoTabla;

/**
 *
 * @author kaido
 */
public class JfrmAgLibro extends javax.swing.JFrame {

    /**
     * Creates new form JfrmAgCliente
     */
    public JfrmAgLibro() {
        initComponents();
        setBackground(new Color(0,0,0,0) );
        setLocationRelativeTo(null);
        //tblAgCliente.setEditable(false);
        carga();
    }
    
public void carga() {
 String titulos[] = {"Id", "Codigo", "Editorial", "Titulo", "Escritor","Inventario","Precio"};
        Double numero[] = new Double[12];
        DefaultTableModel df = new DefaultTableModel(null, titulos);

        LibrosDAO es = new LibrosDAO();
        ArrayList<LibroVM> listar = es.busquedaLibros(txtBusq.getText());

        Iterator iterador = listar.iterator();
        Object fila[] = new Object[7];

        while (iterador.hasNext()) {
            //CASTEAR
            LibroVM estBucle = (LibroVM) iterador.next();
            fila[0] = estBucle.getIdLibro();
            fila[1] = estBucle.getCodigo_Libro();
            fila[2] = estBucle.getNombre_Editorial();
            fila[3] = estBucle.getTitulo();
            fila[4] = estBucle.getNombre_Escritor();
            fila[5] = estBucle.getCantidad();
            fila[6] = estBucle.getPrecio();
            
            df.addRow(fila);
        }
        tblAgLibro.setModel(df);

        tblAgLibro.getTableHeader().setReorderingAllowed(false);
        tblAgLibro.setRowHeight(30);
        tblAgLibro.setGridColor(new java.awt.Color(0, 0, 0));

        //PERSONALIZAR ENCABEZADO
        JTableHeader jtableHeader = tblAgLibro.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tblAgLibro.setTableHeader(jtableHeader);

        tblAgLibro.setDefaultRenderer(Object.class, new GestionColumnas());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeaderCl = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInCl = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgLibro = new javax.swing.JTable();
        txtBusq = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        lblInCl.setText("Agregar Libro");

        javax.swing.GroupLayout pnlHeaderClLayout = new javax.swing.GroupLayout(pnlHeaderCl);
        pnlHeaderCl.setLayout(pnlHeaderClLayout);
        pnlHeaderClLayout.setHorizontalGroup(
            pnlHeaderClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderClLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInCl, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderClLayout.setVerticalGroup(
            pnlHeaderClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHeaderClLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderClLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblInCl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(pnlHeaderCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        tblAgLibro.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAgLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgLibroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAgLibro);

        txtBusq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBusqMousePressed(evt);
            }
        });
        txtBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqActionPerformed(evt);
            }
        });
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusqKeyPressed(evt);
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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBusqueda)
                .addGap(122, 122, 122))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked
int x;
int y;
    private void pnlHeaderClMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderClMouseDragged
        int xx;
        int yy;
        xx=evt.getXOnScreen();
        yy=evt.getYOnScreen();
        
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_pnlHeaderClMouseDragged

    private void pnlHeaderClMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderClMousePressed
        x= evt.getX();
        y=evt.getY();

    }//GEN-LAST:event_pnlHeaderClMousePressed

    private void txtBusqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusqMousePressed

    }//GEN-LAST:event_txtBusqMousePressed

    private void txtBusqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyPressed
        carga();      // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqKeyPressed

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
public void seleccionarleibro(){
if (tblAgLibro.getSelectedRowCount() > 0) {
            
            
            int selectedRow = tblAgLibro.getSelectedRow();
            jpVent.txtclib.setText(String.valueOf(tblAgLibro.getValueAt(selectedRow, 3)));
            jpVent.txtLibro.setText(String.valueOf(tblAgLibro.getValueAt(selectedRow, 1)));
            jpVent.txtPrecio.setText(String.valueOf(tblAgLibro.getValueAt(selectedRow, 6)));
            jpVent.txtStock.setText(String.valueOf(tblAgLibro.getValueAt(selectedRow, 5)));
            
            jpVent.idlb = (int) tblAgLibro.getValueAt(tblAgLibro.getSelectedRow(), 0);
             
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Aviso", 1);
        }

}
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        seleccionarleibro();
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void tblAgLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgLibroMouseClicked
         if (evt.getClickCount() == 1) {
         seleccionarleibro();
         }
    }//GEN-LAST:event_tblAgLibroMouseClicked

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed
public JpCompra jpCompr;
    public JpVentas jpVent;
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
            java.util.logging.Logger.getLogger(JfrmAgLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmAgLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmAgLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmAgLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmAgLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblInCl;
    private java.awt.Panel panel1;
    public javax.swing.JPanel pnlHeaderCl;
    public javax.swing.JTable tblAgLibro;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}