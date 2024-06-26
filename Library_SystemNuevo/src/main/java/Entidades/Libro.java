/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Enums.*;

public class Libro {

    int idLibro;
    String Codigo_Libro;
    int idEditorial;
    String Titulo;
    int idEscritor;
    int Cantidad;
    double Precio;
    String Descripcion;
    categoryType Categoria;
    generoType Genero;
    subgeneroType SubGenero;
    String Clasificacion;
    private byte[] PortadaLibro;

    public Libro() {
    }

    public Libro(String Codigo_Libro, int idEditorial, String Titulo, int idEscritor, int Cantidad, double Precio, String Descripcion, categoryType Categoria, generoType Genero, subgeneroType SubGenero, String Clasificacion, byte[] PortadaLibro) {
        this.Codigo_Libro = Codigo_Libro;
        this.idEditorial = idEditorial;
        this.Titulo = Titulo;
        this.idEscritor = idEscritor;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
        this.Genero = Genero;
        this.SubGenero = SubGenero;
        this.Clasificacion = Clasificacion;
        this.PortadaLibro = PortadaLibro;
    }

    public Libro(int idLibro, String Codigo_Libro, int idEditorial, String Titulo, int idEscritor, int Cantidad, double Precio, String Descripcion, categoryType Categoria, generoType Genero, subgeneroType SubGenero, String Clasificacion, byte[] PortadaLibro) {
        this.idLibro = idLibro;
        this.Codigo_Libro = Codigo_Libro;
        this.idEditorial = idEditorial;
        this.Titulo = Titulo;
        this.idEscritor = idEscritor;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
        this.Genero = Genero;
        this.SubGenero = SubGenero;
        this.Clasificacion = Clasificacion;
        this.PortadaLibro = PortadaLibro;
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

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
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

    public byte[] getPortadaLibro() {
        return PortadaLibro;
    }

    public void setPortadaLibro(byte[] PortadaLibro) {
        this.PortadaLibro = PortadaLibro;
    }

}
