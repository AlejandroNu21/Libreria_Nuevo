/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Editorial;
import Entidades.Escritor;
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
public class EscritoresDAO {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Escritor> ListaEscritor() {
        ArrayList<Escritor> lista = null;
        try {
            lista = new ArrayList<Escritor>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_escritores}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Escritor ed = new Escritor();
                ed.setIdEscritor(resultado.getInt("id_escritor"));
                ed.setCodigo_Escritor(resultado.getString("codigo_escritor"));
                ed.setNombre_Escritor(resultado.getString("nombre_escritor"));
                ed.setApellido_Escritor(resultado.getString("apellido_escritor"));
                ed.setPais_Escritor(resultado.getString("pais_escritor"));
                ed.setFecha_Nacimiento(resultado.getDate("fecha_nacimiento_escritor"));
                ed.setBiografia(resultado.getString("biografia_escritor"));
                ed.setAvatarEscritor(resultado.getBytes("foto_escritor"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    
    public ArrayList<Escritor> FiltroEscritor(String Busqueda) {
        ArrayList<Escritor> lista = null;
        try {
            lista = new ArrayList<Escritor>();

            CallableStatement cb = conexion.prepareCall("{call sp_f_escritores(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Escritor ed = new Escritor();
                ed.setIdEscritor(resultado.getInt("id_escritor"));
                ed.setCodigo_Escritor(resultado.getString("codigo_escritor"));
                ed.setNombre_Escritor(resultado.getString("nombre_escritor"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    //busqueda
    
       public ArrayList<Escritor> BusquedaEscritor(String Busqueda) {
        ArrayList<Escritor> lista = null;
        try {
            lista = new ArrayList<Escritor>();

            CallableStatement cb = conexion.prepareCall("{call sp_b_escritores (?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Escritor ed = new Escritor();
                ed.setIdEscritor(resultado.getInt("id_escritor"));
                ed.setCodigo_Escritor(resultado.getString("codigo_escritor"));
                ed.setNombre_Escritor(resultado.getString("nombre_escritor"));
                ed.setApellido_Escritor(resultado.getString("apellido_escritor"));
                ed.setPais_Escritor(resultado.getString("pais_escritor"));
                ed.setFecha_Nacimiento(resultado.getDate("fecha_nacimiento_escritor"));
                ed.setBiografia(resultado.getString("pais_escritor"));
                //ed.setAvatarEscritor(resultado.getBytes("foto_escritor"));
                //ed.setAvatarEscritor(resultado.getBytes("AvatarEscritor"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }

    //ADD
    public void AddEscritor(Escritor edi) {

        try {
            CallableStatement cb = conexion.prepareCall("{call sp_i_escritores(?,?,?,?,?,?)}");
            cb.setString("p_cod", edi.getCodigo_Escritor());
            cb.setString("p_nombre", edi.getNombre_Escritor());
            cb.setString("p_apellido", edi.getApellido_Escritor());
            cb.setString("p_pais", edi.getPais_Escritor());
            cb.setDate("p_fecha", new java.sql.Date( edi.getFecha_Nacimiento().getTime()));
            cb.setString("p_biog", edi.getBiografia());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
    public void UpdateEscritor(Escritor escritor) {

        try {
            CallableStatement cb = conexion.prepareCall("{call sp_u_escritores (?,?,?,?,?,?,?)};");
            cb.setInt(7, escritor.getIdEscritor());
            cb.setString(1, escritor.getCodigo_Escritor());
            cb.setString(2, escritor.getNombre_Escritor());
            cb.setString(3, escritor.getApellido_Escritor());
            cb.setString(4, escritor.getPais_Escritor());
            cb.setDate(5, new java.sql.Date(escritor.getFecha_Nacimiento().getTime()));
            cb.setString(6, escritor.getBiografia());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor Actualizado");
            //System.out.println(escritor.getCodigo_Escritor()+escritor.getNombre_Escritor()+escritor.getApellido_Escritor()+escritor.getPais_Escritor()+escritor.getIdEscritor());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
         public void DeleteEscritor (Escritor esc) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from escritores as a where a.id_escritor=?;");
            cb.setInt(1, esc.getIdEscritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
    
    
}
