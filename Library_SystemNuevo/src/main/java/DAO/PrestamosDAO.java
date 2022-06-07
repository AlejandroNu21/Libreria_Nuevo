/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Enums.prestamoType;
import Entidades.Prestamo;
import ViewModel.PrestamoVM;
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
public class PrestamosDAO {
    
        ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
    
    //Select
    
        public ArrayList<PrestamoVM> ListaPrestamo() {
        ArrayList<PrestamoVM> lista = null;
        try {
            lista = new ArrayList<PrestamoVM>();

            CallableStatement cb = conexion.prepareCall("{call sp_ij_prestamo}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                   lista.add(new PrestamoVM(
                resultado.getInt("id_prestamo"),
                        resultado.getString("nombre_lector"),
                        resultado.getString("titulo_libro"),
                           resultado.getDate("fecha_prestamo"),
                           resultado.getDate("fecha_devolucion_prestamo"),
                        prestamoType.values()[resultado.getInt("reembolso")-1] ));
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    //Add
            public void AddPrestamo(Prestamo prest) {
        CallableStatement cb = null;
        
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_prestamos(?,?,?,?,?)}");

            cb.setDate("p_fecha_prestamo", new java.sql.Date(prest.getFecha_Prestamo().getTime()));
            cb.setDate("p_fecha_devolucion", new java.sql.Date(prest.getFecha_Devolucion().getTime()));
            cb.setInt("p_reembolso", prest.getReembolso_prestamo().ordinal() + 1);
            cb.setInt("p_id_lector", prest.getIdLector());
            cb.setInt("p_id_libro", prest.getIdLibro());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Solicitud de prestamo agregada correctamente");
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
                }finally{
        try{
                cb.close();
                conexion.close();
        }catch(Exception e){
            System.out.println("Error, no se han guardado las conexiones correctamente" + e);
        }
        
        }

    }
    
    public void UpdatePrestamo(Prestamo prest) {
        CallableStatement cb = null;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_u_prestamos (?,?,?,?,?,?)}");
            cb.setInt(6, prest.getIdPrestamo());
            cb.setDate(1, new java.sql.Date( prest.getFecha_Prestamo().getTime()));
            cb.setDate(2, new java.sql.Date( prest.getFecha_Devolucion().getTime()));
            cb.setInt(3, prest.getReembolso_prestamo().ordinal()+1);
             cb.setInt(4, prest.getIdLector());
            cb.setInt(5, prest.getIdLibro());
            cb.execute();


            JOptionPane.showMessageDialog(null, "Solicitud de prestamo actualizada con exito");
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Solicitud de prestamo no actualizada" + ex);
                }finally{
        try{
                cb.close();
                conexion.close();
        }catch(Exception e){
            System.out.println("Error, no se han guardado las conexiones correctamenbte" + e);
        }
        
        }
    }
    
    
    public void DeletePrestamo(Prestamo prs) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from prestamos as a where a.id_prestamo=?;");
            cb.setInt(1, prs.getIdPrestamo());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Solicitud de prestamo eliminada correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
    
}
