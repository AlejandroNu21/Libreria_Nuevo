/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Venta {
    private int idVentas;
    private int idCliente;
    private String Fecha_Venta;
    private double Total;
    
    public Venta(){
        
    }

    public Venta(int idVentas, int idCliente, String Fecha_Venta, double Total) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.Fecha_Venta = Fecha_Venta;
        this.Total = Total;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha_Venta() {
        return Fecha_Venta;
    }

    public void setFecha_Venta(String Fecha_Venta) {
        this.Fecha_Venta = Fecha_Venta;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    
    
}
