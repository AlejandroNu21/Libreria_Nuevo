/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import org.w3c.dom.Text;

/**
 *
 * @author Kevin
 */
public class Escritor {

    private int idEscritor;
     private String Codigo_Escritor;
    private String Nombre_Escritor;
    private String Apellido_Escritor;
    private String Pais_Escritor;
    private Date Fecha_Nacimiento;
    private String Biografia;
    private byte [] AvatarEscritor;

    public Escritor() {
    }

    public Escritor(String Codigo_Escritor, String Nombre_Escritor, String Apellido_Escritor, String Pais_Escritor, Date Fecha_Nacimiento, String Biografia, byte[] AvatarEscritor) {
        this.Codigo_Escritor = Codigo_Escritor;
        this.Nombre_Escritor = Nombre_Escritor;
        this.Apellido_Escritor = Apellido_Escritor;
        this.Pais_Escritor = Pais_Escritor;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Biografia = Biografia;
        this.AvatarEscritor = AvatarEscritor;
    }

    public Escritor(int idEscritor, String Codigo_Escritor, String Nombre_Escritor, String Apellido_Escritor, String Pais_Escritor, Date Fecha_Nacimiento, String Biografia, byte[] AvatarEscritor) {
        this.idEscritor = idEscritor;
        this.Codigo_Escritor = Codigo_Escritor;
        this.Nombre_Escritor = Nombre_Escritor;
        this.Apellido_Escritor = Apellido_Escritor;
        this.Pais_Escritor = Pais_Escritor;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Biografia = Biografia;
        this.AvatarEscritor = AvatarEscritor;
    }

    
    
    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
    }

    public String getCodigo_Escritor() {
        return Codigo_Escritor;
    }

    public void setCodigo_Escritor(String Codigo_Escritor) {
        this.Codigo_Escritor = Codigo_Escritor;
    }

    public String getNombre_Escritor() {
        return Nombre_Escritor;
    }

    public void setNombre_Escritor(String Nombre_Escritor) {
        this.Nombre_Escritor = Nombre_Escritor;
    }

    public String getApellido_Escritor() {
        return Apellido_Escritor;
    }

    public void setApellido_Escritor(String Apellido_Escritor) {
        this.Apellido_Escritor = Apellido_Escritor;
    }

    public String getPais_Escritor() {
        return Pais_Escritor;
    }

    public void setPais_Escritor(String Pais_Escritor) {
        this.Pais_Escritor = Pais_Escritor;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public byte[] getAvatarEscritor() {
        return AvatarEscritor;
    }

    public void setAvatarEscritor(byte[] AvatarEscritor) {
        this.AvatarEscritor = AvatarEscritor;
    }


}
