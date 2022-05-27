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

            CallableStatement cb = conexion.prepareCall("{call SP_S_DATOS_LIBRO}");
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

//    public ArrayList<DatosLibro> ListaDatosLibros() {
//        ArrayList<DatosLibro> lista = null;
//        try {
//            lista = new ArrayList<DatosLibro>();
//
//            CallableStatement cb = conexion.prepareCall("{call SP_S_DATOS_LIBRO()}");
//            ResultSet resultado = cb.executeQuery();
//
//            while (resultado.next()) {
//                DatosLibro cl = new DatosLibro();
//                cl.setIdDatos_Libro(resultado.getInt("idDatos_Libro"));
//                cl.setIdLibro(resultado.getInt("idLibro"));
//                cl.setReseña(resultado.getString("Reseña"));
//                cl.setPrecio(resultado.getDouble("Precio"));
//                cl.setCantidad(resultado.getInt("Cantidad"));
//               //disponibleType.values()[resultado.getInt("Disponible")-1],
//                cl.setAño_Publicacion(resultado.getString("Año_Publicacion"));
//                disponibleType.values()[resultado.getInt("Disponible")-1];
//
//                lista.add(cl);
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error man" + e);
//        }
//
//        return lista;
//    }
    public void AddDatosLibros(DatosLibro cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_DATOS_LIBRO(?,?,?,?,?,?)}");
            //Escritor es = new Escritor();
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

}
