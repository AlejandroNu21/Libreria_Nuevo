/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Enums.formadePagoType;
import Entidades.venttas;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vkaiido
 */
public class Ventas {

        ConexionAMYSQL con = new ConexionAMYSQL();
        Connection conexion = con.getConecction();
    
    //Select
    public ArrayList<venttas> ListaVentas() {
        ArrayList<venttas> lista = null;
        try {
            lista = new ArrayList<>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_VENTAS}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                venttas vt = new venttas();
                vt.setIdVentas(resultado.getInt("idVentas"));
                vt.setIdLibro(resultado.getInt("idLibro"));
                vt.setIdCliente(resultado.getInt("idCliente"));
                vt.setFecha_Venta(resultado.getDate("Fecha_Venta"));
                //vt.setForma_pago(formadePagoType.values()[resultado.getInt("forma_pago")-1]);
                vt.setCantidadLibro(resultado.getInt("CantidadLibro"));
                vt.setTotal(resultado.getDouble("Total"));
                lista.add(vt);
                
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }
    
    // ADD VENTAS
    
        public void addVentas(venttas ventass) {
        CallableStatement cb = null;
        
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call SP_I_VENTAS(?,?,?,?,?,?)}");
            cb.setInt("PidLibro", ventass.getIdLibro());
            cb.setInt("PidCliente", ventass.getIdCliente());
            cb.setDate("PFecha_Venta", new java.sql.Date( ventass.getFecha_Venta().getTime()));
            cb.setInt("PForma_De_Pago", ventass.getForma_pago().ordinal()+1);
            cb.setInt("PCantidad_Libros", ventass.getCantidadLibro());
            cb.setDouble("PTotal", ventass.getTotal());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Ventas agregadas");
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }

    }
        
         public void DeleteDL(venttas vts) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from ventas as a where a.idVentas = ?;");
            cb.setInt(1, vts.getIdVentas());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Ventas eliminadas correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
        
    
}
