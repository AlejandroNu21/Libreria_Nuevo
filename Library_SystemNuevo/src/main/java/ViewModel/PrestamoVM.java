/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Entidades.Enums.prestamoType;
import java.util.Date;

/**
 *
 * @author Vkaiido
 */
public class PrestamoVM {
    private int idPrestamo;
    private String Nombre_Lector;
    private String Titulo;
    private Date Fecha_Prestamo;
    private Date Fecha_Devolucion;
    private prestamoType Reembolso_prestamo;

    public PrestamoVM() {
    }

    public PrestamoVM(String Nombre_Lector, String Titulo, Date Fecha_Prestamo, Date Fecha_Devolucion, prestamoType Reembolso_prestamo) {
        this.Nombre_Lector = Nombre_Lector;
        this.Titulo = Titulo;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Reembolso_prestamo = Reembolso_prestamo;
    }

    public PrestamoVM(int idPrestamo, String Nombre_Lector, String Titulo, Date Fecha_Prestamo, Date Fecha_Devolucion, prestamoType Reembolso_prestamo) {
        this.idPrestamo = idPrestamo;
        this.Nombre_Lector = Nombre_Lector;
        this.Titulo = Titulo;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Reembolso_prestamo = Reembolso_prestamo;
    }

    
    
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getNombre_Lector() {
        return Nombre_Lector;
    }

    public void setNombre_Lector(String Nombre_Lector) {
        this.Nombre_Lector = Nombre_Lector;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
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

    public prestamoType getReembolso_prestamo() {
        return Reembolso_prestamo;
    }

    public void setReembolso_prestamo(prestamoType Reembolso_prestamo) {
        this.Reembolso_prestamo = Reembolso_prestamo;
    }

 
    
    
    
    
    
    
    
    
}
