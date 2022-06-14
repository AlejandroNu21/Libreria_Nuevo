/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
public class LibrosDAO {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = null;

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
        CallableStatement cb = null;
        ResultSet resultado = null;
        try {
            conexion = con.getConecction();
            lista = new ArrayList<LibroVM>();

             cb = conexion.prepareCall("{call sp_ij_libros}");
            resultado = cb.executeQuery();

            while (resultado.next()) {
                //LibroVM li = new LibroVM();
                lista.add(new LibroVM(
                resultado.getInt("id_libro"),
                        resultado.getString("codigo_libro"),
                        resultado.getString("nombre_editorial"),
                        resultado.getString("titulo_libro"),
                        resultado.getString("nombre_escritor"),
                        resultado.getInt("cantidad_libro"),
                        resultado.getString("descripcion_libro"),
                        categoryType.values()[resultado.getInt("Categoria")-1],
                        generoType.values()[resultado.getInt("Genero")-1],
                        subgeneroType.values()[resultado.getInt("Subgenero")-1],
                        resultado.getString("clasificacion_libro") ));    
                
                
            }
                
                
        } catch (Exception e) {
            System.out.println("Error al mostrar los datos del Libro" + e);
            
        }finally{
        try{
        resultado.close();
                cb.close();
                conexion.close();
        }catch(Exception e){
            System.out.println("Error, no se han cerrado las conexiones correctamenbte" + e);
        }
        
        }

        return lista;
        
    }
    
    
    //Filtro
    
        public ArrayList<Libro> FiltroLibro(String Busqueda) {
        ArrayList<Libro> lista = null;
        try {
            lista = new ArrayList<Libro>();
            conexion = con.getConecction();
            CallableStatement cb = conexion.prepareCall("{call sp_f_libros(?)}");
            cb.setString(1, Busqueda);
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Libro li = new Libro();
                li.setIdLibro(resultado.getInt("id_libro"));
                li.setCodigo_Libro(resultado.getString("codigo_libro"));
                li.setTitulo(resultado.getString("titulo_libro"));
                li.setCantidad(resultado.getInt("cantidad_libro"));
                lista.add(li);
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return lista;
    }
        
            

        
            public ArrayList<LibroVM> busquedaLibros(String Busqueda) {
        ArrayList<LibroVM> lista = null;
        CallableStatement cb = null;
        ResultSet resultado = null;
        try {
            conexion = con.getConecction();
            lista = new ArrayList<LibroVM>();

             cb = conexion.prepareCall("{call sp_b_libros(?)}");
             cb.setString(1, Busqueda);
            resultado = cb.executeQuery();

            while (resultado.next()) {
                //LibroVM li = new LibroVM();
                lista.add(new LibroVM(
                resultado.getInt("id_libro"),
                        resultado.getString("codigo_libro"),
                        resultado.getString("nombre_editorial"),
                        resultado.getString("titulo_libro"),
                        resultado.getString("nombre_escritor"),
                        resultado.getInt("cantidad_libro"),
                        resultado.getString("descripcion_libro"),
                        categoryType.values()[resultado.getInt("Categoria")-1],
                        generoType.values()[resultado.getInt("Genero")-1],
                        subgeneroType.values()[resultado.getInt("Subgenero")-1],
                        resultado.getString("clasificacion_libro") ));    
                
            }
                
                
        } catch (Exception e) {
            System.out.println("Error al mostrar los datos del Libro" + e);
            
        }finally{
        try{
        resultado.close();
                cb.close();
                conexion.close();
        }catch(Exception e){
            System.out.println("Error, no se han cerrado las conexiones correctamente" + e);
        }
        
        }

        return lista;
        
    }
            
            

    //ADD
    public void AddLibro(Libro lib) {
        CallableStatement cb = null;
        
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_i_libros(?,?,?,?,?,?,?,?,?,?)}");
            cb.setString("p_codigo", lib.getCodigo_Libro());
            cb.setString("p_titulo", lib.getTitulo());
            cb.setString("p_clasificacion", lib.getClasificacion());
            cb.setInt("p_cantidad", lib.getCantidad());
            cb.setString("p_descripcion", lib.getDescripcion());
            cb.setInt("p_categoria", lib.getCategoria().ordinal() + 1);
            cb.setInt("p_genero", lib.getGenero().ordinal() + 1);
            cb.setInt("p_subgenero", lib.getSubGenero().ordinal() + 1);
            cb.setInt("p_id_editorial", lib.getIdEditorial());
            cb.setInt("p_id_escritor", lib.getIdEscritor());
            cb.execute();
            JOptionPane.showMessageDialog(null, "Libro Agregado");
           

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
        //Actualizar
    
        public void UpdateBook(Libro lib) {
        CallableStatement cb = null;
        try {
            conexion = con.getConecction();
            cb = conexion.prepareCall("{call sp_u_libros(?,?,?,?,?,?,?,?,?,?,?)}");
            cb.setInt(11, lib.getIdLibro());
            cb.setString(1, lib.getCodigo_Libro());
            cb.setString(2, lib.getTitulo());
            cb.setString(3, lib.getClasificacion());
            cb.setInt(4, lib.getCantidad());
            cb.setString(5, lib.getDescripcion());
            cb.setInt(6, lib.getCategoria().ordinal() + 1);
            cb.setInt(7, lib.getGenero().ordinal() + 1);
            cb.setInt(8, lib.getSubGenero().ordinal() + 1);
            cb.setInt(9, lib.getIdEditorial());
            cb.setInt(10, lib.getIdEscritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Libro actualizado con exito");
           

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
        
         public void DeleteLibro(Libro libb) {

        try {
            conexion = con.getConecction();
            CallableStatement cb = conexion.prepareCall("delete from libros as a where a.id_libro=?;");
            cb.setInt(1, libb.getIdLibro());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Libro eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
        

}
