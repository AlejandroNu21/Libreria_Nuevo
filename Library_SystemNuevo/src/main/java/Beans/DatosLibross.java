/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.DatosLibro;
import Entidades.Enums.disponibleType;
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
public class DatosLibross {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    public ArrayList<DatosLibro> ListaDatosLibros() {
        ArrayList<DatosLibro> lista = null;
        try {
            lista = new ArrayList<DatosLibro>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_DATOS_LIBRO()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                DatosLibro cl = new DatosLibro();
               // cl.setIdDatos_Libro(resultado.getInt("idDatos_Libro"));
               cl.setIdDatos_Libro(resultado.getInt("idDatos_Libro"));
                cl.setIdLibro(resultado.getInt("idLibro"));
                cl.setReseña(resultado.getString("Reseña"));
                cl.setPrecio(resultado.getDouble("Precio"));
                cl.setCantidad(resultado.getInt("Cantidad"));
                cl.setDisponible(disponibleType.values()[resultado.getInt("Disponible") - 1]);
                cl.setAño_Publicacion(resultado.getString("Año_Publicacion"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }


    public void AddDatosLibros(DatosLibro cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_DATOS_LIBRO(?,?,?,?,?,?)}");
            
            cb.setInt("PidLibro", cl.getIdLibro());
            cb.setString("PReseña", cl.getReseña());
            cb.setDouble("PPrecio", cl.getPrecio());
            cb.setInt("PCantidad", cl.getCantidad());
            cb.setInt("PDisponible", cl.getDisponible().ordinal() + 1);
            cb.setString("PAño_Publicacion", cl.getAño_Publicacion());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del libro agregado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
        public void UpdateDL(DatosLibro dl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_U_DATOSLIBRO(?,?,?,?,?,?,?)}");
            cb.setInt(7, dl.getIdDatos_Libro());
            cb.setInt(1, dl.getIdLibro());
            cb.setString(2, dl.getReseña());
            cb.setDouble(3, dl.getPrecio());
            cb.setInt(4, dl.getCantidad());
            cb.setInt(5, dl.getDisponible().ordinal() + 1);
            cb.setString(6, dl.getAño_Publicacion());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del libro actualizados correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
             public void DeleteDL(DatosLibro dl) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from datos_libro as a where a.idDatos_Libro = ?;");
            cb.setInt(1, dl.getIdDatos_Libro());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del libro eliminados correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
    

}
