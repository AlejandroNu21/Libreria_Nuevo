/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Vkaiido
 */
public class DetalleCompras {
    private int idDetalleCompra;
    private int idCompra;
    private int idlibro;
    private int cantidadCompra;
    private double precioCompra;
    private double precioVenta;
    private double impuestoCompra;

    public DetalleCompras() {
    }

    public DetalleCompras(int idCompra, int idlibro, int cantidadCompra, double precioCompra, double precioVenta, double impuestoCompra) {
        this.idCompra = idCompra;
        this.idlibro = idlibro;
        this.cantidadCompra = cantidadCompra;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.impuestoCompra = impuestoCompra;
    }

    public DetalleCompras(int idDetalleCompra, int idCompra, int idlibro, int cantidadCompra, double precioCompra, double precioVenta, double impuestoCompra) {
        this.idDetalleCompra = idDetalleCompra;
        this.idCompra = idCompra;
        this.idlibro = idlibro;
        this.cantidadCompra = cantidadCompra;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.impuestoCompra = impuestoCompra;
    }

    
    
    
    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getImpuestoCompra() {
        return impuestoCompra;
    }

    public void setImpuestoCompra(double impuestoCompra) {
        this.impuestoCompra = impuestoCompra;
    }
    
    
    
    
}
