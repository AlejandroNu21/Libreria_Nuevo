/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.sql.Date;

/**
 *
 * @author kaido
 */
public class VentasVM {
     private int idVenta;
    private Date fechaVenta;
    private String documentoCliente;
    private String nombreCliente;
    private String codigoLibro;
    private String tituloLibro;
    private int cantidadVenta;
    private double precioVenta;

    public VentasVM(int idVenta, Date fechaVenta, String documentoCliente, String nombreCliente, String codigoLibro, String tituloLibro, int cantidadVenta, double precioVenta) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.codigoLibro = codigoLibro;
        this.tituloLibro = tituloLibro;
        this.cantidadVenta = cantidadVenta;
        this.precioVenta = precioVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
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

   
     
    
    
    
}
