/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Enums.formadePagoType;
import java.util.Date;

/**
 *
 * @author Vkaiido
 */
public class venttas {
      int idVentas;
     int idLibro;
     int idCliente;
     Date Fecha_Venta;
    formadePagoType forma_pago;
    int CantidadLibro;
    double Total;

    public venttas() {
    }

    public venttas(int idLibro, int idCliente, Date Fecha_Venta, formadePagoType forma_pago, int CantidadLibro, double Total) {
        this.idLibro = idLibro;
        this.idCliente = idCliente;
        this.Fecha_Venta = Fecha_Venta;
        this.forma_pago = forma_pago;
        this.CantidadLibro = CantidadLibro;
        this.Total = Total;
    }

    public venttas(int idVentas, int idLibro, int idCliente, Date Fecha_Venta, formadePagoType forma_pago, int CantidadLibro, double Total) {
        this.idVentas = idVentas;
        this.idLibro = idLibro;
        this.idCliente = idCliente;
        this.Fecha_Venta = Fecha_Venta;
        this.forma_pago = forma_pago;
        this.CantidadLibro = CantidadLibro;
        this.Total = Total;
    }

    
    
    
    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha_Venta() {
        return Fecha_Venta;
    }

    public void setFecha_Venta(Date Fecha_Venta) {
        this.Fecha_Venta = Fecha_Venta;
    }

    public formadePagoType getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(formadePagoType forma_pago) {
        this.forma_pago = forma_pago;
    }

    public int getCantidadLibro() {
        return CantidadLibro;
    }

    public void setCantidadLibro(int CantidadLibro) {
        this.CantidadLibro = CantidadLibro;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   
    
}
