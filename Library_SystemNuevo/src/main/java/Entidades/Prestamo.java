/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Enums.prestamoType;
import java.util.Date;

/**
 *
 * @author Vkaiido
 */
public class Prestamo {
    private int idPrestamo;
    private int idLector;
    private int idLibro;
    private Date Fecha_Prestamo;
    private Date Fecha_Devolucion;
    prestamoType Devuelto;

    public Prestamo() {
    }
    
    public Prestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Prestamo(int idLector, int idLibro, Date Fecha_Prestamo, Date Fecha_Devolucion, prestamoType Devuelto) {
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Devuelto = Devuelto;
    }

    public Prestamo(int idPrestamo, int idLector, int idLibro, Date Fecha_Prestamo, Date Fecha_Devolucion, prestamoType Devuelto) {
        this.idPrestamo = idPrestamo;
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Devuelto = Devuelto;
    }

 
    
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Date getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(Date Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

    public Date getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(Date Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public prestamoType getDevuelto() {
        return Devuelto;
    }

    public void setDevuelto(prestamoType Devuelto) {
        this.Devuelto = Devuelto;
    }
   
    
}
