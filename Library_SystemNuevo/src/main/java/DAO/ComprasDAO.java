/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Compras;
import Entidades.DetalleCompras;
import Entidades.Libro;
import Entidades.clientes;
import Entidades.detalleVentas;
import Entidades.venttas;
import ViewModel.ComprasVM;
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
public class ComprasDAO {
     ConexionAMYSQL con = new ConexionAMYSQL();
        Connection conexion = con.getConecction();
    
    //Select
    public ArrayList<Compras> ListaCompras() {
        ArrayList<Compras> lista = null;
        try {
            lista = new ArrayList<>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_compras}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Compras vt = new Compras();
                vt.setIdCompra(resultado.getInt("id_compra"));
                vt.setIdEditorial(resultado.getInt("id_editorial_fk"));
                vt.setFechaCompra(resultado.getDate("fecha_compra"));
                //vt.setTipo_comprobante(resultado.getString("tipo_comprobante_venta"));
                vt.setNumeroComprobante(resultado.getString("numero_comprobante_compra"));
                lista.add(vt);
                
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    

    
    
    // ADD VENTAS
    
        public int addCompras(Compras compra) {
        CallableStatement cb = null;
        ResultSet rs ;
        int count=0;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_compras(?,?,?,?)}");
            cb.setInt("p_id", compra.getIdCompra());
            cb.setInt("p_editorial", compra.getIdEditorial());
            cb.setDate("p_fecha_compra", new java.sql.Date( compra.getFechaCompra().getTime()));
            //cb.setInt("PForma_De_Pago", ventass.getForma_pago().ordinal()+1);
            //cb.setString("p_comprobante", ventass.getTipo_comprobante());
            cb.setString("p_numero_comprobante", compra.getNumeroComprobante());
            count = cb.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Compras agregadas");
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }
        
               return count;
    }
        
        
                public int addDetalleCompra(DetalleCompras detallecmpr) {
        CallableStatement cb = null;
        int count=0;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_detallecompra (?,?,?,?,?,?)}");
            
            cb.setInt("p_id_compra", detallecmpr.getIdCompra());
            cb.setInt("p_id_libro", detallecmpr.getIdlibro());
            cb.setInt("p_cantidad", detallecmpr.getCantidadCompra());
            cb.setDouble("p_precio_compra", detallecmpr.getPrecioCompra());
            cb.setDouble("p_precio_venta", detallecmpr.getPrecioVenta());
            cb.setDouble("p_impuesto", detallecmpr.getImpuestoCompra());
           
            count = cb.executeUpdate();


           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }
return count;
    }
        
        
        public int idCompra(){
        
            PreparedStatement cb = null;
        int id= 0;
        ResultSet rs = null;
        try{
            
        conexion = con.getConecction();
        cb = conexion.prepareStatement("select id_compra from compras order by id_compra desc limit 1");
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
        
        
        //ComprasOrdenadas
        public ArrayList<ComprasVM> ListadetalleCompras(String Busqueda) {
        ArrayList<ComprasVM> lista = null;
        CallableStatement cb = null;
        ResultSet resultado = null;
        try {
            conexion = con.getConecction();
            lista = new ArrayList<ComprasVM>();

            cb = conexion.prepareCall("{call sp_ij_compras(?)}");
            cb.setString(1, Busqueda);
            resultado = cb.executeQuery();

            while (resultado.next()) {
                //LibroVM li = new LibroVM();
                lista.add(new ComprasVM(
                        resultado.getInt("id_compra"),
                        resultado.getDate("fecha_compra"),
                        resultado.getString("codigo_libro"),
                        resultado.getString("titulo_libro"),
                        resultado.getDouble("precio_libro"),
                        resultado.getString("codigo_editorial"),
                        resultado.getString("nombre_editorial"),
                        resultado.getInt("cantidad_compra"),
                        resultado.getDouble("precio_compra")));
                       

            }

        } catch (Exception e) {
            System.out.println("Error al mostrar los datos de las compras" + e);

        } finally {
            try {
                resultado.close();
                cb.close();
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error, no se han cerrado las conexiones correctamenbte" + e);
            }

        }

        return lista;

    }
    
}

    
    
    
    

