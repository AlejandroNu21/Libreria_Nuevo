/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Enums.*;
import Entidades.Escritor;
import Entidades.Libro;
import ViewModel.LibroVM;
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
    /*public ArrayList<Libro> ListaLibro() {
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
                li.setCategoria(categoryType.values()[resultado.getInt("Categoria")-1]);
                li.setGenero(generoType.values()[resultado.getInt("Genero")-1]);
                li.setSubGenero(subgeneroType.values()[resultado.getInt("Subgenero")-1]);
                li.setClasificacion(resultado.getString("Clasificacion"));
                lista.add(li);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }*/

    public ArrayList<LibroVM> ListaLibro() {
        ArrayList<LibroVM> lista = null;
        try {
            lista = new ArrayList<LibroVM>();

            CallableStatement cb = conexion.prepareCall("{call spsLibro}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                //LibroVM li = new LibroVM();
                lista.add(new LibroVM(
                resultado.getInt("idLibro"),
                        resultado.getString("Codigo_Libro"),
                        resultado.getString("Nombre_Editorial"),
                        resultado.getString("Titulo"),
                        resultado.getString("Nombre_Escritor"),
                        categoryType.values()[resultado.getInt("Categoria")-1],
                        generoType.values()[resultado.getInt("Genero")-1],
                        subgeneroType.values()[resultado.getInt("Subgenero")-1],
                        resultado.getString("Clasificacion") ));               
//                li.setIdLibro(resultado.getInt("idLibro"));
//                li.setCodigo_Libro(resultado.getString("Codigo_Libro"));
//                li.setNombre_Editorial(resultado.getString("Nombre_Editorial"));
//                li.setTitulo(resultado.getString("Titulo"));
//                li.setNombre_Escritor(resultado.getString("Nombre_Escritor"));
//                li.setCategoria(categoryType.values()[resultado.getInt("Categoria")-1]);
//                li.setGenero(generoType.values()[resultado.getInt("Genero")-1]);
//                li.setSubGenero(subgeneroType.values()[resultado.getInt("Subgenero")-1]);
//                li.setClasificacion(resultado.getString("Clasificacion"));
//                lista.add(li);
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
            cb.setInt("PCategoria", lib.getCategoria().ordinal()+1);
            cb.setInt("PGenero", lib.getGenero().ordinal()+1);
            cb.setInt("PSubGenero", lib.getSubGenero().ordinal()+1);
            cb.setString("PClasificacion", lib.getClasificacion());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Libro Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

}
