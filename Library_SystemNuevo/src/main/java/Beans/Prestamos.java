/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

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
public class Prestamos {
    
        ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
    
    //Select
    
        public ArrayList<PrestamoVM> ListaPrestamo() {
        ArrayList<PrestamoVM> lista = null;
        try {
            lista = new ArrayList<PrestamoVM>();

            CallableStatement cb = conexion.prepareCall("{call SP_IJ_PRESTAMO}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                   lista.add(new PrestamoVM(
                resultado.getInt("idPrestamo"),
                        resultado.getString("Nombre_Lector"),
                        resultado.getString("Titulo"),
                           resultado.getDate("Fecha_Prestamo"),
                           resultado.getDate("Fecha_Devolucion"),
                        prestamoType.values()[resultado.getInt("Devuelto")-1] ));
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
            cb = conexion.prepareCall("{call SP_I_PRESTAMO(?,?,?,?,?)}");
            cb.setInt("PidLector", prest.getIdLector());
            cb.setInt("PidLibro", prest.getIdLibro());
            cb.setDate("PFecha_Prestamo", new java.sql.Date( prest.getFecha_Prestamo().getTime()));
            cb.setDate("PFecha_Devolucion", new java.sql.Date( prest.getFecha_Devolucion().getTime()));
            cb.setInt("PDevuelto", prest.getDevuelto().ordinal()+1);
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
            cb = conexion.prepareCall("{call SP_U_PRESTAMO (?,?,?,?,?,?)}");
            cb.setInt(6, prest.getIdPrestamo());
            cb.setInt(1, prest.getIdLector());
            cb.setInt(2, prest.getIdLibro());
            cb.setDate(3, new java.sql.Date( prest.getFecha_Prestamo().getTime()));
            cb.setDate(4, new java.sql.Date( prest.getFecha_Devolucion().getTime()));
            cb.setInt(5, prest.getDevuelto().ordinal()+1);
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
            CallableStatement cb = conexion.prepareCall("delete from prestamo as a where a.idPrestamo=?;");
            cb.setInt(1, prs.getIdPrestamo());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Solicitud de prestamo eliminada correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
    
}
