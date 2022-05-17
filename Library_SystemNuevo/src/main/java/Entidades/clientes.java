/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Kevin
 */
public class clientes {
    
    private int idCliente;
    private String CodigoCliente;
    private String NombreCliente;
    private String ApellidoCliente;
    private String Edad;
    private String Direccion;
    private String Telefono;

    public clientes() {
    }

    public clientes(int idCliente) {
        this.idCliente = idCliente;
    }

    public clientes(String CodigoCliente, String NombreCliente, String ApellidoCliente, String Edad, String Direccion, String Telefono) {
        this.CodigoCliente = CodigoCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public clientes(int idCliente, String CodigoCliente, String NombreCliente, String ApellidoCliente, String Edad, String Direccion, String Telefono) {
        this.idCliente = idCliente;
        this.CodigoCliente = CodigoCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    

}
