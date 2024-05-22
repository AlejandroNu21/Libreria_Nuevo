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
public class ComprasVM {
     
     private int idCompra;
    private Date fechaCompra;
    private String codigoLibro;
    private String tituloLibro;
    private double precioLibro;
    private String codigoEditorial;
    private String nombreEditorial;
    private int cantidadCompra;
    private double precioCompra;

    public ComprasVM(int idCompra, Date fechaCompra, String codigoLibro, String tituloLibro, double precioLibro, String codigoEditorial, String nombreEditorial, int cantidadCompra, double precioCompra) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.codigoLibro = codigoLibro;
        this.tituloLibro = tituloLibro;
        this.precioLibro = precioLibro;
        this.codigoEditorial = codigoEditorial;
        this.nombreEditorial = nombreEditorial;
        this.cantidadCompra = cantidadCompra;
        this.precioCompra = precioCompra;
    }

    
    
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        this.precioLibro = precioLibro;
    }

    public String getCodigoEditorial() {
        return codigoEditorial;
    }

    public void setCodigoEditorial(String codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
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



}
