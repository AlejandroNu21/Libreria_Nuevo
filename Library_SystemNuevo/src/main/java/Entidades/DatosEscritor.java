/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import com.mysql.cj.util.Util;
import java.util.Date;

/**
 *
 * @author Kevin
 */
public class DatosEscritor{

    private int idDatos_Escritor;
    private int idEscritor;
    private Date Fecha_Nacimiento;
    private String Lugar_Nacimiento;
    private Date Fecha_Deceso;
    private String Lugar_Deceso;
    private String Biografia;

    public DatosEscritor() {
    }

    public DatosEscritor(int idEscritor, Date Fecha_Nacimiento, String Lugar_Nacimiento, Date Fecha_Deceso, String Lugar_Deceso, String Biografia) {
        this.idEscritor = idEscritor;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.Fecha_Deceso = Fecha_Deceso;
        this.Lugar_Deceso = Lugar_Deceso;
        this.Biografia = Biografia;
    }

    public DatosEscritor(int idDatos_Escritor, int idEscritor, Date Fecha_Nacimiento, String Lugar_Nacimiento, Date Fecha_Deceso, String Lugar_Deceso, String Biografia) {
        this.idDatos_Escritor = idDatos_Escritor;
        this.idEscritor = idEscritor;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.Fecha_Deceso = Fecha_Deceso;
        this.Lugar_Deceso = Lugar_Deceso;
        this.Biografia = Biografia;
    }
    
    

    public int getIdDatos_Escritor() {
        return idDatos_Escritor;
    }

    public void setIdDatos_Escritor(int idDatos_Escritor) {
        this.idDatos_Escritor = idDatos_Escritor;
    }

    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public Date getFecha_Deceso() {
        return Fecha_Deceso;
    }

    public void setFecha_Deceso(Date Fecha_Deceso) {
        this.Fecha_Deceso = Fecha_Deceso;
    }

    public String getLugar_Deceso() {
        return Lugar_Deceso;
    }

    public void setLugar_Deceso(String Lugar_Deceso) {
        this.Lugar_Deceso = Lugar_Deceso;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }


    
}

