/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

//import Entidades.Enums.formadePagoType;
import java.util.Date;

/**
 *
 * @author Vkaiido
 */
public class venttas {
 private int id_ventas;
 private Date fecha_venta;
 private String tipo_comprobante;
private String numero_comprobante;
private int id_cliente_fk;

    public venttas() {
    }

    public venttas(Date fecha_venta, String tipo_comprobante, String numero_comprobante, int id_cliente_fk) {
        this.fecha_venta = fecha_venta;
        this.tipo_comprobante = tipo_comprobante;
        this.numero_comprobante = numero_comprobante;
        this.id_cliente_fk = id_cliente_fk;
    }

    public venttas(int id_ventas, Date fecha_venta, String tipo_comprobante, String numero_comprobante, int id_cliente_fk) {
        this.id_ventas = id_ventas;
        this.fecha_venta = fecha_venta;
        this.tipo_comprobante = tipo_comprobante;
        this.numero_comprobante = numero_comprobante;
        this.id_cliente_fk = id_cliente_fk;
    }



    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getNumero_comprobante() {
        return numero_comprobante;
    }

    public void setNumero_comprobante(String numero_comprobante) {
        this.numero_comprobante = numero_comprobante;
    }

    public int getId_cliente_fk() {
        return id_cliente_fk;
    }

    public void setId_cliente_fk(int id_cliente_fk) {
        this.id_cliente_fk = id_cliente_fk;
    }
    



}
