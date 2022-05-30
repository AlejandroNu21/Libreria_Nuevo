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
    private String Usuario;
    private String Contrasenia;
    private rolType Rol;

    public user() {
    }

    public user(String Usuario, String Contrasenia, rolType Rol) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Rol = Rol;
    }

    public user(int idUsuario, String Usuario, String Contrasenia, rolType Rol) {
        this.idUsuario = idUsuario;
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Rol = Rol;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
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
