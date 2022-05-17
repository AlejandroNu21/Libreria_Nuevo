/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Escritor;
import Entidades.Libro;
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
public class Libros {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Libro> ListaLibro() {
        ArrayList<Libro> lista = null;
        try {
            lista = new ArrayList<Libro>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_LIBRO}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Libro li = new Libro();
                li.setIdLibro(resultado.getInt("idLibro"));
                li.setCodigo_Libro(resultado.getString("Codigo_Libro"));
                li.setIdEditorial(resultado.getInt("idEditorial"));
                li.setTitulo(resultado.getString("Titulo"));
                li.setIdEscritor(resultado.getInt("idEscritor"));
                li.setIdCategoria(resultado.getInt("idCategoria"));
                li.setIdGenero_Literario(resultado.getInt("idGenero_Literario"));
                li.setIdSubgenero_Literario(resultado.getInt("idSubgenero_Literario"));
                li.setClasificacion(resultado.getString("Clasificacion"));
                lista.add(li);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddLibro(Libro lib) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_LIBRo(?,?,?,?,?,?,?,?)}");
            cb.setString("PCodigo_Libro", lib.getCodigo_Libro());
            cb.setInt("PidEditorial", lib.getIdEditorial());
            cb.setString("PTitulo", lib.getTitulo());
            cb.setInt("PidEscritor", lib.getIdEscritor());
            cb.setInt("PidCategoria", lib.getIdCategoria());
            cb.setInt("PidGenero_Literario", lib.getIdGenero_Literario());
            cb.setInt("PidSubgenero_Literario", lib.getIdSubgenero_Literario());
            cb.setString("PClasificacion", lib.getClasificacion());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Libro Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

}
