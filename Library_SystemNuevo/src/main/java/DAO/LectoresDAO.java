/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Escritor;
import Entidades.Lector;
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
public class LectoresDAO {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Lector> ListaLector() {
        ArrayList<Lector> lista = null;
        try {
            lista = new ArrayList<Lector>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_lectores}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Lector le = new Lector();
                le.setIdLector(resultado.getInt("id_lector"));
                le.setCodigoLector(resultado.getString("codigo_lector"));
                le.setNombre_Lector(resultado.getString("nombre_lector"));
                le.setApellido_Lector(resultado.getString("apellido_lector"));
                le.setEdad(resultado.getString("edad_lector"));
                le.setDireccion(resultado.getString("direccion_lector"));
                le.setTelefono(resultado.getString("telefono_lector"));
                lista.add(le);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    //FiltroLector
    
        public ArrayList<Lector> FiltroLector(String Busqueda) {
        ArrayList<Lector> lista = null;
        try {
            lista = new ArrayList<Lector>();

            CallableStatement cb = conexion.prepareCall("{call sp_f_lectores(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Lector le = new Lector();
                le.setIdLector(resultado.getInt("id_lector"));
                le.setCodigoLector(resultado.getString("codigo_lector"));
                le.setNombre_Lector(resultado.getString("nombre_lector"));
                lista.add(le);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    //Busqueda
            public ArrayList<Lector> BusquedaLector(String Busqueda) {
        ArrayList<Lector> lista = null;
        try {
            lista = new ArrayList<Lector>();

            CallableStatement cb = conexion.prepareCall("{call sp_b_lectores (?)}");
             cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Lector le = new Lector();
                le.setIdLector(resultado.getInt("id_lector"));
                le.setCodigoLector(resultado.getString("codigo_lector"));
                le.setNombre_Lector(resultado.getString("nombre_lector"));
                le.setApellido_Lector(resultado.getString("apellido_lector"));
                le.setEdad(resultado.getString("edad_lector"));
                le.setDireccion(resultado.getString("direccion_lector"));
                le.setTelefono(resultado.getString("telefono_lector"));
                lista.add(le);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    

    //ADD
    public void AddLector(Lector le) {

        try {
            CallableStatement cb = conexion.prepareCall("{call sp_i_lectores(?,?,?,?,?,?)}");
            cb.setString("p_cod", le.getCodigoLector());
            cb.setString("p_nombre", le.getNombre_Lector());
            cb.setString("p_apellido", le.getApellido_Lector());
            cb.setString("p_edad", le.getEdad());
            cb.setString("p_direccion", le.getDireccion());
            cb.setString("p_tel", le.getTelefono());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
     public void UpdateLector(Lector lect) {
     try {
            CallableStatement cb = conexion.prepareCall("{call sp_u_lectores(?,?,?,?,?,?,?)}");
            cb.setInt(7,lect.getIdLector());
            cb.setString(1, lect.getCodigoLector());
            cb.setString(2, lect.getNombre_Lector());
            cb.setString(3, lect.getApellido_Lector());
            cb.setString(4, lect.getEdad());
            cb.setString(5,lect.getDireccion());
            cb.setString(6,lect.getTelefono());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector Actualizado","Exito",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    
    }
     
        public void DeleteLector (Lector lec){
    
    try{
         CallableStatement cb = conexion.prepareCall("delete from lectores as esc where esc.id_lector=?;");
            cb.setInt(1, lec.getIdLector());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector eliminado correctamente");
            
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error, " + ex);
    }
    }
    
}
