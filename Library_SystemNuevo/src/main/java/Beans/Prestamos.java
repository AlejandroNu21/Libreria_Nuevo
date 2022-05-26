/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Enums.prestamoType;
import Entidades.Prestamo;
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
    
        public ArrayList<Prestamo> ListaEditorial() {
        ArrayList<Prestamo> lista = null;
        try {
            lista = new ArrayList<Prestamo>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_EDITORIAL}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                   Prestamo prs = new Prestamo();
                   prs.setIdPrestamo(resultado.getInt("idPrestamo"));
                   prs.setIdLector(resultado.getInt("idLector"));
                   prs.setIdLibro(resultado.getInt("idLibro"));
                   prs.setFecha_Prestamo(resultado.getDate("Fecha_Prestamo"));
                   prs.setFecha_Devolucion(resultado.getDate("Fecha_Devolucion"));
                   prs.setDevuelto(prestamoType.values()[resultado.getInt("Devuelto")-1]);
                lista.add(prs);
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
            JOptionPane.showMessageDialog(null, "error" + ex);
                }finally{
        try{
                cb.close();
                conexion.close();
        }catch(Exception e){
            System.out.println("Error, no se han guardado las conexiones correctamenbte" + e);
        }
        
        }
    }
    
}
