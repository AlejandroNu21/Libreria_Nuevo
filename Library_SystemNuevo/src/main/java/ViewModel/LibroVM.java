/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Entidades.Enums.categoryType;
import Entidades.Enums.generoType;
import Entidades.Enums.subgeneroType;

/**
 *
 * @author Vkaiido
 */
public class LibroVM {
    private int idLibro;
    private String Codigo_Libro;
    private String Nombre_Editorial;
    private String Titulo;
    private String Nombre_Escritor;
    private int Cantidad;
    private double Precio;
    private String Descripcion;
    private categoryType Categoria;
    private generoType Genero;
    private subgeneroType SubGenero;
    private String Clasificacion;

    public LibroVM(int idLibro, String Codigo_Libro, String Nombre_Editorial, String Titulo, String Nombre_Escritor, int Cantidad,double Precio, String Descripcion, categoryType Categoria, generoType Genero, subgeneroType SubGenero, String Clasificacion) {
        this.idLibro = idLibro;
        this.Codigo_Libro = Codigo_Libro;
        this.Nombre_Editorial = Nombre_Editorial;
        this.Titulo = Titulo;
        this.Nombre_Escritor = Nombre_Escritor;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Precio=Precio;
        this.Categoria = Categoria;
        this.Genero = Genero;
        this.SubGenero = SubGenero;
        this.Clasificacion = Clasificacion;
    }

    
    
    
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getCodigo_Libro() {
        return Codigo_Libro;
    }

    public void setCodigo_Libro(String Codigo_Libro) {
        this.Codigo_Libro = Codigo_Libro;
    }

    public String getNombre_Editorial() {
        return Nombre_Editorial;
    }

    public void setNombre_Editorial(String Nombre_Editorial) {
        this.Nombre_Editorial = Nombre_Editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNombre_Escritor() {
        return Nombre_Escritor;
    }

    public void setNombre_Escritor(String Nombre_Escritor) {
        this.Nombre_Escritor = Nombre_Escritor;
    }


    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
       public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public categoryType getCategoria() {
        return Categoria;
    }

    public void setCategoria(categoryType Categoria) {
        this.Categoria = Categoria;
    }

    public generoType getGenero() {
        return Genero;
    }

    public void setGenero(generoType Genero) {
        this.Genero = Genero;
    }

    public subgeneroType getSubGenero() {
        return SubGenero;
    }

    public void setSubGenero(subgeneroType SubGenero) {
        this.SubGenero = SubGenero;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }


    
}
