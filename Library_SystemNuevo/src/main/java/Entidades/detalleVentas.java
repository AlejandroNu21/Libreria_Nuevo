/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Vkaiido
 */
public class detalleVentas {
    
    private int idDetalleVenta;
    private int idVenta;
    private int idlibro;
    private int cantidadVenta;
    private double precioVenta;
    private double decuentoVenta;
    private double impuestoVenta;

    public detalleVentas() {
    }

    public detalleVentas(int idVenta, int idlibro, int cantidadVenta, double precioVenta, double decuentoVenta, double impuestoVenta) {
        this.idVenta = idVenta;
        this.idlibro = idlibro;
        this.cantidadVenta = cantidadVenta;
        this.precioVenta = precioVenta;
        this.decuentoVenta = decuentoVenta;
        this.impuestoVenta = impuestoVenta;
    }

    public detalleVentas(int idDetalleVenta, int idVenta, int idlibro, int cantidadVenta, double precioVenta, double decuentoVenta, double impuestoVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idlibro = idlibro;
        this.cantidadVenta = cantidadVenta;
        this.precioVenta = precioVenta;
        this.decuentoVenta = decuentoVenta;
        this.impuestoVenta = impuestoVenta;
    }

    
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getDecuentoVenta() {
        return decuentoVenta;
    }

    public void setDecuentoVenta(double decuentoVenta) {
        this.decuentoVenta = decuentoVenta;
    }

    public double getImpuestoVenta() {
        return impuestoVenta;
    }

    public void setImpuestoVenta(double impuestoVenta) {
        this.impuestoVenta = impuestoVenta;
    }
    
    
    
    
}
