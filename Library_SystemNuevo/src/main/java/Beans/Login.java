/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Enums.rolType;
import Entidades.user;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Login {
    
     ConexionAMYSQL con = new ConexionAMYSQL();
     
     public Boolean Logu(user usu){
         
         Connection conexion = con.getConecction();
         
         Boolean valid = false;
         try{
         CallableStatement cb = conexion.prepareCall("{call SP_S_ROL(?,?)}");
         cb.setString("PUsuario", usu.getUsuario());
         cb.setString("PContrasenia", usu.getContrasenia());
         
            ResultSet resultado = cb.executeQuery();

         int x = 0;
         while (resultado.next()){
         x+=1;
         }
         switch(x){
         
             case 1 : JOptionPane.showMessageDialog(null, "Bienvenido "+usu.getUsuario());
             valid = true;
             break;
             
             case 0 : JOptionPane.showMessageDialog(null, "Lo sentimos, no se ha encontrado el Usuario");
             break;
         }
         
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "error"+ex);
         }
         return valid;
     }
     
         public ArrayList<user> listaUser() {
        ArrayList<user> lista = null;
        try {
            lista = new ArrayList<>();
            Connection conexion = con.getConecction();

            CallableStatement cb = conexion.prepareCall("{call SP_S_USERS}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                user us = new user();
                us.setIdUsuario(resultado.getInt("idRol"));
                us.setUsuario(resultado.getString("Usuario"));
                us.setContrasenia(resultado.getString("Contrasenia"));
                us.setRol(rolType.values()[resultado.getInt("Rol")-1]);


                lista.add(us);
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar usuarios" + e);
        }

        return lista;
    }
     
     
     
         public void AddUsuario(user usr) {
             
             Connection conexion = con.getConecction();
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_ROL(?,?,?)}");
            cb.setString("PUsuario", usr.getUsuario());
            cb.setString("PContrasenia", usr.getContrasenia());
            cb.setInt("PRol", usr.getRol().ordinal()+1);
            cb.execute();

            JOptionPane.showMessageDialog(null, "Usuario Agregado correctamente");

            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
        
        
    }
         
              public void DeleteUser(user usuario) {

        try {
             Connection conexion = con.getConecction();
            CallableStatement cb = conexion.prepareCall("delete from rol as a where a.idRol=?;");
            cb.setInt(1, usuario.getIdUsuario());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
}
