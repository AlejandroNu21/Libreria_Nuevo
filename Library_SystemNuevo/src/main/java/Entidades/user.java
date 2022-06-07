/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Enums.rolType;

/**
 *
 * @author COREI5 10TH GEN
 */
public class user {
    private int idUsuario;
    private String NombreUsuario;
    private String Contrasenia;
    private rolType Rol;

    public user() {
    }

    public user(String NombreUsuario, String Contrasenia, rolType Rol) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasenia = Contrasenia;
        this.Rol = Rol;
    }

    public user(int idUsuario, String NombreUsuario, String Contrasenia, rolType Rol) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasenia = Contrasenia;
        this.Rol = Rol;
    }

    
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public rolType getRol() {
        return Rol;
    }

    public void setRol(rolType Rol) {
        this.Rol = Rol;
    }


}
