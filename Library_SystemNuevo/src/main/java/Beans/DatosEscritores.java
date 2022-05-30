/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.DatosEscritor;
import Entidades.Escritor;
import Entidades.clientes;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class DatosEscritores {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    public ArrayList<DatosEscritor> ListaDatosEscritor() {
        ArrayList<DatosEscritor> lista = null;
        try {
            lista = new ArrayList<DatosEscritor>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_DATOSESCRITOR()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                DatosEscritor cl = new DatosEscritor();
                cl.setIdDatos_Escritor(resultado.getInt("idDatos_Escritor"));
                cl.setIdEscritor(resultado.getInt("idEscritor"));
                //cl.setFecha_Nacimiento(resultado.getString("Fecha_Nacimiento"));
                cl.setFecha_Nacimiento(resultado.getDate("Fecha_Nacimiento"));
                cl.setLugar_Nacimiento(resultado.getString("Lugar_Nacimiento"));
                //cl.setFecha_Deceso(resultado.getString("Fecha_Deceso"))
                cl.setFecha_Deceso(resultado.getDate("Fecha_Deceso"));;
                cl.setLugar_Deceso(resultado.getString("Lugar_Deceso"));
                cl.setBiografia(resultado.getString("Biografia"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    public void AddDatosEscritor(DatosEscritor cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_DATOSESCRITOR(?,?,?,?,?,?)}");
            //Escritor es = new Escritor();
            cb.setInt("PidEscritor", cl.getIdEscritor());
            //cb.setString("PFecha_Nacimiento", cl.getFecha_Nacimiento());
            cb.setDate("PFecha_Nacimiento", new java.sql.Date( cl.getFecha_Nacimiento().getTime()));
            cb.setString("PLugar_Nacimiento", cl.getLugar_Nacimiento());
            //cb.setString("PFecha_Deceso", cl.getFecha_Deceso());
            cb.setDate("PFecha_Deceso", new java.sql.Date( cl.getFecha_Deceso().getTime()));
            cb.setString("PLugar_Deceso", cl.getLugar_Deceso());
            cb.setString("PBiografia", cl.getBiografia());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del escritor agregado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
        public void UpdateDatosEscritor(DatosEscritor cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_U_DATOSESCRITOR(?,?,?,?,?,?,?)}");
            //Escritor es = new Escritor();
            cb.setInt(7, cl.getIdDatos_Escritor());
            cb.setInt(1, cl.getIdEscritor());
            //cb.setString("PFecha_Nacimiento", cl.getFecha_Nacimiento());
            cb.setDate(2, new java.sql.Date( cl.getFecha_Nacimiento().getTime()));
            cb.setString(3, cl.getLugar_Nacimiento());
            //cb.setString("PFecha_Deceso", cl.getFecha_Deceso());
            cb.setDate(4, new java.sql.Date( cl.getFecha_Deceso().getTime()));
            cb.setString(5, cl.getLugar_Deceso());
            cb.setString(6, cl.getBiografia());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del escritor Actualizados correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
    
      public void DeleteDE(DatosEscritor de) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from datos_escritor as a where a.idDatos_Escritor = ?;");
            cb.setInt(1, de.getIdDatos_Escritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del libro eliminados correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }

}
