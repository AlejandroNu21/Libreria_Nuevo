/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Enums.disponibleType;

/**
 *
 * @author Kevin
 */
public class DatosLibro {
    int idDatos_Libro;
    int idLibro;
    String Reseña;
    Double Precio;
    int Cantidad;
    disponibleType Disponible;
    String Año_Publicacion;

    public int getIdDatos_Libro() {
        return idDatos_Libro;
    }

    public void setIdDatos_Libro(int idDatos_Libro) {
        this.idDatos_Libro = idDatos_Libro;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getReseña() {
        return Reseña;
    }

    public void setReseña(String Reseña) {
        this.Reseña = Reseña;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public disponibleType getDisponible() {
        return Disponible;
    }

    public void setDisponible(disponibleType Disponible) {
        this.Disponible = Disponible;
    }

    public String getAño_Publicacion() {
        return Año_Publicacion;
    }

    public void setAño_Publicacion(String Año_Publicacion) {
        this.Año_Publicacion = Año_Publicacion;
    }
}