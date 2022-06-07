/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Entidades.Editorial;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class EditorialsDao {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Editorial> ListaEditorial() {
        ArrayList<Editorial> lista = null;
        try {
            lista = new ArrayList<Editorial>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_editoriales}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Editorial ed = new Editorial();
                ed.setIdEditorial(resultado.getInt("id_editorial"));
                ed.setCodigoEditorial(resultado.getString("codigo_editorial"));
                ed.setNombre_Editorial(resultado.getString("nombre_editorial"));
                ed.setDireccion_Editorial(resultado.getString("direccion_editorial"));
                ed.setTelefono_Editorial(resultado.getString("telefono_editorial"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    //Filtro
     public ArrayList<Editorial> FiltroEditorial(String Busqueda) {
        ArrayList<Editorial> lista = null;
        try {
            lista = new ArrayList<Editorial>();

            CallableStatement cb = conexion.prepareCall("{call sp_f_editoriales(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Editorial ed = new Editorial();
                ed.setIdEditorial(resultado.getInt("id_editorial"));
                ed.setCodigoEditorial(resultado.getString("codigo_editorial"));
                ed.setNombre_Editorial(resultado.getString("nombre_editorial"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
     
     
     //Busquedas
         public ArrayList<Editorial> BusquedaEditorial(String Busqueda) {
        ArrayList<Editorial> lista = null;
        try {
            lista = new ArrayList<Editorial>();

            CallableStatement cb = conexion.prepareCall("{call sp_b_editorial(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Editorial ed = new Editorial();
                ed.setIdEditorial(resultado.getInt("id_editorial"));
                ed.setCodigoEditorial(resultado.getString("codigo_editorial"));
                ed.setNombre_Editorial(resultado.getString("nombre_editorial"));
                ed.setDireccion_Editorial(resultado.getString("direccion_editorial"));
                ed.setTelefono_Editorial(resultado.getString("telefono_editorial"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
     

    //ADD
    public void AddEditorial(Editorial edi) {

        try {
            CallableStatement cb = conexion.prepareCall("{call sp_i_editoriales(?,?,?,?)}");
            cb.setString("p_cod", edi.getCodigoEditorial());
            cb.setString("p_nombre", edi.getNombre_Editorial());
            cb.setString("p_direccion", edi.getDireccion_Editorial());
            cb.setString("p_telefono", edi.getTelefono_Editorial());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Editorial Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
    public void UpdateEditorial(Editorial edi) {
     try {
            CallableStatement cb = conexion.prepareCall("{call sp_u_editoriales(?,?,?,?,?)}");
            cb.setInt(5,edi.getIdEditorial());
            cb.setString(1, edi.getCodigoEditorial());
            cb.setString(2, edi.getNombre_Editorial());
            cb.setString(3, edi.getDireccion_Editorial());
            cb.setString(4, edi.getTelefono_Editorial());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Editorial Actualizado","Exito",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    
    }
    
     public void DeleteEditorial(Editorial edi) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from editoriales as a where a.id_editorial=?;");
            cb.setInt(1, edi.getIdEditorial());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Editorial eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }

}
