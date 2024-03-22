/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import Entidades.Enums.formadePagoType;
import Entidades.Libro;
import Entidades.clientes;
import Entidades.detalleVentas;
import Entidades.venttas;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vkaiido
 */
public class VentasDAO {

        ConexionAMYSQL con = new ConexionAMYSQL();
        Connection conexion = con.getConecction();
    
    //Select
    public ArrayList<venttas> ListaVentas() {
        ArrayList<venttas> lista = null;
        try {
            lista = new ArrayList<>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_ventas}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                venttas vt = new venttas();
                vt.setId_ventas(resultado.getInt("id_venta"));
                vt.setId_cliente_fk(resultado.getInt("id_cliente_fk"));
                vt.setFecha_venta(resultado.getDate("fecha_venta"));
                vt.setTipo_comprobante(resultado.getString("tipo_comprobante_venta"));
                vt.setNumero_comprobante(resultado.getString("numero_comprobante_venta"));
                lista.add(vt);
                
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
            public ArrayList<clientes> ClientesCmb() {
        ArrayList<clientes> lista = null;
        try {
            lista = new ArrayList<clientes>();

            CallableStatement cb = conexion.prepareCall("select id_cliente, documento_cliente, concat(nombre_cliente ,' ', apellido_cliente)as nombres from clientes");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                clientes cl = new clientes();
                cl.setId_cliente(resultado.getInt("id_cliente"));
                cl.setDocumento_cliente(resultado.getString("documento_cliente"));
                cl.setNombreCompleto(resultado.getString("nombres"));
                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
            
            public ArrayList<Libro> LibroCmb() {
        ArrayList<Libro> lista = null;
        try {
            lista = new ArrayList<Libro>();
            conexion = con.getConecction();
            CallableStatement cb = conexion.prepareCall("{call sp_s_libros}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Libro li = new Libro();
                li.setIdLibro(resultado.getInt("id_libro"));
                li.setCodigo_Libro(resultado.getString("codigo_libro"));
                li.setTitulo(resultado.getString("titulo_libro"));
                
                lista.add(li);
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return lista;
    }
    
    // ADD VENTAS
    
        public int addVentas(venttas ventass) {
        CallableStatement cb = null;
        ResultSet rs ;
        int count=0;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_ventas(?,?,?,?)}");
            cb.setInt("p_id", ventass.getId_ventas());
            cb.setInt("p_id_cliente", ventass.getId_cliente_fk());
            cb.setDate("p_fecha_venta", new java.sql.Date( ventass.getFecha_venta().getTime()));
            //cb.setInt("PForma_De_Pago", ventass.getForma_pago().ordinal()+1);
            //cb.setString("p_comprobante", ventass.getTipo_comprobante());
            cb.setString("p_numero", ventass.getNumero_comprobante());
            count = cb.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Ventas agregadas");
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }
        
               return count;
    }
        
        
                public int addDetalleVenta(detalleVentas detallevnts) {
        CallableStatement cb = null;
        int count=0;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_detalle_venta (?,?,?,?,?,?)}");
            
            cb.setInt("p_id_venta", detallevnts.getIdVenta());
            cb.setInt("p_id_libro", detallevnts.getIdlibro());
            cb.setInt("p_cantidad", detallevnts.getCantidadVenta());
            cb.setDouble("p_precio", detallevnts.getPrecioVenta());
            cb.setDouble("p_des", detallevnts.getDecuentoVenta());
            cb.setDouble("p_imp", detallevnts.getImpuestoVenta());
           
            count = cb.executeUpdate();


           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }
return count;
    }
        
        
        public int idVenta(){
        
            PreparedStatement cb = null;
        int id= 0;
        ResultSet rs = null;
        try{
            
        conexion = con.getConecction();
        cb = conexion.prepareStatement("select id_venta from ventas order by id_venta desc limit 1");
        rs = cb.executeQuery();
        if(rs.next()){
        id = rs.getInt(1);
            //System.out.println(id);
        }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "error" + ex);
        }
        return id;
        }
        
        
    
        
         /*public void DeleteDL(venttas vts) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from ventas as a where a.id_venta = ?;");
            cb.setInt(1, vts.getId_ventas());
            cb.execute();

            JOptionPane.showMessageDialog(null, "VentasDAO eliminadas correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }*/
        
    
}
