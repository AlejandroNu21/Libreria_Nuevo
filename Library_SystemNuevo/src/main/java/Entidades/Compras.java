/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Vkaiido
 */
public class Compras {

 private int idCompra;
 private Date fechaCompra;
private String numeroComprobante;
private int idEditorial;

    public Compras() {
    }

    public Compras(Date fechaCompra, String numeroComprobante, int idEditorial) {
        this.fechaCompra = fechaCompra;
        this.numeroComprobante = numeroComprobante;
        this.idEditorial = idEditorial;
    }

    public Compras(int idCompra, Date fechaCompra, String numeroComprobante, int idEditorial) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.numeroComprobante = numeroComprobante;
        this.idEditorial = idEditorial;
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

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }


    
}
