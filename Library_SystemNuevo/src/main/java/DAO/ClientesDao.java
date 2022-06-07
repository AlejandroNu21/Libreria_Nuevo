/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.clientes;
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
public class ClientesDao {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    public ArrayList<clientes> ListaClientes() {
        ArrayList<clientes> lista = null;
        try {
            lista = new ArrayList<clientes>();

            CallableStatement cb = conexion.prepareCall("{call sp_s_clientes()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                clientes cl = new clientes();
                cl.setId_cliente(resultado.getInt("id_cliente"));
                cl.setDocumento_cliente(resultado.getString("documento_cliente"));
                cl.setNombre_cliente(resultado.getString("nombre_cliente"));
                cl.setApellido_cliente(resultado.getString("apellido_cliente"));
                cl.setEdad_cliente(resultado.getInt("edad_cliente"));
                cl.setDireccion_cliente(resultado.getString("direccion_cliente"));
                cl.setTelefono_cliente(resultado.getString("telefono_cliente"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    


    //FiltroClientes
    public ArrayList<clientes> FiltroClientes(String Busqueda) {
        ArrayList<clientes> lista = null;
        try {
            lista = new ArrayList<clientes>();

            CallableStatement cb = conexion.prepareCall("{call sp_f_clientes(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                clientes cl = new clientes();
                cl.setId_cliente(resultado.getInt("id_cliente"));
                cl.setDocumento_cliente(resultado.getString("documento_cliente"));
                cl.setNombre_cliente(resultado.getString("nombre_cliente"));
                cl.setApellido_cliente("apellido_cliente");
                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    
    
    

    //Busqueda
    public ArrayList<clientes> BusquedaClientes(String Busqueda) {
        ArrayList<clientes> lista = null;
        try {
            lista = new ArrayList<clientes>();

            CallableStatement cb = conexion.prepareCall("{call sp_b_clientes(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                clientes cl = new clientes();
                cl.setId_cliente(resultado.getInt("id_cliente"));
                cl.setDocumento_cliente(resultado.getString("documento_cliente"));
                cl.setNombre_cliente(resultado.getString("nombre_cliente"));
                cl.setApellido_cliente(resultado.getString("apellido_cliente"));
                cl.setEdad_cliente(resultado.getInt("edad_cliente"));
                cl.setDireccion_cliente(resultado.getString("direccion_cliente"));
                cl.setTelefono_cliente(resultado.getString("telefono_cliente"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }
    //ADD

    public void AddCliente(clientes cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call sp_i_clientes(?,?,?,?,?,?)}");
            cb.setString("p_doc", cl.getDocumento_cliente());
            cb.setString("p_nombre", cl.getNombre_cliente());
            cb.setString("p_apellido", cl.getApellido_cliente());
            cb.setInt("p_edad", cl.getEdad_cliente());
            cb.setString("p_direccion", cl.getDireccion_cliente());
            cb.setString("p_telefono", cl.getTelefono_cliente());
            cb.execute();

            JOptionPane.showMessageDialog(null, "cliente Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

    public void UpdateCliente(clientes clie) {
        try {
            CallableStatement cb = conexion.prepareCall("{call sp_u_clientes(?,?,?,?,?,?,?)}");
            cb.setInt(7, clie.getId_cliente());
            cb.setString(1, clie.getDocumento_cliente());
            cb.setString(2, clie.getNombre_cliente());
            cb.setString(3, clie.getApellido_cliente());
            cb.setInt(4, clie.getEdad_cliente());
            cb.setString(5, clie.getDireccion_cliente());
            cb.setString(6, clie.getTelefono_cliente());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Cliente Actualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

    public void DeleteClient(clientes clt) {

        try {
            CallableStatement cb = conexion.prepareCall("delete from clientes as clt where clt.id_cliente=?;");
            cb.setInt(1, clt.getId_cliente());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ups, Error, " + ex);
        }
    }

}
